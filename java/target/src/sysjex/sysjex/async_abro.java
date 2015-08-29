/*
*  This file is part of SystemJ Runtime Enviornment
*  Generated at 15:47, 30/5/2013
*/
package sysjex;
import systemj.common.*;
import systemj.bootstrap.*;
import java.util.*;
import systemj.lib.*;
import systemj.interfaces.*;
public class async_abro{
	public static void main(String[] arg){
		SystemJProgram program = new SystemJProgram();
		InterfaceManager im = new InterfaceManager();
		im.addCDLocation("SS1","Pabro");
		im.addCDLocation("SS1","Cabro");
		im.addCDLocation("SS1","Buffers");
		System.out.println("Local SubSystem : SS1");
		program.setSubSystemName("SS1");
		im.setLocalInterface("SS1");
		Pabro Pabro = new Pabro();
		Pabro.setName("Pabro");
		Cabro Cabro = new Cabro();
		Cabro.setName("Cabro");
		Buffers Buffers = new Buffers();
		Buffers.setName("Buffers");
		Hashtable channels = new Hashtable();
		CyclicScheduler cs = new CyclicScheduler();
		Pabro.producerChannel_o.Name = "Pabro.producerChannel_o";
		Pabro.producerChannel_o.PartnerName = "Buffers.producerChannel_in";
		Buffers.producerChannel_in.Name = "Buffers.producerChannel_in";
		Buffers.producerChannel_in.PartnerName = "Pabro.producerChannel_o";
		Pabro.producerChannel_o.set_partner_smp(Buffers.producerChannel_in);
		Buffers.producerChannel_in.set_partner_smp(Pabro.producerChannel_o);
		Pabro.producerChannel_o.setInit();
		Buffers.producerChannel_in.setInit();
		channels.put("Buffers.producerChannel_in", Buffers.producerChannel_in);
		channels.put("Pabro.producerChannel_o", Pabro.producerChannel_o);
		System.out.println("DEBUG : initialized Buffers.producerChannel_in, Pabro.producerChannel_o");
		cs.addClockDomain(Pabro);
		Cabro.consumerChannel_in.Name = "Cabro.consumerChannel_in";
		Cabro.consumerChannel_in.PartnerName = "Buffers.consumerChannel_o";
		Buffers.consumerChannel_o.Name = "Buffers.consumerChannel_o";
		Buffers.consumerChannel_o.PartnerName = "Cabro.consumerChannel_in";
		Cabro.consumerChannel_in.set_partner_smp(Buffers.consumerChannel_o);
		Buffers.consumerChannel_o.set_partner_smp(Cabro.consumerChannel_in);
		Cabro.consumerChannel_in.setInit();
		Buffers.consumerChannel_o.setInit();
		channels.put("Cabro.consumerChannel_in", Cabro.consumerChannel_in);
		channels.put("Buffers.consumerChannel_o", Buffers.consumerChannel_o);
		System.out.println("DEBUG : initialized Cabro.consumerChannel_in, Buffers.consumerChannel_o");
		cs.addClockDomain(Cabro);
		cs.addClockDomain(Buffers);
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
