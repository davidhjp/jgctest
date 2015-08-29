/*
*  This file is part of SystemJ Runtime Enviornment
*  Generated at 10:50, 30/5/2013
*/
package sysjex;
import systemj.common.*;
import systemj.bootstrap.*;
import java.util.*;
import systemj.lib.*;
import systemj.interfaces.*;
public class run{
	public static void main(String[] arg){
		SystemJProgram program = new SystemJProgram();
		InterfaceManager im = new InterfaceManager();
		im.addCDLocation("WW","CM");
		System.out.println("Local SubSystem : WW");
		program.setSubSystemName("WW");
		im.setLocalInterface("WW");
		runner CM = new runner();
		CM.setName("CM");
		Hashtable channels = new Hashtable();
		CyclicScheduler cs = new CyclicScheduler();
		cs.addClockDomain(CM);
		program.addScheduler(cs);
		im.setChannelInstances(channels);
		program.setInterfaceManager(im);
		program.init();
		im.printLocalInterface();
		System.out.println("\nConstructed clock-domain map : ");
		System.out.println(program.getInterfaceManager().getcdmap());
		program.startProgram();
	}
}
