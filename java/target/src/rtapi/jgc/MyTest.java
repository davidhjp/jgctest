package jgc;
import javax.realtime.*;
import javax.safetycritical.*;

public class MyTest extends CyclicExecutive implements Safelet<CyclicExecutive>{

	class Program extends PeriodicEventHandler{

		public Program(PriorityParameters priority, PeriodicParameters release,
				StorageParameters storage, long scopeSize) {
			super(priority, release, storage, scopeSize);
		}

		@Override
		public void handleAsyncEvent() {
			System.out.println("hello");
			
		}
		
	}
	// Mission implementations - goes to Mission memory
	@Override
		protected void initialize() {

			
			Program p = new Program(
					new PriorityParameters(0),
					new PeriodicParameters(null, new RelativeTime(50, 0)),
					new StorageParameters(50000,null),
					20000 /* INSERT_SCOPE_SIZE_HERE */);
			p.register();
			

		}
	@Override
		public long missionMemorySize() {return 100000;}
	@Override
		public CyclicSchedule getSchedule(PeriodicEventHandler[] handlers) {
			Frame[] frames = new Frame[1];
			frames[0] = new Frame(new RelativeTime(250, 0), handlers);
			return new CyclicSchedule(frames);
		}

	// Safelet implementations - goes to Immortal memory
	@Override
		public void initializeApplication() {}
	@Override
		public MissionSequencer<CyclicExecutive> getSequencer() {
			StorageParameters sp = new StorageParameters(1000000,null);
			return new LinearMissionSequencer<CyclicExecutive>(new PriorityParameters(0),
					sp,false,this);
		}
	@Override
		public long immortalMemorySize() {
			return 100000;
		}
	public static void main (String[] args) {
		Safelet<CyclicExecutive> m = new MyTest();
		JopSystem js = new JopSystem();
		js.startCycle(m);
	}
}
