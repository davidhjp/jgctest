package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import Asproto.*;
import com.jopdesign.sys.Native;

public class apsCD2 extends ClockDomain{
  public apsCD2(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public input_Channel reset1_in = new input_Channel();
  public input_Channel data1_in = new input_Channel();
  private static Signal killcheck_2;
  private static Signal packet_2;
  private static Signal res1_2;
  private static Signal res2_2;
  private static Signal res3_2;
  private static Signal crcok_2;
  private static int cnt_thread_4;
  private static Asproto buffer_thread_4;
  private static int tutu__925294552;
  private static int tutu__1944031395;
  private static int crc_thread_5;
  private static int match_ok_thread_6;
  private static int tutu__961076200;
  private static int tutu__1858148230;
  private static int tutu__968386429;
  private static int u_thread_3;
  private static int tutu__1378777767;
  private static int tutu__967616931;
  private static int tutu__605220377;
  private static int e_thread_4;
  private static int len2_thread_4;
  private static int tutu__954920217;
  private static byte t_thread_4;
  private static int tutu__1128935034;
  private static int val_thread_5;
  private static int there_thread_6;
  private static int re_thread_8;
  private static int S1223 = 1;
  private static int S657 = 1;
  private static int S603 = 1;
  private static int S593 = 1;
  private static int S1061 = 1;
  private static int S725 = 1;
  private static int S662 = 1;
  private static int S1087 = 1;
  private static int S1065 = 1;
  private static int S1221 = 1;
  private static int S1109 = 1;
  private static int S1107 = 1;
  private static int S1092 = 1;
  private static int S1089 = 1;
  private static int S1097 = 1;
	
  private static int[] ends = new int[9];
  private static int[] tdone = new int[9];
  public void thread866812719(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      switch(S1097){
      case 0 : 
	active[8]=0;
	ends[8]=0;
	tdone[8]=1;
	break;
      case 1 : 
	if(crcok_2.getprestatus()){
	  re_thread_8 = 0;
	  re_thread_8 = (Integer)crcok_2.getpreval();
	  if(re_thread_8 == 0){
	    killcheck_2.setPresent();
	    currsigs.addElement(killcheck_2);
	    //.println("Emitted killcheck_2");
	    S1097=0;
	    active[8]=0;
	    ends[8]=0;
	    tdone[8]=1;
	  }
	  else {
	    S1097=0;
	    active[8]=0;
	    ends[8]=0;
	    tdone[8]=1;
	  }
	}
	else {
	  active[8]=1;
	  ends[8]=1;
	  tdone[8]=1;
	}
	break;
      }
    }
  }
  public void thread868736464(int [] tdone, int [] ends){
    if(tdone[7] != 1){
      switch(S1092){
      case 0 : 
	active[7]=0;
	ends[7]=0;
	tdone[7]=1;
	break;
      case 1 : 
	if(killcheck_2.getprestatus()){
	  S1092=0;
	  active[7]=0;
	  ends[7]=0;
	  tdone[7]=1;
	}
	else {
	  switch(S1089){
	  case 0 : 
	    S1089=0;
	    S1089=1;
	    active[7]=1;
	    ends[7]=1;
	    tdone[7]=1;
	    break;
	  case 1 : 
	    S1089=1;
	    S1089=2;
	    active[7]=1;
	    ends[7]=1;
	    tdone[7]=1;
	    break;
	  case 2 : 
	    S1089=2;
	    S1089=3;
	    active[7]=1;
	    ends[7]=1;
	    tdone[7]=1;
	    break;
	  case 3 : 
	    S1089=3;
	    S1092=0;
	    active[7]=0;
	    ends[7]=0;
	    tdone[7]=1;
	    break;
	  }
	}
	break;
      }
    }
  }
  public void thread867966966(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      S1097=1;
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }
  public void thread868351715(int [] tdone, int [] ends){
    if(tdone[7] != 1){
      S1092=1;
      S1089=0;
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }
  public void thread870275459(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      switch(S1221){
      case 0 : 
	active[6]=0;
	ends[6]=0;
	tdone[6]=1;
	break;
      case 1 : 
	switch(S1109){
	case 0 : 
	  if(res3_2.getprestatus()){
	    S1109=1;
	    active[6]=1;
	    ends[6]=1;
	    tdone[6]=1;
	  }
	  else {
	    switch(S1107){
	    case 0 : 
	      if(packet_2.getprestatus()){
		S1107=1;
		thread868351715(tdone,ends);
		thread867966966(tdone,ends);
		int biggest869121212 = 0;
		if(ends[7]>=biggest869121212){
		  biggest869121212=ends[7];
		}
		if(ends[8]>=biggest869121212){
		  biggest869121212=ends[8];
		}
		if(biggest869121212 == 1){
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
	      thread868736464(tdone,ends);
	      thread866812719(tdone,ends);
	      int biggest866427970 = 0;
	      if(ends[7]>=biggest866427970){
		biggest866427970=ends[7];
	      }
	      if(ends[8]>=biggest866427970){
		biggest866427970=ends[8];
	      }
	      if(biggest866427970 == 1){
		active[6]=1;
		ends[6]=1;
		tdone[6]=1;
	      }
	      //FINXME code
	      if(biggest866427970 == 0){
		there_thread_6 = 0;
		there_thread_6 = (Integer)crcok_2.getpreval();
		if(there_thread_6 == 1) {
		  //.println("Address match!");
		}
		S1109=1;
		active[6]=1;
		ends[6]=1;
		tdone[6]=1;
	      }
	      break;
	    }
	  }
	  break;
	case 1 : 
	  S1109=1;
	  S1109=0;
	  S1107=0;
	  active[6]=1;
	  ends[6]=1;
	  tdone[6]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread859117741(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      switch(S1087){
      case 0 : 
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
	break;
      case 1 : 
	switch(S1065){
	case 0 : 
	  if(res2_2.getprestatus()){
	    S1065=1;
	    active[5]=1;
	    ends[5]=1;
	    tdone[5]=1;
	  }
	  else {
	    if(packet_2.getprestatus()){
	      crc_thread_5 = ((Asproto)packet_2.getpreval()).computeCRC();
	      val_thread_5 = 0;
	      val_thread_5 = (crc_thread_5 == ((Asproto)packet_2.getpreval()).getCRC()) ? 1 : 0;
	      crcok_2.setPresent();
	      currsigs.addElement(crcok_2);
	      crcok_2.setValue(val_thread_5);
	      //.println("Emitted crcok_2");
	      S1065=1;
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
	  break;
	case 1 : 
	  S1065=1;
	  S1065=0;
	  active[5]=1;
	  ends[5]=1;
	  tdone[5]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread773318736(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      switch(S1061){
      case 0 : 
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
	break;
      case 1 : 
	switch(S725){
	case 0 : 
	  if(res1_2.getprestatus()){
	    data1_in.refresh();
	    S725=1;
	    active[4]=1;
	    ends[4]=1;
	    tdone[4]=1;
	  }
	  else {
	    switch(S662){
	    case 0 : 
	      if(data1_in.get_preempted()){
		tutu__605220377 = 0;
		tutu__605220377 = data1_in.get_preempted() ? data1_in.refresh() : 0;
		S662=1;
		active[4]=1;
		ends[4]=1;
		tdone[4]=1;
	      }
	      else {
		if(data1_in.get_r_s() > data1_in.get_r_r()){
		  tutu__967616931 = 0;
		  tutu__967616931 = data1_in.get_r_r();
		  tutu__967616931++;
		  data1_in.set_r_r(tutu__967616931);
		  data1_in.get_val();
		  ends[4]=2;
		  ;
		  t_thread_4 = 0;
		  t_thread_4 = (Byte)data1_in.get_value();
		  e_thread_4 = e_thread_4 + 1;
		  buffer_thread_4.setRaw(e_thread_4, t_thread_4);
		  packet_2.setPresent();
		  currsigs.addElement(packet_2);
		  packet_2.setValue(buffer_thread_4);
		  //.println("Emitted packet_2");
		  S725=1;
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
	    case 1 : 
	      S662=1;
	      S662=0;
	      if(data1_in.get_preempted()){
		tutu__605220377 = 0;
		tutu__605220377 = data1_in.get_preempted() ? data1_in.refresh() : 0;
		S662=1;
		active[4]=1;
		ends[4]=1;
		tdone[4]=1;
	      }
	      else {
		if(data1_in.get_r_s() > data1_in.get_r_r()){
		  tutu__967616931 = 0;
		  tutu__967616931 = data1_in.get_r_r();
		  tutu__967616931++;
		  data1_in.set_r_r(tutu__967616931);
		  data1_in.get_val();
		  ends[4]=2;
		  ;
		  t_thread_4 = 0;
		  t_thread_4 = (Byte)data1_in.get_value();
		  e_thread_4 = e_thread_4 + 1;
		  buffer_thread_4.setRaw(e_thread_4, t_thread_4);
		  packet_2.setPresent();
		  currsigs.addElement(packet_2);
		  packet_2.setValue(buffer_thread_4);
		  //.println("Emitted packet_2");
		  S725=1;
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
	  break;
	case 1 : 
	  S725=1;
	  S725=0;
	  e_thread_4 = 0;
	  len2_thread_4 = Asproto.PKTSIZE;
	  if(e_thread_4 == len2_thread_4){
	    data1_in.refresh();
	    ends[4]=2;
	    ;
	    packet_2.setPresent();
	    currsigs.addElement(packet_2);
	    packet_2.setValue(buffer_thread_4);
	    //.println("Emitted packet_2");
	    S725=1;
	    active[4]=1;
	    ends[4]=1;
	    tdone[4]=1;
	  }
	  else {
	    S662=0;
	    if(data1_in.get_preempted()){
	      tutu__1128935034 = 0;
	      tutu__1128935034 = data1_in.get_preempted() ? data1_in.refresh() : 0;
	      S662=1;
	      active[4]=1;
	      ends[4]=1;
	      tdone[4]=1;
	    }
	    else {
	      if(data1_in.get_r_s() > data1_in.get_r_r()){
		tutu__954920217 = 0;
		tutu__954920217 = data1_in.get_r_r();
		tutu__954920217++;
		data1_in.set_r_r(tutu__954920217);
		data1_in.get_val();
		ends[4]=2;
		;
		t_thread_4 = 0;
		t_thread_4 = (Byte)data1_in.get_value();
		e_thread_4 = e_thread_4 + 1;
		buffer_thread_4.setRaw(e_thread_4, t_thread_4);
		packet_2.setPresent();
		currsigs.addElement(packet_2);
		packet_2.setValue(buffer_thread_4);
		//.println("Emitted packet_2");
		S725=1;
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
	  break;
	}
	break;
      }
    }
  }
  public void thread774857732(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      switch(S657){
      case 0 : 
	active[3]=0;
	ends[3]=0;
	tdone[3]=1;
	break;
      case 1 : 
	switch(S603){
	case 0 : 
	  switch(S593){
	  case 0 : 
	    if(reset1_in.get_preempted()){
	      tutu__1858148230 = 0;
	      tutu__1858148230 = reset1_in.get_preempted() ? reset1_in.refresh() : 0;
	      S593=1;
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	    }
	    else {
	      if(reset1_in.get_r_s() > reset1_in.get_r_r()){
		tutu__961076200 = 0;
		tutu__961076200 = reset1_in.get_r_r();
		tutu__961076200++;
		reset1_in.set_r_r(tutu__961076200);
		reset1_in.get_val();
		ends[3]=2;
		;
		u_thread_3 = 0;
		u_thread_3 = (Integer)reset1_in.get_value();
		if(u_thread_3 == 1){
		  res1_2.setPresent();
		  currsigs.addElement(res1_2);
		  //.println("Emitted res1_2");
		  res2_2.setPresent();
		  currsigs.addElement(res2_2);
		  //.println("Emitted res2_2");
		  res3_2.setPresent();
		  currsigs.addElement(res3_2);
		  //.println("Emitted res3_2");
		  S603=1;
		  active[3]=1;
		  ends[3]=1;
		  tdone[3]=1;
		}
		else {
		  S603=1;
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
	  case 1 : 
	    S593=1;
	    S593=0;
	    if(reset1_in.get_preempted()){
	      tutu__1858148230 = 0;
	      tutu__1858148230 = reset1_in.get_preempted() ? reset1_in.refresh() : 0;
	      S593=1;
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	    }
	    else {
	      if(reset1_in.get_r_s() > reset1_in.get_r_r()){
		tutu__961076200 = 0;
		tutu__961076200 = reset1_in.get_r_r();
		tutu__961076200++;
		reset1_in.set_r_r(tutu__961076200);
		reset1_in.get_val();
		ends[3]=2;
		;
		u_thread_3 = 0;
		u_thread_3 = (Integer)reset1_in.get_value();
		if(u_thread_3 == 1){
		  res1_2.setPresent();
		  currsigs.addElement(res1_2);
		  //.println("Emitted res1_2");
		  res2_2.setPresent();
		  currsigs.addElement(res2_2);
		  //.println("Emitted res2_2");
		  res3_2.setPresent();
		  currsigs.addElement(res3_2);
		  //.println("Emitted res3_2");
		  S603=1;
		  active[3]=1;
		  ends[3]=1;
		  tdone[3]=1;
		}
		else {
		  S603=1;
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
	  S603=1;
	  S603=0;
	  S593=0;
	  if(reset1_in.get_preempted()){
	    tutu__1378777767 = 0;
	    tutu__1378777767 = reset1_in.get_preempted() ? reset1_in.refresh() : 0;
	    S593=1;
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  else {
	    if(reset1_in.get_r_s() > reset1_in.get_r_r()){
	      tutu__968386429 = 0;
	      tutu__968386429 = reset1_in.get_r_r();
	      tutu__968386429++;
	      reset1_in.set_r_r(tutu__968386429);
	      reset1_in.get_val();
	      ends[3]=2;
	      ;
	      u_thread_3 = 0;
	      u_thread_3 = (Integer)reset1_in.get_value();
	      if(u_thread_3 == 1){
		res1_2.setPresent();
		currsigs.addElement(res1_2);
		//.println("Emitted res1_2");
		res2_2.setPresent();
		currsigs.addElement(res2_2);
		//.println("Emitted res2_2");
		res3_2.setPresent();
		currsigs.addElement(res3_2);
		//.println("Emitted res3_2");
		S603=1;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      else {
		S603=1;
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
      }
    }
  }
  public void thread774088234(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      S1221=1;
      match_ok_thread_6 = 0;
      S1109=0;
      S1107=0;
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }
  public void thread774472983(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S1087=1;
      crc_thread_5 = 0;
      S1065=0;
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }
  public void thread792556181(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S1061=1;
      cnt_thread_4 = 0;
      buffer_thread_4 = null;
      buffer_thread_4 = new Asproto();
      S725=0;
      e_thread_4 = 0;
      len2_thread_4 = Asproto.PKTSIZE;
      if(e_thread_4 == len2_thread_4){
	data1_in.refresh();
	ends[4]=2;
	;
	packet_2.setPresent();
	currsigs.addElement(packet_2);
	packet_2.setValue(buffer_thread_4);
	//.println("Emitted packet_2");
	S725=1;
	active[4]=1;
	ends[4]=1;
	tdone[4]=1;
      }
      else {
	S662=0;
	if(data1_in.get_preempted()){
	  tutu__1944031395 = 0;
	  tutu__1944031395 = data1_in.get_preempted() ? data1_in.refresh() : 0;
	  S662=1;
	  active[4]=1;
	  ends[4]=1;
	  tdone[4]=1;
	}
	else {
	  if(data1_in.get_r_s() > data1_in.get_r_r()){
	    tutu__925294552 = 0;
	    tutu__925294552 = data1_in.get_r_r();
	    tutu__925294552++;
	    data1_in.set_r_r(tutu__925294552);
	    data1_in.get_val();
	    ends[4]=2;
	    ;
	    t_thread_4 = 0;
	    t_thread_4 = (Byte)data1_in.get_value();
	    e_thread_4 = e_thread_4 + 1;
	    buffer_thread_4.setRaw(e_thread_4, t_thread_4);
	    packet_2.setPresent();
	    currsigs.addElement(packet_2);
	    packet_2.setValue(buffer_thread_4);
	    //.println("Emitted packet_2");
	    S725=1;
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
    }
  }
  public void thread794864675(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      S657=1;
      S603=0;
      S593=0;
      if(reset1_in.get_preempted()){
	tutu__1858148230 = 0;
	tutu__1858148230 = reset1_in.get_preempted() ? reset1_in.refresh() : 0;
	S593=1;
	active[3]=1;
	ends[3]=1;
	tdone[3]=1;
      }
      else {
	if(reset1_in.get_r_s() > reset1_in.get_r_r()){
	  tutu__961076200 = 0;
	  tutu__961076200 = reset1_in.get_r_r();
	  tutu__961076200++;
	  reset1_in.set_r_r(tutu__961076200);
	  reset1_in.get_val();
	  ends[3]=2;
	  ;
	  u_thread_3 = 0;
	  u_thread_3 = (Integer)reset1_in.get_value();
	  if(u_thread_3 == 1){
	    res1_2.setPresent();
	    currsigs.addElement(res1_2);
	    //.println("Emitted res1_2");
	    res2_2.setPresent();
	    currsigs.addElement(res2_2);
	    //.println("Emitted res2_2");
	    res3_2.setPresent();
	    currsigs.addElement(res3_2);
	    //.println("Emitted res3_2");
	    S603=1;
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  else {
	    S603=1;
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
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S1223){
      case 0 : 
	S1223=0;
	break RUN;
      case 1 : 
	S1223=2;
	killcheck_2.setClear();
	packet_2.setClear();
	res1_2.setClear();
	res2_2.setClear();
	res3_2.setClear();
	crcok_2.setClear();
	thread794864675(tdone,ends);
	thread792556181(tdone,ends);
	thread774472983(tdone,ends);
	thread774088234(tdone,ends);
	int biggest775242481 = 0;
	if(ends[3]>=biggest775242481){
	  biggest775242481=ends[3];
	}
	if(ends[4]>=biggest775242481){
	  biggest775242481=ends[4];
	}
	if(ends[5]>=biggest775242481){
	  biggest775242481=ends[5];
	}
	if(ends[6]>=biggest775242481){
	  biggest775242481=ends[6];
	}
	if(biggest775242481 == 1){
	  active[2]=1;
	  ends[2]=1;
	  break RUN;
	}
      case 2 : 
	killcheck_2.setClear();
	packet_2.setClear();
	res1_2.setClear();
	res2_2.setClear();
	res3_2.setClear();
	crcok_2.setClear();
	thread774857732(tdone,ends);
	thread773318736(tdone,ends);
	thread859117741(tdone,ends);
	thread870275459(tdone,ends);
	int biggest865273723 = 0;
	if(ends[3]>=biggest865273723){
	  biggest865273723=ends[3];
	}
	if(ends[4]>=biggest865273723){
	  biggest865273723=ends[4];
	}
	if(ends[5]>=biggest865273723){
	  biggest865273723=ends[5];
	}
	if(ends[6]>=biggest865273723){
	  biggest865273723=ends[6];
	}
	if(biggest865273723 == 1){
	  active[2]=1;
	  ends[2]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest865273723 == 0){
	  S1223=0;
	  active[2]=0;
	  ends[2]=0;
	  S1223=0;
	  break RUN;
	}
      }
    }
  }
  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    killcheck_2 = new Signal();
    packet_2 = new Signal();
    res1_2 = new Signal();
    res2_2 = new Signal();
    res3_2 = new Signal();
    crcok_2 = new Signal();
    // --------------------------------------------------
  }
  int tick = 0;
  public void run(){
    while(active[2] != 0){
      int index = 2;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
	for(int h=1;h<paused.length;++h){
	  paused[h]=0;
	}
      }
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
	reset1_in.update_r_s();
	data1_in.update_r_s();
	if(!df){
	  reset1_in.gethook();
	  data1_in.gethook();
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
	System.err.println("VAL apsCD2,"+(++tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      killcheck_2.setpreclear();
      packet_2.setpreclear();
      res1_2.setpreclear();
      res2_2.setpreclear();
      res3_2.setpreclear();
      crcok_2.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      killcheck_2.setClear();
      packet_2.setClear();
      res1_2.setClear();
      res2_2.setClear();
      res3_2.setClear();
      crcok_2.setClear();
      reset1_in.sethook();
      data1_in.sethook();
      if(paused[2]!=0 || suspended[2]!=0 || active[2]!=1);
      else{
	reset1_in.gethook();
	data1_in.gethook();
      }
      if(active[2] == 0){
	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
