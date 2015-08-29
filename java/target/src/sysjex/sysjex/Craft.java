package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import com.jopdesign.sys.Native;

public class Craft extends ClockDomain{
  public Craft(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public output_Channel craft_o = new output_Channel();
  private static Signal kitespeed_6;
  private static Signal kiteheading_6;
  private static Signal spdTop2_8;
  private static Signal hdTop2_8;
  private static Signal request2_8;
  private static int counter_thread_9;
  private static int counter2_thread_9;
  private static Integer s2_thread_9;
  private static Integer h2_thread_9;
  private static int buffersize1_thread_9;
  private static int[] speed2_thread_9;
  private static int[] heading2_thread_9;
  private static int buffersize1_thread_10;
  private static int counter1_thread_10;
  private static Integer s22_thread_10;
  private static Integer h22_thread_10;
  private static Vector myvalues_thread_10;
  private static int tutu__1895877034;
  private static int tutu__1683946796;
  private static int tutu__1887027810;
  private static int tutu__1804679029;
  private static int S623 = 1;
  private static int S318 = 1;
  private static int S314 = 1;
  private static int S621 = 1;
  private static int S335 = 1;
  private static int S324 = 1;
  private static int S619 = 1;
  private static int S337 = 1;
  private static int S346 = 1;
  private static int S341 = 1;
	
  private static int[] ends = new int[16];
  private static int[] tdone = new int[16];
  public void thread1852400409(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      switch(S619){
      case 0 : 
	active[10]=0;
	ends[10]=0;
	tdone[10]=1;
	break;
      case 1 : 
	switch(S337){
	case 0 : 
	  S337=0;
	  S337=1;
	  active[10]=1;
	  ends[10]=1;
	  tdone[10]=1;
	  break;
	case 1 : 
	  if(spdTop2_8.getprestatus()){
	    s22_thread_10 = (Integer)spdTop2_8.getpreval();
	    h22_thread_10 = (Integer)hdTop2_8.getpreval();
	    myvalues_thread_10 = new Vector(2);
	    myvalues_thread_10.addElement(s22_thread_10);
	    myvalues_thread_10.addElement(h22_thread_10);
	    if(counter1_thread_10 == (buffersize1_thread_10 - 1)) {
	      counter1_thread_10 = 0;
	    }
	    else {
	      counter1_thread_10 += 1;
	    }
	    S337=2;
	    S346=0;
	    if(craft_o.get_preempted()){
	      tutu__1683946796 = 0;
	      tutu__1683946796 = craft_o.get_preempted() ? craft_o.refresh() : 0;
	      S346=1;
	      active[10]=1;
	      ends[10]=1;
	      tdone[10]=1;
	    }
	    else {
	      S341=0;
	      if(craft_o.get_w_s() == craft_o.get_w_r()){
		tutu__1895877034 = 0;
		tutu__1895877034 = craft_o.get_w_s();
		tutu__1895877034++;
		craft_o.set_w_s(tutu__1895877034);
		craft_o.set_value(myvalues_thread_10);
		S341=1;
		if(craft_o.get_w_s() == craft_o.get_w_r()){
		  ends[10]=2;
		  ;
		  S337=3;
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
		else {
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
	      }
	      else {
		active[10]=1;
		ends[10]=1;
		tdone[10]=1;
	      }
	    }
	  }
	  else {
	    active[10]=1;
	    ends[10]=1;
	    tdone[10]=1;
	  }
	  break;
	case 2 : 
	  switch(S346){
	  case 0 : 
	    if(craft_o.get_preempted()){
	      tutu__1804679029 = 0;
	      tutu__1804679029 = craft_o.get_preempted() ? craft_o.refresh() : 0;
	      S346=1;
	      active[10]=1;
	      ends[10]=1;
	      tdone[10]=1;
	    }
	    else {
	      switch(S341){
	      case 0 : 
		if(craft_o.get_w_s() == craft_o.get_w_r()){
		  tutu__1887027810 = 0;
		  tutu__1887027810 = craft_o.get_w_s();
		  tutu__1887027810++;
		  craft_o.set_w_s(tutu__1887027810);
		  craft_o.set_value(myvalues_thread_10);
		  S341=1;
		  if(craft_o.get_w_s() == craft_o.get_w_r()){
		    ends[10]=2;
		    ;
		    S337=3;
		    active[10]=1;
		    ends[10]=1;
		    tdone[10]=1;
		  }
		  else {
		    active[10]=1;
		    ends[10]=1;
		    tdone[10]=1;
		  }
		}
		else {
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
		break;
	      case 1 : 
		if(craft_o.get_w_s() == craft_o.get_w_r()){
		  ends[10]=2;
		  ;
		  S337=3;
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
		else {
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
		break;
	      }
	    }
	    break;
	  case 1 : 
	    S346=1;
	    S346=0;
	    if(craft_o.get_preempted()){
	      tutu__1804679029 = 0;
	      tutu__1804679029 = craft_o.get_preempted() ? craft_o.refresh() : 0;
	      S346=1;
	      active[10]=1;
	      ends[10]=1;
	      tdone[10]=1;
	    }
	    else {
	      S341=0;
	      if(craft_o.get_w_s() == craft_o.get_w_r()){
		tutu__1887027810 = 0;
		tutu__1887027810 = craft_o.get_w_s();
		tutu__1887027810++;
		craft_o.set_w_s(tutu__1887027810);
		craft_o.set_value(myvalues_thread_10);
		S341=1;
		if(craft_o.get_w_s() == craft_o.get_w_r()){
		  ends[10]=2;
		  ;
		  S337=3;
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
		else {
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
	      }
	      else {
		active[10]=1;
		ends[10]=1;
		tdone[10]=1;
	      }
	    }
	    break;
	  }
	  break;
	case 3 : 
	  S337=3;
	  request2_8.setPresent();
	  currsigs.addElement(request2_8);
	  System.out.println("Emitted request2_8");
	  S337=0;
	  active[10]=1;
	  ends[10]=1;
	  tdone[10]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1862019131(int [] tdone, int [] ends){
    if(tdone[9] != 1){
      switch(S335){
      case 0 : 
	active[9]=0;
	ends[9]=0;
	tdone[9]=1;
	break;
      case 1 : 
	switch(S324){
	case 0 : 
	  if((kitespeed_6.getprestatus() && kiteheading_6.getprestatus()) || request2_8.getprestatus()){
	    speed2_thread_9[counter_thread_9] = (Integer)kitespeed_6.getpreval();
	    heading2_thread_9[counter_thread_9] = (Integer)kiteheading_6.getpreval();
	    if(counter_thread_9 == (buffersize1_thread_9 - 1)) {
	      counter_thread_9 = 0;
	    }
	    else {
	      counter_thread_9 += 1;
	    }
	    s2_thread_9 = speed2_thread_9[counter2_thread_9];
	    h2_thread_9 = heading2_thread_9[counter2_thread_9];
	    if(counter2_thread_9 == (buffersize1_thread_9 - 1)) {
	      counter2_thread_9 = 0;
	    }
	    else {
	      counter2_thread_9 += 1;
	    }
	    spdTop2_8.setPresent();
	    currsigs.addElement(spdTop2_8);
	    spdTop2_8.setValue(s2_thread_9);
	    System.out.println("Emitted spdTop2_8");
	    hdTop2_8.setPresent();
	    currsigs.addElement(hdTop2_8);
	    hdTop2_8.setValue(h2_thread_9);
	    System.out.println("Emitted hdTop2_8");
	    S324=1;
	    active[9]=1;
	    ends[9]=1;
	    tdone[9]=1;
	  }
	  else {
	    active[9]=1;
	    ends[9]=1;
	    tdone[9]=1;
	  }
	  break;
	case 1 : 
	  S324=1;
	  S324=0;
	  if((kitespeed_6.getprestatus() && kiteheading_6.getprestatus()) || request2_8.getprestatus()){
	    speed2_thread_9[counter_thread_9] = (Integer)kitespeed_6.getpreval();
	    heading2_thread_9[counter_thread_9] = (Integer)kiteheading_6.getpreval();
	    if(counter_thread_9 == (buffersize1_thread_9 - 1)) {
	      counter_thread_9 = 0;
	    }
	    else {
	      counter_thread_9 += 1;
	    }
	    s2_thread_9 = speed2_thread_9[counter2_thread_9];
	    h2_thread_9 = heading2_thread_9[counter2_thread_9];
	    if(counter2_thread_9 == (buffersize1_thread_9 - 1)) {
	      counter2_thread_9 = 0;
	    }
	    else {
	      counter2_thread_9 += 1;
	    }
	    spdTop2_8.setPresent();
	    currsigs.addElement(spdTop2_8);
	    spdTop2_8.setValue(s2_thread_9);
	    System.out.println("Emitted spdTop2_8");
	    hdTop2_8.setPresent();
	    currsigs.addElement(hdTop2_8);
	    hdTop2_8.setValue(h2_thread_9);
	    System.out.println("Emitted hdTop2_8");
	    S324=1;
	    active[9]=1;
	    ends[9]=1;
	    tdone[9]=1;
	  }
	  else {
	    active[9]=1;
	    ends[9]=1;
	    tdone[9]=1;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1862403880(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      switch(S621){
      case 0 : 
	active[8]=0;
	ends[8]=0;
	tdone[8]=1;
	break;
      case 1 : 
	spdTop2_8.setClear();
	hdTop2_8.setClear();
	request2_8.setClear();
	thread1862019131(tdone,ends);
	thread1852400409(tdone,ends);
	int biggest1852785158 = 0;
	if(ends[9]>=biggest1852785158){
	  biggest1852785158=ends[9];
	}
	if(ends[10]>=biggest1852785158){
	  biggest1852785158=ends[10];
	}
	if(biggest1852785158 == 1){
	  active[8]=1;
	  ends[8]=1;
	  tdone[8]=1;
	}
	//FINXME code
	if(biggest1852785158 == 0){
	  S621=0;
	  active[8]=0;
	  ends[8]=0;
	  tdone[8]=1;
	}
	break;
      }
    }
  }
  public void thread1778143871(int [] tdone, int [] ends){
    if(tdone[7] != 1){
      switch(S318){
      case 0 : 
	active[7]=0;
	ends[7]=0;
	tdone[7]=1;
	break;
      case 1 : 
	switch(S314){
	case 0 : 
	  S314=0;
	  S314=1;
	  active[7]=1;
	  ends[7]=1;
	  tdone[7]=1;
	  break;
	case 1 : 
	  S314=1;
	  kitespeed_6.setPresent();
	  currsigs.addElement(kitespeed_6);
	  kitespeed_6.setValue(new Integer(13));
	  System.out.println("Emitted kitespeed_6");
	  kiteheading_6.setPresent();
	  currsigs.addElement(kiteheading_6);
	  kiteheading_6.setValue(new Integer(6));
	  System.out.println("Emitted kiteheading_6");
	  S314=2;
	  active[7]=1;
	  ends[7]=1;
	  tdone[7]=1;
	  break;
	case 2 : 
	  S314=2;
	  kitespeed_6.setPresent();
	  currsigs.addElement(kitespeed_6);
	  kitespeed_6.setValue(new Integer(2));
	  System.out.println("Emitted kitespeed_6");
	  kiteheading_6.setPresent();
	  currsigs.addElement(kiteheading_6);
	  kiteheading_6.setValue(new Integer(-4));
	  System.out.println("Emitted kiteheading_6");
	  S314=3;
	  active[7]=1;
	  ends[7]=1;
	  tdone[7]=1;
	  break;
	case 3 : 
	  S314=3;
	  kitespeed_6.setPresent();
	  currsigs.addElement(kitespeed_6);
	  kitespeed_6.setValue(new Integer(-100));
	  System.out.println("Emitted kitespeed_6");
	  kiteheading_6.setPresent();
	  currsigs.addElement(kiteheading_6);
	  kiteheading_6.setValue(new Integer(-700));
	  System.out.println("Emitted kiteheading_6");
	  S314=4;
	  active[7]=1;
	  ends[7]=1;
	  tdone[7]=1;
	  break;
	case 4 : 
	  S314=4;
	  kitespeed_6.setPresent();
	  currsigs.addElement(kitespeed_6);
	  kitespeed_6.setValue(new Integer(21));
	  System.out.println("Emitted kitespeed_6");
	  kiteheading_6.setPresent();
	  currsigs.addElement(kiteheading_6);
	  kiteheading_6.setValue(new Integer(16));
	  System.out.println("Emitted kiteheading_6");
	  S314=0;
	  active[7]=1;
	  ends[7]=1;
	  tdone[7]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1793149078(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      S619=1;
      buffersize1_thread_10 = 50;
      counter1_thread_10 = 0;
      s22_thread_10 = 0;
      h22_thread_10 = 0;
      request2_8.setPresent();
      currsigs.addElement(request2_8);
      System.out.println("Emitted request2_8");
      S337=0;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }
  public void thread1797381316(int [] tdone, int [] ends){
    if(tdone[9] != 1){
      S335=1;
      counter_thread_9 = 0;
      counter2_thread_9 = 0;
      s2_thread_9 = 0;
      h2_thread_9 = 0;
      buffersize1_thread_9 = 50;
      speed2_thread_9 = new int[buffersize1_thread_9];
      heading2_thread_9 = new int[buffersize1_thread_9];
      S324=0;
      if((kitespeed_6.getprestatus() && kiteheading_6.getprestatus()) || request2_8.getprestatus()){
	speed2_thread_9[counter_thread_9] = (Integer)kitespeed_6.getpreval();
	heading2_thread_9[counter_thread_9] = (Integer)kiteheading_6.getpreval();
	if(counter_thread_9 == (buffersize1_thread_9 - 1)) {
	  counter_thread_9 = 0;
	}
	else {
	  counter_thread_9 += 1;
	}
	s2_thread_9 = speed2_thread_9[counter2_thread_9];
	h2_thread_9 = heading2_thread_9[counter2_thread_9];
	if(counter2_thread_9 == (buffersize1_thread_9 - 1)) {
	  counter2_thread_9 = 0;
	}
	else {
	  counter2_thread_9 += 1;
	}
	spdTop2_8.setPresent();
	currsigs.addElement(spdTop2_8);
	spdTop2_8.setValue(s2_thread_9);
	System.out.println("Emitted spdTop2_8");
	hdTop2_8.setPresent();
	currsigs.addElement(hdTop2_8);
	hdTop2_8.setValue(h2_thread_9);
	System.out.println("Emitted hdTop2_8");
	S324=1;
	active[9]=1;
	ends[9]=1;
	tdone[9]=1;
      }
      else {
	active[9]=1;
	ends[9]=1;
	tdone[9]=1;
      }
    }
  }
  public void thread1797766065(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      spdTop2_8.setClear();
      hdTop2_8.setClear();
      request2_8.setClear();
      thread1797381316(tdone,ends);
      thread1793149078(tdone,ends);
      int biggest1792764329 = 0;
      if(ends[9]>=biggest1792764329){
	biggest1792764329=ends[9];
      }
      if(ends[10]>=biggest1792764329){
	biggest1792764329=ends[10];
      }
      if(biggest1792764329 == 1){
	active[8]=1;
	ends[8]=1;
	tdone[8]=1;
      }
    }
  }
  public void thread1790071087(int [] tdone, int [] ends){
    if(tdone[7] != 1){
      S318=1;
      kitespeed_6.setPresent();
      currsigs.addElement(kitespeed_6);
      kitespeed_6.setValue(new Integer(21));
      System.out.println("Emitted kitespeed_6");
      kiteheading_6.setPresent();
      currsigs.addElement(kiteheading_6);
      kiteheading_6.setValue(new Integer(16));
      System.out.println("Emitted kiteheading_6");
      S314=0;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S623){
      case 0 : 
	S623=0;
	break RUN;
      case 1 : 
	S623=2;
	kitespeed_6.setClear();
	kiteheading_6.setClear();
	thread1790071087(tdone,ends);
	thread1797766065(tdone,ends);
	int biggest1778528620 = 0;
	if(ends[7]>=biggest1778528620){
	  biggest1778528620=ends[7];
	}
	if(ends[8]>=biggest1778528620){
	  biggest1778528620=ends[8];
	}
	if(biggest1778528620 == 1){
	  active[6]=1;
	  ends[6]=1;
	  break RUN;
	}
	if(biggest1778528620 == 1){
	  active[6]=1;
	  ends[6]=1;
	  break RUN;
	}
      case 2 : 
	kitespeed_6.setClear();
	kiteheading_6.setClear();
	thread1778143871(tdone,ends);
	thread1862403880(tdone,ends);
	int biggest1851630911 = 0;
	if(ends[7]>=biggest1851630911){
	  biggest1851630911=ends[7];
	}
	if(ends[8]>=biggest1851630911){
	  biggest1851630911=ends[8];
	}
	if(biggest1851630911 == 1){
	  active[6]=1;
	  ends[6]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest1851630911 == 0){
	  S623=0;
	  active[6]=0;
	  ends[6]=0;
	  S623=0;
	  break RUN;
	}
      }
    }
  }
  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    kitespeed_6 = new Signal();
    kiteheading_6 = new Signal();
    spdTop2_8 = new Signal();
    hdTop2_8 = new Signal();
    request2_8 = new Signal();
    // --------------------------------------------------
  }
  int tick=0;
  public void run(){
    while(active[6] != 0){
      int index = 6;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
	for(int h=1;h<paused.length;++h){
	  paused[h]=0;
	}
      }
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
	craft_o.update_w_r();
	if(!df){
	  craft_o.gethook();
	  df = true;
	}
	Native.count(((0x1<<25)|0x7));
	runClockDomain();
	++tick;
	Native.count(0x7);
	Native.count(((0x1<<25)|(0x1<<26)|0x7));
	int fmc = Native.hc(0x1);
	int eot = Native.hc(0x0);
	int mmc = Native.hc(0x2);
	int foc = Native.hc(0x3);
	int moc = Native.hc(0x4);
	System.out.println("VAL Craft,"+tick+","+eot+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }

      kitespeed_6.setpreclear();
      kiteheading_6.setpreclear();
      spdTop2_8.setpreclear();
      hdTop2_8.setpreclear();
      request2_8.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      kitespeed_6.setClear();
      kiteheading_6.setClear();
      spdTop2_8.setClear();
      hdTop2_8.setClear();
      request2_8.setClear();
      craft_o.sethook();
      if(paused[6]!=0 || suspended[6]!=0 || active[6]!=1);
      else{
	craft_o.gethook();
      }
      if(active[6] == 0){
	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
