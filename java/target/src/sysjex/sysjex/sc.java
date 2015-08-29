/*
 *  This file is part of SystemJ Runtime Enviornment
 *  Generated at 11:34, 30/5/2013
 */
package sysjex;
import systemj.common.*;
import systemj.bootstrap.*;
import java.util.*;
import systemj.lib.*;
import systemj.interfaces.*;
public class sc{
  public static void main(String[] arg){
    SystemJProgram program = new SystemJProgram();
    InterfaceManager im = new InterfaceManager();
    im.addCDLocation("SS","DD");
    im.addCDLocation("SS","DD2");
    System.out.println("Local SubSystem : SS");
    program.setSubSystemName("SS");
    im.setLocalInterface("SS");
    OsNode DD = new OsNode();
    DD.setName("DD");
    UserNode DD2 = new UserNode();
    DD2.setName("DD2");
    Hashtable channels = new Hashtable();
    CyclicScheduler cs = new CyclicScheduler();
    DD.Authorization_o.Name = "DD.Authorization_o";
    DD.Authorization_o.PartnerName = "DD2.Authorization_in";
    DD2.Authorization_in.Name = "DD2.Authorization_in";
    DD2.Authorization_in.PartnerName = "DD.Authorization_o";
    DD.Authorization_o.set_partner_smp(DD2.Authorization_in);
    DD2.Authorization_in.set_partner_smp(DD.Authorization_o);
    DD.Authorization_o.setInit();
    DD2.Authorization_in.setInit();
    channels.put("DD2.Authorization_in", DD2.Authorization_in);
    channels.put("DD.Authorization_o", DD.Authorization_o);
    System.out.println("DEBUG : initialized DD2.Authorization_in, DD.Authorization_o");
    DD.TransferId_in.Name = "DD.TransferId_in";
    DD.TransferId_in.PartnerName = "DD2.TransferId_o";
    DD2.TransferId_o.Name = "DD2.TransferId_o";
    DD2.TransferId_o.PartnerName = "DD.TransferId_in";
    DD.TransferId_in.set_partner_smp(DD2.TransferId_o);
    DD2.TransferId_o.set_partner_smp(DD.TransferId_in);
    DD.TransferId_in.setInit();
    DD2.TransferId_o.setInit();
    channels.put("DD.TransferId_in", DD.TransferId_in);
    channels.put("DD2.TransferId_o", DD2.TransferId_o);
    System.out.println("DEBUG : initialized DD.TransferId_in, DD2.TransferId_o");
    DD.SendCmd_in.Name = "DD.SendCmd_in";
    DD.SendCmd_in.PartnerName = "DD2.SendCmd_o";
    DD2.SendCmd_o.Name = "DD2.SendCmd_o";
    DD2.SendCmd_o.PartnerName = "DD.SendCmd_in";
    DD.SendCmd_in.set_partner_smp(DD2.SendCmd_o);
    DD2.SendCmd_o.set_partner_smp(DD.SendCmd_in);
    DD.SendCmd_in.setInit();
    DD2.SendCmd_o.setInit();
    channels.put("DD.SendCmd_in", DD.SendCmd_in);
    channels.put("DD2.SendCmd_o", DD2.SendCmd_o);
    System.out.println("DEBUG : initialized DD.SendCmd_in, DD2.SendCmd_o");
    cs.addClockDomain(DD);
    cs.addClockDomain(DD2);
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
