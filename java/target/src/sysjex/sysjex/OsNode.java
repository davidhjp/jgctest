package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import scPackage.*;
import com.jopdesign.sys.Native;

public class OsNode extends ClockDomain{
  public OsNode(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public input_Channel TransferId_in = new input_Channel();
  public input_Channel SendCmd_in = new input_Channel();
  public output_Channel Authorization_o = new output_Channel();
  private static int tutu__1501460031;
  private static int tutu__837697690;
  private static int tutu__1499536286;
  private static int tutu__1974814023;
  private static int ret_thread_9;
  private static int tutu__1580333555;
  private static int tutu__186560898;
  private static int tutu__1498382039;
  private static int tutu__1491639705;
  private static int tutu__1587259035;
  private static int tutu__862675011;
  private static int tutu__1586104789;
  private static int tutu__34161443;
  private static int S1250 = 1;
  private static int S1054 = 1;
  private static int S1038 = 1;
  private static int S1027 = 1;
  private static int S1053 = 1;
  private static int S1042 = 1;
  private static int S1061 = 1;
  private static int S1056 = 1;
	
  private static int[] ends = new int[12];
  private static int[] tdone = new int[12];
  public void thread1378400811(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      S1053=1;
      S1042=0;
      if(SendCmd_in.get_preempted()){
	tutu__34161443 = 0;
	tutu__34161443 = SendCmd_in.get_preempted() ? SendCmd_in.refresh() : 0;
	S1042=1;
	active[11]=1;
	ends[11]=1;
	tdone[11]=1;
      }
      else {
	if(SendCmd_in.get_r_s() > SendCmd_in.get_r_r()){
	  tutu__1586104789 = 0;
	  tutu__1586104789 = SendCmd_in.get_r_r();
	  tutu__1586104789++;
	  SendCmd_in.set_r_r(tutu__1586104789);
	  SendCmd_in.get_val();
	  ends[11]=2;
	  ;
	  S1053=0;
	  active[11]=0;
	  ends[11]=0;
	  tdone[11]=1;
	}
	else {
	  active[11]=1;
	  ends[11]=1;
	  tdone[11]=1;
	}
      }
    }
  }
  public void thread1388789031(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      S1038=1;
      S1027=0;
      if(TransferId_in.get_preempted()){
	tutu__862675011 = 0;
	tutu__862675011 = TransferId_in.get_preempted() ? TransferId_in.refresh() : 0;
	S1027=1;
	active[10]=1;
	ends[10]=1;
	tdone[10]=1;
      }
      else {
	if(TransferId_in.get_r_s() > TransferId_in.get_r_r()){
	  tutu__1587259035 = 0;
	  tutu__1587259035 = TransferId_in.get_r_r();
	  tutu__1587259035++;
	  TransferId_in.set_r_r(tutu__1587259035);
	  TransferId_in.get_val();
	  ends[10]=2;
	  ;
	  S1038=0;
	  active[10]=0;
	  ends[10]=0;
	  tdone[10]=1;
	}
	else {
	  active[10]=1;
	  ends[10]=1;
	  tdone[10]=1;
	}
      }
    }
  }
  public void thread1389173780(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      switch(S1053){
      case 0 : 
	active[11]=0;
	ends[11]=0;
	tdone[11]=1;
	break;
      case 1 : 
	switch(S1042){
	case 0 : 
	  if(SendCmd_in.get_preempted()){
	    tutu__1974814023 = 0;
	    tutu__1974814023 = SendCmd_in.get_preempted() ? SendCmd_in.refresh() : 0;
	    S1042=1;
	    active[11]=1;
	    ends[11]=1;
	    tdone[11]=1;
	  }
	  else {
	    if(SendCmd_in.get_r_s() > SendCmd_in.get_r_r()){
	      tutu__1499536286 = 0;
	      tutu__1499536286 = SendCmd_in.get_r_r();
	      tutu__1499536286++;
	      SendCmd_in.set_r_r(tutu__1499536286);
	      SendCmd_in.get_val();
	      ends[11]=2;
	      ;
	      S1053=0;
	      active[11]=0;
	      ends[11]=0;
	      tdone[11]=1;
	    }
	    else {
	      active[11]=1;
	      ends[11]=1;
	      tdone[11]=1;
	    }
	  }
	  break;
	case 1 : 
	  S1042=1;
	  S1042=0;
	  if(SendCmd_in.get_preempted()){
	    tutu__1974814023 = 0;
	    tutu__1974814023 = SendCmd_in.get_preempted() ? SendCmd_in.refresh() : 0;
	    S1042=1;
	    active[11]=1;
	    ends[11]=1;
	    tdone[11]=1;
	  }
	  else {
	    if(SendCmd_in.get_r_s() > SendCmd_in.get_r_r()){
	      tutu__1499536286 = 0;
	      tutu__1499536286 = SendCmd_in.get_r_r();
	      tutu__1499536286++;
	      SendCmd_in.set_r_r(tutu__1499536286);
	      SendCmd_in.get_val();
	      ends[11]=2;
	      ;
	      S1053=0;
	      active[11]=0;
	      ends[11]=0;
	      tdone[11]=1;
	    }
	    else {
	      active[11]=1;
	      ends[11]=1;
	      tdone[11]=1;
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1387250035(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      switch(S1038){
      case 0 : 
	active[10]=0;
	ends[10]=0;
	tdone[10]=1;
	break;
      case 1 : 
	switch(S1027){
	case 0 : 
	  if(TransferId_in.get_preempted()){
	    tutu__837697690 = 0;
	    tutu__837697690 = TransferId_in.get_preempted() ? TransferId_in.refresh() : 0;
	    S1027=1;
	    active[10]=1;
	    ends[10]=1;
	    tdone[10]=1;
	  }
	  else {
	    if(TransferId_in.get_r_s() > TransferId_in.get_r_r()){
	      tutu__1501460031 = 0;
	      tutu__1501460031 = TransferId_in.get_r_r();
	      tutu__1501460031++;
	      TransferId_in.set_r_r(tutu__1501460031);
	      TransferId_in.get_val();
	      ends[10]=2;
	      ;
	      S1038=0;
	      active[10]=0;
	      ends[10]=0;
	      tdone[10]=1;
	    }
	    else {
	      active[10]=1;
	      ends[10]=1;
	      tdone[10]=1;
	    }
	  }
	  break;
	case 1 : 
	  S1027=1;
	  S1027=0;
	  if(TransferId_in.get_preempted()){
	    tutu__837697690 = 0;
	    tutu__837697690 = TransferId_in.get_preempted() ? TransferId_in.refresh() : 0;
	    S1027=1;
	    active[10]=1;
	    ends[10]=1;
	    tdone[10]=1;
	  }
	  else {
	    if(TransferId_in.get_r_s() > TransferId_in.get_r_r()){
	      tutu__1501460031 = 0;
	      tutu__1501460031 = TransferId_in.get_r_r();
	      tutu__1501460031++;
	      TransferId_in.set_r_r(tutu__1501460031);
	      TransferId_in.get_val();
	      ends[10]=2;
	      ;
	      S1038=0;
	      active[10]=0;
	      ends[10]=0;
	      tdone[10]=1;
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
      }
    }
  }
  public void thread1388019533(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      S1053=1;
      S1042=0;
      if(SendCmd_in.get_preempted()){
	tutu__1974814023 = 0;
	tutu__1974814023 = SendCmd_in.get_preempted() ? SendCmd_in.refresh() : 0;
	S1042=1;
	active[11]=1;
	ends[11]=1;
	tdone[11]=1;
      }
      else {
	if(SendCmd_in.get_r_s() > SendCmd_in.get_r_r()){
	  tutu__1499536286 = 0;
	  tutu__1499536286 = SendCmd_in.get_r_r();
	  tutu__1499536286++;
	  SendCmd_in.set_r_r(tutu__1499536286);
	  SendCmd_in.get_val();
	  ends[11]=2;
	  ;
	  S1053=0;
	  active[11]=0;
	  ends[11]=0;
	  tdone[11]=1;
	}
	else {
	  active[11]=1;
	  ends[11]=1;
	  tdone[11]=1;
	}
      }
    }
  }
  public void thread1387634784(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      S1038=1;
      S1027=0;
      if(TransferId_in.get_preempted()){
	tutu__837697690 = 0;
	tutu__837697690 = TransferId_in.get_preempted() ? TransferId_in.refresh() : 0;
	S1027=1;
	active[10]=1;
	ends[10]=1;
	tdone[10]=1;
      }
      else {
	if(TransferId_in.get_r_s() > TransferId_in.get_r_r()){
	  tutu__1501460031 = 0;
	  tutu__1501460031 = TransferId_in.get_r_r();
	  tutu__1501460031++;
	  TransferId_in.set_r_r(tutu__1501460031);
	  TransferId_in.get_val();
	  ends[10]=2;
	  ;
	  S1038=0;
	  active[10]=0;
	  ends[10]=0;
	  tdone[10]=1;
	}
	else {
	  active[10]=1;
	  ends[10]=1;
	  tdone[10]=1;
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
      switch(S1250){
      case 0 : 
	S1250=0;
	break RUN;
      case 1 : 
	S1250=2;
	S1250=2;
	S1054=0;
	thread1387634784(tdone,ends);
	thread1388019533(tdone,ends);
	int biggest1386865287 = 0;
	if(ends[10]>=biggest1386865287){
	  biggest1386865287=ends[10];
	}
	if(ends[11]>=biggest1386865287){
	  biggest1386865287=ends[11];
	}
	if(biggest1386865287 == 1){
	  active[9]=1;
	  ends[9]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest1386865287 == 0){
	  S1054=1;
	  active[9]=1;
	  ends[9]=1;
	  break RUN;
	}
      case 2 : 
	switch(S1054){
	case 0 : 
	  thread1387250035(tdone,ends);
	  thread1389173780(tdone,ends);
	  int biggest1389558529 = 0;
	  if(ends[10]>=biggest1389558529){
	    biggest1389558529=ends[10];
	  }
	  if(ends[11]>=biggest1389558529){
	    biggest1389558529=ends[11];
	  }
	  if(biggest1389558529 == 1){
	    active[9]=1;
	    ends[9]=1;
	    break RUN;
	  }
	  //FINXME code
	  if(biggest1389558529 == 0){
	    S1054=1;
	    active[9]=1;
	    ends[9]=1;
	    break RUN;
	  }
	case 1 : 
	  S1054=1;
	  ret_thread_9 = 0;
	  ret_thread_9 = Permission.getPermission(((Character)TransferId_in.get_value()).charValue(), ((Character)SendCmd_in.get_value()).charValue());
	  S1054=2;
	  S1061=0;
	  if(Authorization_o.get_preempted()){
	    tutu__186560898 = 0;
	    tutu__186560898 = Authorization_o.get_preempted() ? Authorization_o.refresh() : 0;
	    S1061=1;
	    active[9]=1;
	    ends[9]=1;
	    break RUN;
	  }
	  else {
	    S1056=0;
	    if(Authorization_o.get_w_s() == Authorization_o.get_w_r()){
	      tutu__1580333555 = 0;
	      tutu__1580333555 = Authorization_o.get_w_s();
	      tutu__1580333555++;
	      Authorization_o.set_w_s(tutu__1580333555);
	      Authorization_o.set_value(new Integer(ret_thread_9));
	      S1056=1;
	      if(Authorization_o.get_w_s() == Authorization_o.get_w_r()){
		ends[9]=2;
		;
		S1054=3;
		active[9]=1;
		ends[9]=1;
		break RUN;
	      }
	      else {
		active[9]=1;
		ends[9]=1;
		break RUN;
	      }
	    }
	    else {
	      active[9]=1;
	      ends[9]=1;
	      break RUN;
	    }
	  }
	case 2 : 
	  switch(S1061){
	  case 0 : 
	    if(Authorization_o.get_preempted()){
	      tutu__1491639705 = 0;
	      tutu__1491639705 = Authorization_o.get_preempted() ? Authorization_o.refresh() : 0;
	      S1061=1;
	      active[9]=1;
	      ends[9]=1;
	      break RUN;
	    }
	    else {
	      switch(S1056){
	      case 0 : 
		if(Authorization_o.get_w_s() == Authorization_o.get_w_r()){
		  tutu__1498382039 = 0;
		  tutu__1498382039 = Authorization_o.get_w_s();
		  tutu__1498382039++;
		  Authorization_o.set_w_s(tutu__1498382039);
		  Authorization_o.set_value(new Integer(ret_thread_9));
		  S1056=1;
		  if(Authorization_o.get_w_s() == Authorization_o.get_w_r()){
		    ends[9]=2;
		    ;
		    S1054=3;
		    active[9]=1;
		    ends[9]=1;
		    break RUN;
		  }
		  else {
		    active[9]=1;
		    ends[9]=1;
		    break RUN;
		  }
		}
		else {
		  active[9]=1;
		  ends[9]=1;
		  break RUN;
		}
	      case 1 : 
		if(Authorization_o.get_w_s() == Authorization_o.get_w_r()){
		  ends[9]=2;
		  ;
		  S1054=3;
		  active[9]=1;
		  ends[9]=1;
		  break RUN;
		}
		else {
		  active[9]=1;
		  ends[9]=1;
		  break RUN;
		}
	      }
	    }
	    break;
	  case 1 : 
	    S1061=1;
	    S1061=0;
	    if(Authorization_o.get_preempted()){
	      tutu__1491639705 = 0;
	      tutu__1491639705 = Authorization_o.get_preempted() ? Authorization_o.refresh() : 0;
	      S1061=1;
	      active[9]=1;
	      ends[9]=1;
	      break RUN;
	    }
	    else {
	      S1056=0;
	      if(Authorization_o.get_w_s() == Authorization_o.get_w_r()){
		tutu__1498382039 = 0;
		tutu__1498382039 = Authorization_o.get_w_s();
		tutu__1498382039++;
		Authorization_o.set_w_s(tutu__1498382039);
		Authorization_o.set_value(new Integer(ret_thread_9));
		S1056=1;
		if(Authorization_o.get_w_s() == Authorization_o.get_w_r()){
		  ends[9]=2;
		  ;
		  S1054=3;
		  active[9]=1;
		  ends[9]=1;
		  break RUN;
		}
		else {
		  active[9]=1;
		  ends[9]=1;
		  break RUN;
		}
	      }
	      else {
		active[9]=1;
		ends[9]=1;
		break RUN;
	      }
	    }
	  }
	  break;
	case 3 : 
	  S1054=3;
	  S1054=0;
	  thread1388789031(tdone,ends);
	  thread1378400811(tdone,ends);
	  int biggest1378785560 = 0;
	  if(ends[10]>=biggest1378785560){
	    biggest1378785560=ends[10];
	  }
	  if(ends[11]>=biggest1378785560){
	    biggest1378785560=ends[11];
	  }
	  if(biggest1378785560 == 1){
	    active[9]=1;
	    ends[9]=1;
	    break RUN;
	  }
	  //FINXME code
	  if(biggest1378785560 == 0){
	    S1054=1;
	    active[9]=1;
	    ends[9]=1;
	    break RUN;
	  }
	}
      }
    }
  }
  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    // --------------------------------------------------
  }
  int tick = 0;
  public void run(){
    while(active[9] != 0){
      int index = 9;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
	for(int h=1;h<paused.length;++h){
	  paused[h]=0;
	}
      }
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
	TransferId_in.update_r_s();
	SendCmd_in.update_r_s();
	Authorization_o.update_w_r();
	if(!df){
	  TransferId_in.gethook();
	  SendCmd_in.gethook();
	  Authorization_o.gethook();
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
	System.err.println("VAL OsNode,"+(++tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      TransferId_in.sethook();
      SendCmd_in.sethook();
      Authorization_o.sethook();
      if(paused[9]!=0 || suspended[9]!=0 || active[9]!=1);
      else{
	TransferId_in.gethook();
	SendCmd_in.gethook();
	Authorization_o.gethook();
      }
      if(active[9] == 0){
	System.err.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
