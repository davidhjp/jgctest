package sysjex;
import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;
import Frq.*;

public class ControlDominatedDomain extends ClockDomain{
  public ControlDominatedDomain(){super(); init();}
  Vector currsigs = new Vector();
  private static boolean df = false;
  private static char [] active;
  private static char [] paused;
  private static char [] suspended;
  public input_Channel SampleCount_in = new input_Channel();
  private static Signal FreqStatLink_7;
  private static Signal RocStatLink_7;
  private static Signal switch1Link_7;
  private static Signal switch2Link_7;
  private static Signal switch3Link_7;
  private static Signal ThreshValueLink_7;
  private static Signal ThreshCodeLink_7;
  private static Signal CheckStatLink_7;
  private static Signal cancelLink_7;
  private static Signal doneLink_7;
  private static Signal skipLink_7;
  private static Signal InputPasswordLink_7;
  private static Signal WrongPasswordLink_7;
  private static Signal StartLink_7;
  private static Signal passwordLink_7;
  private static Signal Frths_7;
  private static Signal AveFreqval_8;
  private static Signal meCount_8;
  private static Signal timeout_12;
  private static Signal start2_12;
  private static Signal next_12;
  private static Signal ep_12;
  private static Signal pp_12;
  private static Signal Enter_12;
  private static Signal ic_12;
  private static Signal it_12;
  private static int tutu__1677385656;
  private static int tutu__2098372999;
  private static float dft0_thread_10;
  private static float dft1_thread_10;
  private static float dft2_thread_10;
  private static float Sum_thread_10;
  private static int FreqWs_thread_10;
  private static float SamplingFreq_thread_10;
  private static float[] FreqWindow_thread_10;
  private static float Freq_thread_10;
  private static float drt0_thread_11;
  private static float drt1_thread_11;
  private static float drt2_thread_11;
  private static int RocWs_thread_11;
  private static int j34_thread_11;
  private static float[] RocWindow_thread_11;
  private static float firstC_thread_11;
  private static float secondC_thread_11;
  private static float temp_thread_11;
  private static float Roc_thread_11;
  private static float AveRoc_thread_11;
  private static float RocSum_thread_11;
  private static String CurrentState_thread_13;
  private static int enter_thread_13;
  private static int i1_thread_17;
  private static int PrevSwitch1_thread_18;
  private static int PrevSwitch2_thread_18;
  private static int PrevSwitch3_thread_18;
  private static int i_thread_19;
  private static int d1_thread_19;
  private static String d2_thread_19;
  private static boolean[] UpdateFlags_thread_19;
  private static String CorrectPassword_thread_19;
  private static int[] ThreshVars_thread_19;
  private static Vector frths_thread_19;
  private static int i_thread_20;
  private static String PassValue_thread_20;
  private static int tutu__1271345238;
  private static int tutu__622067254;
  private static int tutu__1269806242;
  private static Float vall_thread_9;
  private static int tutu__295096246;
  private static int i34_thread_10;
  private static int j34_thread_10;
  private static float toe_thread_10;
  private static int ghy_thread_10;
  private static int drt_thread_14;
  private static int dft_thread_14;
  private static int enter_thread_14;
  private static int drt_thread_15;
  private static int dft_thread_15;
  private static int enter_thread_15;
  private static String sdft_thread_14;
  private static String sdrt_thread_14;
  private static String changerval_thread_15;
  private static Integer ichan_thread_15;
  private static int dummy1_thread_18;
  private static int dummy2_thread_18;
  private static int dummy3_thread_18;
  private static int tu_thread_19;
  private static int y_thread_20;
  private static int u67_thread_20;
  private static int S13971 = 1;
  private static int S7353 = 1;
  private static int S6736 = 1;
  private static int S6706 = 1;
  private static int S6696 = 1;
  private static int S6878 = 1;
  private static int S6739 = 1;
  private static int S7020 = 1;
  private static int S12779 = 1;
  private static int S12695 = 1;
  private static int S7367 = 1;
  private static int S7481 = 1;
  private static int S7428 = 1;
  private static int S7573 = 1;
  private static int S7526 = 1;
  private static int S7591 = 1;
  private static int S12777 = 1;
  private static int S12698 = 1;
  private static int S12709 = 1;
  private static int S12799 = 1;
  private static int S12781 = 1;
  private static int S13821 = 1;
  private static int S12800 = 1;
  private static int S12970 = 1;
  private static int S12802 = 1;
  private static int S12804 = 1;
  private static int S12850 = 1;
  private static int S12844 = 1;
  private static int S13969 = 1;
  private static int S13822 = 1;
  private static int S13839 = 1;
	
