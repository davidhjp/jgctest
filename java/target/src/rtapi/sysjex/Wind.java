package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import com.jopdesign.sys.Native;


public class Wind extends ClockDomain{
  public Wind(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public output_Channel wind_o = new output_Channel();
  private static Signal windspeed_1;
  private static Signal windheading_1;
  private static Signal spdTop_3;
  private static Signal hdTop_3;
  private static Signal request_3;
  private static int buffersize_thread_4;
  private static int[] speed1_thread_4;
  private static int[] heading1_thread_4;
  private static int counter111_thread_4;
  private static int counter222_thread_4;
  private static Integer s1_thread_4;
  private static Integer h1_thread_4;
  private static int buffersize_thread_5;
  private static int counter11_thread_5;
  private static Integer s11_thread_5;
  private static Integer h11_thread_5;
  private static Vector myvalues1_thread_5;
  private static int tutu__593117259;
  private static int tutu__1439514339;
  private static int tutu__613508950;
  private static int tutu__328373957;
  private static int S311 = 1;
  private static int S6 = 1;
  private static int S2 = 1;
  private static int S309 = 1;
  private static int S23 = 1;
  private static int S12 = 1;
  private static int S307 = 1;
  private static int S25 = 1;
  private static int S34 = 1;
  private static int S29 = 1;
	
  private static int[] ends = new int[16];
  private static int[] tdone = new int[16];
  public void thread1807384787(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      switch(S307){
      case 0 : 
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
	break;
      case 1 : 
	switch(S25){
	case 0 : 
	  S25=0;
	  S25=1;
	  active[5]=1;
	  ends[5]=1;
	  tdone[5]=1;
	  break;
	case 1 : 
	  if(spdTop_3.getprestatus()){
	    s11_thread_5 = (Integer)spdTop_3.getpreval();
	    h11_thread_5 = (Integer)hdTop_3.getpreval();
	    myvalues1_thread_5 = new Vector(2);
	    myvalues1_thread_5.addElement(s11_thread_5);
	    myvalues1_thread_5.addElement(h11_thread_5);
	    if(counter11_thread_5 == (buffersize_thread_5 - 1)) {
	      counter11_thread_5 = 0;
	    }
	    else {
	      counter11_thread_5 += 1;
	    }
	    S25=2;
	    S34=0;
	    if(wind_o.get_preempted()){
	      tutu__1439514339 = 0;
	      tutu__1439514339 = wind_o.get_preempted() ? wind_o.refresh() : 0;
	      S34=1;
	      active[5]=1;
	      ends[5]=1;
	      tdone[5]=1;
	    }
	    else {
	      S29=0;
	      if(wind_o.get_w_s() == wind_o.get_w_r()){
		tutu__593117259 = 0;
		tutu__593117259 = wind_o.get_w_s();
		tutu__593117259++;
		wind_o.set_w_s(tutu__593117259);
		wind_o.set_value(myvalues1_thread_5);
		S29=1;
		if(wind_o.get_w_s() == wind_o.get_w_r()){
		  ends[5]=2;
		  ;
		  S25=3;
		  active[5]=1;
		  ends[5]=1;
		  tdone[5]=1;
		}
		else {
		  active[5]=1;
		  ends[5]=1;
		  tdone[5]=1;
		}
	      }
	      else {
		active[5]=1;
		ends[5]=1;
		tdone[5]=1;
	      }
	    }
	  }
	  else {
	    active[5]=1;
	    ends[5]=1;
	    tdone[5]=1;
	  }
	  break;
	case 2 : 
	  switch(S34){
	  case 0 : 
	    if(wind_o.get_preempted()){
	      tutu__328373957 = 0;
	      tutu__328373957 = wind_o.get_preempted() ? wind_o.refresh() : 0;
	      S34=1;
	      active[5]=1;
	      ends[5]=1;
	      tdone[5]=1;
	    }
	    else {
	      switch(S29){
	      case 0 : 
		if(wind_o.get_w_s() == wind_o.get_w_r()){
		  tutu__613508950 = 0;
		  tutu__613508950 = wind_o.get_w_s();
		  tutu__613508950++;
		  wind_o.set_w_s(tutu__613508950);
		  wind_o.set_value(myvalues1_thread_5);
		  S29=1;
		  if(wind_o.get_w_s() == wind_o.get_w_r()){
		    ends[5]=2;
		    ;
		    S25=3;
		    active[5]=1;
		    ends[5]=1;
		    tdone[5]=1;
		  }
		  else {
		    active[5]=1;
		    ends[5]=1;
		    tdone[5]=1;
		  }
		}
		else {
		  active[5]=1;
		  ends[5]=1;
		  tdone[5]=1;
		}
		break;
	      case 1 : 
		if(wind_o.get_w_s() == wind_o.get_w_r()){
		  ends[5]=2;
		  ;
		  S25=3;
		  active[5]=1;
		  ends[5]=1;
		  tdone[5]=1;
		}
		else {
		  active[5]=1;
		  ends[5]=1;
		  tdone[5]=1;
		}
		break;
	      }
	    }
	    break;
	  case 1 : 
	    S34=1;
	    S34=0;
	    if(wind_o.get_preempted()){
	      tutu__328373957 = 0;
	      tutu__328373957 = wind_o.get_preempted() ? wind_o.refresh() : 0;
	      S34=1;
	      active[5]=1;
	      ends[5]=1;
	      tdone[5]=1;
	    }
	    else {
	      S29=0;
	      if(wind_o.get_w_s() == wind_o.get_w_r()){
		tutu__613508950 = 0;
		tutu__613508950 = wind_o.get_w_s();
		tutu__613508950++;
		wind_o.set_w_s(tutu__613508950);
		wind_o.set_value(myvalues1_thread_5);
		S29=1;
		if(wind_o.get_w_s() == wind_o.get_w_r()){
		  ends[5]=2;
		  ;
		  S25=3;
		  active[5]=1;
		  ends[5]=1;
		  tdone[5]=1;
		}
		else {
		  active[5]=1;
		  ends[5]=1;
		  tdone[5]=1;
		}
	      }
	      else {
		active[5]=1;
		ends[5]=1;
		tdone[5]=1;
	      }
	    }
	    break;
	  }
	  break;
	case 3 : 
	  S25=3;
	  request_3.setPresent();
	  currsigs.addElement(request_3);
	  System.out.println("Emitted request_3");
	  S25=0;
	  active[5]=1;
	  ends[5]=1;
	  tdone[5]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1803152549(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      switch(S23){
      case 0 : 
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
	break;
      case 1 : 
	switch(S12){
	case 0 : 
	  if((windspeed_1.getprestatus() && windheading_1.getprestatus()) || request_3.getprestatus()){
	    speed1_thread_4[counter111_thread_4] = (Integer)windspeed_1.getpreval();
	    heading1_thread_4[counter111_thread_4] = (Integer)windheading_1.getpreval();
	    if(counter111_thread_4 == (buffersize_thread_4 - 1)) {
	      counter111_thread_4 = 0;
	    }
	    else {
	      counter111_thread_4 += 1;
	    }
	    s1_thread_4 = speed1_thread_4[counter222_thread_4];
	    h1_thread_4 = heading1_thread_4[counter222_thread_4];
	    if(counter222_thread_4 == (buffersize_thread_4 - 1)) {
	      counter222_thread_4 = 0;
	    }
	    else {
	      counter222_thread_4 += 1;
	    }
	    spdTop_3.setPresent();
	    currsigs.addElement(spdTop_3);
	    spdTop_3.setValue(s1_thread_4);
	    System.out.println("Emitted spdTop_3");
	    hdTop_3.setPresent();
	    currsigs.addElement(hdTop_3);
	    hdTop_3.setValue(h1_thread_4);
	    System.out.println("Emitted hdTop_3");
	    S12=1;
	    active[4]=1;
	    ends[4]=1;
	    tdone[4]=1;
	  }
	  else {
	    active[4]=1;
	    ends[4]=1;
	    tdone[4]=1;
	  }
	  break;
	case 1 : 
	  S12=1;
	  S12=0;
	  if((windspeed_1.getprestatus() && windheading_1.getprestatus()) || request_3.getprestatus()){
	    speed1_thread_4[counter111_thread_4] = (Integer)windspeed_1.getpreval();
	    heading1_thread_4[counter111_thread_4] = (Integer)windheading_1.getpreval();
	    if(counter111_thread_4 == (buffersize_thread_4 - 1)) {
	      counter111_thread_4 = 0;
	    }
	    else {
	      counter111_thread_4 += 1;
	    }
	    s1_thread_4 = speed1_thread_4[counter222_thread_4];
	    h1_thread_4 = heading1_thread_4[counter222_thread_4];
	    if(counter222_thread_4 == (buffersize_thread_4 - 1)) {
	      counter222_thread_4 = 0;
	    }
	    else {
	      counter222_thread_4 += 1;
	    }
	    spdTop_3.setPresent();
	    currsigs.addElement(spdTop_3);
	    spdTop_3.setValue(s1_thread_4);
	    System.out.println("Emitted spdTop_3");
	    hdTop_3.setPresent();
	    currsigs.addElement(hdTop_3);
	    hdTop_3.setValue(h1_thread_4);
	    System.out.println("Emitted hdTop_3");
	    S12=1;
	    active[4]=1;
	    ends[4]=1;
	    tdone[4]=1;
	  }
	  else {
	    active[4]=1;
	    ends[4]=1;
	    tdone[4]=1;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1817388259(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      switch(S309){
      case 0 : 
	active[3]=0;
	ends[3]=0;
	tdone[3]=1;
	break;
      case 1 : 
	spdTop_3.setClear();
	hdTop_3.setClear();
	request_3.setClear();
	thread1803152549(tdone,ends);
	thread1807384787(tdone,ends);
	int biggest1806230541 = 0;
	if(ends[4]>=biggest1806230541){
	  biggest1806230541=ends[4];
	}
	if(ends[5]>=biggest1806230541){
	  biggest1806230541=ends[5];
	}
	if(biggest1806230541 == 1){
	  active[3]=1;
	  ends[3]=1;
	  tdone[3]=1;
	}
	//FINXME code
	if(biggest1806230541 == 0){
	  S309=0;
	  active[3]=0;
	  ends[3]=0;
	  tdone[3]=1;
	}
	break;
      }
    }
  }
  public void thread1734667245(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      switch(S6){
      case 0 : 
	active[2]=0;
	ends[2]=0;
	tdone[2]=1;
	break;
      case 1 : 
	switch(S2){
	case 0 : 
	  S2=0;
	  windspeed_1.setPresent();
	  currsigs.addElement(windspeed_1);
	  windspeed_1.setValue(new Integer(30));
	  System.out.println("Emitted windspeed_1");
	  windheading_1.setPresent();
	  currsigs.addElement(windheading_1);
	  windheading_1.setValue(new Integer(11));
	  System.out.println("Emitted windheading_1");
	  S2=1;
	  active[2]=1;
	  ends[2]=1;
	  tdone[2]=1;
	  break;
	case 1 : 
	  S2=1;
	  windspeed_1.setPresent();
	  currsigs.addElement(windspeed_1);
	  windspeed_1.setValue(new Integer(-12));
	  System.out.println("Emitted windspeed_1");
	  windheading_1.setPresent();
	  currsigs.addElement(windheading_1);
	  windheading_1.setValue(new Integer(-22));
	  System.out.println("Emitted windheading_1");
	  S2=2;
	  active[2]=1;
	  ends[2]=1;
	  tdone[2]=1;
	  break;
	case 2 : 
	  S2=2;
	  windspeed_1.setPresent();
	  currsigs.addElement(windspeed_1);
	  windspeed_1.setValue(new Integer(-450));
	  System.out.println("Emitted windspeed_1");
	  windheading_1.setPresent();
	  currsigs.addElement(windheading_1);
	  windheading_1.setValue(new Integer(-304));
	  System.out.println("Emitted windheading_1");
	  S2=3;
	  active[2]=1;
	  ends[2]=1;
	  tdone[2]=1;
	  break;
	case 3 : 
	  S2=3;
	  windspeed_1.setPresent();
	  currsigs.addElement(windspeed_1);
	  windspeed_1.setValue(new Integer(14));
	  System.out.println("Emitted windspeed_1");
	  windheading_1.setPresent();
	  currsigs.addElement(windheading_1);
	  windheading_1.setValue(new Integer(22));
	  System.out.println("Emitted windheading_1");
	  S2=0;
	  active[2]=1;
	  ends[2]=1;
	  tdone[2]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1735821492(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S307=1;
      buffersize_thread_5 = 80;
      counter11_thread_5 = 0;
      s11_thread_5 = 0;
      h11_thread_5 = 0;
      request_3.setPresent();
      currsigs.addElement(request_3);
      System.out.println("Emitted request_3");
      S25=0;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }
  public void thread1726202769(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S23=1;
      buffersize_thread_4 = 80;
      speed1_thread_4 = new int[buffersize_thread_4];
      heading1_thread_4 = new int[buffersize_thread_4];
      counter111_thread_4 = 0;
      counter222_thread_4 = 0;
      s1_thread_4 = 0;
      h1_thread_4 = 0;
      S12=0;
      if((windspeed_1.getprestatus() && windheading_1.getprestatus()) || request_3.getprestatus()){
	speed1_thread_4[counter111_thread_4] = (Integer)windspeed_1.getpreval();
	heading1_thread_4[counter111_thread_4] = (Integer)windheading_1.getpreval();
	if(counter111_thread_4 == (buffersize_thread_4 - 1)) {
	  counter111_thread_4 = 0;
	}
	else {
	  counter111_thread_4 += 1;
	}
	s1_thread_4 = speed1_thread_4[counter222_thread_4];
	h1_thread_4 = heading1_thread_4[counter222_thread_4];
	if(counter222_thread_4 == (buffersize_thread_4 - 1)) {
	  counter222_thread_4 = 0;
	}
	else {
	  counter222_thread_4 += 1;
	}
	spdTop_3.setPresent();
	currsigs.addElement(spdTop_3);
	spdTop_3.setValue(s1_thread_4);
	System.out.println("Emitted spdTop_3");
	hdTop_3.setPresent();
	currsigs.addElement(hdTop_3);
	hdTop_3.setValue(h1_thread_4);
	System.out.println("Emitted hdTop_3");
	S12=1;
	active[4]=1;
	ends[4]=1;
	tdone[4]=1;
      }
      else {
	active[4]=1;
	ends[4]=1;
	tdone[4]=1;
      }
    }
  }
  public void thread1728126514(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      spdTop_3.setClear();
      hdTop_3.setClear();
      request_3.setClear();
      thread1726202769(tdone,ends);
      thread1735821492(tdone,ends);
      int biggest1733897747 = 0;
      if(ends[4]>=biggest1733897747){
	biggest1733897747=ends[4];
      }
      if(ends[5]>=biggest1733897747){
	biggest1733897747=ends[5];
      }
      if(biggest1733897747 == 1){
	active[3]=1;
	ends[3]=1;
	tdone[3]=1;
      }
    }
  }
  public void thread1745055466(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      S6=1;
      windspeed_1.setPresent();
      currsigs.addElement(windspeed_1);
      windspeed_1.setValue(new Integer(14));
      System.out.println("Emitted windspeed_1");
      windheading_1.setPresent();
      currsigs.addElement(windheading_1);
      windheading_1.setValue(new Integer(22));
      System.out.println("Emitted windheading_1");
      S2=0;
      active[2]=1;
      ends[2]=1;
      tdone[2]=1;
    }
  }
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S311){
      case 0 : 
	S311=0;
	break RUN;
      case 1 : 
	S311=2;
	windspeed_1.setClear();
	windheading_1.setClear();
	thread1745055466(tdone,ends);
	thread1728126514(tdone,ends);
	int biggest1733512999 = 0;
	if(ends[2]>=biggest1733512999){
	  biggest1733512999=ends[2];
	}
	if(ends[3]>=biggest1733512999){
	  biggest1733512999=ends[3];
	}
	if(biggest1733512999 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
	if(biggest1733512999 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
      case 2 : 
	windspeed_1.setClear();
	windheading_1.setClear();
	thread1734667245(tdone,ends);
	thread1817388259(tdone,ends);
	int biggest1807000038 = 0;
	if(ends[2]>=biggest1807000038){
	  biggest1807000038=ends[2];
	}
	if(ends[3]>=biggest1807000038){
	  biggest1807000038=ends[3];
	}
	if(biggest1807000038 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest1807000038 == 0){
	  S311=0;
	  active[1]=0;
	  ends[1]=0;
	  S311=0;
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
    windspeed_1 = new Signal();
    windheading_1 = new Signal();
    spdTop_3 = new Signal();
    hdTop_3 = new Signal();
    request_3 = new Signal();
    // --------------------------------------------------
  }
  int tick=0;
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
	for(int h=1;h<paused.length;++h){
	  paused[h]=0;
	}
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
	wind_o.update_w_r();
	if(!df){
	  wind_o.gethook();
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
	System.out.println("VAL Wind,"+tick+","+eot+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }

      windspeed_1.setpreclear();
      windheading_1.setpreclear();
      spdTop_3.setpreclear();
      hdTop_3.setpreclear();
      request_3.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      windspeed_1.setClear();
      windheading_1.setClear();
      spdTop_3.setClear();
      hdTop_3.setClear();
      request_3.setClear();
      wind_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
	wind_o.gethook();
      }
      if(active[1] == 0){
	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
