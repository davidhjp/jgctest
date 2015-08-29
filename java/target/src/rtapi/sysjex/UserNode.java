package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import scPackage.*;
import com.jopdesign.sys.Native;

public class UserNode extends ClockDomain{
  public UserNode(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public Signal success = new Signal();
  public Signal failed = new Signal();
  public input_Channel Authorization_in = new input_Channel();
  public output_Channel TransferId_o = new output_Channel();
  public output_Channel SendCmd_o = new output_Channel();
  private static Signal userId_1;
  private static Signal Command_1;
  private static Signal escape_1;
  private static Signal nextstep_1;
  private static int tutu__2140143205;
  private static int tutu__1711284387;
  private static int tutu__1827727098;
  private static int tutu__239320764;
  private static int tutu__1825803353;
  private static int tutu__1721776348;
  private static int tutu__1833498331;
  private static int tutu__86921309;
  private static int tutu__1815415133;
  private static int tutu__1439878469;
  private static int tutu__1812337142;
  private static int tutu__785936454;
  private static int tutu__2122120435;
  private static int tutu__1143225535;
  private static int tutu__2145914438;
  private static int tutu__1863683842;
  private static int tutu__2145590118;
  private static int tutu__621856862;
  private static char uid_thread_6;
  private static int tutu__1854659521;
  private static int tutu__959779071;
  private static char cmd_thread_7;
  private static int tutu__1839654314;
  private static int tutu__1220962723;
  private static int tutu__1835806825;
  private static int tutu__1743948445;
  private static int S1023 = 1;
  private static int S10 = 1;
  private static int S4 = 1;
  private static int S1020 = 1;
  private static int S17 = 1;
  private static int S13 = 1;
  private static int S16 = 1;
  private static int S63 = 1;
  private static int S25 = 1;
  private static int S20 = 1;
  private static int S109 = 1;
  private static int S71 = 1;
  private static int S66 = 1;
  private static int S124 = 1;
  private static int S113 = 1;
	
  private static int[] ends = new int[12];
  private static int[] tdone = new int[12];
  public void thread1466123560(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      S124=1;
      S113=0;
      if(Authorization_in.get_preempted()){
	tutu__1743948445 = 0;
	tutu__1743948445 = Authorization_in.get_preempted() ? Authorization_in.refresh() : 0;
	S113=1;
	active[8]=1;
	ends[8]=1;
	tdone[8]=1;
      }
      else {
	if(Authorization_in.get_r_s() > Authorization_in.get_r_r()){
	  tutu__1835806825 = 0;
	  tutu__1835806825 = Authorization_in.get_r_r();
	  tutu__1835806825++;
	  Authorization_in.set_r_r(tutu__1835806825);
	  Authorization_in.get_val();
	  ends[8]=2;
	  ;
	  S124=0;
	  active[8]=0;
	  ends[8]=0;
	  tdone[8]=1;
	}
	else {
	  active[8]=1;
	  ends[8]=1;
	  tdone[8]=1;
	}
      }
    }
  }
  public void thread1464199816(int [] tdone, int [] ends){
    if(tdone[7] != 1){
      S109=1;
      cmd_thread_7 = ((Character)Command_1.getpreval()).charValue();
      S71=0;
      if(SendCmd_o.get_preempted()){
	tutu__1220962723 = 0;
	tutu__1220962723 = SendCmd_o.get_preempted() ? SendCmd_o.refresh() : 0;
	S71=1;
	active[7]=1;
	ends[7]=1;
	tdone[7]=1;
      }
      else {
	S66=0;
	if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
	  tutu__1839654314 = 0;
	  tutu__1839654314 = SendCmd_o.get_w_s();
	  tutu__1839654314++;
	  SendCmd_o.set_w_s(tutu__1839654314);
	  SendCmd_o.set_value(new Character(cmd_thread_7));
	  S66=1;
	  if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
	    ends[7]=2;
	    ;
	    S109=0;
	    active[7]=0;
	    ends[7]=0;
	    tdone[7]=1;
	  }
	  else {
	    active[7]=1;
	    ends[7]=1;
	    tdone[7]=1;
	  }
	}
	else {
	  active[7]=1;
	  ends[7]=1;
	  tdone[7]=1;
	}
      }
    }
  }
  public void thread1463815067(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      S63=1;
      uid_thread_6 = ((Character)userId_1.getpreval()).charValue();
      S25=0;
      if(TransferId_o.get_preempted()){
	tutu__959779071 = 0;
	tutu__959779071 = TransferId_o.get_preempted() ? TransferId_o.refresh() : 0;
	S25=1;
	active[6]=1;
	ends[6]=1;
	tdone[6]=1;
      }
      else {
	S20=0;
	if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
	  tutu__1854659521 = 0;
	  tutu__1854659521 = TransferId_o.get_w_s();
	  tutu__1854659521++;
	  TransferId_o.set_w_s(tutu__1854659521);
	  TransferId_o.set_value(new Character(uid_thread_6));
	  S20=1;
	  if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
	    ends[6]=2;
	    ;
	    S63=0;
	    active[6]=0;
	    ends[6]=0;
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
  public void thread1464584564(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S16=1;
      if(Command_1.getprestatus()){
	S16=0;
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
      }
      else {
	active[5]=1;
	ends[5]=1;
	tdone[5]=1;
      }
    }
  }
  public void thread1474972785(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S13=1;
      if(userId_1.getprestatus()){
	S13=0;
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
      }
      else {
	active[4]=1;
	ends[4]=1;
	tdone[4]=1;
      }
    }
  }
  public void thread1475357534(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      switch(S124){
      case 0 : 
	active[8]=0;
	ends[8]=0;
	tdone[8]=1;
	break;
      case 1 : 
	switch(S113){
	case 0 : 
	  if(Authorization_in.get_preempted()){
	    tutu__621856862 = 0;
	    tutu__621856862 = Authorization_in.get_preempted() ? Authorization_in.refresh() : 0;
	    S113=1;
	    active[8]=1;
	    ends[8]=1;
	    tdone[8]=1;
	  }
	  else {
	    if(Authorization_in.get_r_s() > Authorization_in.get_r_r()){
	      tutu__2145590118 = 0;
	      tutu__2145590118 = Authorization_in.get_r_r();
	      tutu__2145590118++;
	      Authorization_in.set_r_r(tutu__2145590118);
	      Authorization_in.get_val();
	      ends[8]=2;
	      ;
	      S124=0;
	      active[8]=0;
	      ends[8]=0;
	      tdone[8]=1;
	    }
	    else {
	      active[8]=1;
	      ends[8]=1;
	      tdone[8]=1;
	    }
	  }
	  break;
	case 1 : 
	  S113=1;
	  S113=0;
	  if(Authorization_in.get_preempted()){
	    tutu__621856862 = 0;
	    tutu__621856862 = Authorization_in.get_preempted() ? Authorization_in.refresh() : 0;
	    S113=1;
	    active[8]=1;
	    ends[8]=1;
	    tdone[8]=1;
	  }
	  else {
	    if(Authorization_in.get_r_s() > Authorization_in.get_r_r()){
	      tutu__2145590118 = 0;
	      tutu__2145590118 = Authorization_in.get_r_r();
	      tutu__2145590118++;
	      Authorization_in.set_r_r(tutu__2145590118);
	      Authorization_in.get_val();
	      ends[8]=2;
	      ;
	      S124=0;
	      active[8]=0;
	      ends[8]=0;
	      tdone[8]=1;
	    }
	    else {
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
  public void thread1473049040(int [] tdone, int [] ends){
    if(tdone[7] != 1){
      switch(S109){
      case 0 : 
	active[7]=0;
	ends[7]=0;
	tdone[7]=1;
	break;
      case 1 : 
	switch(S71){
	case 0 : 
	  if(SendCmd_o.get_preempted()){
	    tutu__1863683842 = 0;
	    tutu__1863683842 = SendCmd_o.get_preempted() ? SendCmd_o.refresh() : 0;
	    S71=1;
	    active[7]=1;
	    ends[7]=1;
	    tdone[7]=1;
	  }
	  else {
	    switch(S66){
	    case 0 : 
	      if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
		tutu__2145914438 = 0;
		tutu__2145914438 = SendCmd_o.get_w_s();
		tutu__2145914438++;
		SendCmd_o.set_w_s(tutu__2145914438);
		SendCmd_o.set_value(new Character(cmd_thread_7));
		S66=1;
		if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
		  ends[7]=2;
		  ;
		  S109=0;
		  active[7]=0;
		  ends[7]=0;
		  tdone[7]=1;
		}
		else {
		  active[7]=1;
		  ends[7]=1;
		  tdone[7]=1;
		}
	      }
	      else {
		active[7]=1;
		ends[7]=1;
		tdone[7]=1;
	      }
	      break;
	    case 1 : 
	      if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
		ends[7]=2;
		;
		S109=0;
		active[7]=0;
		ends[7]=0;
		tdone[7]=1;
	      }
	      else {
		active[7]=1;
		ends[7]=1;
		tdone[7]=1;
	      }
	      break;
	    }
	  }
	  break;
	case 1 : 
	  S71=1;
	  S71=0;
	  if(SendCmd_o.get_preempted()){
	    tutu__1863683842 = 0;
	    tutu__1863683842 = SendCmd_o.get_preempted() ? SendCmd_o.refresh() : 0;
	    S71=1;
	    active[7]=1;
	    ends[7]=1;
	    tdone[7]=1;
	  }
	  else {
	    S66=0;
	    if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
	      tutu__2145914438 = 0;
	      tutu__2145914438 = SendCmd_o.get_w_s();
	      tutu__2145914438++;
	      SendCmd_o.set_w_s(tutu__2145914438);
	      SendCmd_o.set_value(new Character(cmd_thread_7));
	      S66=1;
	      if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
		ends[7]=2;
		;
		S109=0;
		active[7]=0;
		ends[7]=0;
		tdone[7]=1;
	      }
	      else {
		active[7]=1;
		ends[7]=1;
		tdone[7]=1;
	      }
	    }
	    else {
	      active[7]=1;
	      ends[7]=1;
	      tdone[7]=1;
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1473818538(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      switch(S63){
      case 0 : 
	active[6]=0;
	ends[6]=0;
	tdone[6]=1;
	break;
      case 1 : 
	switch(S25){
	case 0 : 
	  if(TransferId_o.get_preempted()){
	    tutu__1143225535 = 0;
	    tutu__1143225535 = TransferId_o.get_preempted() ? TransferId_o.refresh() : 0;
	    S25=1;
	    active[6]=1;
	    ends[6]=1;
	    tdone[6]=1;
	  }
	  else {
	    switch(S20){
	    case 0 : 
	      if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
		tutu__2122120435 = 0;
		tutu__2122120435 = TransferId_o.get_w_s();
		tutu__2122120435++;
		TransferId_o.set_w_s(tutu__2122120435);
		TransferId_o.set_value(new Character(uid_thread_6));
		S20=1;
		if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
		  ends[6]=2;
		  ;
		  S63=0;
		  active[6]=0;
		  ends[6]=0;
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
	      if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
		ends[6]=2;
		;
		S63=0;
		active[6]=0;
		ends[6]=0;
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
	  S25=1;
	  S25=0;
	  if(TransferId_o.get_preempted()){
	    tutu__1143225535 = 0;
	    tutu__1143225535 = TransferId_o.get_preempted() ? TransferId_o.refresh() : 0;
	    S25=1;
	    active[6]=1;
	    ends[6]=1;
	    tdone[6]=1;
	  }
	  else {
	    S20=0;
	    if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
	      tutu__2122120435 = 0;
	      tutu__2122120435 = TransferId_o.get_w_s();
	      tutu__2122120435++;
	      TransferId_o.set_w_s(tutu__2122120435);
	      TransferId_o.set_value(new Character(uid_thread_6));
	      S20=1;
	      if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
		ends[6]=2;
		;
		S63=0;
		active[6]=0;
		ends[6]=0;
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
    }
  }
  public void thread1471510045(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      S124=1;
      S113=0;
      if(Authorization_in.get_preempted()){
	tutu__785936454 = 0;
	tutu__785936454 = Authorization_in.get_preempted() ? Authorization_in.refresh() : 0;
	S113=1;
	active[8]=1;
	ends[8]=1;
	tdone[8]=1;
      }
      else {
	if(Authorization_in.get_r_s() > Authorization_in.get_r_r()){
	  tutu__1812337142 = 0;
	  tutu__1812337142 = Authorization_in.get_r_r();
	  tutu__1812337142++;
	  Authorization_in.set_r_r(tutu__1812337142);
	  Authorization_in.get_val();
	  ends[8]=2;
	  ;
	  S124=0;
	  active[8]=0;
	  ends[8]=0;
	  tdone[8]=1;
	}
	else {
	  active[8]=1;
	  ends[8]=1;
	  tdone[8]=1;
	}
      }
    }
  }
  public void thread1472664291(int [] tdone, int [] ends){
    if(tdone[7] != 1){
      S109=1;
      cmd_thread_7 = ((Character)Command_1.getpreval()).charValue();
      S71=0;
      if(SendCmd_o.get_preempted()){
	tutu__1439878469 = 0;
	tutu__1439878469 = SendCmd_o.get_preempted() ? SendCmd_o.refresh() : 0;
	S71=1;
	active[7]=1;
	ends[7]=1;
	tdone[7]=1;
      }
      else {
	S66=0;
	if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
	  tutu__1815415133 = 0;
	  tutu__1815415133 = SendCmd_o.get_w_s();
	  tutu__1815415133++;
	  SendCmd_o.set_w_s(tutu__1815415133);
	  SendCmd_o.set_value(new Character(cmd_thread_7));
	  S66=1;
	  if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
	    ends[7]=2;
	    ;
	    S109=0;
	    active[7]=0;
	    ends[7]=0;
	    tdone[7]=1;
	  }
	  else {
	    active[7]=1;
	    ends[7]=1;
	    tdone[7]=1;
	  }
	}
	else {
	  active[7]=1;
	  ends[7]=1;
	  tdone[7]=1;
	}
      }
    }
  }
  public void thread1472279542(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      S63=1;
      uid_thread_6 = ((Character)userId_1.getpreval()).charValue();
      S25=0;
      if(TransferId_o.get_preempted()){
	tutu__86921309 = 0;
	tutu__86921309 = TransferId_o.get_preempted() ? TransferId_o.refresh() : 0;
	S25=1;
	active[6]=1;
	ends[6]=1;
	tdone[6]=1;
      }
      else {
	S20=0;
	if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
	  tutu__1833498331 = 0;
	  tutu__1833498331 = TransferId_o.get_w_s();
	  tutu__1833498331++;
	  TransferId_o.set_w_s(tutu__1833498331);
	  TransferId_o.set_value(new Character(uid_thread_6));
	  S20=1;
	  if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
	    ends[6]=2;
	    ;
	    S63=0;
	    active[6]=0;
	    ends[6]=0;
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
  public void thread1469971049(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      switch(S16){
      case 0 : 
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
	break;
      case 1 : 
	if(Command_1.getprestatus()){
	  S16=0;
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
  public void thread1471125296(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      switch(S13){
      case 0 : 
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
	break;
      case 1 : 
	if(userId_1.getprestatus()){
	  S13=0;
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
  public void thread1470740547(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      switch(S1020){
      case 0 : 
	active[3]=0;
	ends[3]=0;
	tdone[3]=1;
	break;
      case 1 : 
	switch(S17){
	case 0 : 
	  thread1471125296(tdone,ends);
	  thread1469971049(tdone,ends);
	  int biggest1470355798 = 0;
	  if(ends[4]>=biggest1470355798){
	    biggest1470355798=ends[4];
	  }
	  if(ends[5]>=biggest1470355798){
	    biggest1470355798=ends[5];
	  }
	  if(biggest1470355798 == 1){
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  //FINXME code
	  if(biggest1470355798 == 0){
	    //.println("GOT IT");
	    S17=1;
	    thread1472279542(tdone,ends);
	    thread1472664291(tdone,ends);
	    thread1471510045(tdone,ends);
	    int biggest1471894794 = 0;
	    if(ends[6]>=biggest1471894794){
	      biggest1471894794=ends[6];
	    }
	    if(ends[7]>=biggest1471894794){
	      biggest1471894794=ends[7];
	    }
	    if(ends[8]>=biggest1471894794){
	      biggest1471894794=ends[8];
	    }
	    if(biggest1471894794 == 1){
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	    }
	    //FINXME code
	    if(biggest1471894794 == 0){
	      if(((Integer)Authorization_in.get_value()).intValue() == 1){
		Execute.execute(((Character)Command_1.getpreval()).charValue());
		success.setPresent();
		currsigs.addElement(success);
		//.println("Emitted success");
		nextstep_1.setPresent();
		currsigs.addElement(nextstep_1);
		//.println("Emitted nextstep_1");
		S17=2;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      else {
		failed.setPresent();
		currsigs.addElement(failed);
		//.println("Emitted failed");
		nextstep_1.setPresent();
		currsigs.addElement(nextstep_1);
		//.println("Emitted nextstep_1");
		S17=2;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	    }
	  }
	  break;
	case 1 : 
	  thread1473818538(tdone,ends);
	  thread1473049040(tdone,ends);
	  thread1475357534(tdone,ends);
	  int biggest1474588036 = 0;
	  if(ends[6]>=biggest1474588036){
	    biggest1474588036=ends[6];
	  }
	  if(ends[7]>=biggest1474588036){
	    biggest1474588036=ends[7];
	  }
	  if(ends[8]>=biggest1474588036){
	    biggest1474588036=ends[8];
	  }
	  if(biggest1474588036 == 1){
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  //FINXME code
	  if(biggest1474588036 == 0){
	    if(((Integer)Authorization_in.get_value()).intValue() == 1){
	      Execute.execute(((Character)Command_1.getpreval()).charValue());
	      success.setPresent();
	      currsigs.addElement(success);
	      //.println("Emitted success");
	      nextstep_1.setPresent();
	      currsigs.addElement(nextstep_1);
	      //.println("Emitted nextstep_1");
	      S17=2;
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	    }
	    else {
	      failed.setPresent();
	      currsigs.addElement(failed);
	      //.println("Emitted failed");
	      nextstep_1.setPresent();
	      currsigs.addElement(nextstep_1);
	      //.println("Emitted nextstep_1");
	      S17=2;
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	    }
	  }
	  break;
	case 2 : 
	  S17=2;
	  S17=0;
	  thread1474972785(tdone,ends);
	  thread1464584564(tdone,ends);
	  int biggest1464969313 = 0;
	  if(ends[4]>=biggest1464969313){
	    biggest1464969313=ends[4];
	  }
	  if(ends[5]>=biggest1464969313){
	    biggest1464969313=ends[5];
	  }
	  if(biggest1464969313 == 1){
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  //FINXME code
	  if(biggest1464969313 == 0){
	    //.println("GOT IT");
	    S17=1;
	    thread1463815067(tdone,ends);
	    thread1464199816(tdone,ends);
	    thread1466123560(tdone,ends);
	    int biggest1466508309 = 0;
	    if(ends[6]>=biggest1466508309){
	      biggest1466508309=ends[6];
	    }
	    if(ends[7]>=biggest1466508309){
	      biggest1466508309=ends[7];
	    }
	    if(ends[8]>=biggest1466508309){
	      biggest1466508309=ends[8];
	    }
	    if(biggest1466508309 == 1){
	      active[3]=1;
	      ends[3]=1;
	      tdone[3]=1;
	    }
	    //FINXME code
	    if(biggest1466508309 == 0){
	      if(((Integer)Authorization_in.get_value()).intValue() == 1){
		Execute.execute(((Character)Command_1.getpreval()).charValue());
		success.setPresent();
		currsigs.addElement(success);
		//.println("Emitted success");
		nextstep_1.setPresent();
		currsigs.addElement(nextstep_1);
		//.println("Emitted nextstep_1");
		S17=2;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	      else {
		failed.setPresent();
		currsigs.addElement(failed);
		//.println("Emitted failed");
		nextstep_1.setPresent();
		currsigs.addElement(nextstep_1);
		//.println("Emitted nextstep_1");
		S17=2;
		active[3]=1;
		ends[3]=1;
		tdone[3]=1;
	      }
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1459582829(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      switch(S10){
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
	  if(nextstep_1.getprestatus()){
	    userId_1.setPresent();
	    currsigs.addElement(userId_1);
	    userId_1.setValue(new Character('b'));
	    //.println("Emitted userId_1");
	    Command_1.setPresent();
	    currsigs.addElement(Command_1);
	    Command_1.setValue(new Character('a'));
	    //.println("Emitted Command_1");
	    S4=2;
	    if(nextstep_1.getprestatus()){
	      S4=3;
	      active[2]=1;
	      ends[2]=1;
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
	  if(nextstep_1.getprestatus()){
	    userId_1.setPresent();
	    currsigs.addElement(userId_1);
	    userId_1.setValue(new Character('b'));
	    //.println("Emitted userId_1");
	    Command_1.setPresent();
	    currsigs.addElement(Command_1);
	    Command_1.setValue(new Character('a'));
	    //.println("Emitted Command_1");
	    S4=2;
	    if(nextstep_1.getprestatus()){
	      S4=3;
	      active[2]=1;
	      ends[2]=1;
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
	case 2 : 
	  if(nextstep_1.getprestatus()){
	    S4=3;
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  else {
	    active[2]=1;
	    ends[2]=1;
	    tdone[2]=1;
	  }
	  break;
	case 3 : 
	  S4=3;
	  escape_1.setPresent();
	  currsigs.addElement(escape_1);
	  //.println("Emitted escape_1");
	  S10=0;
	  active[2]=0;
	  ends[2]=0;
	  tdone[2]=1;
	  break;
	}
	break;
      }
    }
  }
  public void thread1458043833(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      S124=1;
      S113=0;
      if(Authorization_in.get_preempted()){
	tutu__1721776348 = 0;
	tutu__1721776348 = Authorization_in.get_preempted() ? Authorization_in.refresh() : 0;
	S113=1;
	active[8]=1;
	ends[8]=1;
	tdone[8]=1;
      }
      else {
	if(Authorization_in.get_r_s() > Authorization_in.get_r_r()){
	  tutu__1825803353 = 0;
	  tutu__1825803353 = Authorization_in.get_r_r();
	  tutu__1825803353++;
	  Authorization_in.set_r_r(tutu__1825803353);
	  Authorization_in.get_val();
	  ends[8]=2;
	  ;
	  S124=0;
	  active[8]=0;
	  ends[8]=0;
	  tdone[8]=1;
	}
	else {
	  active[8]=1;
	  ends[8]=1;
	  tdone[8]=1;
	}
      }
    }
  }
  public void thread1457659084(int [] tdone, int [] ends){
    if(tdone[7] != 1){
      S109=1;
      cmd_thread_7 = ((Character)Command_1.getpreval()).charValue();
      S71=0;
      if(SendCmd_o.get_preempted()){
	tutu__239320764 = 0;
	tutu__239320764 = SendCmd_o.get_preempted() ? SendCmd_o.refresh() : 0;
	S71=1;
	active[7]=1;
	ends[7]=1;
	tdone[7]=1;
      }
      else {
	S66=0;
	if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
	  tutu__1827727098 = 0;
	  tutu__1827727098 = SendCmd_o.get_w_s();
	  tutu__1827727098++;
	  SendCmd_o.set_w_s(tutu__1827727098);
	  SendCmd_o.set_value(new Character(cmd_thread_7));
	  S66=1;
	  if(SendCmd_o.get_w_s() == SendCmd_o.get_w_r()){
	    ends[7]=2;
	    ;
	    S109=0;
	    active[7]=0;
	    ends[7]=0;
	    tdone[7]=1;
	  }
	  else {
	    active[7]=1;
	    ends[7]=1;
	    tdone[7]=1;
	  }
	}
	else {
	  active[7]=1;
	  ends[7]=1;
	  tdone[7]=1;
	}
      }
    }
  }
  public void thread1458813331(int [] tdone, int [] ends){
    if(tdone[6] != 1){
      S63=1;
      uid_thread_6 = ((Character)userId_1.getpreval()).charValue();
      S25=0;
      if(TransferId_o.get_preempted()){
	tutu__1711284387 = 0;
	tutu__1711284387 = TransferId_o.get_preempted() ? TransferId_o.refresh() : 0;
	S25=1;
	active[6]=1;
	ends[6]=1;
	tdone[6]=1;
      }
      else {
	S20=0;
	if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
	  tutu__2140143205 = 0;
	  tutu__2140143205 = TransferId_o.get_w_s();
	  tutu__2140143205++;
	  TransferId_o.set_w_s(tutu__2140143205);
	  TransferId_o.set_value(new Character(uid_thread_6));
	  S20=1;
	  if(TransferId_o.get_w_s() == TransferId_o.get_w_r()){
	    ends[6]=2;
	    ;
	    S63=0;
	    active[6]=0;
	    ends[6]=0;
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
  public void thread1444192873(int [] tdone, int [] ends){
    if(tdone[5] != 1){
      S16=1;
      if(Command_1.getprestatus()){
	S16=0;
	active[5]=0;
	ends[5]=0;
	tdone[5]=1;
      }
      else {
	active[5]=1;
	ends[5]=1;
	tdone[5]=1;
      }
    }
  }
  public void thread1443808124(int [] tdone, int [] ends){
    if(tdone[4] != 1){
      S13=1;
      if(userId_1.getprestatus()){
	S13=0;
	active[4]=0;
	ends[4]=0;
	tdone[4]=1;
      }
      else {
	active[4]=1;
	ends[4]=1;
	tdone[4]=1;
      }
    }
  }
  public void thread1444962371(int [] tdone, int [] ends){
    if(tdone[3] != 1){
      S1020=1;
      S17=0;
      thread1443808124(tdone,ends);
      thread1444192873(tdone,ends);
      int biggest1458428582 = 0;
      if(ends[4]>=biggest1458428582){
	biggest1458428582=ends[4];
      }
      if(ends[5]>=biggest1458428582){
	biggest1458428582=ends[5];
      }
      if(biggest1458428582 == 1){
	active[3]=1;
	ends[3]=1;
	tdone[3]=1;
      }
      //FINXME code
      if(biggest1458428582 == 0){
	//.println("GOT IT");
	S17=1;
	thread1458813331(tdone,ends);
	thread1457659084(tdone,ends);
	thread1458043833(tdone,ends);
	int biggest1459967578 = 0;
	if(ends[6]>=biggest1459967578){
	  biggest1459967578=ends[6];
	}
	if(ends[7]>=biggest1459967578){
	  biggest1459967578=ends[7];
	}
	if(ends[8]>=biggest1459967578){
	  biggest1459967578=ends[8];
	}
	if(biggest1459967578 == 1){
	  active[3]=1;
	  ends[3]=1;
	  tdone[3]=1;
	}
	//FINXME code
	if(biggest1459967578 == 0){
	  if(((Integer)Authorization_in.get_value()).intValue() == 1){
	    Execute.execute(((Character)Command_1.getpreval()).charValue());
	    success.setPresent();
	    currsigs.addElement(success);
	    //.println("Emitted success");
	    nextstep_1.setPresent();
	    currsigs.addElement(nextstep_1);
	    //.println("Emitted nextstep_1");
	    S17=2;
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	  else {
	    failed.setPresent();
	    currsigs.addElement(failed);
	    //.println("Emitted failed");
	    nextstep_1.setPresent();
	    currsigs.addElement(nextstep_1);
	    //.println("Emitted nextstep_1");
	    S17=2;
	    active[3]=1;
	    ends[3]=1;
	    tdone[3]=1;
	  }
	}
      }
    }
  }
  public void thread1450348855(int [] tdone, int [] ends){
    if(tdone[2] != 1){
      S10=1;
      userId_1.setPresent();
      currsigs.addElement(userId_1);
      userId_1.setValue(new Character('a'));
      //.println("Emitted userId_1");
      Command_1.setPresent();
      currsigs.addElement(Command_1);
      Command_1.setValue(new Character('b'));
      //.println("Emitted Command_1");
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
      switch(S1023){
      case 0 : 
	S1023=0;
	break RUN;
      case 1 : 
	S1023=2;
	userId_1.setClear();
	Command_1.setClear();
	escape_1.setClear();
	nextstep_1.setClear();
	if(escape_1.getprestatus()){
	  Authorization_in.refresh();
	  TransferId_o.refresh();
	  SendCmd_o.refresh();
	  S1023=0;
	  active[1]=0;
	  ends[1]=0;
	  S1023=0;
	  break RUN;
	}
	else {
	  thread1450348855(tdone,ends);
	  thread1444962371(tdone,ends);
	  int biggest1459198080 = 0;
	  if(ends[2]>=biggest1459198080){
	    biggest1459198080=ends[2];
	  }
	  if(ends[3]>=biggest1459198080){
	    biggest1459198080=ends[3];
	  }
	  if(biggest1459198080 == 1){
	    active[1]=1;
	    ends[1]=1;
	    break RUN;
	  }
	}
      case 2 : 
	userId_1.setClear();
	Command_1.setClear();
	escape_1.setClear();
	nextstep_1.setClear();
	if(escape_1.getprestatus()){
	  Authorization_in.refresh();
	  TransferId_o.refresh();
	  SendCmd_o.refresh();
	  S1023=0;
	  active[1]=0;
	  ends[1]=0;
	  S1023=0;
	  break RUN;
	}
	else {
	  thread1459582829(tdone,ends);
	  thread1470740547(tdone,ends);
	  int biggest1466893058 = 0;
	  if(ends[2]>=biggest1466893058){
	    biggest1466893058=ends[2];
	  }
	  if(ends[3]>=biggest1466893058){
	    biggest1466893058=ends[3];
	  }
	  if(biggest1466893058 == 1){
	    active[1]=1;
	    ends[1]=1;
	    break RUN;
	  }
	  //FINXME code
	  if(biggest1466893058 == 0){
	    S1023=0;
	    active[1]=0;
	    ends[1]=0;
	    S1023=0;
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
    userId_1 = new Signal();
    Command_1 = new Signal();
    escape_1 = new Signal();
    nextstep_1 = new Signal();
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
	Authorization_in.update_r_s();
	TransferId_o.update_w_r();
	SendCmd_o.update_w_r();
	if(!df){
	  Authorization_in.gethook();
	  TransferId_o.gethook();
	  SendCmd_o.gethook();
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
	System.err.println("VAL UserNode,"+(tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      success.setpreclear();
      failed.setpreclear();
      userId_1.setpreclear();
      Command_1.setpreclear();
      escape_1.setpreclear();
      nextstep_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      success.sethook();
      success.setClear();
      failed.sethook();
      failed.setClear();
      userId_1.setClear();
      Command_1.setClear();
      escape_1.setClear();
      nextstep_1.setClear();
      Authorization_in.sethook();
      TransferId_o.sethook();
      SendCmd_o.sethook();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
	Authorization_in.gethook();
	TransferId_o.gethook();
	SendCmd_o.gethook();
      }
      if(active[1] == 0){
	System.err.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
