package jgc;
import javax.realtime.*;
import javax.safetycritical.*;

import jgc.micro.arr;
import jgc.micro.arraytest;
import jgc.micro.o;
import jgc.micro.o1;
import systemj.lib.Signal;

public class MyMicroArray extends CyclicExecutive implements Safelet<CyclicExecutive>{

	class Program extends PeriodicEventHandler{

		public Program(PriorityParameters priority, PeriodicParameters release,
				StorageParameters storage, long scopeSize) {
			super(priority, release, storage, scopeSize);
		}

//		public Signal S1;

		@Override
		public void handleAsyncEvent() {
		    arr A = null;
		    arraytest at = new arraytest();
		    int count = 0;
		    /* Start timer */
		    int t1 = (int)System.nanoTime();
		    for(count=0;count<800;++count){
		      A = new arr ();
		      A.testArr = new int[20];
		    }
		    int t2 = (int)System.nanoTime();
		    System.out.println(""+(t2-t1));
		    System.out.println("Time taken for array object allocation: ");
//		    S1 = new Signal();
//		    S1.setValue(A);
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
		Safelet<CyclicExecutive> m = new MyMicroArray();
		JopSystem js = new JopSystem();
		js.startCycle(m);
	}
}
