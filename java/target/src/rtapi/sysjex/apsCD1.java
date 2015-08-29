package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import Asproto.*;
import com.jopdesign.sys.Native;

public class apsCD1 extends ClockDomain{
  public apsCD1(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public output_Channel reset1_o = new output_Channel();
  public output_Channel data1_o = new output_Channel();
  private static Signal breakme_1;
  private static byte[] tosend_thread_3;
  private static int y_thread_3;
  private static int tutu__1575963473;
  private static int tutu__1455891304;
  private static int tutu__848418627;
  private static int tutu__1226402325;
  private static int tutu__1660223482;
  private static int tutu__1807839633;
  private static int len_thread_3;
  private static byte r_thread_3;
  private static int tutu__885739271;
  private static int tutu__813548153;
  private static int S590 = 1;
  private static int S24 = 1;
  private static int S7 = 1;
  private static int S2 = 1;
  private static int S588 = 1;
  private static int S25 = 1;
  private static int S28 = 1;
  private static int S36 = 1;
  private static int S31 = 1;
	
  private static int[] ends = new int[11];
  private static int[] tdone = new int[11];
  public void thread789167297(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      switch(S588){
      case 0 : 
	active[3]=0;
	ends[3]=0;
	tdone[3]=1;
	break;
      case 1 : 
	switch(S25){
	case 0 : 
	  if(breakme_1.getprestatus()){
	    S25=1;
	    len_thread_3 = 0;
	    len_thread_3 = tosend_thread_3.length;
	    S28=0;
	    if(y_thread_3 == len_thread_3){
	      breakme_1.setPresent();
	      currsigs.addElement(breakme_1);
	      //.println("Emitted breakme_1");
	      S28=1;
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	    }
	    else {
	      r_thread_3 = 0;
	      r_thread_3 = tosend_thread_3[y_thread_3];
	      S36=0;
	      if(data1_o.get_preempted()){
		tutu__1226402325 = 0;
		tutu__1226402325 = data1_o.get_preempted() ? data1_o.refresh() : 0;
		S36=1;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      else {
		S31=0;
		if(data1_o.get_w_s() == data1_o.get_w_r()){
		  tutu__848418627 = 0;
		  tutu__848418627 = data1_o.get_w_s();
		  tutu__848418627++;
		  data1_o.set_w_s(tutu__848418627);
		  data1_o.set_value(new Byte(r_thread_3));
		  S31=1;
		  if(data1_o.get_w_s() == data1_o.get_w_r()){
		    ends[3]=2;
		    ;
		    y_thread_3 = y_thread_3 + 1;
		    S28=1;
		    active[3]=1;
		    ends[3]=1;
		    tdone[3]=1;
		  }
		  else {
		    active[3]=1;
		    ends[3]=1;
		    tdone[3]=1;
		  }
		}
		else {
		  active[3]=1;
		  ends[3]=1;
		  tdone[3]=1;
		}
	      }
	    }
	  }
	  else {
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  break;
	case 1 : 
	  if(breakme_1.getprestatus()){
	    data1_o.refresh();
	    S588=0;
	    active[3]=0;
	    ends[3]=0;
	    tdone[3]=1;
	  }
	  else {
	    switch(S28){
	    case 0 : 
	      switch(S36){
	      case 0 : 
		if(data1_o.get_preempted()){
		  tutu__1807839633 = 0;
		  tutu__1807839633 = data1_o.get_preempted() ? data1_o.refresh() : 0;
		  S36=1;
		  active[3]=1;
		  ends[3]=1;
		  tdone[3]=1;
		}
		else {
		  switch(S31){
		  case 0 : 
		    if(data1_o.get_w_s() == data1_o.get_w_r()){
		      tutu__1660223482 = 0;
		      tutu__1660223482 = data1_o.get_w_s();
		      tutu__1660223482++;
		      data1_o.set_w_s(tutu__1660223482);
		      data1_o.set_value(new Byte(r_thread_3));
		      S31=1;
		      if(data1_o.get_w_s() == data1_o.get_w_r()){
			ends[3]=2;
			;
			y_thread_3 = y_thread_3 + 1;
			S28=1;
			active[3]=1;
			ends[3]=1;
			tdone[3]=1;
		      }
		      else {
			active[3]=1;
			ends[3]=1;
			tdone[3]=1;
		      }
		    }
		    else {
		      active[3]=1;
		      ends[3]=1;
		      tdone[3]=1;
		    }
		    break;
		  case 1 : 
		    if(data1_o.get_w_s() == data1_o.get_w_r()){
		      ends[3]=2;
		      ;
		      y_thread_3 = y_thread_3 + 1;
		      S28=1;
		      active[3]=1;
		      ends[3]=1;
		      tdone[3]=1;
		    }
		    else {
		      active[3]=1;
		      ends[3]=1;
		      tdone[3]=1;
		    }
		    break;
		  }
		}
		break;
	      case 1 : 
		S36=1;
		S36=0;
		if(data1_o.get_preempted()){
		  tutu__1807839633 = 0;
		  tutu__1807839633 = data1_o.get_preempted() ? data1_o.refresh() : 0;
		  S36=1;
		  active[3]=1;
		  ends[3]=1;
		  tdone[3]=1;
		}
		else {
		  S31=0;
		  if(data1_o.get_w_s() == data1_o.get_w_r()){
		    tutu__1660223482 = 0;
		    tutu__1660223482 = data1_o.get_w_s();
		    tutu__1660223482++;
		    data1_o.set_w_s(tutu__1660223482);
		    data1_o.set_value(new Byte(r_thread_3));
		    S31=1;
		    if(data1_o.get_w_s() == data1_o.get_w_r()){
		      ends[3]=2;
		      ;
		      y_thread_3 = y_thread_3 + 1;
		      S28=1;
		      active[3]=1;
		      ends[3]=1;
		      tdone[3]=1;
		    }
		    else {
		      active[3]=1;
		      ends[3]=1;
		      tdone[3]=1;
		    }
		  }
		  else {
		    active[3]=1;
		    ends[3]=1;
		    tdone[3]=1;
		  }
		}
		break;
	      }
	      break;
	    case 1 : 
	      S28=1;
	      len_thread_3 = 0;
	      len_thread_3 = tosend_thread_3.length;
	      S28=0;
	      if(y_thread_3 == len_thread_3){
		breakme_1.setPresent();
		currsigs.addElement(breakme_1);
		//.println("Emitted breakme_1");
		S28=1;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      else {
		r_thread_3 = 0;
		r_thread_3 = tosend_thread_3[y_thread_3];
		S36=0;
		if(data1_o.get_preempted()){
		  tutu__813548153 = 0;
		  tutu__813548153 = data1_o.get_preempted() ? data1_o.refresh() : 0;
		  S36=1;
		  active[3]=1;
		  ends[3]=1;
		  tdone[3]=1;
		}
		else {
		  S31=0;
		  if(data1_o.get_w_s() == data1_o.get_w_r()){
		    tutu__885739271 = 0;
		    tutu__885739271 = data1_o.get_w_s();
		    tutu__885739271++;
		    data1_o.set_w_s(tutu__885739271);
		    data1_o.set_value(new Byte(r_thread_3));
		    S31=1;
		    if(data1_o.get_w_s() == data1_o.get_w_r()){
		      ends[3]=2;
		      ;
		      y_thread_3 = y_thread_3 + 1;
		      S28=1;
		      active[3]=1;
		      ends[3]=1;
		      tdone[3]=1;
		    }
		    else {
		      active[3]=1;
		      ends[3]=1;
		      tdone[3]=1;
		    }
		  }
		  else {
		    active[3]=1;
		    ends[3]=1;
		    tdone[3]=1;
		  }
		}
	      }
	      break;
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread779163825(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      switch(S24){
      case 0 : 
	active[2]=0;
	ends[2]=0;
	tdone[2]=1;
	break;
      case 1 : 
	switch(S7){
	case 0 : 
	  if(reset1_o.get_preempted()){
	    tutu__1455891304 = 0;
	    tutu__1455891304 = reset1_o.get_preempted() ? reset1_o.refresh() : 0;
	    S7=1;
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  else {
	    switch(S2){
	    case 0 : 
	      if(reset1_o.get_w_s() == reset1_o.get_w_r()){
		tutu__1575963473 = 0;
		tutu__1575963473 = reset1_o.get_w_s();
		tutu__1575963473++;
		reset1_o.set_w_s(tutu__1575963473);
		reset1_o.set_value(new Integer(1));
		S2=1;
		if(reset1_o.get_w_s() == reset1_o.get_w_r()){
		  ends[2]=2;
		  ;
		  breakme_1.setPresent();
		  currsigs.addElement(breakme_1);
		  //.println("Emitted breakme_1");
		  S24=0;
		  active[2]=0;
		  ends[2]=0;
		  tdone[2]=1;
		}
		else {
		  active[2]=1;
		  ends[2]=1;
		  tdone[2]=1;
		}
	      }
	      else {
		active[2]=1;
		ends[2]=1;
		tdone[2]=1;
	      }
	      break;
	    case 1 : 
	      if(reset1_o.get_w_s() == reset1_o.get_w_r()){
		ends[2]=2;
		;
		breakme_1.setPresent();
		currsigs.addElement(breakme_1);
		//.println("Emitted breakme_1");
		S24=0;
		active[2]=0;
		ends[2]=0;
		tdone[2]=1;
	      }
	      else {
		active[2]=1;
		ends[2]=1;
		tdone[2]=1;
	      }
	      break;
	    }
	  }
	  break;
	case 1 : 
	  S7=1;
	  S7=0;
	  if(reset1_o.get_preempted()){
	    tutu__1455891304 = 0;
	    tutu__1455891304 = reset1_o.get_preempted() ? reset1_o.refresh() : 0;
	    S7=1;
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  else {
	    S2=0;
	    if(reset1_o.get_w_s() == reset1_o.get_w_r()){
	      tutu__1575963473 = 0;
	      tutu__1575963473 = reset1_o.get_w_s();
	      tutu__1575963473++;
	      reset1_o.set_w_s(tutu__1575963473);
	      reset1_o.set_value(new Integer(1));
	      S2=1;
	      if(reset1_o.get_w_s() == reset1_o.get_w_r()){
		ends[2]=2;
		;
		breakme_1.setPresent();
		currsigs.addElement(breakme_1);
		//.println("Emitted breakme_1");
		S24=0;
		active[2]=0;
		ends[2]=0;
		tdone[2]=1;
	      }
	      else {
		active[2]=1;
		ends[2]=1;
		tdone[2]=1;
	      }
	    }
	    else {
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
  public void thread778394328(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      S588=1;
      tosend_thread_3 = new byte[6];
      tosend_thread_3[0] = 13;
      tosend_thread_3[1] = 73;
      tosend_thread_3[2] = 127;
      tosend_thread_3[3] = 100;
      tosend_thread_3[4] = 55;
      tosend_thread_3[5] = 77;
      y_thread_3 = 0;
      S25=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }
  public void thread780702821(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      S24=1;
      S7=0;
      if(reset1_o.get_preempted()){
	tutu__1455891304 = 0;
	tutu__1455891304 = reset1_o.get_preempted() ? reset1_o.refresh() : 0;
	S7=1;
	active[2]=1;
	ends[2]=1;
	tdone[2]=1;
      }
      else {
	S2=0;
	if(reset1_o.get_w_s() == reset1_o.get_w_r()){
	  tutu__1575963473 = 0;
	  tutu__1575963473 = reset1_o.get_w_s();
	  tutu__1575963473++;
	  reset1_o.set_w_s(tutu__1575963473);
	  reset1_o.set_value(new Integer(1));
	  S2=1;
	  if(reset1_o.get_w_s() == reset1_o.get_w_r()){
	    ends[2]=2;
	    ;
	    breakme_1.setPresent();
	    currsigs.addElement(breakme_1);
	    //.println("Emitted breakme_1");
	    S24=0;
	    active[2]=0;
	    ends[2]=0;
	    tdone[2]=1;
	  }
	  else {
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	}
	else {
	  active[2]=1;
	  ends[2]=1;
	  tdone[2]=1;
	}
      }
    }
  }
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S590){
      case 0 : 
	S590=0;
	break RUN;
      case 1 : 
	S590=2;
	breakme_1.setClear();
	thread780702821(tdone,ends);
	thread778394328(tdone,ends);
	int biggest778009579 = 0;
	if(ends[2]>=biggest778009579){
	  biggest778009579=ends[2];
	}
	if(ends[3]>=biggest778009579){
	  biggest778009579=ends[3];
	}
	if(biggest778009579 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
      case 2 : 
	breakme_1.setClear();
	thread779163825(tdone,ends);
	thread789167297(tdone,ends);
	int biggest787243552 = 0;
	if(ends[2]>=biggest787243552){
	  biggest787243552=ends[2];
	}
	if(ends[3]>=biggest787243552){
	  biggest787243552=ends[3];
	}
	if(biggest787243552 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest787243552 == 0){
	  System.err.println("Packet sent.");
	  S590=0;
	  active[1]=0;
	  ends[1]=0;
	  S590=0;
	  break RUN;
	}
      }
    }
  }
  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    breakme_1 = new Signal();
    // --------------------------------------------------
  }
  int tick = 0;
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
	reset1_o.update_w_r();
	data1_o.update_w_r();
	if(!df){
	  reset1_o.gethook();
	  data1_o.gethook();
	  df = true;
	}
	Native.count(((0x1<<25)|0x7));
	runClockDomain();
	Native.count(0x7);
	Native.count(((0x1<<25)|(0x1<<26)|0x7));
	int eot = Native.hc(0x0);
	int fmc = Native.hc(0x1);
	int mmc = Native.hc(0x2);
	int foc = Native.hc(0x3);
	int moc = Native.hc(0x4);
	// System.err.println("VAL apsCD1,"+(++tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      breakme_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      breakme_1.setClear();
      reset1_o.sethook();
      data1_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
	reset1_o.gethook();
	data1_o.gethook();
      }
      if(active[1] == 0){
	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
