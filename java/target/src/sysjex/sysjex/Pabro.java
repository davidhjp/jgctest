package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import buffer.*;
import fibonacci.*;
import com.jopdesign.sys.Native;

public class Pabro extends ClockDomain{
  public Pabro(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public Signal O = new Signal();
  public output_Channel producerChannel_o = new output_Channel();
  private static Signal Obc_1;
  private static Signal A_1;
  private static Signal B_1;
  private static Signal R_1;
  private static int timer_thread_2;
  private static FibonacciGenerator f_thread_6;
  private static int data_thread_6;
  private static int tutu__802945073;
  private static int tutu__2062432552;
  private static int tutu__746002235;
  private static int tutu__1445560146;
  private static int tutu__755620958;
  private static int tutu__1671750477;
  private static int tutu__716761319;
  private static int tutu__931925297;
  private static int S485 = 1;
  private static int S47 = 1;
  private static int S4 = 1;
  private static int S73 = 1;
  private static int S72 = 1;
  private static int S54 = 1;
  private static int S50 = 1;
  private static int S53 = 1;
  private static int S483 = 1;
  private static int S76 = 1;
  private static int S83 = 1;
  private static int S78 = 1;
	
  private static int[] ends = new int[16];
  private static int[] tdone = new int[16];
  public void thread2022214337(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      switch(S483){
      case 0 : 
	active[6]=0;
	ends[6]=0;
	tdone[6]=1;
	break;
      case 1 : 
	switch(S76){
	case 0 : 
	  if(Obc_1.getprestatus()){
	    O.setPresent();
	    currsigs.addElement(O);
	    //.println("Emitted O");
	    data_thread_6 = f_thread_6.getNext();
	    S76=1;
	    S83=0;
	    if(producerChannel_o.get_preempted()){
	      tutu__1445560146 = 0;
	      tutu__1445560146 = producerChannel_o.get_preempted() ? producerChannel_o.refresh() : 0;
	      S83=1;
	      active[6]=1;
	      ends[6]=1;
	      tdone[6]=1;
	    }
	    else {
	      S78=0;
	      if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		tutu__746002235 = 0;
		tutu__746002235 = producerChannel_o.get_w_s();
		tutu__746002235++;
		producerChannel_o.set_w_s(tutu__746002235);
		producerChannel_o.set_value(new Integer(data_thread_6));
		S78=1;
		if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		  ends[6]=2;
		  ;
		  S76=2;
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
		else {
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
	      }
	      else {
		active[6]=1;
		ends[6]=1;
		tdone[6]=1;
	      }
	    }
	  }
	  else {
	    active[6]=1;
	    ends[6]=1;
	    tdone[6]=1;
	  }
	  break;
	case 1 : 
	  switch(S83){
	  case 0 : 
	    if(producerChannel_o.get_preempted()){
	      tutu__1671750477 = 0;
	      tutu__1671750477 = producerChannel_o.get_preempted() ? producerChannel_o.refresh() : 0;
	      S83=1;
	      active[6]=1;
	      ends[6]=1;
	      tdone[6]=1;
	    }
	    else {
	      switch(S78){
	      case 0 : 
		if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		  tutu__755620958 = 0;
		  tutu__755620958 = producerChannel_o.get_w_s();
		  tutu__755620958++;
		  producerChannel_o.set_w_s(tutu__755620958);
		  producerChannel_o.set_value(new Integer(data_thread_6));
		  S78=1;
		  if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		    ends[6]=2;
		    ;
		    S76=2;
		    active[6]=1;
		    ends[6]=1;
		    tdone[6]=1;
		  }
		  else {
		    active[6]=1;
		    ends[6]=1;
		    tdone[6]=1;
		  }
		}
		else {
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
		break;
	      case 1 : 
		if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		  ends[6]=2;
		  ;
		  S76=2;
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
		else {
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
		break;
	      }
	    }
	    break;
	  case 1 : 
	    S83=1;
	    S83=0;
	    if(producerChannel_o.get_preempted()){
	      tutu__1671750477 = 0;
	      tutu__1671750477 = producerChannel_o.get_preempted() ? producerChannel_o.refresh() : 0;
	      S83=1;
	      active[6]=1;
	      ends[6]=1;
	      tdone[6]=1;
	    }
	    else {
	      S78=0;
	      if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		tutu__755620958 = 0;
		tutu__755620958 = producerChannel_o.get_w_s();
		tutu__755620958++;
		producerChannel_o.set_w_s(tutu__755620958);
		producerChannel_o.set_value(new Integer(data_thread_6));
		S78=1;
		if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		  ends[6]=2;
		  ;
		  S76=2;
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
		else {
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
	      }
	      else {
		active[6]=1;
		ends[6]=1;
		tdone[6]=1;
	      }
	    }
	    break;
	  }
	  break;
	case 2 : 
	  S76=2;
	  S76=0;
	  if(Obc_1.getprestatus()){
	    O.setPresent();
	    currsigs.addElement(O);
	    //.println("Emitted O");
	    data_thread_6 = f_thread_6.getNext();
	    S76=1;
	    S83=0;
	    if(producerChannel_o.get_preempted()){
	      tutu__931925297 = 0;
	      tutu__931925297 = producerChannel_o.get_preempted() ? producerChannel_o.refresh() : 0;
	      S83=1;
	      active[6]=1;
	      ends[6]=1;
	      tdone[6]=1;
	    }
	    else {
	      S78=0;
	      if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		tutu__716761319 = 0;
		tutu__716761319 = producerChannel_o.get_w_s();
		tutu__716761319++;
		producerChannel_o.set_w_s(tutu__716761319);
		producerChannel_o.set_value(new Integer(data_thread_6));
		S78=1;
		if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
		  ends[6]=2;
		  ;
		  S76=2;
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
		else {
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
	      }
	      else {
		active[6]=1;
		ends[6]=1;
		tdone[6]=1;
	      }
	    }
	  }
	  else {
	    active[6]=1;
	    ends[6]=1;
	    tdone[6]=1;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread2021444839(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      switch(S53){
      case 0 : 
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
	break;
      case 1 : 
	if(B_1.getprestatus()){
	  S53=0;
	  active[5]=0;
	  ends[5]=0;
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
  }
  public void thread2023368584(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      switch(S50){
      case 0 : 
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
	break;
      case 1 : 
	if(A_1.getprestatus()){
	  S50=0;
	  active[4]=0;
	  ends[4]=0;
	  tdone[4]=1;
	}
	else {
	  active[4]=1;
	  ends[4]=1;
	  tdone[4]=1;
	}
	break;
      }
    }
  }
  public void thread2022599086(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S53=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }
  public void thread2022983835(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S50=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }
  public void thread2024907579(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      switch(S73){
      case 0 : 
	active[3]=0;
	ends[3]=0;
	tdone[3]=1;
	break;
      case 1 : 
	switch(S72){
	case 0 : 
	  if(R_1.getprestatus()){
	    S54=0;
	    thread2022983835(tdone,ends);
	    thread2022599086(tdone,ends);
	    int biggest2023753333 = 0;
	    if(ends[4]>=biggest2023753333){
	      biggest2023753333=ends[4];
	    }
	    if(ends[5]>=biggest2023753333){
	      biggest2023753333=ends[5];
	    }
	    if(biggest2023753333 == 1){
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	    }
	  }
	  else {
	    switch(S54){
	    case 0 : 
	      thread2023368584(tdone,ends);
	      thread2021444839(tdone,ends);
	      int biggest2021060090 = 0;
	      if(ends[4]>=biggest2021060090){
		biggest2021060090=ends[4];
	      }
	      if(ends[5]>=biggest2021060090){
		biggest2021060090=ends[5];
	      }
	      if(biggest2021060090 == 1){
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      //FINXME code
	      if(biggest2021060090 == 0){
		Obc_1.setPresent();
		currsigs.addElement(Obc_1);
		//.println("Emitted Obc_1");
		S54=1;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      break;
	    case 1 : 
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	      break;
	    }
	  }
	  break;
	case 1 : 
	  S72=1;
	  S73=0;
	  active[3]=0;
	  ends[3]=0;
	  tdone[3]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread2025292328(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      switch(S47){
      case 0 : 
	active[2]=0;
	ends[2]=0;
	tdone[2]=1;
	break;
      case 1 : 
	switch(S4){
	case 0 : 
	  S4=0;
	  S4=1;
	  active[2]=1;
	  ends[2]=1;
	  tdone[2]=1;
	  break;
	case 1 : 
	  if(R_1.getprestatus()){
	    S47=0;
	    active[2]=0;
	    ends[2]=0;
	    tdone[2]=1;
	  }
	  else {
	    if(timer_thread_2 == 100){
	      R_1.setPresent();
	      currsigs.addElement(R_1);
	      //.println("Emitted R_1");
	      active[2]=1;
	      ends[2]=1;
	      tdone[2]=1;
	    }
	    else {
	      timer_thread_2 = timer_thread_2 + 1;
	      Obc_1.setPresent();
	      currsigs.addElement(Obc_1);
	      //.println("Emitted Obc_1");
	      active[2]=1;
	      ends[2]=1;
	      tdone[2]=1;
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread2026446575(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      S483=1;
      f_thread_6 = new FibonacciGenerator();
      data_thread_6 = 0;
      S76=0;
      if(Obc_1.getprestatus()){
	O.setPresent();
	currsigs.addElement(O);
	//.println("Emitted O");
	data_thread_6 = f_thread_6.getNext();
	S76=1;
	S83=0;
	if(producerChannel_o.get_preempted()){
	  tutu__2062432552 = 0;
	  tutu__2062432552 = producerChannel_o.get_preempted() ? producerChannel_o.refresh() : 0;
	  S83=1;
	  active[6]=1;
	  ends[6]=1;
	  tdone[6]=1;
	}
	else {
	  S78=0;
	  if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
	    tutu__802945073 = 0;
	    tutu__802945073 = producerChannel_o.get_w_s();
	    tutu__802945073++;
	    producerChannel_o.set_w_s(tutu__802945073);
	    producerChannel_o.set_value(new Integer(data_thread_6));
	    S78=1;
	    if(producerChannel_o.get_w_s() == producerChannel_o.get_w_r()){
	      ends[6]=2;
	      ;
	      S76=2;
	      active[6]=1;
	      ends[6]=1;
	      tdone[6]=1;
	    }
	    else {
	      active[6]=1;
	      ends[6]=1;
	      tdone[6]=1;
	    }
	  }
	  else {
	    active[6]=1;
	    ends[6]=1;
	    tdone[6]=1;
	  }
	}
      }
      else {
	active[6]=1;
	ends[6]=1;
	tdone[6]=1;
      }
    }
  }
  public void thread2025677077(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S53=1;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }
  public void thread2026061826(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S50=1;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }
  public void thread2015673606(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      S73=1;
      S72=0;
      S54=0;
      thread2026061826(tdone,ends);
      thread2025677077(tdone,ends);
      int biggest2026831324 = 0;
      if(ends[4]>=biggest2026831324){
	biggest2026831324=ends[4];
      }
      if(ends[5]>=biggest2026831324){
	biggest2026831324=ends[5];
      }
      if(biggest2026831324 == 1){
	active[3]=1;
	ends[3]=1;
	tdone[3]=1;
      }
    }
  }
  public void thread2016058355(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      S47=1;
      A_1.setPresent();
      currsigs.addElement(A_1);
      //.println("Emitted A_1");
      B_1.setPresent();
      currsigs.addElement(B_1);
      //.println("Emitted B_1");
      S4=0;
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
      switch(S485){
      case 0 : 
	S485=0;
	break RUN;
      case 1 : 
	S485=2;
	Obc_1.setClear();
	A_1.setClear();
	B_1.setClear();
	R_1.setClear();
	thread2016058355(tdone,ends);
	thread2015673606(tdone,ends);
	thread2026446575(tdone,ends);
	int biggest2024138081 = 0;
	if(ends[2]>=biggest2024138081){
	  biggest2024138081=ends[2];
	}
	if(ends[3]>=biggest2024138081){
	  biggest2024138081=ends[3];
	}
	if(ends[6]>=biggest2024138081){
	  biggest2024138081=ends[6];
	}
	if(biggest2024138081 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
      case 2 : 
	Obc_1.setClear();
	A_1.setClear();
	B_1.setClear();
	R_1.setClear();
	thread2025292328(tdone,ends);
	thread2024907579(tdone,ends);
	thread2022214337(tdone,ends);
	int biggest2008363377 = 0;
	if(ends[2]>=biggest2008363377){
	  biggest2008363377=ends[2];
	}
	if(ends[3]>=biggest2008363377){
	  biggest2008363377=ends[3];
	}
	if(ends[6]>=biggest2008363377){
	  biggest2008363377=ends[6];
	}
	if(biggest2008363377 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest2008363377 == 0){
	  S485=0;
	  active[1]=0;
	  ends[1]=0;
	  S485=0;
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
    Obc_1 = new Signal();
    A_1 = new Signal();
    B_1 = new Signal();
    R_1 = new Signal();
    // --------------------------------------------------
  }
  private int tick = 0;
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
	producerChannel_o.update_w_r();
	if(!df){
	  producerChannel_o.gethook();
	  df = true;
	}
	Native.count(((0x1<<25)|0x7));
	runClockDomain();
	++tick;
	Native.count(0x7);
	Native.count(((0x1<<25)|(0x1<<26)|0x7));
	int eot = Native.hc(0x0);
	int fmc = Native.hc(0x1);
	int mmc = Native.hc(0x2);
	int foc = Native.hc(0x3);
	int moc = Native.hc(0x4);
	System.err.println("VAL Pabro,"+(tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      O.setpreclear();
      Obc_1.setpreclear();
      A_1.setpreclear();
      B_1.setpreclear();
      R_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      O.sethook();
      O.setClear();
      Obc_1.setClear();
      A_1.setClear();
      B_1.setClear();
      R_1.setClear();
      producerChannel_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
	producerChannel_o.gethook();
      }
      if(active[1] == 0){
	System.err.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
