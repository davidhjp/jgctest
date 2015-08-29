package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import com.jopdesign.sys.Native;

public class demoloop1 extends ClockDomain{
  public demoloop1(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  private static Signal B_1;
  private static Signal C_1;
  private static Signal D_1;
  private static Signal E_1;
  private static Signal A_1;
  private static Signal R_1;
  private static int S62 = 1;
  private static int S58 = 1;
  private static int S25 = 1;
  private static int S7 = 1;
  private static int S55 = 1;
  private static int S60 = 1;
  private static int S59 = 1;
	
  private static int[] ends = new int[6];
  private static int[] tdone = new int[6];
  public void thread1588591771(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      switch(S60){
      case 0 : 
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
	break;
      case 1 : 
	switch(S59){
	case 0 : 
	  S59=0;
	  A_1.setPresent();
	  currsigs.addElement(A_1);
	  System.out.println("Emitted A_1");
	  System.out.println("A");
	  S59=1;
	  active[5]=1;
	  ends[5]=1;
	  tdone[5]=1;
	  break;
	case 1 : 
	  S59=1;
	  S59=2;
	  active[5]=1;
	  ends[5]=1;
	  tdone[5]=1;
	  break;
	case 2 : 
	  S59=2;
	  S59=3;
	  active[5]=1;
	  ends[5]=1;
	  tdone[5]=1;
	  break;
	case 3 : 
	  S59=3;
	  S59=4;
	  active[5]=1;
	  ends[5]=1;
	  tdone[5]=1;
	  break;
	case 4 : 
	  S59=4;
	  R_1.setPresent();
	  currsigs.addElement(R_1);
	  System.out.println("Emitted R_1");
	  System.out.println("R");
	  S60=0;
	  active[5]=0;
	  ends[5]=0;
	  tdone[5]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1587052776(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      switch(S55){
      case 0 : 
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
	break;
      case 1 : 
	if(B_1.getprestatus()){
	  E_1.setPresent();
	  currsigs.addElement(E_1);
	  System.out.println("Emitted E_1");
	  System.out.println("E");
	  if(B_1.getprestatus()){
	    C_1.setPresent();
	    currsigs.addElement(C_1);
	    System.out.println("Emitted C_1");
	    System.out.println("C");
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
	else {
	  if(B_1.getprestatus()){
	    C_1.setPresent();
	    currsigs.addElement(C_1);
	    System.out.println("Emitted C_1");
	    System.out.println("C");
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
	break;
      }
    }
  }
  public void thread1587822274(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      switch(S25){
      case 0 : 
	active[3]=0;
	ends[3]=0;
	tdone[3]=1;
	break;
      case 1 : 
	switch(S7){
	case 0 : 
	  if(A_1.getprestatus()){
	    B_1.setPresent();
	    currsigs.addElement(B_1);
	    System.out.println("Emitted B_1");
	    System.out.println("B");
	    S7=1;
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
	case 1 : 
	  S7=1;
	  S7=2;
	  active[3]=1;
	  ends[3]=1;
	  tdone[3]=1;
	  break;
	case 2 : 
	  S7=2;
	  if(C_1.getprestatus()){
	    D_1.setPresent();
	    currsigs.addElement(D_1);
	    System.out.println("Emitted D_1");
	    System.out.println("D");
	    S7=3;
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  else {
	    S7=3;
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  break;
	case 3 : 
	  S7=3;
	  S7=0;
	  active[3]=1;
	  ends[3]=1;
	  tdone[3]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1587437525(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      switch(S58){
      case 0 : 
	active[2]=0;
	ends[2]=0;
	tdone[2]=1;
	break;
      case 1 : 
	if(R_1.getprestatus()){
	  S58=0;
	  active[2]=0;
	  ends[2]=0;
	  tdone[2]=1;
	}
	else {
	  thread1587822274(tdone,ends);
	  thread1587052776(tdone,ends);
	  int biggest1589361269 = 0;
	  if(ends[3]>=biggest1589361269){
	    biggest1589361269=ends[3];
	  }
	  if(ends[4]>=biggest1589361269){
	    biggest1589361269=ends[4];
	  }
	  if(biggest1589361269 == 1){
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  //FINXME code
	  if(biggest1589361269 == 0){
	    S58=0;
	    active[2]=0;
	    ends[2]=0;
	    tdone[2]=1;
	  }
	}
	break;
      }
    }
  }
  public void thread1585129031(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S60=1;
      S59=0;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }
  public void thread1585898529(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S55=1;
      if(B_1.getprestatus()){
	C_1.setPresent();
	currsigs.addElement(C_1);
	System.out.println("Emitted C_1");
	System.out.println("C");
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
  public void thread1583974785(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      S25=1;
      S7=0;
      active[3]=1;
      ends[3]=1;
      tdone[3]=1;
    }
  }
  public void thread1583590036(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      S58=1;
      thread1583974785(tdone,ends);
      thread1585898529(tdone,ends);
      int biggest1586283278 = 0;
      if(ends[3]>=biggest1586283278){
	biggest1586283278=ends[3];
      }
      if(ends[4]>=biggest1586283278){
	biggest1586283278=ends[4];
      }
      if(biggest1586283278 == 1){
	active[2]=1;
	ends[2]=1;
	tdone[2]=1;
      }
    }
  }
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S62){
      case 0 : 
	S62=0;
	break RUN;
      case 1 : 
	S62=2;
	B_1.setClear();
	C_1.setClear();
	D_1.setClear();
	E_1.setClear();
	A_1.setClear();
	R_1.setClear();
	thread1583590036(tdone,ends);
	thread1585129031(tdone,ends);
	int biggest1585513780 = 0;
	if(ends[2]>=biggest1585513780){
	  biggest1585513780=ends[2];
	}
	if(ends[5]>=biggest1585513780){
	  biggest1585513780=ends[5];
	}
	if(biggest1585513780 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
      case 2 : 
	B_1.setClear();
	C_1.setClear();
	D_1.setClear();
	E_1.setClear();
	A_1.setClear();
	R_1.setClear();
	thread1587437525(tdone,ends);
	thread1588591771(tdone,ends);
	int biggest1603212230 = 0;
	if(ends[2]>=biggest1603212230){
	  biggest1603212230=ends[2];
	}
	if(ends[5]>=biggest1603212230){
	  biggest1603212230=ends[5];
	}
	if(biggest1603212230 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest1603212230 == 0){
	  S62=0;
	  active[1]=0;
	  ends[1]=0;
	  S62=0;
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
    B_1 = new Signal();
    C_1 = new Signal();
    D_1 = new Signal();
    E_1 = new Signal();
    A_1 = new Signal();
    R_1 = new Signal();
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
	++tick;
	Native.count(0x7);
	Native.count(((0x1<<25)|(0x1<<26)|0x7));
	int fmc = Native.hc(0x1);
	int eot = Native.hc(0x0);
	int mmc = Native.hc(0x2);
	int foc = Native.hc(0x3);
	int moc = Native.hc(0x4);
	System.out.println("VAL demoloop,"+tick+","+eot+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      B_1.setpreclear();
      C_1.setpreclear();
      D_1.setpreclear();
      E_1.setpreclear();
      A_1.setpreclear();
      R_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      B_1.setClear();
      C_1.setClear();
      D_1.setClear();
      E_1.setClear();
      A_1.setClear();
      R_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
      }
      if(active[1] == 0){
	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