  private static int[] ends = new int[21];
  private static int[] tdone = new int[21];
  public void thread173786955(int [] tdone, int [] ends){
    if(tdone[20] != 1){
      switch(S13969){
      case 0 : 
	active[20]=0;
	ends[20]=0;
	tdone[20]=1;
	break;
      case 1 : 
	switch(S13822){
	case 0 : 
	  if(i_thread_20 == 9){
	    ends[20]=2;
	    ;
	    S13822=1;
	    StartLink_7.setPresent();
	    currsigs.addElement(StartLink_7);
	    System.out.println("Emitted StartLink_7");
	    S13839=0;
	    active[20]=1;
	    ends[20]=1;
	    tdone[20]=1;
	  }
	  else {
	    i_thread_20 = i_thread_20 + 1;
	    active[20]=1;
	    ends[20]=1;
	    tdone[20]=1;
	  }
	  break;
	case 1 : 
	  switch(S13839){
	  case 0 : 
	    if(InputPasswordLink_7.getprestatus()){
	      S13839=1;
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    else {
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    break;
	  case 1 : 
	    S13839=1;
	    passwordLink_7.setPresent();
	    currsigs.addElement(passwordLink_7);
	    passwordLink_7.setValue(PassValue_thread_20);
	    System.out.println("Emitted passwordLink_7");
	    S13839=2;
	    active[20]=1;
	    ends[20]=1;
	    tdone[20]=1;
	    break;
	  case 2 : 
	    if(ThreshCodeLink_7.getprestatus()){
	      S13839=3;
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    else {
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    break;
	  case 3 : 
	    S13839=3;
	    y_thread_20 = (int)49.1;
	    ThreshValueLink_7.setPresent();
	    currsigs.addElement(ThreshValueLink_7);
	    ThreshValueLink_7.setValue(new Integer(y_thread_20));
	    System.out.println("Emitted ThreshValueLink_7");
	    S13839=4;
	    active[20]=1;
	    ends[20]=1;
	    tdone[20]=1;
	    break;
	  case 4 : 
	    if(ThreshCodeLink_7.getprestatus()){
	      S13839=5;
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    else {
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    break;
	  case 5 : 
	    S13839=5;
	    skipLink_7.setPresent();
	    currsigs.addElement(skipLink_7);
	    System.out.println("Emitted skipLink_7");
	    S13839=6;
	    active[20]=1;
	    ends[20]=1;
	    tdone[20]=1;
	    break;
	  case 6 : 
	    if(ThreshCodeLink_7.getprestatus()){
	      S13839=7;
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    else {
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    break;
	  case 7 : 
	    S13839=7;
	    u67_thread_20 = (int)47.1;
	    ThreshValueLink_7.setPresent();
	    currsigs.addElement(ThreshValueLink_7);
	    ThreshValueLink_7.setValue(new Integer(u67_thread_20));
	    System.out.println("Emitted ThreshValueLink_7");
	    S13839=8;
	    active[20]=1;
	    ends[20]=1;
	    tdone[20]=1;
	    break;
	  case 8 : 
	    if(ThreshCodeLink_7.getprestatus()){
	      S13839=9;
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    else {
	      active[20]=1;
	      ends[20]=1;
	      tdone[20]=1;
	    }
	    break;
	  case 9 : 
	    S13839=9;
	    doneLink_7.setPresent();
	    currsigs.addElement(doneLink_7);
	    System.out.println("Emitted doneLink_7");
	    S13839=10;
	    active[20]=1;
	    ends[20]=1;
	    tdone[20]=1;
	    break;
	  case 10 : 
	    S13839=10;
	    StartLink_7.setPresent();
	    currsigs.addElement(StartLink_7);
	    System.out.println("Emitted StartLink_7");
	    S13839=0;
	    active[20]=1;
	    ends[20]=1;
	    tdone[20]=1;
	    break;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread221880567(int [] tdone, int [] ends){
    if(tdone[19] != 1){
      switch(S13821){
      case 0 : 
	active[19]=0;
	ends[19]=0;
	tdone[19]=1;
	break;
      case 1 : 
	switch(S12800){
	case 0 : 
	  S12800=0;
	  S12800=1;
	  S12970=0;
	  S12802=0;
	  active[19]=1;
	  ends[19]=1;
	  tdone[19]=1;
	  break;
	case 1 : 
	  switch(S12970){
	  case 0 : 
	    if(cancelLink_7.getprestatus()){
	      S12970=1;
	      active[19]=1;
	      ends[19]=1;
	      tdone[19]=1;
	    }
	    else {
	      switch(S12802){
	      case 0 : 
		if(StartLink_7.getprestatus()){
		  for(i_thread_19 = 0; i_thread_19 < 6; i_thread_19 = i_thread_19 + 1) {
		    UpdateFlags_thread_19[i_thread_19] = false;
		  }
		  S12802=1;
		  active[19]=1;
		  ends[19]=1;
		  tdone[19]=1;
		}
		else {
		  active[19]=1;
		  ends[19]=1;
		  tdone[19]=1;
		}
		break;
	      case 1 : 
		S12802=1;
		InputPasswordLink_7.setPresent();
		currsigs.addElement(InputPasswordLink_7);
		System.out.println("Emitted InputPasswordLink_7");
		S12802=2;
		S12804=0;
		active[19]=1;
		ends[19]=1;
		tdone[19]=1;
		break;
	      case 2 : 
		switch(S12804){
		case 0 : 
		  if(passwordLink_7.getprestatus()){
		    d2_thread_19 = (String)passwordLink_7.getpreval();
		    S12804=1;
		    active[19]=1;
		    ends[19]=1;
		    tdone[19]=1;
		  }
		  else {
		    active[19]=1;
		    ends[19]=1;
		    tdone[19]=1;
		  }
		  break;
		case 1 : 
		  S12804=1;
		  if(CorrectPassword_thread_19.equals(d2_thread_19)){
		    ThreshCodeLink_7.setPresent();
		    currsigs.addElement(ThreshCodeLink_7);
		    ThreshCodeLink_7.setValue(new Integer(1));
		    System.out.println("Emitted ThreshCodeLink_7");
		    ends[19]=2;
		    ;
		    S12802=3;
		    i_thread_19 = 0;
		    S12850=0;
		    if(i_thread_19 < 6){
		      S12844=0;
		      active[19]=1;
		      ends[19]=1;
		      tdone[19]=1;
		    }
		    else {
		      ends[19]=2;
		      ;
		      for(int q_thread_19 = 0; q_thread_19 < UpdateFlags_thread_19.length; q_thread_19 = q_thread_19 + 1) {
			if(UpdateFlags_thread_19[q_thread_19]) {
			  frths_thread_19.setElementAt((float)ThreshVars_thread_19[q_thread_19], q_thread_19);
			}
		      }
		      Frths_7.setPresent();
		      currsigs.addElement(Frths_7);
		      Frths_7.setValue(frths_thread_19);
		      System.out.println("Emitted Frths_7");
		      S12970=1;
		      active[19]=1;
		      ends[19]=1;
		      tdone[19]=1;
		    }
		  }
		  else {
		    WrongPasswordLink_7.setPresent();
		    currsigs.addElement(WrongPasswordLink_7);
		    System.out.println("Emitted WrongPasswordLink_7");
		    S12804=0;
		    active[19]=1;
		    ends[19]=1;
		    tdone[19]=1;
		  }
		  break;
		}
		break;
	      case 3 : 
		if(doneLink_7.getprestatus()){
		  for(int q_thread_19 = 0; q_thread_19 < UpdateFlags_thread_19.length; q_thread_19 = q_thread_19 + 1) {
		    if(UpdateFlags_thread_19[q_thread_19]) {
		      frths_thread_19.setElementAt((float)ThreshVars_thread_19[q_thread_19], q_thread_19);
		    }
		  }
		  Frths_7.setPresent();
		  currsigs.addElement(Frths_7);
		  Frths_7.setValue(frths_thread_19);
		  System.out.println("Emitted Frths_7");
		  S12970=1;
		  active[19]=1;
		  ends[19]=1;
		  tdone[19]=1;
		}
		else {
		  switch(S12850){
		  case 0 : 
		    switch(S12844){
		    case 0 : 
		      if(skipLink_7.getprestatus()){
			S12844=1;
			active[19]=1;
			ends[19]=1;
			tdone[19]=1;
		      }
		      else {
			if(ThreshValueLink_7.getprestatus()){
			  UpdateFlags_thread_19[i_thread_19] = true;
			  ThreshVars_thread_19[i_thread_19] = ((Integer)ThreshValueLink_7.getpreval()).intValue();
			  S12844=1;
			  active[19]=1;
			  ends[19]=1;
			  tdone[19]=1;
			}
			else {
			  active[19]=1;
			  ends[19]=1;
			  tdone[19]=1;
			}
		      }
		      break;
		    case 1 : 
		      S12844=1;
		      if(i_thread_19 < 5){
			tu_thread_19 = i_thread_19 + 2;
			ThreshCodeLink_7.setPresent();
			currsigs.addElement(ThreshCodeLink_7);
			ThreshCodeLink_7.setValue(new Integer(tu_thread_19));
			System.out.println("Emitted ThreshCodeLink_7");
			i_thread_19 = i_thread_19 + 1;
			S12850=1;
			active[19]=1;
			ends[19]=1;
			tdone[19]=1;
		      }
		      else {
			i_thread_19 = i_thread_19 + 1;
			S12850=1;
			active[19]=1;
			ends[19]=1;
			tdone[19]=1;
		      }
		      break;
		    }
		    break;
		  case 1 : 
		    S12850=1;
		    S12850=0;
		    if(i_thread_19 < 6){
		      S12844=0;
		      active[19]=1;
		      ends[19]=1;
		      tdone[19]=1;
		    }
		    else {
		      ends[19]=2;
		      ;
		      for(int q_thread_19 = 0; q_thread_19 < UpdateFlags_thread_19.length; q_thread_19 = q_thread_19 + 1) {
			if(UpdateFlags_thread_19[q_thread_19]) {
			  frths_thread_19.setElementAt((float)ThreshVars_thread_19[q_thread_19], q_thread_19);
			}
		      }
		      Frths_7.setPresent();
		      currsigs.addElement(Frths_7);
		      Frths_7.setValue(frths_thread_19);
		      System.out.println("Emitted Frths_7");
		      S12970=1;
		      active[19]=1;
		      ends[19]=1;
		      tdone[19]=1;
		    }
		    break;
		  }
		}
		break;
	      }
	    }
	    break;
	  case 1 : 
	    S12970=1;
	    S12970=0;
	    S12802=0;
	    active[19]=1;
	    ends[19]=1;
	    tdone[19]=1;
	    break;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread221495818(int [] tdone, int [] ends){
    if(tdone[18] != 1){
      switch(S12799){
      case 0 : 
	active[18]=0;
	ends[18]=0;
	tdone[18]=1;
	break;
      case 1 : 
	switch(S12781){
	case 0 : 
	  S12781=0;
	  dummy1_thread_18 = 0;
	  dummy2_thread_18 = 0;
	  dummy3_thread_18 = 0;
	  S12781=1;
	  active[18]=1;
	  ends[18]=1;
	  tdone[18]=1;
	  break;
	case 1 : 
	  if(switch1Link_7.getprestatus() && switch2Link_7.getprestatus() && switch3Link_7.getprestatus()){
	    dummy1_thread_18 = ((Integer)switch1Link_7.getpreval()).intValue();
	    dummy2_thread_18 = ((Integer)switch2Link_7.getpreval()).intValue();
	    dummy3_thread_18 = ((Integer)switch3Link_7.getpreval()).intValue();
	    if(!(PrevSwitch1_thread_18 == dummy1_thread_18 && PrevSwitch2_thread_18 == dummy2_thread_18 && PrevSwitch3_thread_18 == dummy3_thread_18)) {
	      System.out.println();
	      System.out.println();
	      if(dummy1_thread_18 == 1) {
		System.out.println("switch1 closed");
	      }
	      else {
		System.out.println("switch1 open");
	      }
	      if(dummy2_thread_18 == 1) {
		System.out.println("switch2 closed");
	      }
	      else {
		System.out.println("switch2 open");
	      }
	      if(dummy3_thread_18 == 1) {
		System.out.println("switch3 closed");
	      }
	      else {
		System.out.println("switch3 open");
	      }
	      System.out.println();
	      System.out.println();
	      PrevSwitch1_thread_18 = dummy1_thread_18;
	      PrevSwitch2_thread_18 = dummy2_thread_18;
	      PrevSwitch3_thread_18 = dummy3_thread_18;
	    }
	    S12781=0;
	    active[18]=1;
	    ends[18]=1;
	    tdone[18]=1;
	  }
	  else {
	    active[18]=1;
	    ends[18]=1;
	    tdone[18]=1;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread219187325(int [] tdone, int [] ends){
    if(tdone[17] != 1){
      switch(S12777){
      case 0 : 
	active[17]=0;
	ends[17]=0;
	tdone[17]=1;
	break;
      case 1 : 
	switch(S12698){
	case 0 : 
	  if(start2_12.getprestatus()){
	    S12698=1;
	    S12709=0;
	    if(i1_thread_17 < 1000){
	      i1_thread_17 = i1_thread_17 + 1;
	      active[17]=1;
	      ends[17]=1;
	      tdone[17]=1;
	    }
	    else {
	      i1_thread_17 = 0;
	      ends[17]=2;
	      ;
	      S12709=1;
	      active[17]=1;
	      ends[17]=1;
	      tdone[17]=1;
	    }
	  }
	  else {
	    active[17]=1;
	    ends[17]=1;
	    tdone[17]=1;
	  }
	  break;
	case 1 : 
	  switch(S12709){
	  case 0 : 
	    if(i1_thread_17 < 1000){
	      i1_thread_17 = i1_thread_17 + 1;
	      active[17]=1;
	      ends[17]=1;
	      tdone[17]=1;
	    }
	    else {
	      i1_thread_17 = 0;
	      ends[17]=2;
	      ;
	      S12709=1;
	      active[17]=1;
	      ends[17]=1;
	      tdone[17]=1;
	    }
	    break;
	  case 1 : 
	    S12709=1;
	    timeout_12.setPresent();
	    currsigs.addElement(timeout_12);
	    System.out.println("Emitted timeout_12");
	    S12709=2;
	    active[17]=1;
	    ends[17]=1;
	    tdone[17]=1;
	    break;
	  case 2 : 
	    if(start2_12.getprestatus()){
	      S12709=0;
	      if(i1_thread_17 < 1000){
		i1_thread_17 = i1_thread_17 + 1;
		active[17]=1;
		ends[17]=1;
		tdone[17]=1;
	      }
	      else {
		i1_thread_17 = 0;
		ends[17]=2;
		;
		S12709=1;
		active[17]=1;
		ends[17]=1;
		tdone[17]=1;
	      }
	    }
	    else {
	      active[17]=1;
	      ends[17]=1;
	      tdone[17]=1;
	    }
	    break;
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread32199360(int [] tdone, int [] ends){
    if(tdone[16] != 1){
      switch(S7591){
      case 0 : 
	active[16]=0;
	ends[16]=0;
	tdone[16]=1;
	break;
      case 1 : 
	if(((String)next_12.getpreval()).equals("0") || ((String)next_12.getpreval()).equals("1")){
	  switch2Link_7.setPresent();
	  currsigs.addElement(switch2Link_7);
	  switch2Link_7.setValue(new Integer(1));
	  System.out.println("Emitted switch2Link_7");
	  switch3Link_7.setPresent();
	  currsigs.addElement(switch3Link_7);
	  switch3Link_7.setValue(new Integer(1));
	  System.out.println("Emitted switch3Link_7");
	  if(((String)next_12.getpreval()).equals("0")){
	    switch1Link_7.setPresent();
	    currsigs.addElement(switch1Link_7);
	    switch1Link_7.setValue(new Integer(1));
	    System.out.println("Emitted switch1Link_7");
	    S7591=0;
	    active[16]=0;
	    ends[16]=0;
	    tdone[16]=1;
	  }
	  else {
	    switch1Link_7.setPresent();
	    currsigs.addElement(switch1Link_7);
	    switch1Link_7.setValue(new Integer(0));
	    System.out.println("Emitted switch1Link_7");
	    S7591=0;
	    active[16]=0;
	    ends[16]=0;
	    tdone[16]=1;
	  }
	}
	else {
	  if(((String)next_12.getpreval()).equals("2") || ((String)next_12.getpreval()).equals("3")){
	    switch1Link_7.setPresent();
	    currsigs.addElement(switch1Link_7);
	    switch1Link_7.setValue(new Integer(0));
	    System.out.println("Emitted switch1Link_7");
	    switch2Link_7.setPresent();
	    currsigs.addElement(switch2Link_7);
	    switch2Link_7.setValue(new Integer(0));
	    System.out.println("Emitted switch2Link_7");
	    if(((String)next_12.getpreval()).equals("2")){
	      switch3Link_7.setPresent();
	      currsigs.addElement(switch3Link_7);
	      switch3Link_7.setValue(new Integer(1));
	      System.out.println("Emitted switch3Link_7");
	      S7591=0;
	      active[16]=0;
	      ends[16]=0;
	      tdone[16]=1;
	    }
	    else {
	      switch3Link_7.setPresent();
	      currsigs.addElement(switch3Link_7);
	      switch3Link_7.setValue(new Integer(0));
	      System.out.println("Emitted switch3Link_7");
	      S7591=0;
	      active[16]=0;
	      ends[16]=0;
	      tdone[16]=1;
	    }
	  }
	  else {
	    S7591=0;
	    active[16]=0;
	    ends[16]=0;
	    tdone[16]=1;
	  }
	}
	break;
      }
    }
  }
  public void thread69135254(int [] tdone, int [] ends){
    if(tdone[15] != 1){
      switch(S7573){
      case 0 : 
	active[15]=0;
	ends[15]=0;
	tdone[15]=1;
	break;
      case 1 : 
	if(pp_12.getprestatus()){
	  ;
	  S7573=0;
	  active[15]=0;
	  ends[15]=0;
	  tdone[15]=1;
	}
	else {
	  switch(S7526){
	  case 0 : 
	    if(ep_12.getprestatus()){
	      if(ic_12.getprestatus()){
		if(dft_thread_15 == 3 || drt_thread_15 == 3){
		  next_12.setPresent();
		  currsigs.addElement(next_12);
		  next_12.setValue("3");
		  System.out.println("Emitted next_12");
		  if(enter_thread_15 == 1){
		    enter_thread_15 = enter_thread_15 + 1;
		    Enter_12.setPresent();
		    currsigs.addElement(Enter_12);
		    Enter_12.setValue(new Integer(enter_thread_15));
		    System.out.println("Emitted Enter_12");
		    start2_12.setPresent();
		    currsigs.addElement(start2_12);
		    System.out.println("Emitted start2_12");
		    S7573=0;
		    active[15]=0;
		    ends[15]=0;
		    tdone[15]=1;
		  }
		  else {
		    start2_12.setPresent();
		    currsigs.addElement(start2_12);
		    System.out.println("Emitted start2_12");
		    S7573=0;
		    active[15]=0;
		    ends[15]=0;
		    tdone[15]=1;
		  }
		}
		else {
		  if(((String)ep_12.getpreval()).equals("2") && (dft_thread_15 == 2 || drt_thread_15 == 2)){
		    next_12.setPresent();
		    currsigs.addElement(next_12);
		    next_12.setValue("2");
		    System.out.println("Emitted next_12");
		    if(enter_thread_15 == 1){
		      enter_thread_15 = enter_thread_15 + 1;
		      Enter_12.setPresent();
		      currsigs.addElement(Enter_12);
		      Enter_12.setValue(new Integer(enter_thread_15));
		      System.out.println("Emitted Enter_12");
		      start2_12.setPresent();
		      currsigs.addElement(start2_12);
		      System.out.println("Emitted start2_12");
		      S7573=0;
		      active[15]=0;
		      ends[15]=0;
		      tdone[15]=1;
		    }
		    else {
		      start2_12.setPresent();
		      currsigs.addElement(start2_12);
		      System.out.println("Emitted start2_12");
		      S7573=0;
		      active[15]=0;
		      ends[15]=0;
		      tdone[15]=1;
		    }
		  }
		  else {
		    if(enter_thread_15 == 1){
		      enter_thread_15 = enter_thread_15 + 1;
		      Enter_12.setPresent();
		      currsigs.addElement(Enter_12);
		      Enter_12.setValue(new Integer(enter_thread_15));
		      System.out.println("Emitted Enter_12");
		      start2_12.setPresent();
		      currsigs.addElement(start2_12);
		      System.out.println("Emitted start2_12");
		      S7573=0;
		      active[15]=0;
		      ends[15]=0;
		      tdone[15]=1;
		    }
		    else {
		      start2_12.setPresent();
		      currsigs.addElement(start2_12);
		      System.out.println("Emitted start2_12");
		      S7573=0;
		      active[15]=0;
		      ends[15]=0;
		      tdone[15]=1;
		    }
		  }
		}
	      }
	      else {
		if(it_12.getprestatus()){
		  changerval_thread_15 = (String)ep_12.getpreval();
		  ichan_thread_15 = new Integer(Integer.parseInt(changerval_thread_15));
		  changerval_thread_15 = ichan_thread_15 - 1 + "";
		  next_12.setPresent();
		  currsigs.addElement(next_12);
		  next_12.setValue(changerval_thread_15);
		  System.out.println("Emitted next_12");
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7573=0;
		  active[15]=0;
		  ends[15]=0;
		  tdone[15]=1;
		}
		else {
		  S7573=0;
		  active[15]=0;
		  ends[15]=0;
		  tdone[15]=1;
		}
	      }
	    }
	    else {
	      active[15]=1;
	      ends[15]=1;
	      tdone[15]=1;
	    }
	    break;
	  case 1 : 
	    S7573=0;
	    active[15]=0;
	    ends[15]=0;
	    tdone[15]=1;
	    break;
	  case 2 : 
	    S7573=0;
	    active[15]=0;
	    ends[15]=0;
	    tdone[15]=1;
	    break;
	  case 3 : 
	    S7573=0;
	    active[15]=0;
	    ends[15]=0;
	    tdone[15]=1;
	    break;
	  }
	}
	break;
      }
    }
  }
  public void thread105686400(int [] tdone, int [] ends){
    if(tdone[14] != 1){
      switch(S7481){
      case 0 : 
	active[14]=0;
	ends[14]=0;
	tdone[14]=1;
	break;
      case 1 : 
	if(ep_12.getprestatus()){
	  ;
	  S7481=0;
	  active[14]=0;
	  ends[14]=0;
	  tdone[14]=1;
	}
	else {
	  switch(S7428){
	  case 0 : 
	    if(pp_12.getprestatus()){
	      if(ic_12.getprestatus()){
		if(dft_thread_14 != 0){
		  sdft_thread_14 = dft_thread_14 + "";
		  next_12.setPresent();
		  currsigs.addElement(next_12);
		  next_12.setValue(sdft_thread_14);
		  System.out.println("Emitted next_12");
		  if(enter_thread_14 == 1){
		    enter_thread_14 = enter_thread_14 + 1;
		    Enter_12.setPresent();
		    currsigs.addElement(Enter_12);
		    Enter_12.setValue(new Integer(enter_thread_14));
		    System.out.println("Emitted Enter_12");
		    start2_12.setPresent();
		    currsigs.addElement(start2_12);
		    System.out.println("Emitted start2_12");
		    S7481=0;
		    active[14]=0;
		    ends[14]=0;
		    tdone[14]=1;
		  }
		  else {
		    start2_12.setPresent();
		    currsigs.addElement(start2_12);
		    System.out.println("Emitted start2_12");
		    S7481=0;
		    active[14]=0;
		    ends[14]=0;
		    tdone[14]=1;
		  }
		}
		else {
		  if(drt_thread_14 != 0){
		    sdrt_thread_14 = drt_thread_14 + "";
		    next_12.setPresent();
		    currsigs.addElement(next_12);
		    next_12.setValue(sdrt_thread_14);
		    System.out.println("Emitted next_12");
		    if(enter_thread_14 == 1){
		      enter_thread_14 = enter_thread_14 + 1;
		      Enter_12.setPresent();
		      currsigs.addElement(Enter_12);
		      Enter_12.setValue(new Integer(enter_thread_14));
		      System.out.println("Emitted Enter_12");
		      start2_12.setPresent();
		      currsigs.addElement(start2_12);
		      System.out.println("Emitted start2_12");
		      S7481=0;
		      active[14]=0;
		      ends[14]=0;
		      tdone[14]=1;
		    }
		    else {
		      start2_12.setPresent();
		      currsigs.addElement(start2_12);
		      System.out.println("Emitted start2_12");
		      S7481=0;
		      active[14]=0;
		      ends[14]=0;
		      tdone[14]=1;
		    }
		  }
		  else {
		    if(enter_thread_14 == 1){
		      enter_thread_14 = enter_thread_14 + 1;
		      Enter_12.setPresent();
		      currsigs.addElement(Enter_12);
		      Enter_12.setValue(new Integer(enter_thread_14));
		      System.out.println("Emitted Enter_12");
		      start2_12.setPresent();
		      currsigs.addElement(start2_12);
		      System.out.println("Emitted start2_12");
		      S7481=0;
		      active[14]=0;
		      ends[14]=0;
		      tdone[14]=1;
		    }
		    else {
		      start2_12.setPresent();
		      currsigs.addElement(start2_12);
		      System.out.println("Emitted start2_12");
		      S7481=0;
		      active[14]=0;
		      ends[14]=0;
		      tdone[14]=1;
		    }
		  }
		}
	      }
	      else {
		if(((String)(pp_12.getpreval())).equals("1")){
		  if(it_12.getprestatus()){
		    next_12.setPresent();
		    currsigs.addElement(next_12);
		    next_12.setValue("0");
		    System.out.println("Emitted next_12");
		    S7481=0;
		    active[14]=0;
		    ends[14]=0;
		    tdone[14]=1;
		  }
		  else {
		    S7481=0;
		    active[14]=0;
		    ends[14]=0;
		    tdone[14]=1;
		  }
		}
		else {
		  S7481=0;
		  active[14]=0;
		  ends[14]=0;
		  tdone[14]=1;
		}
	      }
	    }
	    else {
	      active[14]=1;
	      ends[14]=1;
	      tdone[14]=1;
	    }
	    break;
	  case 1 : 
	    S7481=0;
	    active[14]=0;
	    ends[14]=0;
	    tdone[14]=1;
	    break;
	  case 2 : 
	    S7481=0;
	    active[14]=0;
	    ends[14]=0;
	    tdone[14]=1;
	    break;
	  case 3 : 
	    S7481=0;
	    active[14]=0;
	    ends[14]=0;
	    tdone[14]=1;
	    break;
	  case 4 : 
	    S7481=0;
	    active[14]=0;
	    ends[14]=0;
	    tdone[14]=1;
	    break;
	  }
	}
	break;
      }
    }
  }
  public void thread106455897(int [] tdone, int [] ends){
    if(tdone[16] != 1){
      S7591=1;
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }
  public void thread1421527638(int [] tdone, int [] ends){
    if(tdone[15] != 1){
      S7573=1;
      drt_thread_15 = (RocStatLink_7.getpreval() == null) ? 0 : ((Integer)RocStatLink_7.getpreval()).intValue();
      dft_thread_15 = (FreqStatLink_7.getpreval() == null) ? 0 : ((Integer)FreqStatLink_7.getpreval()).intValue();
      enter_thread_15 = ((Integer)Enter_12.getpreval()).intValue();
      if(pp_12.getprestatus()){
	;
	S7573=0;
	active[15]=0;
	ends[15]=0;
	tdone[15]=1;
      }
      else {
	S7526=0;
	if(ep_12.getprestatus()){
	  if(ic_12.getprestatus()){
	    if(dft_thread_15 == 3 || drt_thread_15 == 3){
	      next_12.setPresent();
	      currsigs.addElement(next_12);
	      next_12.setValue("3");
	      System.out.println("Emitted next_12");
	      if(enter_thread_15 == 1){
		enter_thread_15 = enter_thread_15 + 1;
		Enter_12.setPresent();
		currsigs.addElement(Enter_12);
		Enter_12.setValue(new Integer(enter_thread_15));
		System.out.println("Emitted Enter_12");
		start2_12.setPresent();
		currsigs.addElement(start2_12);
		System.out.println("Emitted start2_12");
		S7573=0;
		active[15]=0;
		ends[15]=0;
		tdone[15]=1;
	      }
	      else {
		start2_12.setPresent();
		currsigs.addElement(start2_12);
		System.out.println("Emitted start2_12");
		S7573=0;
		active[15]=0;
		ends[15]=0;
		tdone[15]=1;
	      }
	    }
	    else {
	      if(((String)ep_12.getpreval()).equals("2") && (dft_thread_15 == 2 || drt_thread_15 == 2)){
		next_12.setPresent();
		currsigs.addElement(next_12);
		next_12.setValue("2");
		System.out.println("Emitted next_12");
		if(enter_thread_15 == 1){
		  enter_thread_15 = enter_thread_15 + 1;
		  Enter_12.setPresent();
		  currsigs.addElement(Enter_12);
		  Enter_12.setValue(new Integer(enter_thread_15));
		  System.out.println("Emitted Enter_12");
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7573=0;
		  active[15]=0;
		  ends[15]=0;
		  tdone[15]=1;
		}
		else {
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7573=0;
		  active[15]=0;
		  ends[15]=0;
		  tdone[15]=1;
		}
	      }
	      else {
		if(enter_thread_15 == 1){
		  enter_thread_15 = enter_thread_15 + 1;
		  Enter_12.setPresent();
		  currsigs.addElement(Enter_12);
		  Enter_12.setValue(new Integer(enter_thread_15));
		  System.out.println("Emitted Enter_12");
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7573=0;
		  active[15]=0;
		  ends[15]=0;
		  tdone[15]=1;
		}
		else {
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7573=0;
		  active[15]=0;
		  ends[15]=0;
		  tdone[15]=1;
		}
	      }
	    }
	  }
	  else {
	    if(it_12.getprestatus()){
	      changerval_thread_15 = (String)ep_12.getpreval();
	      ichan_thread_15 = new Integer(Integer.parseInt(changerval_thread_15));
	      changerval_thread_15 = ichan_thread_15 - 1 + "";
	      next_12.setPresent();
	      currsigs.addElement(next_12);
	      next_12.setValue(changerval_thread_15);
	      System.out.println("Emitted next_12");
	      start2_12.setPresent();
	      currsigs.addElement(start2_12);
	      System.out.println("Emitted start2_12");
	      S7573=0;
	      active[15]=0;
	      ends[15]=0;
	      tdone[15]=1;
	    }
	    else {
	      S7573=0;
	      active[15]=0;
	      ends[15]=0;
	      tdone[15]=1;
	    }
	  }
	}
	else {
	  active[15]=1;
	  ends[15]=1;
	  tdone[15]=1;
	}
      }
    }
  }
  public void thread1460772026(int [] tdone, int [] ends){
    if(tdone[14] != 1){
      S7481=1;
      drt_thread_14 = (RocStatLink_7.getpreval() == null) ? 0 : ((Integer)RocStatLink_7.getpreval()).intValue();
      dft_thread_14 = (FreqStatLink_7.getpreval() == null) ? 0 : ((Integer)FreqStatLink_7.getpreval()).intValue();
      enter_thread_14 = ((Integer)Enter_12.getpreval()).intValue();
      if(ep_12.getprestatus()){
	;
	S7481=0;
	active[14]=0;
	ends[14]=0;
	tdone[14]=1;
      }
      else {
	S7428=0;
	if(pp_12.getprestatus()){
	  if(ic_12.getprestatus()){
	    if(dft_thread_14 != 0){
	      sdft_thread_14 = dft_thread_14 + "";
	      next_12.setPresent();
	      currsigs.addElement(next_12);
	      next_12.setValue(sdft_thread_14);
	      System.out.println("Emitted next_12");
	      if(enter_thread_14 == 1){
		enter_thread_14 = enter_thread_14 + 1;
		Enter_12.setPresent();
		currsigs.addElement(Enter_12);
		Enter_12.setValue(new Integer(enter_thread_14));
		System.out.println("Emitted Enter_12");
		start2_12.setPresent();
		currsigs.addElement(start2_12);
		System.out.println("Emitted start2_12");
		S7481=0;
		active[14]=0;
		ends[14]=0;
		tdone[14]=1;
	      }
	      else {
		start2_12.setPresent();
		currsigs.addElement(start2_12);
		System.out.println("Emitted start2_12");
		S7481=0;
		active[14]=0;
		ends[14]=0;
		tdone[14]=1;
	      }
	    }
	    else {
	      if(drt_thread_14 != 0){
		sdrt_thread_14 = drt_thread_14 + "";
		next_12.setPresent();
		currsigs.addElement(next_12);
		next_12.setValue(sdrt_thread_14);
		System.out.println("Emitted next_12");
		if(enter_thread_14 == 1){
		  enter_thread_14 = enter_thread_14 + 1;
		  Enter_12.setPresent();
		  currsigs.addElement(Enter_12);
		  Enter_12.setValue(new Integer(enter_thread_14));
		  System.out.println("Emitted Enter_12");
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7481=0;
		  active[14]=0;
		  ends[14]=0;
		  tdone[14]=1;
		}
		else {
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7481=0;
		  active[14]=0;
		  ends[14]=0;
		  tdone[14]=1;
		}
	      }
	      else {
		if(enter_thread_14 == 1){
		  enter_thread_14 = enter_thread_14 + 1;
		  Enter_12.setPresent();
		  currsigs.addElement(Enter_12);
		  Enter_12.setValue(new Integer(enter_thread_14));
		  System.out.println("Emitted Enter_12");
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7481=0;
		  active[14]=0;
		  ends[14]=0;
		  tdone[14]=1;
		}
		else {
		  start2_12.setPresent();
		  currsigs.addElement(start2_12);
		  System.out.println("Emitted start2_12");
		  S7481=0;
		  active[14]=0;
		  ends[14]=0;
		  tdone[14]=1;
		}
	      }
	    }
	  }
	  else {
	    if(((String)(pp_12.getpreval())).equals("1")){
	      if(it_12.getprestatus()){
		next_12.setPresent();
		currsigs.addElement(next_12);
		next_12.setValue("0");
		System.out.println("Emitted next_12");
		S7481=0;
		active[14]=0;
		ends[14]=0;
		tdone[14]=1;
	      }
	      else {
		S7481=0;
		active[14]=0;
		ends[14]=0;
		tdone[14]=1;
	      }
	    }
	    else {
	      S7481=0;
	      active[14]=0;
	      ends[14]=0;
	      tdone[14]=1;
	    }
	  }
	}
	else {
	  active[14]=1;
	  ends[14]=1;
	  tdone[14]=1;
	}
      }
    }
  }
  public void thread1460387277(int [] tdone, int [] ends){
    if(tdone[13] != 1){
      switch(S12695){
      case 0 : 
	active[13]=0;
	ends[13]=0;
	tdone[13]=1;
	break;
      case 1 : 
	next_12.setClear();
	ep_12.setClear();
	pp_12.setClear();
	Enter_12.setClear();
	ic_12.setClear();
	it_12.setClear();
	switch(S7367){
	case 0 : 
	  S7367=0;
	  S7367=1;
	  thread1460772026(tdone,ends);
	  thread1421527638(tdone,ends);
	  thread106455897(tdone,ends);
	  int biggest105301651 = 0;
	  if(ends[14]>=biggest105301651){
	    biggest105301651=ends[14];
	  }
	  if(ends[15]>=biggest105301651){
	    biggest105301651=ends[15];
	  }
	  if(ends[16]>=biggest105301651){
	    biggest105301651=ends[16];
	  }
	  if(biggest105301651 == 1){
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  break;
	case 1 : 
	  thread105686400(tdone,ends);
	  thread69135254(tdone,ends);
	  thread32199360(tdone,ends);
	  int biggest297291352 = 0;
	  if(ends[14]>=biggest297291352){
	    biggest297291352=ends[14];
	  }
	  if(ends[15]>=biggest297291352){
	    biggest297291352=ends[15];
	  }
	  if(ends[16]>=biggest297291352){
	    biggest297291352=ends[16];
	  }
	  if(biggest297291352 == 1){
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  //FINXME code
	  if(biggest297291352 == 0){
	    if(!((String)next_12.getpreval()).equals("")) {
	      CurrentState_thread_13 = (String)next_12.getpreval();
	    }
	    if(CheckStatLink_7.getprestatus()){
	      ic_12.setPresent();
	      currsigs.addElement(ic_12);
	      System.out.println("Emitted ic_12");
	      if(timeout_12.getprestatus()){
		it_12.setPresent();
		currsigs.addElement(it_12);
		System.out.println("Emitted it_12");
		Enter_12.setPresent();
		currsigs.addElement(Enter_12);
		Enter_12.setValue(new Integer(enter_thread_13));
		System.out.println("Emitted Enter_12");
		if(CurrentState_thread_13.equals("0") || CurrentState_thread_13.equals("1")){
		  pp_12.setPresent();
		  currsigs.addElement(pp_12);
		  pp_12.setValue(CurrentState_thread_13);
		  System.out.println("Emitted pp_12");
		  S7367=0;
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
		else {
		  if(CurrentState_thread_13.equals("2") || CurrentState_thread_13.equals("3")){
		    ep_12.setPresent();
		    currsigs.addElement(ep_12);
		    ep_12.setValue(CurrentState_thread_13);
		    System.out.println("Emitted ep_12");
		    S7367=0;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		  else {
		    S7367=0;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		}
	      }
	      else {
		Enter_12.setPresent();
		currsigs.addElement(Enter_12);
		Enter_12.setValue(new Integer(enter_thread_13));
		System.out.println("Emitted Enter_12");
		if(CurrentState_thread_13.equals("0") || CurrentState_thread_13.equals("1")){
		  pp_12.setPresent();
		  currsigs.addElement(pp_12);
		  pp_12.setValue(CurrentState_thread_13);
		  System.out.println("Emitted pp_12");
		  S7367=0;
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
		else {
		  if(CurrentState_thread_13.equals("2") || CurrentState_thread_13.equals("3")){
		    ep_12.setPresent();
		    currsigs.addElement(ep_12);
		    ep_12.setValue(CurrentState_thread_13);
		    System.out.println("Emitted ep_12");
		    S7367=0;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		  else {
		    S7367=0;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		}
	      }
	    }
	    else {
	      if(timeout_12.getprestatus()){
		it_12.setPresent();
		currsigs.addElement(it_12);
		System.out.println("Emitted it_12");
		Enter_12.setPresent();
		currsigs.addElement(Enter_12);
		Enter_12.setValue(new Integer(enter_thread_13));
		System.out.println("Emitted Enter_12");
		if(CurrentState_thread_13.equals("0") || CurrentState_thread_13.equals("1")){
		  pp_12.setPresent();
		  currsigs.addElement(pp_12);
		  pp_12.setValue(CurrentState_thread_13);
		  System.out.println("Emitted pp_12");
		  S7367=0;
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
		else {
		  if(CurrentState_thread_13.equals("2") || CurrentState_thread_13.equals("3")){
		    ep_12.setPresent();
		    currsigs.addElement(ep_12);
		    ep_12.setValue(CurrentState_thread_13);
		    System.out.println("Emitted ep_12");
		    S7367=0;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		  else {
		    S7367=0;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		}
	      }
	      else {
		Enter_12.setPresent();
		currsigs.addElement(Enter_12);
		Enter_12.setValue(new Integer(enter_thread_13));
		System.out.println("Emitted Enter_12");
		if(CurrentState_thread_13.equals("0") || CurrentState_thread_13.equals("1")){
		  pp_12.setPresent();
		  currsigs.addElement(pp_12);
		  pp_12.setValue(CurrentState_thread_13);
		  System.out.println("Emitted pp_12");
		  S7367=0;
		  active[13]=1;
		  ends[13]=1;
		  tdone[13]=1;
		}
		else {
		  if(CurrentState_thread_13.equals("2") || CurrentState_thread_13.equals("3")){
		    ep_12.setPresent();
		    currsigs.addElement(ep_12);
		    ep_12.setValue(CurrentState_thread_13);
		    System.out.println("Emitted ep_12");
		    S7367=0;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		  else {
		    S7367=0;
		    active[13]=1;
		    ends[13]=1;
		    tdone[13]=1;
		  }
		}
	      }
	    }
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1458463532(int [] tdone, int [] ends){
    if(tdone[12] != 1){
      switch(S12779){
      case 0 : 
	active[12]=0;
	ends[12]=0;
	tdone[12]=1;
	break;
      case 1 : 
	timeout_12.setClear();
	start2_12.setClear();
	thread1460387277(tdone,ends);
	thread219187325(tdone,ends);
	int biggest219572074 = 0;
	if(ends[13]>=biggest219572074){
	  biggest219572074=ends[13];
	}
	if(ends[17]>=biggest219572074){
	  biggest219572074=ends[17];
	}
	if(biggest219572074 == 1){
	  active[12]=1;
	  ends[12]=1;
	  tdone[12]=1;
	}
	//FINXME code
	if(biggest219572074 == 0){
	  S12779=0;
	  active[12]=0;
	  ends[12]=0;
	  tdone[12]=1;
	}
	break;
      }
    }
  }
  public void thread1505402898(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      switch(S7020){
      case 0 : 
	active[11]=0;
	ends[11]=0;
	tdone[11]=1;
	break;
      case 1 : 
	if(AveFreqval_8.getprestatus()){
	  drt0_thread_11 = ((Float)((Vector)Frths_7.getpreval()).get(3)).floatValue();
	  drt1_thread_11 = ((Float)((Vector)Frths_7.getpreval()).get(4)).floatValue();
	  drt2_thread_11 = ((Float)((Vector)Frths_7.getpreval()).get(5)).floatValue();
	  secondC_thread_11 = firstC_thread_11;
	  firstC_thread_11 = ((Float)AveFreqval_8.getpreval()).floatValue();
	  temp_thread_11 = (firstC_thread_11 - secondC_thread_11) * firstC_thread_11;
	  if(temp_thread_11 < 0) {
	    Roc_thread_11 = -1 * temp_thread_11;
	  }
	  else {
	    Roc_thread_11 = temp_thread_11;
	  }
	  for(j34_thread_11 = RocWs_thread_11 - 1; j34_thread_11 > 0; j34_thread_11 = j34_thread_11 - 1) {
	    RocWindow_thread_11[j34_thread_11] = RocWindow_thread_11[j34_thread_11 - 1];
	  }
	  RocWindow_thread_11[0] = Roc_thread_11;
	  RocSum_thread_11 = 0;
	  for(j34_thread_11 = 0; j34_thread_11 < RocWs_thread_11; j34_thread_11 = j34_thread_11 + 1) {
	    RocSum_thread_11 = RocSum_thread_11 + RocWindow_thread_11[j34_thread_11];
	  }
	  AveRoc_thread_11 = RocSum_thread_11 / RocWs_thread_11;
	  if(AveRoc_thread_11 < drt0_thread_11){
	    RocStatLink_7.setPresent();
	    currsigs.addElement(RocStatLink_7);
	    RocStatLink_7.setValue(new Integer(0));
	    System.out.println("Emitted RocStatLink_7");
	    CheckStatLink_7.setPresent();
	    currsigs.addElement(CheckStatLink_7);
	    System.out.println("Emitted CheckStatLink_7");
	    active[11]=1;
	    ends[11]=1;
	    tdone[11]=1;
	  }
	  else {
	    if(AveRoc_thread_11 >= drt0_thread_11 && AveRoc_thread_11 < drt1_thread_11){
	      RocStatLink_7.setPresent();
	      currsigs.addElement(RocStatLink_7);
	      RocStatLink_7.setValue(new Integer(1));
	      System.out.println("Emitted RocStatLink_7");
	      CheckStatLink_7.setPresent();
	      currsigs.addElement(CheckStatLink_7);
	      System.out.println("Emitted CheckStatLink_7");
	      active[11]=1;
	      ends[11]=1;
	      tdone[11]=1;
	    }
	    else {
	      if(AveRoc_thread_11 >= drt1_thread_11 && AveRoc_thread_11 < drt2_thread_11){
		RocStatLink_7.setPresent();
		currsigs.addElement(RocStatLink_7);
		RocStatLink_7.setValue(new Integer(2));
		System.out.println("Emitted RocStatLink_7");
		CheckStatLink_7.setPresent();
		currsigs.addElement(CheckStatLink_7);
		System.out.println("Emitted CheckStatLink_7");
		active[11]=1;
		ends[11]=1;
		tdone[11]=1;
	      }
	      else {
		if(AveRoc_thread_11 >= drt2_thread_11){
		  RocStatLink_7.setPresent();
		  currsigs.addElement(RocStatLink_7);
		  RocStatLink_7.setValue(new Integer(3));
		  System.out.println("Emitted RocStatLink_7");
		  CheckStatLink_7.setPresent();
		  currsigs.addElement(CheckStatLink_7);
		  System.out.println("Emitted CheckStatLink_7");
		  active[11]=1;
		  ends[11]=1;
		  tdone[11]=1;
		}
		else {
		  CheckStatLink_7.setPresent();
		  currsigs.addElement(CheckStatLink_7);
		  System.out.println("Emitted CheckStatLink_7");
		  active[11]=1;
		  ends[11]=1;
		  tdone[11]=1;
		}
	      }
	    }
	  }
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
  public void thread1157974641(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      switch(S6878){
      case 0 : 
	active[10]=0;
	ends[10]=0;
	tdone[10]=1;
	break;
      case 1 : 
	switch(S6739){
	case 0 : 
	  if(meCount_8.getprestatus()){
	    ghy_thread_10 = 0;
	    ghy_thread_10 = (int)((Float)meCount_8.getpreval()).floatValue();
	    S6739=1;
	    active[10]=1;
	    ends[10]=1;
	    tdone[10]=1;
	  }
	  else {
	    active[10]=1;
	    ends[10]=1;
	    tdone[10]=1;
	  }
	  break;
	case 1 : 
	  S6739=1;
	  Freq_thread_10 = SamplingFreq_thread_10 / ghy_thread_10;
	  dft0_thread_10 = ((Float)(((Vector)Frths_7.getpreval()).get(0))).floatValue();
	  dft1_thread_10 = ((Float)(((Vector)Frths_7.getpreval()).get(1))).floatValue();
	  dft2_thread_10 = ((Float)(((Vector)Frths_7.getpreval()).get(2))).floatValue();
	  i34_thread_10 = 0;
	  j34_thread_10 = 0;
	  for(i34_thread_10 = FreqWs_thread_10 - 1; i34_thread_10 > 0; i34_thread_10 = i34_thread_10 - 1) {
	    FreqWindow_thread_10[i34_thread_10] = FreqWindow_thread_10[i34_thread_10 - 1];
	  }
	  FreqWindow_thread_10[0] = Freq_thread_10;
	  Sum_thread_10 = 0;
	  for(i34_thread_10 = 0; i34_thread_10 < FreqWs_thread_10; i34_thread_10 = i34_thread_10 + 1) {
	    Sum_thread_10 = Sum_thread_10 + FreqWindow_thread_10[i34_thread_10];
	  }
	  toe_thread_10 = (Sum_thread_10 / FreqWs_thread_10);
	  AveFreqval_8.setPresent();
	  currsigs.addElement(AveFreqval_8);
	  AveFreqval_8.setValue(new Float(toe_thread_10));
	  System.out.println("Emitted AveFreqval_8");
	  if(toe_thread_10 >= dft0_thread_10){
	    FreqStatLink_7.setPresent();
	    currsigs.addElement(FreqStatLink_7);
	    FreqStatLink_7.setValue(new Integer(0));
	    System.out.println("Emitted FreqStatLink_7");
	    S6739=0;
	    if(meCount_8.getprestatus()){
	      ghy_thread_10 = 0;
	      ghy_thread_10 = (int)((Float)meCount_8.getpreval()).floatValue();
	      S6739=1;
	      active[10]=1;
	      ends[10]=1;
	      tdone[10]=1;
	    }
	    else {
	      active[10]=1;
	      ends[10]=1;
	      tdone[10]=1;
	    }
	  }
	  else {
	    if(toe_thread_10 < dft0_thread_10 && toe_thread_10 >= dft1_thread_10){
	      FreqStatLink_7.setPresent();
	      currsigs.addElement(FreqStatLink_7);
	      FreqStatLink_7.setValue(new Integer(1));
	      System.out.println("Emitted FreqStatLink_7");
	      S6739=0;
	      if(meCount_8.getprestatus()){
		ghy_thread_10 = 0;
		ghy_thread_10 = (int)((Float)meCount_8.getpreval()).floatValue();
		S6739=1;
		active[10]=1;
		ends[10]=1;
		tdone[10]=1;
	      }
	      else {
		active[10]=1;
		ends[10]=1;
		tdone[10]=1;
	      }
	    }
	    else {
	      if(toe_thread_10 < dft1_thread_10 && toe_thread_10 >= dft2_thread_10){
		FreqStatLink_7.setPresent();
		currsigs.addElement(FreqStatLink_7);
		FreqStatLink_7.setValue(new Integer(2));
		System.out.println("Emitted FreqStatLink_7");
		S6739=0;
		if(meCount_8.getprestatus()){
		  ghy_thread_10 = 0;
		  ghy_thread_10 = (int)((Float)meCount_8.getpreval()).floatValue();
		  S6739=1;
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
		else {
		  active[10]=1;
		  ends[10]=1;
		  tdone[10]=1;
		}
	      }
	      else {
		if(toe_thread_10 < dft2_thread_10){
		  FreqStatLink_7.setPresent();
		  currsigs.addElement(FreqStatLink_7);
		  FreqStatLink_7.setValue(new Integer(3));
		  System.out.println("Emitted FreqStatLink_7");
		  S6739=0;
		  if(meCount_8.getprestatus()){
		    ghy_thread_10 = 0;
		    ghy_thread_10 = (int)((Float)meCount_8.getpreval()).floatValue();
		    S6739=1;
		    active[10]=1;
		    ends[10]=1;
		    tdone[10]=1;
		  }
		  else {
		    active[10]=1;
		    ends[10]=1;
		    tdone[10]=1;
		  }
		}
		else {
		  S6739=0;
		  if(meCount_8.getprestatus()){
		    ghy_thread_10 = 0;
		    ghy_thread_10 = (int)((Float)meCount_8.getpreval()).floatValue();
		    S6739=1;
		    active[10]=1;
		    ends[10]=1;
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
	  }
	  break;
	}
	break;
      }
    }
  }
  public void thread1139891443(int [] tdone, int [] ends){
    if(tdone[9] != 1){
      switch(S6736){
      case 0 : 
	active[9]=0;
	ends[9]=0;
	tdone[9]=1;
	break;
      case 1 : 
	switch(S6706){
	case 0 : 
	  switch(S6696){
	  case 0 : 
	    if(SampleCount_in.get_preempted()){
	      tutu__622067254 = 0;
	      tutu__622067254 = SampleCount_in.get_preempted() ? SampleCount_in.refresh() : 0;
	      S6696=1;
	      active[9]=1;
	      ends[9]=1;
	      tdone[9]=1;
	    }
	    else {
	      if(SampleCount_in.get_r_s() > SampleCount_in.get_r_r()){
		tutu__1271345238 = 0;
		tutu__1271345238 = SampleCount_in.get_r_r();
		tutu__1271345238++;
		SampleCount_in.set_r_r(tutu__1271345238);
		SampleCount_in.get_val();
		ends[9]=2;
		;
		vall_thread_9 = (Float)SampleCount_in.get_value();
		meCount_8.setPresent();
		currsigs.addElement(meCount_8);
		meCount_8.setValue(new Float(vall_thread_9));
		System.out.println("Emitted meCount_8");
		S6706=1;
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
	    S6696=1;
	    S6696=0;
	    if(SampleCount_in.get_preempted()){
	      tutu__622067254 = 0;
	      tutu__622067254 = SampleCount_in.get_preempted() ? SampleCount_in.refresh() : 0;
	      S6696=1;
	      active[9]=1;
	      ends[9]=1;
	      tdone[9]=1;
	    }
	    else {
	      if(SampleCount_in.get_r_s() > SampleCount_in.get_r_r()){
		tutu__1271345238 = 0;
		tutu__1271345238 = SampleCount_in.get_r_r();
		tutu__1271345238++;
		SampleCount_in.set_r_r(tutu__1271345238);
		SampleCount_in.get_val();
		ends[9]=2;
		;
		vall_thread_9 = (Float)SampleCount_in.get_value();
		meCount_8.setPresent();
		currsigs.addElement(meCount_8);
		meCount_8.setValue(new Float(vall_thread_9));
		System.out.println("Emitted meCount_8");
		S6706=1;
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
	case 1 : 
	  S6706=1;
	  S6706=0;
	  S6696=0;
	  if(SampleCount_in.get_preempted()){
	    tutu__295096246 = 0;
	    tutu__295096246 = SampleCount_in.get_preempted() ? SampleCount_in.refresh() : 0;
	    S6696=1;
	    active[9]=1;
	    ends[9]=1;
	    tdone[9]=1;
	  }
	  else {
	    if(SampleCount_in.get_r_s() > SampleCount_in.get_r_r()){
	      tutu__1269806242 = 0;
	      tutu__1269806242 = SampleCount_in.get_r_r();
	      tutu__1269806242++;
	      SampleCount_in.set_r_r(tutu__1269806242);
	      SampleCount_in.get_val();
	      ends[9]=2;
	      ;
	      vall_thread_9 = (Float)SampleCount_in.get_value();
	      meCount_8.setPresent();
	      currsigs.addElement(meCount_8);
	      meCount_8.setValue(new Float(vall_thread_9));
	      System.out.println("Emitted meCount_8");
	      S6706=1;
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
      }
    }
  }
  public void thread1139506694(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      switch(S7353){
      case 0 : 
	active[8]=0;
	ends[8]=0;
	tdone[8]=1;
	break;
      case 1 : 
	AveFreqval_8.setClear();
	meCount_8.setClear();
	thread1139891443(tdone,ends);
	thread1157974641(tdone,ends);
	thread1505402898(tdone,ends);
	int biggest1458078783 = 0;
	if(ends[9]>=biggest1458078783){
	  biggest1458078783=ends[9];
	}
	if(ends[10]>=biggest1458078783){
	  biggest1458078783=ends[10];
	}
	if(ends[11]>=biggest1458078783){
	  biggest1458078783=ends[11];
	}
	if(biggest1458078783 == 1){
	  active[8]=1;
	  ends[8]=1;
	  tdone[8]=1;
	}
	//FINXME code
	if(biggest1458078783 == 0){
	  S7353=0;
	  active[8]=0;
	  ends[8]=0;
	  tdone[8]=1;
	}
	break;
      }
    }
  }
  public void thread1140276192(int [] tdone, int [] ends){
    if(tdone[20] != 1){
      S13969=1;
      i_thread_20 = 0;
      PassValue_thread_20 = "r";
      i_thread_20 = 0;
      S13822=0;
      if(i_thread_20 == 9){
	ends[20]=2;
	;
	S13822=1;
	StartLink_7.setPresent();
	currsigs.addElement(StartLink_7);
	System.out.println("Emitted StartLink_7");
	S13839=0;
	active[20]=1;
	ends[20]=1;
	tdone[20]=1;
      }
      else {
	i_thread_20 = i_thread_20 + 1;
	active[20]=1;
	ends[20]=1;
	tdone[20]=1;
      }
    }
  }
  public void thread1228383690(int [] tdone, int [] ends){
    if(tdone[19] != 1){
      S13821=1;
      i_thread_19 = 0;
      d1_thread_19 = 0;
      d2_thread_19 = "";
      UpdateFlags_thread_19 = new boolean[6];
      CorrectPassword_thread_19 = "r";
      ThreshVars_thread_19 = new int[6];
      frths_thread_19 = new Vector(6);
      frths_thread_19.add((float)49);
      frths_thread_19.add((float)48);
      frths_thread_19.add((float)47);
      frths_thread_19.add((float)1);
      frths_thread_19.add((float)2);
      frths_thread_19.add((float)3);
      Frths_7.setPresent();
      currsigs.addElement(Frths_7);
      Frths_7.setValue(frths_thread_19);
      System.out.println("Emitted Frths_7");
      S12800=0;
      active[19]=1;
      ends[19]=1;
      tdone[19]=1;
    }
  }
  public void thread1227998941(int [] tdone, int [] ends){
    if(tdone[18] != 1){
      S12799=1;
      PrevSwitch1_thread_18 = 1;
      PrevSwitch2_thread_18 = 1;
      PrevSwitch3_thread_18 = 1;
      S12781=0;
      active[18]=1;
      ends[18]=1;
      tdone[18]=1;
    }
  }
  public void thread1225690448(int [] tdone, int [] ends){
    if(tdone[17] != 1){
      S12777=1;
      S12698=0;
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }
  public void thread968293434(int [] tdone, int [] ends){
    if(tdone[13] != 1){
      S12695=1;
      CurrentState_thread_13 = "0";
      enter_thread_13 = 1;
      switch1Link_7.setPresent();
      currsigs.addElement(switch1Link_7);
      switch1Link_7.setValue(new Integer(1));
      System.out.println("Emitted switch1Link_7");
      switch2Link_7.setPresent();
      currsigs.addElement(switch2Link_7);
      switch2Link_7.setValue(new Integer(1));
      System.out.println("Emitted switch2Link_7");
      switch3Link_7.setPresent();
      currsigs.addElement(switch3Link_7);
      switch3Link_7.setValue(new Integer(1));
      System.out.println("Emitted switch3Link_7");
      next_12.setClear();
      ep_12.setClear();
      pp_12.setClear();
      Enter_12.setClear();
      next_12.setPresent();
      currsigs.addElement(next_12);
      next_12.setValue("");
      System.out.println("Emitted next_12");
      ic_12.setClear();
      it_12.setClear();
      if(CheckStatLink_7.getprestatus()){
	ic_12.setPresent();
	currsigs.addElement(ic_12);
	System.out.println("Emitted ic_12");
	if(timeout_12.getprestatus()){
	  it_12.setPresent();
	  currsigs.addElement(it_12);
	  System.out.println("Emitted it_12");
	  Enter_12.setPresent();
	  currsigs.addElement(Enter_12);
	  Enter_12.setValue(new Integer(enter_thread_13));
	  System.out.println("Emitted Enter_12");
	  if(CurrentState_thread_13.equals("0") || CurrentState_thread_13.equals("1")){
	    pp_12.setPresent();
	    currsigs.addElement(pp_12);
	    pp_12.setValue(CurrentState_thread_13);
	    System.out.println("Emitted pp_12");
	    S7367=0;
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  else {
	    if(CurrentState_thread_13.equals("2") || CurrentState_thread_13.equals("3")){
	      ep_12.setPresent();
	      currsigs.addElement(ep_12);
	      ep_12.setValue(CurrentState_thread_13);
	      System.out.println("Emitted ep_12");
	      S7367=0;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	    else {
	      S7367=0;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	  }
	}
	else {
	  Enter_12.setPresent();
	  currsigs.addElement(Enter_12);
	  Enter_12.setValue(new Integer(enter_thread_13));
	  System.out.println("Emitted Enter_12");
	  if(CurrentState_thread_13.equals("0") || CurrentState_thread_13.equals("1")){
	    pp_12.setPresent();
	    currsigs.addElement(pp_12);
	    pp_12.setValue(CurrentState_thread_13);
	    System.out.println("Emitted pp_12");
	    S7367=0;
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  else {
	    if(CurrentState_thread_13.equals("2") || CurrentState_thread_13.equals("3")){
	      ep_12.setPresent();
	      currsigs.addElement(ep_12);
	      ep_12.setValue(CurrentState_thread_13);
	      System.out.println("Emitted ep_12");
	      S7367=0;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	    else {
	      S7367=0;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	  }
	}
      }
      else {
	if(timeout_12.getprestatus()){
	  it_12.setPresent();
	  currsigs.addElement(it_12);
	  System.out.println("Emitted it_12");
	  Enter_12.setPresent();
	  currsigs.addElement(Enter_12);
	  Enter_12.setValue(new Integer(enter_thread_13));
	  System.out.println("Emitted Enter_12");
	  if(CurrentState_thread_13.equals("0") || CurrentState_thread_13.equals("1")){
	    pp_12.setPresent();
	    currsigs.addElement(pp_12);
	    pp_12.setValue(CurrentState_thread_13);
	    System.out.println("Emitted pp_12");
	    S7367=0;
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  else {
	    if(CurrentState_thread_13.equals("2") || CurrentState_thread_13.equals("3")){
	      ep_12.setPresent();
	      currsigs.addElement(ep_12);
	      ep_12.setValue(CurrentState_thread_13);
	      System.out.println("Emitted ep_12");
	      S7367=0;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	    else {
	      S7367=0;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	  }
	}
	else {
	  Enter_12.setPresent();
	  currsigs.addElement(Enter_12);
	  Enter_12.setValue(new Integer(enter_thread_13));
	  System.out.println("Emitted Enter_12");
	  if(CurrentState_thread_13.equals("0") || CurrentState_thread_13.equals("1")){
	    pp_12.setPresent();
	    currsigs.addElement(pp_12);
	    pp_12.setValue(CurrentState_thread_13);
	    System.out.println("Emitted pp_12");
	    S7367=0;
	    active[13]=1;
	    ends[13]=1;
	    tdone[13]=1;
	  }
	  else {
	    if(CurrentState_thread_13.equals("2") || CurrentState_thread_13.equals("3")){
	      ep_12.setPresent();
	      currsigs.addElement(ep_12);
	      ep_12.setValue(CurrentState_thread_13);
	      System.out.println("Emitted ep_12");
	      S7367=0;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	    else {
	      S7367=0;
	      active[13]=1;
	      ends[13]=1;
	      tdone[13]=1;
	    }
	  }
	}
      }
    }
  }
  public void thread967908685(int [] tdone, int [] ends){
    if(tdone[12] != 1){
      timeout_12.setClear();
      start2_12.setClear();
      thread968293434(tdone,ends);
      thread1225690448(tdone,ends);
      int biggest1226075197 = 0;
      if(ends[13]>=biggest1226075197){
	biggest1226075197=ends[13];
      }
      if(ends[17]>=biggest1226075197){
	biggest1226075197=ends[17];
      }
      if(biggest1226075197 == 1){
	active[12]=1;
	ends[12]=1;
	tdone[12]=1;
      }
    }
  }
  public void thread965600191(int [] tdone, int [] ends){
    if(tdone[11] != 1){
      S7020=1;
      drt0_thread_11 = 0;
      drt1_thread_11 = 0;
      drt2_thread_11 = 0;
      RocWs_thread_11 = 4;
      j34_thread_11 = 0;
      RocWindow_thread_11 = new float[RocWs_thread_11];
      firstC_thread_11 = 50;
      secondC_thread_11 = 50;
      for(j34_thread_11 = 0; j34_thread_11 < RocWs_thread_11; j34_thread_11 = j34_thread_11 + 1) {
	RocWindow_thread_11[j34_thread_11] = 0;
      }
      temp_thread_11 = 0;
      Roc_thread_11 = 0;
      AveRoc_thread_11 = 0;
      RocSum_thread_11 = 0;
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }
  public void thread966754438(int [] tdone, int [] ends){
    if(tdone[10] != 1){
      S6878=1;
      dft0_thread_10 = 0;
      dft1_thread_10 = 0;
      dft2_thread_10 = 0;
      FreqWs_thread_10 = 4;
      SamplingFreq_thread_10 = 16000;
      FreqWindow_thread_10 = new float[FreqWs_thread_10];
      for(int i34 = 0; i34 < FreqWs_thread_10; i34 = i34 + 1) {
	FreqWindow_thread_10[i34] = 50;
      }
      Freq_thread_10 = 0;
      S6739=0;
      if(meCount_8.getprestatus()){
	ghy_thread_10 = 0;
	ghy_thread_10 = (int)((Float)meCount_8.getpreval()).floatValue();
	S6739=1;
	active[10]=1;
	ends[10]=1;
	tdone[10]=1;
      }
      else {
	active[10]=1;
	ends[10]=1;
	tdone[10]=1;
      }
    }
  }
  public void thread954827222(int [] tdone, int [] ends){
    if(tdone[9] != 1){
      S6736=1;
      S6706=0;
      S6696=0;
      if(SampleCount_in.get_preempted()){
	tutu__2098372999 = 0;
	tutu__2098372999 = SampleCount_in.get_preempted() ? SampleCount_in.refresh() : 0;
	S6696=1;
	active[9]=1;
	ends[9]=1;
	tdone[9]=1;
      }
      else {
	if(SampleCount_in.get_r_s() > SampleCount_in.get_r_r()){
	  tutu__1677385656 = 0;
	  tutu__1677385656 = SampleCount_in.get_r_r();
	  tutu__1677385656++;
	  SampleCount_in.set_r_r(tutu__1677385656);
	  SampleCount_in.get_val();
	  ends[9]=2;
	  ;
	  vall_thread_9 = (Float)SampleCount_in.get_value();
	  meCount_8.setPresent();
	  currsigs.addElement(meCount_8);
	  meCount_8.setValue(new Float(vall_thread_9));
	  System.out.println("Emitted meCount_8");
	  S6706=1;
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
  }
  public void thread944439002(int [] tdone, int [] ends){
    if(tdone[8] != 1){
      AveFreqval_8.setClear();
      AveFreqval_8.setPresent();
      currsigs.addElement(AveFreqval_8);
      AveFreqval_8.setValue(new Float(0));
      System.out.println("Emitted AveFreqval_8");
      meCount_8.setClear();
      thread954827222(tdone,ends);
      thread966754438(tdone,ends);
      thread965600191(tdone,ends);
      int biggest965984940 = 0;
      if(ends[9]>=biggest965984940){
	biggest965984940=ends[9];
      }
      if(ends[10]>=biggest965984940){
	biggest965984940=ends[10];
      }
      if(ends[11]>=biggest965984940){
	biggest965984940=ends[11];
      }
      if(biggest965984940 == 1){
	active[8]=1;
	ends[8]=1;
	tdone[8]=1;
      }
    }
  }
  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
  RUN: while(true){
      switch(S13971){
      case 0 : 
	S13971=0;
	break RUN;
      case 1 : 
	S13971=2;
	FreqStatLink_7.setClear();
	RocStatLink_7.setClear();
	switch1Link_7.setClear();
	switch2Link_7.setClear();
	switch3Link_7.setClear();
	ThreshValueLink_7.setClear();
	ThreshCodeLink_7.setClear();
	CheckStatLink_7.setClear();
	cancelLink_7.setClear();
	doneLink_7.setClear();
	skipLink_7.setClear();
	InputPasswordLink_7.setClear();
	WrongPasswordLink_7.setClear();
	StartLink_7.setClear();
	passwordLink_7.setClear();
	Frths_7.setClear();
	thread944439002(tdone,ends);
	thread967908685(tdone,ends);
	thread1227998941(tdone,ends);
	thread1228383690(tdone,ends);
	thread1140276192(tdone,ends);
	int biggest1140660941 = 0;
	if(ends[8]>=biggest1140660941){
	  biggest1140660941=ends[8];
	}
	if(ends[12]>=biggest1140660941){
	  biggest1140660941=ends[12];
	}
	if(ends[18]>=biggest1140660941){
	  biggest1140660941=ends[18];
	}
	if(ends[19]>=biggest1140660941){
	  biggest1140660941=ends[19];
	}
	if(ends[20]>=biggest1140660941){
	  biggest1140660941=ends[20];
	}
	if(biggest1140660941 == 1){
	  active[7]=1;
	  ends[7]=1;
	  break RUN;
	}
	if(biggest1140660941 == 1){
	  active[7]=1;
	  ends[7]=1;
	  break RUN;
	}
	if(biggest1140660941 == 1){
	  active[7]=1;
	  ends[7]=1;
	  break RUN;
	}
	if(biggest1140660941 == 1){
	  active[7]=1;
	  ends[7]=1;
	  break RUN;
	}
	if(biggest1140660941 == 1){
	  active[7]=1;
	  ends[7]=1;
	  break RUN;
	}
      case 2 : 
	FreqStatLink_7.setClear();
	RocStatLink_7.setClear();
	switch1Link_7.setClear();
	switch2Link_7.setClear();
	switch3Link_7.setClear();
	ThreshValueLink_7.setClear();
	ThreshCodeLink_7.setClear();
	CheckStatLink_7.setClear();
	cancelLink_7.setClear();
	doneLink_7.setClear();
	skipLink_7.setClear();
	InputPasswordLink_7.setClear();
	WrongPasswordLink_7.setClear();
	StartLink_7.setClear();
	passwordLink_7.setClear();
	Frths_7.setClear();
	thread1139506694(tdone,ends);
	thread1458463532(tdone,ends);
	thread221495818(tdone,ends);
	thread221880567(tdone,ends);
	thread173786955(tdone,ends);
	int biggest510442242 = 0;
	if(ends[8]>=biggest510442242){
	  biggest510442242=ends[8];
	}
	if(ends[12]>=biggest510442242){
	  biggest510442242=ends[12];
	}
	if(ends[18]>=biggest510442242){
	  biggest510442242=ends[18];
	}
	if(ends[19]>=biggest510442242){
	  biggest510442242=ends[19];
	}
	if(ends[20]>=biggest510442242){
	  biggest510442242=ends[20];
	}
	if(biggest510442242 == 1){
	  active[7]=1;
	  ends[7]=1;
	  break RUN;
	}
	//FINXME code
	if(biggest510442242 == 0){
	  S13971=0;
	  active[7]=0;
	  ends[7]=0;
	  S13971=0;
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
    FreqStatLink_7 = new Signal();
    RocStatLink_7 = new Signal();
    switch1Link_7 = new Signal();
    switch2Link_7 = new Signal();
    switch3Link_7 = new Signal();
    ThreshValueLink_7 = new Signal();
    ThreshCodeLink_7 = new Signal();
    CheckStatLink_7 = new Signal();
    cancelLink_7 = new Signal();
    doneLink_7 = new Signal();
    skipLink_7 = new Signal();
    InputPasswordLink_7 = new Signal();
    WrongPasswordLink_7 = new Signal();
    StartLink_7 = new Signal();
    passwordLink_7 = new Signal();
    Frths_7 = new Signal();
    AveFreqval_8 = new Signal();
    meCount_8 = new Signal();
    timeout_12 = new Signal();
    start2_12 = new Signal();
    next_12 = new Signal();
    ep_12 = new Signal();
    pp_12 = new Signal();
    Enter_12 = new Signal();
    ic_12 = new Signal();
    it_12 = new Signal();
    // --------------------------------------------------
  }
  int tick=0;
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
	SampleCount_in.update_r_s();
	if(!df){
	  SampleCount_in.gethook();
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
	System.out.println("VAL ControlDominatedDomain,"+(++tick)+","+(eot)+","+fmc+","+mmc+","+foc+","+moc);
	Native.count((0x7|(0x1<<26)));
      }
      FreqStatLink_7.setpreclear();
      RocStatLink_7.setpreclear();
      switch1Link_7.setpreclear();
      switch2Link_7.setpreclear();
      switch3Link_7.setpreclear();
      ThreshValueLink_7.setpreclear();
      ThreshCodeLink_7.setpreclear();
      CheckStatLink_7.setpreclear();
      cancelLink_7.setpreclear();
      doneLink_7.setpreclear();
      skipLink_7.setpreclear();
      InputPasswordLink_7.setpreclear();
      WrongPasswordLink_7.setpreclear();
      StartLink_7.setpreclear();
      passwordLink_7.setpreclear();
      Frths_7.setpreclear();
      AveFreqval_8.setpreclear();
      meCount_8.setpreclear();
      timeout_12.setpreclear();
      start2_12.setpreclear();
      next_12.setpreclear();
      ep_12.setpreclear();
      pp_12.setpreclear();
      Enter_12.setpreclear();
      ic_12.setpreclear();
      it_12.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
	dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
	((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      FreqStatLink_7.setClear();
      RocStatLink_7.setClear();
      switch1Link_7.setClear();
      switch2Link_7.setClear();
      switch3Link_7.setClear();
      ThreshValueLink_7.setClear();
      ThreshCodeLink_7.setClear();
      CheckStatLink_7.setClear();
      cancelLink_7.setClear();
      doneLink_7.setClear();
      skipLink_7.setClear();
      InputPasswordLink_7.setClear();
      WrongPasswordLink_7.setClear();
      StartLink_7.setClear();
      passwordLink_7.setClear();
      Frths_7.setClear();
      AveFreqval_8.setClear();
      meCount_8.setClear();
      timeout_12.setClear();
      start2_12.setClear();
      next_12.setClear();
      ep_12.setClear();
      pp_12.setClear();
      Enter_12.setClear();
      ic_12.setClear();
      it_12.setClear();
      SampleCount_in.sethook();
      if(paused[7]!=0 || suspended[7]!=0 || active[7]!=1);
      else{
	SampleCount_in.gethook();
      }
      if(active[7] == 0){
	System.out.println("Finished CD");
      }
      if(!threaded) break;
    }
  }
}
