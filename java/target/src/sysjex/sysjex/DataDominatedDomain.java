package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import Frq.*;

public class DataDominatedDomain extends ClockDomain{
  public DataDominatedDomain(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public output_Channel SampleCount_o = new output_Channel();
  private static Signal SampleLink_1;
  private static Signal SymResult_3;
  private static Signal AveResult_3;
  private static int i_thread_2;
  private static int val_thread_2;
  private static CalculateSample cs_thread_2;
  private static int turn_thread_2;
  private static int AveIndex_thread_4;
  private static int AveSum_thread_4;
  private static int AveWs_thread_4;
  private static float[] AveWindow_thread_4;
  private static int L_thread_5;
  private static float x1_thread_5;
  private static float x2_thread_5;
  private static int HalfSymWs_thread_5;
  private static float CorResult_thread_5;
  private static int SymIndex_thread_5;
  private static int SymWs_thread_5;
  private static float[] SymWindow_thread_5;
  private static int CorIndex_thread_5;
  private static float first_thread_6;
  private static float second_thread_6;
  private static float third_thread_6;
  private static boolean FirstPeak_thread_6;
  private static int SampleCountVar_thread_6;
  private static int SkipSamples_thread_6;
  private static int u_thread_2;
  private static float sample_thread_2;
  private static float sum_thread_4;
  private static int j_thread_4;
  private static float qwe_thread_4;
  private static int tyi_thread_6;
  private static int tutu__1843082104;
  private static int tutu__314771271;
  private static int tutu__1860780553;
  private static int tutu__1297911671;
  private static int S6674 = 1;
  private static int S272 = 1;
  private static int S2 = 1;
  private static int S6672 = 1;
  private static int S289 = 1;
  private static int S303 = 1;
  private static int S3473 = 1;
  private static int S502 = 1;
  private static int S314 = 1;
  private static int S309 = 1;
	
  private static int[] ends = new int[21];
  private static int[] tdone = new int[21];
  public void thread1070251892(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      switch(S3473){
      case 0 : 
	active[6]=0;
	ends[6]=0;
	tdone[6]=1;
	break;
      case 1 : 
	switch(S502){
	case 0 : 
	  if(SymResult_3.getprestatus()){
	    S502=1;
	    if(SkipSamples_thread_6 == 0){
	      SampleCountVar_thread_6 = SampleCountVar_thread_6 + 1;
	      third_thread_6 = second_thread_6;
	      second_thread_6 = first_thread_6;
	      first_thread_6 = ((Float)SymResult_3.getpreval()).floatValue();
	      if(second_thread_6 > first_thread_6 && second_thread_6 > third_thread_6){
		if(FirstPeak_thread_6){
		  FirstPeak_thread_6 = false;
		  SampleCountVar_thread_6 = 1;
		  S502=0;
		  active[6]=1;
		  ends[6]=1;
		  tdone[6]=1;
		}
		else {
		  tyi_thread_6 = SampleCountVar_thread_6 - 1;
		  S314=0;
		  if(SampleCount_o.get_preempted()){
		    tutu__314771271 = 0;
		    tutu__314771271 = SampleCount_o.get_preempted() ? SampleCount_o.refresh() : 0;
		    S314=1;
		    active[6]=1;
		    ends[6]=1;
		    tdone[6]=1;
		  }
		  else {
		    S309=0;
		    if(SampleCount_o.get_w_s() == SampleCount_o.get_w_r()){
		      tutu__1843082104 = 0;
		      tutu__1843082104 = SampleCount_o.get_w_s();
		      tutu__1843082104++;
		      SampleCount_o.set_w_s(tutu__1843082104);
		      SampleCount_o.set_value(new Float(tyi_thread_6));
		      S309=1;
		      if(SampleCount_o.get_w_s() == SampleCount_o.get_w_r()){
			ends[6]=2;
			;
			SampleCountVar_thread_6 = 1;
			S502=0;
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
	      }
	      else {
		S502=0;
		active[6]=1;
		ends[6]=1;
		tdone[6]=1;
	      }
	    }
	    else {
	      SkipSamples_thread_6 = SkipSamples_thread_6 - 1;
	      S502=0;
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
	  switch(S314){
	  case 0 : 
	    if(SampleCount_o.get_preempted()){
	      tutu__1297911671 = 0;
	      tutu__1297911671 = SampleCount_o.get_preempted() ? SampleCount_o.refresh() : 0;
	      S314=1;
	      active[6]=1;
	      ends[6]=1;
	      tdone[6]=1;
	    }
	    else {
	      switch(S309){
	      case 0 : 
		if(SampleCount_o.get_w_s() == SampleCount_o.get_w_r()){
		  tutu__1860780553 = 0;
		  tutu__1860780553 = SampleCount_o.get_w_s();
		  tutu__1860780553++;
		  SampleCount_o.set_w_s(tutu__1860780553);
		  SampleCount_o.set_value(new Float(tyi_thread_6));
		  S309=1;
		  if(SampleCount_o.get_w_s() == SampleCount_o.get_w_r()){
		    ends[6]=2;
		    ;
		    SampleCountVar_thread_6 = 1;
		    S502=0;
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
		if(SampleCount_o.get_w_s() == SampleCount_o.get_w_r()){
		  ends[6]=2;
		  ;
		  SampleCountVar_thread_6 = 1;
		  S502=0;
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
	    S314=1;
	    S314=0;
	    if(SampleCount_o.get_preempted()){
	      tutu__1297911671 = 0;
	      tutu__1297911671 = SampleCount_o.get_preempted() ? SampleCount_o.refresh() : 0;
	      S314=1;
	      active[6]=1;
	      ends[6]=1;
	      tdone[6]=1;
	    }
	    else {
	      S309=0;
	      if(SampleCount_o.get_w_s() == SampleCount_o.get_w_r()){
		tutu__1860780553 = 0;
		tutu__1860780553 = SampleCount_o.get_w_s();
		tutu__1860780553++;
		SampleCount_o.set_w_s(tutu__1860780553);
		SampleCount_o.set_value(new Float(tyi_thread_6));
		S309=1;
		if(SampleCount_o.get_w_s() == SampleCount_o.get_w_r()){
		  ends[6]=2;
		  ;
		  SampleCountVar_thread_6 = 1;
		  S502=0;
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
	}
	break;
      }
    }
  }
  public void thread1068712896(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      switch(S303){
      case 0 : 
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
	break;
      case 1 : 
	if(AveResult_3.getprestatus()){
	  SymIndex_thread_5 = (SymIndex_thread_5 + 1) % SymWs_thread_5;
	  SymWindow_thread_5[SymIndex_thread_5] = ((Float)AveResult_3.getpreval()).floatValue();
	  CorIndex_thread_5 = (SymIndex_thread_5 - HalfSymWs_thread_5 + SymWs_thread_5) % SymWs_thread_5;
	  CorResult_thread_5 = 0;
	  for(int k = 0; k <= HalfSymWs_thread_5; k = k + 1) {
	    x1_thread_5 = SymWindow_thread_5[(CorIndex_thread_5 + k) % SymWs_thread_5];
	    x2_thread_5 = SymWindow_thread_5[(CorIndex_thread_5 - k + SymWs_thread_5) % SymWs_thread_5];
	    CorResult_thread_5 = CorResult_thread_5 + (L_thread_5 + x1_thread_5) * (L_thread_5 + x2_thread_5);
	  }
	  SymResult_3.setPresent();
	  currsigs.addElement(SymResult_3);
	  SymResult_3.setValue(new Float(CorResult_thread_5));
	  System.out.println("Emitted SymResult_3");
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
  }
  public void thread1079485866(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      switch(S289){
      case 0 : 
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
	break;
      case 1 : 
	if(SampleLink_1.getprestatus()){
	  AveIndex_thread_4 = (AveIndex_thread_4 + 1) % AveWs_thread_4;
	  AveWindow_thread_4[AveIndex_thread_4] = ((Float)SampleLink_1.getpreval()).floatValue();
	  AveSum_thread_4 = 0;
	  sum_thread_4 = 0;
	  j_thread_4 = 0;
	  for(j_thread_4 = 0; j_thread_4 < AveWs_thread_4; j_thread_4 = j_thread_4 + 1) {
	    sum_thread_4 = sum_thread_4 + AveWindow_thread_4[(AveIndex_thread_4 + j_thread_4) % AveWs_thread_4];
	  }
	  qwe_thread_4 = sum_thread_4 / AveWs_thread_4;
	  AveResult_3.setPresent();
	  currsigs.addElement(AveResult_3);
	  AveResult_3.setValue(new Float(qwe_thread_4));
	  System.out.println("Emitted AveResult_3");
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
    }
  }
  public void thread1080640112(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      switch(S6672){
      case 0 : 
	active[3]=0;
	ends[3]=0;
	tdone[3]=1;
	break;
      case 1 : 
	SymResult_3.setClear();
	AveResult_3.setClear();
	thread1079485866(tdone,ends);
	thread1068712896(tdone,ends);
	thread1070251892(tdone,ends);
	int biggest1071790888 = 0;
	if(ends[4]>=biggest1071790888){
	  biggest1071790888=ends[4];
	}
	if(ends[5]>=biggest1071790888){
	  biggest1071790888=ends[5];
	}
	if(ends[6]>=biggest1071790888){
	  biggest1071790888=ends[6];
	}
	if(biggest1071790888 == 1){
	  active[3]=1;
	  ends[3]=1;
	  tdone[3]=1;
	}
	//FINXME code
	if(biggest1071790888 == 0){
	  S6672=0;
	  active[3]=0;
	  ends[3]=0;
	  tdone[3]=1;
	}
	break;
      }
    }
  }
  public void thread1079101117(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      switch(S272){
      case 0 : 
	active[2]=0;
	ends[2]=0;
	tdone[2]=1;
	break;
      case 1 : 
	switch(S2){
	case 0 : 
	  S2=0;
	  u_thread_2 = 0;
	  S2=1;
	  if(u_thread_2 == i_thread_2){
	    u_thread_2 = 0;
	    turn_thread_2 = turn_thread_2 + 1;
	    if(turn_thread_2 == 1) {
	      i_thread_2 = 16499;
	      val_thread_2 = 330;
	    }
	    else {
	      if(turn_thread_2 == 2) {
		i_thread_2 = 16999;
		val_thread_2 = 340;
	      }
	      else {
		if(turn_thread_2 == 3) {
		  i_thread_2 = 17499;
		  val_thread_2 = 350;
		}
		else {
		  if(turn_thread_2 == 0) {
		    i_thread_2 = 15999;
		    val_thread_2 = 320;
		  }
		}
	      }
	    }
	    ends[2]=2;
	    ;
	    S2=0;
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  else {
	    u_thread_2 = u_thread_2 + 1;
	    if(u_thread_2 == i_thread_2 && turn_thread_2 == 3) {
	      turn_thread_2 = -1;
	    }
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  break;
	case 1 : 
	  sample_thread_2 = cs_thread_2.compute(u_thread_2, val_thread_2);
	  SampleLink_1.setPresent();
	  currsigs.addElement(SampleLink_1);
	  SampleLink_1.setValue(new Float(sample_thread_2));
	  System.out.println("Emitted SampleLink_1");
	  if(u_thread_2 == i_thread_2){
	    u_thread_2 = 0;
	    turn_thread_2 = turn_thread_2 + 1;
	    if(turn_thread_2 == 1) {
	      i_thread_2 = 16499;
	      val_thread_2 = 330;
	    }
	    else {
	      if(turn_thread_2 == 2) {
		i_thread_2 = 16999;
		val_thread_2 = 340;
	      }
	      else {
		if(turn_thread_2 == 3) {
		  i_thread_2 = 17499;
		  val_thread_2 = 350;
		}
		else {
		  if(turn_thread_2 == 0) {
		    i_thread_2 = 15999;
		    val_thread_2 = 320;
		  }
		}
	      }
	    }
	    ends[2]=2;
	    ;
	    S2=0;
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  else {
	    u_thread_2 = u_thread_2 + 1;
	    if(u_thread_2 == i_thread_2 && turn_thread_2 == 3) {
	      turn_thread_2 = -1;
	    }
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
  public void thread1076407874(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      S3473=1;
      first_thread_6 = 10000;
      second_thread_6 = 10000;
      third_thread_6 = 10000;
      FirstPeak_thread_6 = true;
      SampleCountVar_thread_6 = 0;
      SkipSamples_thread_6 = 363;
      S502=0;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }
  public void thread1077562121(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S303=1;
      L_thread_5 = 10;
      x1_thread_5 = 0;
      x2_thread_5 = 0;
      HalfSymWs_thread_5 = 80;
      CorResult_thread_5 = 0;
      SymIndex_thread_5 = -1;
      SymWs_thread_5 = 161;
      SymWindow_thread_5 = new float[SymWs_thread_5];
      CorIndex_thread_5 = 0;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }
  public void thread1077177372(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S289=1;
      AveIndex_thread_4 = -1;
      AveSum_thread_4 = 0;
      AveWs_thread_4 = 20;
      AveWindow_thread_4 = new float[AveWs_thread_4];
      active[4]=1;
      ends[4]=1;
      tdone[4]=1;
    }
  }
  public void thread1060633170(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      SymResult_3.setClear();
      AveResult_3.setClear();
      SymResult_3.setPresent();
      currsigs.addElement(SymResult_3);
      SymResult_3.setValue(new Float(0.0));
      System.out.println("Emitted SymResult_3");
      AveResult_3.setPresent();
      currsigs.addElement(AveResult_3);
      AveResult_3.setValue(new Float(0.0));
      System.out.println("Emitted AveResult_3");
      thread1077177372(tdone,ends);
      thread1077562121(tdone,ends);
      thread1076407874(tdone,ends);
      int biggest1076792623 = 0;
      if(ends[4]>=biggest1076792623){
	biggest1076792623=ends[4];
      }
      if(ends[5]>=biggest1076792623){
	biggest1076792623=ends[5];
      }
      if(ends[6]>=biggest1076792623){
	biggest1076792623=ends[6];
      }
      if(biggest1076792623 == 1){
	active[3]=1;
	ends[3]=1;
	tdone[3]=1;
      }
    }
  }
  public void thread1060248421(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      S272=1;
      i_thread_2 = 15999;
      val_thread_2 = 320;
      cs_thread_2 = new CalculateSample();
      turn_thread_2 = 0;
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
      switch(S6674){
      case 0 : 
	S6674=0;
	break RUN;
      case 1 : 
	S6674=2;
	SampleLink_1.setClear();
	thread1060248421(tdone,ends);
	thread1060633170(tdone,ends);
	int biggest1078716368 = 0;
	if(ends[2]>=biggest1078716368){
	  biggest1078716368=ends[2];
	}
	if(ends[3]>=biggest1078716368){
	  biggest1078716368=ends[3];
	}
	if(biggest1078716368 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
	if(biggest1078716368 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
      case 2 : 
	SampleLink_1.setClear();
	thread1079101117(tdone,ends);
	thread1080640112(tdone,ends);
	int biggest1074099381 = 0;
	if(ends[2]>=biggest1074099381){
	  biggest1074099381=ends[2];
	}
	if(ends[3]>=biggest1074099381){
	  biggest1074099381=ends[3];
	}
	if(biggest1074099381 == 1){
	  active[1]=1;
	  ends[1]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest1074099381 == 0){
	  S6674=0;
	  active[1]=0;
	  ends[1]=0;
	  S6674=0;
	  break RUN;
	}
      }
    }
  }
  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    SampleLink_1 = new Signal();
    SymResult_3 = new Signal();
    AveResult_3 = new Signal();
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
	SampleCount_o.update_w_r();
	if(!df){
	  SampleCount_o.gethook();
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
	System.out.println("VAL DataDominatedDomain,"+(++tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }

      SampleLink_1.setpreclear();
      SymResult_3.setpreclear();
      AveResult_3.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      SampleLink_1.setClear();
      SymResult_3.setClear();
      AveResult_3.setClear();
      SampleCount_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
	SampleCount_o.gethook();
      }
      if(active[1] == 0){
	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
