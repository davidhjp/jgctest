/*
 *  This file is part of SystemJ Runtime Enviornment
 *  Generated at 17:24, 28/5/2013
 */
package sysjex;
import systemj.common.*;
import systemj.bootstrap.*;
import java.util.*;
import systemj.lib.*;
import systemj.interfaces.*;
public class demoloop{
  public static void main(String[] arg){
    SystemJProgram program = new SystemJProgram();
    InterfaceManager im = new InterfaceManager();
    im.addCDLocation("SS","DD");
    im.addCDLocation("SS","DD1");
    System.out.println("Local SubSystem : SS");
    program.setSubSystemName("SS");
    im.setLocalInterface("SS");
    demoloop1 DD = new demoloop1();
    DD.setName("DD");
    demoloop1 DD1 = new demoloop1();
    DD1.setName("DD1");
    Hashtable channels = new Hashtable();
    systemj.common.CyclicScheduler sc0 = new systemj.common.CyclicScheduler();
    sc0.addClockDomain(DD);
    sc0.addClockDomain(DD1);
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
