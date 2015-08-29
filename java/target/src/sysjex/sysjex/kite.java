/*
 *  This file is part of SystemJ Runtime Enviornment
 *  Generated at 20:40, 29/5/2013
 */
package sysjex;
import systemj.common.*;
import systemj.bootstrap.*;
import java.util.*;
import systemj.lib.*;
import systemj.interfaces.*;
public class kite{
  public static void main(String[] arg){
    SystemJProgram program = new SystemJProgram();
    InterfaceManager im = new InterfaceManager();
    im.addCDLocation("WW","wind");
    im.addCDLocation("WW","craft");
    im.addCDLocation("WW","kc");
    System.out.println("Local SubSystem : WW");
    program.setSubSystemName("WW");
    im.setLocalInterface("WW");
    Wind wind = new Wind();
    wind.setName("wind");
    Craft craft = new Craft();
    craft.setName("craft");
    KiteControl kc = new KiteControl();
    kc.setName("kc");
    Hashtable channels = new Hashtable();
    CyclicScheduler cs = new CyclicScheduler();
    wind.wind_o.Name = "wind.wind_o";
    wind.wind_o.PartnerName = "kc.craft_in";
    kc.craft_in.Name = "kc.craft_in";
    kc.craft_in.PartnerName = "wind.wind_o";
    wind.wind_o.set_partner_smp(kc.craft_in);
    kc.craft_in.set_partner_smp(wind.wind_o);
    wind.wind_o.setInit();
    kc.craft_in.setInit();
    channels.put("kc.craft_in", kc.craft_in);
    channels.put("wind.wind_o", wind.wind_o);
    System.out.println("DEBUG : initialized kc.craft_in, wind.wind_o");
    cs.addClockDomain(wind);
    craft.craft_o.Name = "craft.craft_o";
    craft.craft_o.PartnerName = "kc.wind_in";
    kc.wind_in.Name = "kc.wind_in";
    kc.wind_in.PartnerName = "craft.craft_o";
    craft.craft_o.set_partner_smp(kc.wind_in);
    kc.wind_in.set_partner_smp(craft.craft_o);
    craft.craft_o.setInit();
    kc.wind_in.setInit();
    channels.put("kc.wind_in", kc.wind_in);
    channels.put("craft.craft_o", craft.craft_o);
    System.out.println("DEBUG : initialized kc.wind_in, craft.craft_o");
    cs.addClockDomain(craft);
    cs.addClockDomain(kc);
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
