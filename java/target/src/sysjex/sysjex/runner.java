package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import com.jopdesign.sys.Native;

public class runner extends ClockDomain{
  public runner(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  private static Signal HEARTATTACK_1;
  private static Signal METER_1;
  private static Signal SECOND_1;
  private static Signal HEARTBEAT_1;
  private static Signal STEP_1;
  private static Signal WALK_1;
  private static Signal JUMP_1;
  private static Signal RUN_1;
  private static Signal GOTOHOSPITAL_1;
  private static int meters_thread_2;
  private static int u_thread_5;
  private static int seconds_thread_3;
  private static int S1962 = 1;
  private static int S1164 = 1;
  private static int S200 = 1;
  private static int S113 = 1;
  private static int S73 = 1;
  private static int S40 = 1;
  private static int S118 = 1;
  private static int S117 = 1;
  private static int S1960 = 1;
	
  private static int[] ends = new int[6];
  private static int[] tdone = new int[6];
  public void thread447087282(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      switch(S1960){
      case 0 : 
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
	break;
      case 1 : 
	if(u_thread_5 == 150){
	  ends[5]=2;
	  ;
	  S1960=0;
	  active[5]=0;
	  ends[5]=0;
	  tdone[5]=1;
	}
	else {
	  if(u_thread_5 < 101){
	    METER_1.setPresent();
	    currsigs.addElement(METER_1);
	    //.println("Emitted METER_1");
	    if(u_thread_5 < 133){
	      STEP_1.setPresent();
	      currsigs.addElement(STEP_1);
	      //.println("Emitted STEP_1");
	      if(u_thread_5 < 140){
		SECOND_1.setPresent();
		currsigs.addElement(SECOND_1);
		//.println("Emitted SECOND_1");
		u_thread_5 = u_thread_5 + 1;
		if(u_thread_5 == 139){
		  HEARTBEAT_1.setPresent();
		  currsigs.addElement(HEARTBEAT_1);
		  //.println("Emitted HEARTBEAT_1");
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
		u_thread_5 = u_thread_5 + 1;
		if(u_thread_5 == 139){
		  HEARTBEAT_1.setPresent();
		  currsigs.addElement(HEARTBEAT_1);
		  //.println("Emitted HEARTBEAT_1");
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
	    }
	    else {
	      if(u_thread_5 < 140){
		SECOND_1.setPresent();
		currsigs.addElement(SECOND_1);
		//.println("Emitted SECOND_1");
		u_thread_5 = u_thread_5 + 1;
		if(u_thread_5 == 139){
		  HEARTBEAT_1.setPresent();
		  currsigs.addElement(HEARTBEAT_1);
		  //.println("Emitted HEARTBEAT_1");
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
		u_thread_5 = u_thread_5 + 1;
		if(u_thread_5 == 139){
		  HEARTBEAT_1.setPresent();
		  currsigs.addElement(HEARTBEAT_1);
		  //.println("Emitted HEARTBEAT_1");
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
	    }
	  }
	  else {
	    if(u_thread_5 < 133){
	      STEP_1.setPresent();
	      currsigs.addElement(STEP_1);
	      //.println("Emitted STEP_1");
	      if(u_thread_5 < 140){
		SECOND_1.setPresent();
		currsigs.addElement(SECOND_1);
		//.println("Emitted SECOND_1");
		u_thread_5 = u_thread_5 + 1;
		if(u_thread_5 == 139){
		  HEARTBEAT_1.setPresent();
		  currsigs.addElement(HEARTBEAT_1);
		  //.println("Emitted HEARTBEAT_1");
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
		u_thread_5 = u_thread_5 + 1;
		if(u_thread_5 == 139){
		  HEARTBEAT_1.setPresent();
		  currsigs.addElement(HEARTBEAT_1);
		  //.println("Emitted HEARTBEAT_1");
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
	    }
	    else {
	      if(u_thread_5 < 140){
		SECOND_1.setPresent();
		currsigs.addElement(SECOND_1);
		//.println("Emitted SECOND_1");
		u_thread_5 = u_thread_5 + 1;
		if(u_thread_5 == 139){
		  HEARTBEAT_1.setPresent();
		  currsigs.addElement(HEARTBEAT_1);
		  //.println("Emitted HEARTBEAT_1");
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
		u_thread_5 = u_thread_5 + 1;
		if(u_thread_5 == 139){
		  HEARTBEAT_1.setPresent();
		  currsigs.addElement(HEARTBEAT_1);
		  //.println("Emitted HEARTBEAT_1");
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
	    }
	  }
	}
	break;
      }
    }
  }
  public void thread445548287(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      switch(S118){
      case 0 : 
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
	break;
      case 1 : 
	switch(S117){
	case 0 : 
	  if(HEARTBEAT_1.getprestatus()){
	    S117=1;
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
	  if(SECOND_1.getprestatus()){
	    HEARTATTACK_1.setPresent();
	    currsigs.addElement(HEARTATTACK_1);
	    //.println("Emitted HEARTATTACK_1");
	    S118=0;
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
	break;
      }
    }
  }
  public void thread430927829(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      switch(S113){
      case 0 : 
	active[3]=0;
	ends[3]=0;
	tdone[3]=1;
	break;
      case 1 : 
	if(HEARTATTACK_1.getprestatus()){
	  ends[3]=4;
	  tdone[3]=1;
	}
	else {
	  switch(S73){
	  case 0 : 
	    switch(S40){
	    case 0 : 
	      S40=0;
	      if(seconds_thread_3 == 15){
		ends[3]=2;
		;
		S73=1;
		RUN_1.setPresent();
		currsigs.addElement(RUN_1);
		//.println("Emitted RUN_1");
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      else {
		S40=1;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      break;
	    case 1 : 
	      if(STEP_1.getprestatus()){
		JUMP_1.setPresent();
		currsigs.addElement(JUMP_1);
		//.println("Emitted JUMP_1");
		if(SECOND_1.getprestatus()){
		  seconds_thread_3 = seconds_thread_3 + 1;
		  S40=0;
		  active[3]=1;
		  ends[3]=1;
		  tdone[3]=1;
		}
		else {
		  S40=0;
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
	    }
	    break;
	  case 1 : 
	    RUN_1.setPresent();
	    currsigs.addElement(RUN_1);
	    //.println("Emitted RUN_1");
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	    break;
	  }
	}
	break;
      }
    }
  }
  public void thread431697326(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S118=1;
      S117=0;
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }
  public void thread431312578(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      S113=1;
      S73=0;
      S40=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }
  public void thread429388833(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      switch(S1164){
      case 0 : 
	active[2]=0;
	ends[2]=0;
	tdone[2]=1;
	break;
      case 1 : 
	switch(S200){
	case 0 : 
	  if(METER_1.getprestatus()){
	    if(meters_thread_2 == 100){
	      ends[2]=3;
	      ;
	      S200=1;
	      thread431312578(tdone,ends);
	      thread431697326(tdone,ends);
	      int biggest430543080 = 0;
	      if(ends[3]>=biggest430543080){
		biggest430543080=ends[3];
	      }
	      if(ends[4]>=biggest430543080){
		biggest430543080=ends[4];
	      }
	      if(biggest430543080 == 1){
		active[2]=1;
		ends[2]=1;
		tdone[2]=1;
	      }
	      if(biggest430543080 == 1){
		active[2]=1;
		ends[2]=1;
		tdone[2]=1;
	      }
	    }
	    else {
	      WALK_1.setPresent();
	      currsigs.addElement(WALK_1);
	      //.println("Emitted WALK_1");
	      meters_thread_2 = meters_thread_2 + 1;
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
	  thread430927829(tdone,ends);
	  thread445548287(tdone,ends);
	  int biggest444394040 = 0;
	  if(ends[3]>=biggest444394040){
	    biggest444394040=ends[3];
	  }
	  if(ends[4]>=biggest444394040){
	    biggest444394040=ends[4];
	  }
	  if(biggest444394040 == 1){
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  if(biggest444394040 == 4){
	    ends[2]=4;
	    ;
	    GOTOHOSPITAL_1.setPresent();
	    currsigs.addElement(GOTOHOSPITAL_1);
	    //.println("Emitted GOTOHOSPITAL_1");
	    S1164=0;
	    active[2]=0;
	    ends[2]=0;
	    tdone[2]=1;
	  }
	  //FINXME code
	  if(biggest444394040 == 0){
	    S200=0;
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread430158331(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S1960=1;
      u_thread_5 = 0;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }
  public void thread429773582(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      S1164=1;
      meters_thread_2 = 0;
      S200=0;
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
      switch(S1962){
      case 0 : 
	S1962=0;
	break RUN;
      case 1 : 
	S1962=2;
	HEARTATTACK_1.setClear();
	METER_1.setClear();
	SECOND_1.setClear();
	HEARTBEAT_1.setClear();
	STEP_1.setClear();
	WALK_1.setClear();
	JUMP_1.setClear();
	RUN_1.setClear();
	GOTOHOSPITAL_1.setClear();
	thread429773582(tdone,ends);
	thread430158331(tdone,ends);
	int biggest429004084 = 0;
	if(ends[2]>=biggest429004084){
	  biggest429004084=ends[2];
	}
	if(ends[5]>=biggest429004084){
	  biggest429004084=ends[5];
	}
	if(biggest429004084 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
      case 2 : 
	HEARTATTACK_1.setClear();
	METER_1.setClear();
	SECOND_1.setClear();
	HEARTBEAT_1.setClear();
	STEP_1.setClear();
	WALK_1.setClear();
	JUMP_1.setClear();
	RUN_1.setClear();
	GOTOHOSPITAL_1.setClear();
	thread429388833(tdone,ends);
	thread447087282(tdone,ends);
	int biggest447472031 = 0;
	if(ends[2]>=biggest447472031){
	  biggest447472031=ends[2];
	}
	if(ends[5]>=biggest447472031){
	  biggest447472031=ends[5];
	}
	if(biggest447472031 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest447472031 == 0){
	  S1962=0;
	  active[1]=0;
	  ends[1]=0;
	  S1962=0;
	  break RUN;
	}
      }
    }
  }
  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    HEARTATTACK_1 = new Signal();
    METER_1 = new Signal();
    SECOND_1 = new Signal();
    HEARTBEAT_1 = new Signal();
    STEP_1 = new Signal();
    WALK_1 = new Signal();
    JUMP_1 = new Signal();
    RUN_1 = new Signal();
    GOTOHOSPITAL_1 = new Signal();
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
	if(!df){
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
	System.err.println("VAL runner,"+(++tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      HEARTATTACK_1.setpreclear();
      METER_1.setpreclear();
      SECOND_1.setpreclear();
      HEARTBEAT_1.setpreclear();
      STEP_1.setpreclear();
      WALK_1.setpreclear();
      JUMP_1.setpreclear();
      RUN_1.setpreclear();
      GOTOHOSPITAL_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      HEARTATTACK_1.setClear();
      METER_1.setClear();
      SECOND_1.setClear();
      HEARTBEAT_1.setClear();
      STEP_1.setClear();
      WALK_1.setClear();
      JUMP_1.setClear();
      RUN_1.setClear();
      GOTOHOSPITAL_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
      }
      if(active[1] == 0){
	System.err.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
