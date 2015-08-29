package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import com.jopdesign.sys.Native;

public class KiteControl extends ClockDomain{
  public KiteControl(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public input_Channel wind_in = new input_Channel();
  public input_Channel craft_in = new input_Channel();
  private static Signal increasekitevelocity_11;
  private static Signal reducekitevelocity_11;
  private static Signal increasekiteheading_11;
  private static Signal reducekiteheading_11;
  private static int MAXCROSSWIND_thread_13;
  private static int MAXHEADWIND_thread_13;
  private static int MAXVELOCITY_thread_13;
  private static double crosswind_thread_13;
  private static int w0_thread_13;
  private static int w1_thread_13;
  private static int c0_thread_13;
  private static int c1_thread_13;
  private static int tosin_thread_13;
  private static int tocos_thread_13;
  private static double headwind_thread_13;
  private static double absheadwind_thread_13;
  private static int tutu__1942046902;
  private static int tutu__464751153;
  private static int tutu__1922809457;
  private static int tutu__1890562193;
  private static int tutu__1938584162;
  private static int tutu__2020789551;
  private static int tutu__1937045167;
  private static int tutu__1693818543;
  private static int tutu__1944355396;
  private static int tutu__2121778289;
  private static int tutu__1942816400;
  private static int tutu__1846217999;
  private static int S938 = 1;
  private static int S936 = 1;
  private static int S660 = 1;
  private static int S644 = 1;
  private static int S633 = 1;
  private static int S659 = 1;
  private static int S648 = 1;
	
  private static int[] ends = new int[16];
  private static int[] tdone = new int[16];
  public void thread1838164699(int [] tdone, int [] ends){
    if(tdone[15] != 1){
      S659=1;
      S648=0;
      if(craft_in.get_preempted()){
	tutu__1846217999 = 0;
	tutu__1846217999 = craft_in.get_preempted() ? craft_in.refresh() : 0;
	S648=1;
	active[15]=1;
	ends[15]=1;
	tdone[15]=1;
      }
      else {
	if(craft_in.get_r_s() > craft_in.get_r_r()){
	  tutu__1942816400 = 0;
	  tutu__1942816400 = craft_in.get_r_r();
	  tutu__1942816400++;
	  craft_in.set_r_r(tutu__1942816400);
	  craft_in.get_val();
	  ends[15]=2;
	  ;
	  S659=0;
	  active[15]=0;
	  ends[15]=0;
	  tdone[15]=1;
	}
	else {
	  active[15]=1;
	  ends[15]=1;
	  tdone[15]=1;
	}
      }
    }
  }
  public void thread1840473193(int [] tdone, int [] ends){
    if(tdone[14] != 1){
      S644=1;
      S633=0;
      if(wind_in.get_preempted()){
	tutu__2121778289 = 0;
	tutu__2121778289 = wind_in.get_preempted() ? wind_in.refresh() : 0;
	S633=1;
	active[14]=1;
	ends[14]=1;
	tdone[14]=1;
      }
      else {
	if(wind_in.get_r_s() > wind_in.get_r_r()){
	  tutu__1944355396 = 0;
	  tutu__1944355396 = wind_in.get_r_r();
	  tutu__1944355396++;
	  wind_in.set_r_r(tutu__1944355396);
	  wind_in.get_val();
	  ends[14]=2;
	  ;
	  S644=0;
	  active[14]=0;
	  ends[14]=0;
	  tdone[14]=1;
	}
	else {
	  active[14]=1;
	  ends[14]=1;
	  tdone[14]=1;
	}
      }
    }
  }
  public void thread1840088444(int [] tdone, int [] ends){
    if(tdone[15] != 1){
      switch(S659){
      case 0 : 
	active[15]=0;
	ends[15]=0;
	tdone[15]=1;
	break;
      case 1 : 
	switch(S648){
	case 0 : 
	  if(craft_in.get_preempted()){
	    tutu__1693818543 = 0;
	    tutu__1693818543 = craft_in.get_preempted() ? craft_in.refresh() : 0;
	    S648=1;
	    active[15]=1;
	    ends[15]=1;
	    tdone[15]=1;
	  }
	  else {
	    if(craft_in.get_r_s() > craft_in.get_r_r()){
	      tutu__1937045167 = 0;
	      tutu__1937045167 = craft_in.get_r_r();
	      tutu__1937045167++;
	      craft_in.set_r_r(tutu__1937045167);
	      craft_in.get_val();
	      ends[15]=2;
	      ;
	      S659=0;
	      active[15]=0;
	      ends[15]=0;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	  break;
	case 1 : 
	  S648=1;
	  S648=0;
	  if(craft_in.get_preempted()){
	    tutu__1693818543 = 0;
	    tutu__1693818543 = craft_in.get_preempted() ? craft_in.refresh() : 0;
	    S648=1;
	    active[15]=1;
	    ends[15]=1;
	    tdone[15]=1;
	  }
	  else {
	    if(craft_in.get_r_s() > craft_in.get_r_r()){
	      tutu__1937045167 = 0;
	      tutu__1937045167 = craft_in.get_r_r();
	      tutu__1937045167++;
	      craft_in.set_r_r(tutu__1937045167);
	      craft_in.get_val();
	      ends[15]=2;
	      ;
	      S659=0;
	      active[15]=0;
	      ends[15]=0;
	      tdone[15]=1;
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1854708902(int [] tdone, int [] ends){
    if(tdone[14] != 1){
      switch(S644){
      case 0 : 
	active[14]=0;
	ends[14]=0;
	tdone[14]=1;
	break;
      case 1 : 
	switch(S633){
	case 0 : 
	  if(wind_in.get_preempted()){
	    tutu__2020789551 = 0;
	    tutu__2020789551 = wind_in.get_preempted() ? wind_in.refresh() : 0;
	    S633=1;
	    active[14]=1;
	    ends[14]=1;
	    tdone[14]=1;
	  }
	  else {
	    if(wind_in.get_r_s() > wind_in.get_r_r()){
	      tutu__1938584162 = 0;
	      tutu__1938584162 = wind_in.get_r_r();
	      tutu__1938584162++;
	      wind_in.set_r_r(tutu__1938584162);
	      wind_in.get_val();
	      ends[14]=2;
	      ;
	      S644=0;
	      active[14]=0;
	      ends[14]=0;
	      tdone[14]=1;
	    }
	    else {
	      active[14]=1;
	      ends[14]=1;
	      tdone[14]=1;
	    }
	  }
	  break;
	case 1 : 
	  S633=1;
	  S633=0;
	  if(wind_in.get_preempted()){
	    tutu__2020789551 = 0;
	    tutu__2020789551 = wind_in.get_preempted() ? wind_in.refresh() : 0;
	    S633=1;
	    active[14]=1;
	    ends[14]=1;
	    tdone[14]=1;
	  }
	  else {
	    if(wind_in.get_r_s() > wind_in.get_r_r()){
	      tutu__1938584162 = 0;
	      tutu__1938584162 = wind_in.get_r_r();
	      tutu__1938584162++;
	      wind_in.set_r_r(tutu__1938584162);
	      wind_in.get_val();
	      ends[14]=2;
	      ;
	      S644=0;
	      active[14]=0;
	      ends[14]=0;
	      tdone[14]=1;
	    }
	    else {
	      active[14]=1;
	      ends[14]=1;
	      tdone[14]=1;
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1853554655(int [] tdone, int [] ends){
    if(tdone[13] != 1){
      switch(S936){
      case 0 : 
	active[13]=0;
	ends[13]=0;
	tdone[13]=1;
	break;
      case 1 : 
	switch(S660){
	case 0 : 
	  thread1854708902(tdone,ends);
	  thread1840088444(tdone,ends);
	  int biggest1840857942 = 0;
	  if(ends[14]>=biggest1840857942){
	    biggest1840857942=ends[14];
	  }
	  if(ends[15]>=biggest1840857942){
	    biggest1840857942=ends[15];
	  }
	  if(biggest1840857942 == 1){
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  //FINXME code
	  if(biggest1840857942 == 0){
	    S660=1;
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  break;
	case 1 : 
	  S660=1;
	  //.println("wind : " + wind_in.get_value());
	  //.println("craft : " + craft_in.get_value());
	  w0_thread_13 = (((Integer)((Vector)wind_in.get_value()).elementAt(0)).intValue());
	  c0_thread_13 = (((Integer)((Vector)craft_in.get_value()).elementAt(0)).intValue());
	  c1_thread_13 = (((Integer)((Vector)craft_in.get_value()).elementAt(1)).intValue());
	  w1_thread_13 = (((Integer)((Vector)wind_in.get_value()).elementAt(1)).intValue());
	  crosswind_thread_13 = Math.abs(Math.sin(w0_thread_13 - c0_thread_13) * w1_thread_13);
	  //.println("crosswind " + crosswind_thread_13);
	  if(crosswind_thread_13 < MAXCROSSWIND_thread_13){
	    headwind_thread_13 = Math.cos(w0_thread_13 - c0_thread_13) * w1_thread_13;
	    absheadwind_thread_13 = Math.abs(headwind_thread_13);
	    //.println(headwind_thread_13);
	    if(headwind_thread_13 > 0 && headwind_thread_13 < MAXHEADWIND_thread_13){
	      increasekitevelocity_11.setPresent();
	      currsigs.addElement(increasekitevelocity_11);
	      //.println("Emitted increasekitevelocity_11");
	      S660=2;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	    else {
	      if(absheadwind_thread_13 > MAXHEADWIND_thread_13){
		reducekiteheading_11.setPresent();
		currsigs.addElement(reducekiteheading_11);
		//.println("Emitted reducekiteheading_11");
		S660=2;
		active[13]=1;
		ends[13]=1;
		tdone[13]=1;
	      }
	      else {
		if(headwind_thread_13 < 0 && c1_thread_13 >= MAXVELOCITY_thread_13){
		  reducekitevelocity_11.setPresent();
		  currsigs.addElement(reducekitevelocity_11);
		  //.println("Emitted reducekitevelocity_11");
		  S660=2;
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
		else {
		  S660=2;
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
	      }
	    }
	  }
	  else {
	    if(crosswind_thread_13 < 0){
	      increasekiteheading_11.setPresent();
	      currsigs.addElement(increasekiteheading_11);
	      //.println("Emitted increasekiteheading_11");
	      S660=2;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	    else {
	      if(crosswind_thread_13 > 0){
		reducekiteheading_11.setPresent();
		currsigs.addElement(reducekiteheading_11);
		//.println("Emitted reducekiteheading_11");
		S660=2;
		active[13]=1;
		ends[13]=1;
		tdone[13]=1;
	      }
	      else {
		S660=2;
		active[13]=1;
		ends[13]=1;
		tdone[13]=1;
	      }
	    }
	  }
	  break;
	case 2 : 
	  S660=2;
	  S660=0;
	  thread1840473193(tdone,ends);
	  thread1838164699(tdone,ends);
	  int biggest1839318946 = 0;
	  if(ends[14]>=biggest1839318946){
	    biggest1839318946=ends[14];
	  }
	  if(ends[15]>=biggest1839318946){
	    biggest1839318946=ends[15];
	  }
	  if(biggest1839318946 == 1){
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  //FINXME code
	  if(biggest1839318946 == 0){
	    S660=1;
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1853939404(int [] tdone, int [] ends){
    if(tdone[12] != 1){
      active[12]=0;
      ends[12]=0;
      tdone[12]=1;
    }
  }
  public void thread1855093651(int [] tdone, int [] ends){
    if(tdone[15] != 1){
      S659=1;
      S648=0;
      if(craft_in.get_preempted()){
	tutu__1890562193 = 0;
	tutu__1890562193 = craft_in.get_preempted() ? craft_in.refresh() : 0;
	S648=1;
	active[15]=1;
	ends[15]=1;
	tdone[15]=1;
      }
      else {
	if(craft_in.get_r_s() > craft_in.get_r_r()){
	  tutu__1922809457 = 0;
	  tutu__1922809457 = craft_in.get_r_r();
	  tutu__1922809457++;
	  craft_in.set_r_r(tutu__1922809457);
	  craft_in.get_val();
	  ends[15]=2;
	  ;
	  S659=0;
	  active[15]=0;
	  ends[15]=0;
	  tdone[15]=1;
	}
	else {
	  active[15]=1;
	  ends[15]=1;
	  tdone[15]=1;
	}
      }
    }
  }
  public void thread1855478400(int [] tdone, int [] ends){
    if(tdone[14] != 1){
      S644=1;
      S633=0;
      if(wind_in.get_preempted()){
	tutu__464751153 = 0;
	tutu__464751153 = wind_in.get_preempted() ? wind_in.refresh() : 0;
	S633=1;
	active[14]=1;
	ends[14]=1;
	tdone[14]=1;
      }
      else {
	if(wind_in.get_r_s() > wind_in.get_r_r()){
	  tutu__1942046902 = 0;
	  tutu__1942046902 = wind_in.get_r_r();
	  tutu__1942046902++;
	  wind_in.set_r_r(tutu__1942046902);
	  wind_in.get_val();
	  ends[14]=2;
	  ;
	  S644=0;
	  active[14]=0;
	  ends[14]=0;
	  tdone[14]=1;
	}
	else {
	  active[14]=1;
	  ends[14]=1;
	  tdone[14]=1;
	}
      }
    }
  }
  public void thread1857402144(int [] tdone, int [] ends){
    if(tdone[13] != 1){
      S936=1;
      MAXCROSSWIND_thread_13 = 11;
      MAXHEADWIND_thread_13 = 23;
      MAXVELOCITY_thread_13 = 20;
      crosswind_thread_13 = 0;
      w0_thread_13 = 0;
      w1_thread_13 = 0;
      c0_thread_13 = 0;
      c1_thread_13 = 0;
      tosin_thread_13 = 0;
      tocos_thread_13 = 0;
      headwind_thread_13 = 0;
      absheadwind_thread_13 = 0;
      S660=0;
      thread1855478400(tdone,ends);
      thread1855093651(tdone,ends);
      int biggest1856247898 = 0;
      if(ends[14]>=biggest1856247898){
	biggest1856247898=ends[14];
      }
      if(ends[15]>=biggest1856247898){
	biggest1856247898=ends[15];
      }
      if(biggest1856247898 == 1){
	active[13]=1;
	ends[13]=1;
	tdone[13]=1;
      }
      //FINXME code
      if(biggest1856247898 == 0){
	S660=1;
	active[13]=1;
	ends[13]=1;
	tdone[13]=1;
      }
    }
  }
  public void thread1857786893(int [] tdone, int [] ends){
    if(tdone[12] != 1){
      active[12]=0;
      ends[12]=0;
      tdone[12]=1;
    }
  }
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S938){
      case 0 : 
	S938=0;
	break RUN;
      case 1 : 
	S938=2;
	increasekitevelocity_11.setClear();
	reducekitevelocity_11.setClear();
	increasekiteheading_11.setClear();
	reducekiteheading_11.setClear();
	thread1857786893(tdone,ends);
	thread1857402144(tdone,ends);
	int biggest1855863149 = 0;
	if(ends[12]>=biggest1855863149){
	  biggest1855863149=ends[12];
	}
	if(ends[13]>=biggest1855863149){
	  biggest1855863149=ends[13];
	}
	if(biggest1855863149 == 1){
	  active[11]=1;
	  ends[11]=1;
	  break RUN;
	}
      case 2 : 
	increasekitevelocity_11.setClear();
	reducekitevelocity_11.setClear();
	increasekiteheading_11.setClear();
	reducekiteheading_11.setClear();
	thread1853939404(tdone,ends);
	thread1853554655(tdone,ends);
	int biggest1836625704 = 0;
	if(ends[12]>=biggest1836625704){
	  biggest1836625704=ends[12];
	}
	if(ends[13]>=biggest1836625704){
	  biggest1836625704=ends[13];
	}
	if(biggest1836625704 == 1){
	  active[11]=1;
	  ends[11]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest1836625704 == 0){
	  S938=0;
	  active[11]=0;
	  ends[11]=0;
	  S938=0;
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
    increasekitevelocity_11 = new Signal();
    reducekitevelocity_11 = new Signal();
    increasekiteheading_11 = new Signal();
    reducekiteheading_11 = new Signal();
    // --------------------------------------------------
  }
  int tick=0;
  public void run(){
    while(active[11] != 0){
      int index = 11;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
	for(int h=1;h<paused.length;++h){
	  paused[h]=0;
	}
      }
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
	wind_in.update_r_s();
	craft_in.update_r_s();
	if(!df){
	  wind_in.gethook();
	  craft_in.gethook();
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
	System.err.println("VAL KiteControl,"+tick+","+eot+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      increasekitevelocity_11.setpreclear();
      reducekitevelocity_11.setpreclear();
      increasekiteheading_11.setpreclear();
      reducekiteheading_11.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      increasekitevelocity_11.setClear();
      reducekitevelocity_11.setClear();
      increasekiteheading_11.setClear();
      reducekiteheading_11.setClear();
      wind_in.sethook();
      craft_in.sethook();
      if(paused[11]!=0 || suspended[11]!=0 || active[11]!=1);
      else{
	wind_in.gethook();
	craft_in.gethook();
      }
      if(active[11] == 0){
	//.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
