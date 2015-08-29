/*
*  This file is part of SystemJ Runtime Enviornment
*  Generated at 10:20, 30/5/2013
*/
package sysjex;

import systemj.common.*;
import systemj.bootstrap.*;
import java.util.*;
import systemj.lib.*;
import systemj.interfaces.*;
public class pp{
	public static void main(String[] arg){
		SystemJProgram program = new SystemJProgram();
		InterfaceManager im = new InterfaceManager();
		im.addCDLocation("SS","DD");
		im.addCDLocation("SS","DD2");
		System.out.println("Local SubSystem : SS");
		program.setSubSystemName("SS");
		im.setLocalInterface("SS");
		apsCD1 DD = new apsCD1();
		DD.setName("DD");
		apsCD2 DD2 = new apsCD2();
		DD2.setName("DD2");
		Hashtable channels = new Hashtable();
		systemj.common.CyclicScheduler sc0 = new systemj.common.CyclicScheduler();
		DD.reset1_o.Name = "DD.reset1_o";
		DD.reset1_o.PartnerName = "DD2.reset1_in";
		DD2.reset1_in.Name = "DD2.reset1_in";
		DD2.reset1_in.PartnerName = "DD.reset1_o";
		DD.reset1_o.set_partner_smp(DD2.reset1_in);
		DD2.reset1_in.set_partner_smp(DD.reset1_o);
		DD.reset1_o.setInit();
		DD2.reset1_in.setInit();
		channels.put("DD2.reset1_in", DD2.reset1_in);
		channels.put("DD.reset1_o", DD.reset1_o);
		System.out.println("DEBUG : initialized DD2.reset1_in, DD.reset1_o");
		DD.data1_o.Name = "DD.data1_o";
		DD.data1_o.PartnerName = "DD2.data1_in";
		DD2.data1_in.Name = "DD2.data1_in";
		DD2.data1_in.PartnerName = "DD.data1_o";
		DD.data1_o.set_partner_smp(DD2.data1_in);
		DD2.data1_in.set_partner_smp(DD.data1_o);
		DD.data1_o.setInit();
		DD2.data1_in.setInit();
		channels.put("DD2.data1_in", DD2.data1_in);
		channels.put("DD.data1_o", DD.data1_o);
		System.out.println("DEBUG : initialized DD2.data1_in, DD.data1_o");
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
