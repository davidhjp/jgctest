/*
*  This file is part of SystemJ Runtime Enviornment
*  Generated at 10:51, 6/6/2013
*/
package sysjex;
import systemj.common.*;
import systemj.bootstrap.*;
import java.util.*;
import systemj.lib.*;
import systemj.interfaces.*;
public class frey{
	public static void main(String[] arg){
		SystemJProgram program = new SystemJProgram();
		InterfaceManager im = new InterfaceManager();
		im.addCDLocation("SS","DD");
		im.addCDLocation("SS","DD2");
		System.out.println("Local SubSystem : SS");
		program.setSubSystemName("SS");
		im.setLocalInterface("SS");
		DataDominatedDomain DD = new DataDominatedDomain();
		DD.setName("DD");
		ControlDominatedDomain DD2 = new ControlDominatedDomain();
		DD2.setName("DD2");
		Hashtable channels = new Hashtable();
		systemj.common.CyclicScheduler sc0 = new systemj.common.CyclicScheduler();
		DD.SampleCount_o.Name = "DD.SampleCount_o";
		DD.SampleCount_o.PartnerName = "DD2.SampleCount_in";
		DD2.SampleCount_in.Name = "DD2.SampleCount_in";
		DD2.SampleCount_in.PartnerName = "DD.SampleCount_o";
		DD.SampleCount_o.set_partner_smp(DD2.SampleCount_in);
		DD2.SampleCount_in.set_partner_smp(DD.SampleCount_o);
		DD.SampleCount_o.setInit();
		DD2.SampleCount_in.setInit();
		channels.put("DD2.SampleCount_in", DD2.SampleCount_in);
		channels.put("DD.SampleCount_o", DD.SampleCount_o);
		System.out.println("DEBUG : initialized DD2.SampleCount_in, DD.SampleCount_o");
		sc0.addClockDomain(DD);
		sc0.addClockDomain(DD2);
		program.addScheduler(sc0);
		im.setChannelInstances(channels);
		program.setInterfaceManager(im);
		program.init();
		im.printLocalInterface();
		System.out.println("\nConstructed clock-domain map : ");
		System.out.println(program.getInterfaceManager().getcdmap());
		program.startProgram();
	}
}
