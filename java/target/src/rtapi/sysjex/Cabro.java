package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import buffer.*;
import fibonacci.*;
import com.jopdesign.sys.Native;

public class Cabro extends ClockDomain{
  public Cabro(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public Signal O = new Signal();
  public input_Channel consumerChannel_in = new input_Channel();
  private static Signal A_7;
  private static Signal B_7;
  private static Signal R_7;
  private static int timer_thread_8;
  private static int tutu__826414755;
  private static int tutu__467452347;
  private static int tutu__839880967;
  private static int tutu__1319802148;
  private static int data_thread_9;
  private static int S696 = 1;
  private static int S532 = 1;
  private static int S489 = 1;
  private static int S694 = 1;
  private static int S693 = 1;
  private static int S545 = 1;
  private static int S535 = 1;
  private static int S538 = 1;
  private static int S549 = 1;
	
  private static int[] ends = new int[16];
  private static int[] tdone = new int[16];
  public void thread2010671870(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      S538=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }
  public void thread2012595614(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      S535=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }
  public void thread2012210866(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      switch(S538){
      case 0 : 
	active[11]=0;
	ends[11]=0;
	tdone[11]=1;
	break;
      case 1 : 
	if(B_7.getprestatus()){
	  S538=0;
	  active[11]=0;
	  ends[11]=0;
	  tdone[11]=1;
	}
	else {
	  active[11]=1;
	  ends[11]=1;
	  tdone[11]=1;
	}
	break;
      }
    }
  }
  public void thread2014134610(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      switch(S535){
      case 0 : 
	active[10]=0;
	ends[10]=0;
	tdone[10]=1;
	break;
      case 1 : 
	if(A_7.getprestatus()){
	  S535=0;
	  active[10]=0;
	  ends[10]=0;
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
  }
  public void thread2013365112(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      S538=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }
  public void thread2013749861(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      S535=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }
  public void thread2003361641(int [] tdone, int [] ends){
    if(tdone[9] != 1){
      switch(S694){
      case 0 : 
	active[9]=0;
	ends[9]=0;
	tdone[9]=1;
	break;
      case 1 : 
	switch(S693){
	case 0 : 
	  if(R_7.getprestatus()){
	    consumerChannel_in.refresh();
	    data_thread_9 = 0;
	    S545=0;
	    thread2013749861(tdone,ends);
	    thread2013365112(tdone,ends);
	    int biggest2014519359 = 0;
	    if(ends[10]>=biggest2014519359){
	      biggest2014519359=ends[10];
	    }
	    if(ends[11]>=biggest2014519359){
	      biggest2014519359=ends[11];
	    }
	    if(biggest2014519359 == 1){
	      active[9]=1;
	      ends[9]=1;
	      tdone[9]=1;
	    }
	  }
	  else {
	    switch(S545){
	    case 0 : 
	      thread2014134610(tdone,ends);
	      thread2012210866(tdone,ends);
	      int biggest2011826117 = 0;
	      if(ends[10]>=biggest2011826117){
		biggest2011826117=ends[10];
	      }
	      if(ends[11]>=biggest2011826117){
		biggest2011826117=ends[11];
	      }
	      if(biggest2011826117 == 1){
		active[9]=1;
		ends[9]=1;
		tdone[9]=1;
	      }
	      //FINXME code
	      if(biggest2011826117 == 0){
		O.setPresent();
		currsigs.addElement(O);
		//.println("Emitted O");
		S545=1;
		S549=0;
		if(consumerChannel_in.get_preempted()){
		  tutu__467452347 = 0;
		  tutu__467452347 = consumerChannel_in.get_preempted() ? consumerChannel_in.refresh() : 0;
		  S549=1;
		  active[9]=1;
		  ends[9]=1;
		  tdone[9]=1;
		}
		else {
		  if(consumerChannel_in.get_r_s() > consumerChannel_in.get_r_r()){
		    tutu__826414755 = 0;
		    tutu__826414755 = consumerChannel_in.get_r_r();
		    tutu__826414755++;
		    consumerChannel_in.set_r_r(tutu__826414755);
		    consumerChannel_in.get_val();
		    ends[9]=2;
		    ;
		    data_thread_9 = (Integer)consumerChannel_in.get_value();
		    //.println("received " + data_thread_9);
		    //.println("PC-ABRO Received next fibonacci number: " + data_thread_9);
		    S545=2;
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
	      break;
	    case 1 : 
	      switch(S549){
	      case 0 : 
		if(consumerChannel_in.get_preempted()){
		  tutu__1319802148 = 0;
		  tutu__1319802148 = consumerChannel_in.get_preempted() ? consumerChannel_in.refresh() : 0;
		  S549=1;
		  active[9]=1;
		  ends[9]=1;
		  tdone[9]=1;
		}
		else {
		  if(consumerChannel_in.get_r_s() > consumerChannel_in.get_r_r()){
		    tutu__839880967 = 0;
		    tutu__839880967 = consumerChannel_in.get_r_r();
		    tutu__839880967++;
		    consumerChannel_in.set_r_r(tutu__839880967);
		    consumerChannel_in.get_val();
		    ends[9]=2;
		    ;
		    data_thread_9 = (Integer)consumerChannel_in.get_value();
		    //.println("received " + data_thread_9);
		    //.println("PC-ABRO Received next fibonacci number: " + data_thread_9);
		    S545=2;
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
		break;
	      case 1 : 
		S549=1;
		S549=0;
		if(consumerChannel_in.get_preempted()){
		  tutu__1319802148 = 0;
		  tutu__1319802148 = consumerChannel_in.get_preempted() ? consumerChannel_in.refresh() : 0;
		  S549=1;
		  active[9]=1;
		  ends[9]=1;
		  tdone[9]=1;
		}
		else {
		  if(consumerChannel_in.get_r_s() > consumerChannel_in.get_r_r()){
		    tutu__839880967 = 0;
		    tutu__839880967 = consumerChannel_in.get_r_r();
		    tutu__839880967++;
		    consumerChannel_in.set_r_r(tutu__839880967);
		    consumerChannel_in.get_val();
		    ends[9]=2;
		    ;
		    data_thread_9 = (Integer)consumerChannel_in.get_value();
		    //.println("received " + data_thread_9);
		    //.println("PC-ABRO Received next fibonacci number: " + data_thread_9);
		    S545=2;
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
		break;
	      }
	      break;
	    case 2 : 
	      S545=2;
	      data_thread_9 = 0;
	      S545=0;
	      thread2012595614(tdone,ends);
	      thread2010671870(tdone,ends);
	      int biggest2010287121 = 0;
	      if(ends[10]>=biggest2010287121){
		biggest2010287121=ends[10];
	      }
	      if(ends[11]>=biggest2010287121){
		biggest2010287121=ends[11];
	      }
	      if(biggest2010287121 == 1){
		active[9]=1;
		ends[9]=1;
		tdone[9]=1;
	      }
	      break;
	    }
	  }
	  break;
	case 1 : 
	  S693=1;
	  S694=0;
	  active[9]=0;
	  ends[9]=0;
	  tdone[9]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread2003746390(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      switch(S532){
      case 0 : 
	active[8]=0;
	ends[8]=0;
	tdone[8]=1;
	break;
      case 1 : 
	switch(S489){
	case 0 : 
	  S489=0;
	  S489=1;
	  active[8]=1;
	  ends[8]=1;
	  tdone[8]=1;
	  break;
	case 1 : 
	  if(R_7.getprestatus()){
	    S532=0;
	    active[8]=0;
	    ends[8]=0;
	    tdone[8]=1;
	  }
	  else {
	    if(timer_thread_8 == 100){
	      R_7.setPresent();
	      currsigs.addElement(R_7);
	      //.println("Emitted R_7");
	      active[8]=1;
	      ends[8]=1;
	      tdone[8]=1;
	    }
	    else {
	      timer_thread_8 = timer_thread_8 + 1;
	      A_7.setPresent();
	      currsigs.addElement(A_7);
	      //.println("Emitted A_7");
	      B_7.setPresent();
	      currsigs.addElement(B_7);
	      //.println("Emitted B_7");
	      active[8]=1;
	      ends[8]=1;
	      tdone[8]=1;
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread2004900636(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      S538=1;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }
  public void thread2005285385(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      S535=1;
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }
  public void thread2004131139(int [] tdone, int [] ends){
    if(tdone[9] != 1){
      S694=1;
      S693=0;
      data_thread_9 = 0;
      S545=0;
      thread2005285385(tdone,ends);
      thread2004900636(tdone,ends);
      int biggest2002976892 = 0;
      if(ends[10]>=biggest2002976892){
	biggest2002976892=ends[10];
      }
      if(ends[11]>=biggest2002976892){
	biggest2002976892=ends[11];
      }
      if(biggest2002976892 == 1){
	active[9]=1;
	ends[9]=1;
	tdone[9]=1;
      }
    }
  }
  public void thread2004515888(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      S532=1;
      A_7.setPresent();
      currsigs.addElement(A_7);
      //.println("Emitted A_7");
      B_7.setPresent();
      currsigs.addElement(B_7);
      //.println("Emitted B_7");
      S489=0;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S696){
      case 0 : 
	S696=0;
	break RUN;
      case 1 : 
	S696=2;
	A_7.setClear();
	B_7.setClear();
	R_7.setClear();
	thread2004515888(tdone,ends);
	thread2004131139(tdone,ends);
	int biggest2002592143 = 0;
	if(ends[8]>=biggest2002592143){
	  biggest2002592143=ends[8];
	}
	if(ends[9]>=biggest2002592143){
	  biggest2002592143=ends[9];
	}
	if(biggest2002592143 == 1){
	  active[7]=1;
	  ends[7]=1;
	  break RUN;
	}
      case 2 : 
	A_7.setClear();
	B_7.setClear();
	R_7.setClear();
	thread2003746390(tdone,ends);
	thread2003361641(tdone,ends);
	int biggest2011056619 = 0;
	if(ends[8]>=biggest2011056619){
	  biggest2011056619=ends[8];
	}
	if(ends[9]>=biggest2011056619){
	  biggest2011056619=ends[9];
	}
	if(biggest2011056619 == 1){
	  active[7]=1;
	  ends[7]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest2011056619 == 0){
	  S696=0;
	  active[7]=0;
	  ends[7]=0;
	  S696=0;
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
    A_7 = new Signal();
    B_7 = new Signal();
    R_7 = new Signal();
    // --------------------------------------------------
  }
  private static int tick = 0;
  public void run(){
    while(active[7] != 0){
      int index = 7;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
	for(int h=1;h<paused.length;++h){
	  paused[h]=0;
	}
      }
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
	consumerChannel_in.update_r_s();
	if(!df){
	  consumerChannel_in.gethook();
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
	System.err.println("VAL Cabro,"+(tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      O.setpreclear();
      A_7.setpreclear();
      B_7.setpreclear();
      R_7.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      O.sethook();
      O.setClear();
      A_7.setClear();
      B_7.setClear();
      R_7.setClear();
      consumerChannel_in.sethook();
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
	consumerChannel_in.gethook();
      }
      if(active[7] == 0){
	System.err.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
