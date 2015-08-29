package R2optimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.*;
import UtilA.*;//R2.sysj line: 1, column: 1

public class R2omp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static input_Channel ResetAC2_in;
  private static input_Channel Emergency2_in;
  private static output_Channel IncreaseCount2_o;
  private static output_Channel DecreaseCount2_o;
  private static Signal ExitRequest_1;
  private static Signal EntryRegistered_1;
  private static Signal ExitRegistered_1;
  private static Signal DoorClosed_1;
  private static Signal DoorOpened_1;
  private static Signal InvalidCard_1;
  private static Signal UnlockDoor_1;
  private static Signal LockDoor_1;
  private static Signal TimeOutAC_1;
  private static Signal TriggerAC_1;
  private static Signal EntryRequest_1;
  private static Signal s1_1;
  private static Signal s2_1;
  private static Signal beep_5;
  private static Signal RAC_5;
  private static Signal Preempt_5;
  private static Signal sInc_5;
  private static Signal sDec_5;
  private static Random random_thread_3;//R2.sysj line: 143, column: 2
  private static int p_thread_4;//R2.sysj line: 168, column: 4
  private static boolean h_thread_4;//R2.sysj line: 169, column: 4
  private static Random random_thread_4;//R2.sysj line: 170, column: 4
  private static String id_thread_6;//R2.sysj line: 13, column: 2
  private static Boolean val_thread_11;//R2.sysj line: 88, column: 2
  private static int tutu__21280;//R2.sysj line: 89, column: 2
  private static int tutu__21281;//R2.sysj line: 89, column: 2
  private static Boolean val_thread_12;//R2.sysj line: 101, column: 4
  private static int tutu__21387;//R2.sysj line: 102, column: 4
  private static int tutu__21388;//R2.sysj line: 102, column: 4
  private static int i_thread_6;//R2.sysj line: 31, column: 3
  private static int i_thread_10;//R2.sysj line: 53, column: 7
  private static int tutu__10506;//R2.sysj line: 89, column: 2
  private static int tutu__10507;//R2.sysj line: 89, column: 2
  private static int tutu__10591;//R2.sysj line: 89, column: 2
  private static int tutu__10592;//R2.sysj line: 89, column: 2
  private static int tutu__10613;//R2.sysj line: 102, column: 4
  private static int tutu__10614;//R2.sysj line: 102, column: 4
  private static int tutu__10698;//R2.sysj line: 102, column: 4
  private static int tutu__10699;//R2.sysj line: 102, column: 4
  private static int tutu__10745;//R2.sysj line: 114, column: 6
  private static int tutu__10746;//R2.sysj line: 114, column: 6
  private static int tutu__10721;//R2.sysj line: 114, column: 6
  private static int tutu__10722;//R2.sysj line: 114, column: 6
  private static int tutu__10897;//R2.sysj line: 122, column: 8
  private static int tutu__10898;//R2.sysj line: 122, column: 8
  private static int tutu__10873;//R2.sysj line: 122, column: 8
  private static int tutu__10874;//R2.sysj line: 122, column: 8
  public static void main(String args[]){
    ExitRequest_1 = new Signal();
    EntryRegistered_1 = new Signal();
    ExitRegistered_1 = new Signal();
    DoorClosed_1 = new Signal();
    DoorOpened_1 = new Signal();
    InvalidCard_1 = new Signal();
    UnlockDoor_1 = new Signal();
    LockDoor_1 = new Signal();
    TimeOutAC_1 = new Signal();
    TriggerAC_1 = new Signal();
    EntryRequest_1 = new Signal();
    s1_1 = new Signal();
    s2_1 = new Signal();
    beep_5 = new Signal();
    RAC_5 = new Signal();
    Preempt_5 = new Signal();
    sInc_5 = new Signal();
    sDec_5 = new Signal();
    IncreaseCount2_o = new output_Channel();
    DecreaseCount2_o = new output_Channel();
    ResetAC2_in = new input_Channel();
    Emergency2_in = new input_Channel();
    R2omp t_procs = new R2omp();
    while(true){
      int ret = 0;
      boolean ret_bool = false;
      int data_call_word=Native.rd(Const.DPCR_ADDR);
      if(((data_call_word >> 31)&0x001) > 0){
        int case_number = (data_call_word>>16) & 0x7FFF;
        int clock_domain = data_call_word & 0xF;
        switch(clock_domain ){
          case 0: 
          ret_bool = t_procs.cbackcall0_0(case_number);
          break;
          default:throw new RuntimeException();
        }
        int dprr = ret_bool ? 0x0003 : 0x0002;
        Native.wr(dprr, (Const.RESULT_ADDR));
        }
      }
    }
  private boolean cbackcall0_0(int var){
    boolean retval = false;
    switch(var){
      case 1 : retval = MethodCall1_0();
  break;
  case 2 : retval = MethodCall2_0();
  break;
  case 3 : retval = MethodCall3_0();
  break;
  case 4 : retval = MethodCall4_0();
  break;
  case 5 : retval = MethodCall5_0();
  break;
  case 6 : retval = MethodCall6_0();
  break;
  case 7 : retval = MethodCall7_0();
  break;
  case 8 : retval = MethodCall8_0();
  break;
  case 9 : retval = MethodCall9_0();
  break;
  case 10 : retval = MethodCall10_0();
  break;
  case 11 : retval = MethodCall11_0();
  break;
  case 12 : retval = MethodCall12_0();
  break;
  case 13 : retval = MethodCall13_0();
  break;
  case 14 : retval = MethodCall14_0();
  break;
  case 15 : retval = MethodCall15_0();
  break;
  case 16 : retval = MethodCall16_0();
  break;
  case 17 : retval = MethodCall17_0();
  break;
  case 18 : retval = MethodCall18_0();
  break;
  case 19 : retval = MethodCall19_0();
  break;
  case 20 : retval = MethodCall20_0();
  break;
  case 21 : retval = MethodCall21_0();
  break;
  case 22 : retval = MethodCall22_0();
  break;
  case 23 : retval = MethodCall23_0();
  break;
  case 24 : retval = MethodCall24_0();
  break;
  case 25 : retval = MethodCall25_0();
  break;
  case 26 : retval = MethodCall26_0();
  break;
  case 27 : retval = MethodCall27_0();
  break;
  case 28 : retval = MethodCall28_0();
  break;
  case 29 : retval = MethodCall29_0();
  break;
  case 30 : retval = MethodCall30_0();
  break;
  case 31 : retval = MethodCall31_0();
  break;
  case 32 : retval = MethodCall32_0();
  break;
  case 33 : retval = MethodCall33_0();
  break;
  case 34 : retval = MethodCall34_0();
  break;
  case 35 : retval = MethodCall35_0();
  break;
  case 36 : retval = MethodCall36_0();
  break;
  case 37 : retval = MethodCall37_0();
  break;
  case 38 : retval = MethodCall38_0();
  break;
  case 39 : retval = MethodCall39_0();
  break;
  case 40 : retval = MethodCall40_0();
  break;
  case 41 : retval = MethodCall41_0();
  break;
  case 42 : retval = MethodCall42_0();
  break;
  case 43 : retval = MethodCall43_0();
  break;
  case 44 : retval = MethodCall44_0();
  break;
  case 45 : retval = MethodCall45_0();
  break;
  case 46 : retval = MethodCall46_0();
  break;
  case 47 : retval = MethodCall47_0();
  break;
  case 48 : retval = MethodCall48_0();
  break;
  case 49 : retval = MethodCall49_0();
  break;
  case 50 : retval = MethodCall50_0();
  break;
  case 51 : retval = MethodCall51_0();
  break;
  case 52 : retval = MethodCall52_0();
  break;
  case 53 : retval = MethodCall53_0();
  break;
  case 54 : retval = MethodCall54_0();
  break;
  case 55 : retval = MethodCall55_0();
  break;
  case 56 : retval = MethodCall56_0();
  break;
  case 57 : retval = MethodCall57_0();
  break;
  case 58 : retval = MethodCall58_0();
  break;
  case 59 : retval = MethodCall59_0();
  break;
  case 60 : retval = MethodCall60_0();
  break;
  case 61 : retval = MethodCall61_0();
  break;
  case 62 : retval = MethodCall62_0();
  break;
  case 63 : retval = MethodCall63_0();
  break;
  case 64 : retval = MethodCall64_0();
  break;
  case 65 : retval = MethodCall65_0();
  break;
  case 66 : retval = MethodCall66_0();
  break;
  case 67 : retval = MethodCall67_0();
  break;
  case 68 : retval = MethodCall68_0();
  break;
  case 69 : retval = MethodCall69_0();
  break;
  case 70 : retval = MethodCall70_0();
  break;
  case 71 : retval = MethodCall71_0();
  break;
  case 72 : retval = MethodCall72_0();
  break;
  case 73 : retval = MethodCall73_0();
  break;
  case 74 : retval = MethodCall74_0();
  break;
  case 75 : retval = MethodCall75_0();
  break;
  case 76 : retval = MethodCall76_0();
  break;
  case 77 : retval = MethodCall77_0();
  break;
  case 78 : retval = MethodCall78_0();
  break;
  case 79 : retval = MethodCall79_0();
  break;
  case 80 : retval = MethodCall80_0();
  break;
  case 81 : retval = MethodCall81_0();
  break;
  case 0: 
      for(int qw=0;qw<currsigs0.size();++qw){
              int rand496563282 = ((Signal)currsigs0.elementAt(qw)).getStatus() ? ((Signal)currsigs0.elementAt(qw)).setprepresent() : ((Signal)currsigs0.elementAt(qw)).setpreclear();
			((Signal)currsigs0.elementAt(qw)).setpreval(((Signal)currsigs0.elementAt(qw)).getValue());
			}
      currsigs0.removeAllElements();
            ResetAC2_in.update_r_s();
      Emergency2_in.update_r_s();
      IncreaseCount2_o.update_w_r();
      DecreaseCount2_o.update_w_r();
      break;
      default : retval = cbackcall0_1(var);
break;
}
    return retval;
}
  private boolean cbackcall0_1(int var){
    boolean retval = false;
    switch(var){
      case 82 : retval = MethodCall82_0();
  break;
  case 83 : retval = MethodCall83_0();
  break;
  case 84 : retval = MethodCall84_0();
  break;
  case 85 : retval = MethodCall85_0();
  break;
  case 86 : retval = MethodCall86_0();
  break;
  case 87 : retval = MethodCall87_0();
  break;
  case 88 : retval = MethodCall88_0();
  break;
  case 89 : retval = MethodCall89_0();
  break;
  case 90 : retval = MethodCall90_0();
  break;
  case 91 : retval = MethodCall91_0();
  break;
  case 92 : retval = MethodCall92_0();
  break;
  case 93 : retval = MethodCall93_0();
  break;
  case 94 : retval = MethodCall94_0();
  break;
  case 95 : retval = MethodCall95_0();
  break;
  case 96 : retval = MethodCall96_0();
  break;
  case 97 : retval = MethodCall97_0();
  break;
  case 98 : retval = MethodCall98_0();
  break;
  case 99 : retval = MethodCall99_0();
  break;
  case 100 : retval = MethodCall100_0();
  break;
  case 101 : retval = MethodCall101_0();
  break;
  case 102 : retval = MethodCall102_0();
  break;
  case 103 : retval = MethodCall103_0();
  break;
  case 104 : retval = MethodCall104_0();
  break;
  case 105 : retval = MethodCall105_0();
  break;
  case 106 : retval = MethodCall106_0();
  break;
  case 107 : retval = MethodCall107_0();
  break;
  case 108 : retval = MethodCall108_0();
  break;
  case 109 : retval = MethodCall109_0();
  break;
  case 110 : retval = MethodCall110_0();
  break;
  case 111 : retval = MethodCall111_0();
  break;
  case 112 : retval = MethodCall112_0();
  break;
  case 113 : retval = MethodCall113_0();
  break;
  case 114 : retval = MethodCall114_0();
  break;
  case 115 : retval = MethodCall115_0();
  break;
  case 116 : retval = MethodCall116_0();
  break;
  case 117 : retval = MethodCall117_0();
  break;
  case 118 : retval = MethodCall118_0();
  break;
  case 119 : retval = MethodCall119_0();
  break;
  case 120 : retval = MethodCall120_0();
  break;
  case 121 : retval = MethodCall121_0();
  break;
  case 122 : retval = MethodCall122_0();
  break;
  case 123 : retval = MethodCall123_0();
  break;
  case 124 : retval = MethodCall124_0();
  break;
  case 125 : retval = MethodCall125_0();
  break;
  case 126 : retval = MethodCall126_0();
  break;
  case 127 : retval = MethodCall127_0();
  break;
  case 128 : retval = MethodCall128_0();
  break;
  case 129 : retval = MethodCall129_0();
  break;
  case 130 : retval = MethodCall130_0();
  break;
  case 131 : retval = MethodCall131_0();
  break;
  case 132 : retval = MethodCall132_0();
  break;
  case 133 : retval = MethodCall133_0();
  break;
  default: throw new RuntimeException("CaseNum: "+var+" not found");
      }
    return retval;
}
  public boolean MethodCall1_0(){
  random_thread_3 = new Random(234123123);//R2.sysj line: 143, column: 2
  return false;
}
  public boolean MethodCall2_0(){
  return random_thread_3.nextInt(3) > 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall3_0(){
  currsigs0.addElement(EntryRequest_1);
  EntryRequest_1.setValue("whoisthis");
return false;
}
  public boolean MethodCall4_0(){
  currsigs0.addElement(EntryRequest_1);
  EntryRequest_1.setValue("paul");
return false;
}
  public boolean MethodCall5_0(){
  p_thread_4 = 1;//R2.sysj line: 168, column: 4
  h_thread_4 = true;//R2.sysj line: 169, column: 4
  random_thread_4 = new Random(22323123);//R2.sysj line: 170, column: 4
  return false;
}
  public boolean MethodCall6_0(){
  Debug.setEnabled();//R2.sysj line: 9, column: 3
  return false;
}
  public boolean MethodCall7_0(){
  id_thread_6 = null;//R2.sysj line: 13, column: 2
  return false;
}
  public boolean MethodCall8_0(){
  val_thread_11 = null;//R2.sysj line: 88, column: 2
  return false;
}
  public boolean MethodCall9_0(){
  return Emergency2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall10_0(){
  return Emergency2_in.get_r_s() > Emergency2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall11_0(){
  tutu__21280 = 0;//R2.sysj line: 89, column: 2
  tutu__21280 = Emergency2_in.get_r_r();//R2.sysj line: 89, column: 2
  tutu__21280++;//R2.sysj line: 89, column: 2
  Emergency2_in.set_r_r(tutu__21280);//R2.sysj line: 89, column: 2
  Emergency2_in.get_val();//R2.sysj line: 89, column: 2
  return false;
}
  public boolean MethodCall12_0(){
  ;//R2.sysj line: 89, column: 2
  val_thread_11 = (Boolean)Emergency2_in.get_value();
return false;
}
  public boolean MethodCall13_0(){
  return val_thread_11;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall14_0(){
  tutu__21281 = 0;//R2.sysj line: 89, column: 2
  tutu__21281 = Emergency2_in.get_preempted() ? Emergency2_in.refresh() : 0;//R2.sysj line: 89, column: 2
  return false;
}
  public boolean MethodCall15_0(){
  val_thread_12 = null;//R2.sysj line: 101, column: 4
  return false;
}
  public boolean MethodCall16_0(){
  return ResetAC2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall17_0(){
  return ResetAC2_in.get_r_s() > ResetAC2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall18_0(){
  tutu__21387 = 0;//R2.sysj line: 102, column: 4
  tutu__21387 = ResetAC2_in.get_r_r();//R2.sysj line: 102, column: 4
  tutu__21387++;//R2.sysj line: 102, column: 4
  ResetAC2_in.set_r_r(tutu__21387);//R2.sysj line: 102, column: 4
  ResetAC2_in.get_val();//R2.sysj line: 102, column: 4
  return false;
}
  public boolean MethodCall19_0(){
  ;//R2.sysj line: 102, column: 4
  val_thread_12 = (Boolean)ResetAC2_in.get_value();
return false;
}
  public boolean MethodCall20_0(){
  return val_thread_12;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall21_0(){
  tutu__21388 = 0;//R2.sysj line: 102, column: 4
  tutu__21388 = ResetAC2_in.get_preempted() ? ResetAC2_in.refresh() : 0;//R2.sysj line: 102, column: 4
  return false;
}
  public boolean MethodCall22_0(){
  return random_thread_3.nextInt(2) == 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall23_0(){
  return random_thread_3.nextInt(3) > 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall24_0(){
  currsigs0.addElement(EntryRequest_1);
  EntryRequest_1.setValue("whoisthis");
return false;
}
  public boolean MethodCall25_0(){
  currsigs0.addElement(EntryRequest_1);
  EntryRequest_1.setValue("paul");
return false;
}
  public boolean MethodCall26_0(){
  return random_thread_4.nextInt(2) == 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall27_0(){
  return random_thread_4.nextInt(2) == 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall28_0(){
  if(p_thread_4 > 20) {//R2.sysj line: 184, column: 3
    h_thread_4 = false;//R2.sysj line: 185, column: 5
  }
  else {//R2.sysj line: 184, column: 3
    if(p_thread_4 == 0) {//R2.sysj line: 186, column: 8
      h_thread_4 = true;//R2.sysj line: 187, column: 5
    }
  }
  return false;
}
  public boolean MethodCall29_0(){
  return h_thread_4;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall30_0(){
  p_thread_4 = p_thread_4 + 1;//R2.sysj line: 189, column: 5
  return false;
}
  public boolean MethodCall31_0(){
  p_thread_4 = p_thread_4 - 1;//R2.sysj line: 193, column: 5
  return false;
}
  public boolean MethodCall32_0(){
  id_thread_6 = ((String)EntryRequest_1.getpreval()).trim();//R2.sysj line: 20, column: 6
  return false;
}
  public boolean MethodCall33_0(){
  return Entries.isValidRequest(id_thread_6);//Unknown file line: 0, column: 0
  }
  public boolean MethodCall34_0(){
  i_thread_6 = 0;//R2.sysj line: 31, column: 3
  return false;
}
  public boolean MethodCall35_0(){
  return i_thread_6 == 4;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall36_0(){
  ;//R2.sysj line: 32, column: 3
  return false;
}
  public boolean MethodCall37_0(){
  ;//R2.sysj line: 28, column: 6
  return false;
}
  public boolean MethodCall38_0(){
  i_thread_6 = i_thread_6 + 1;//R2.sysj line: 35, column: 7
  return false;
}
  public boolean MethodCall39_0(){
  id_thread_6 = ((String)ExitRequest_1.getpreval()).trim();//R2.sysj line: 23, column: 6
  return false;
}
  public boolean MethodCall40_0(){
  return Entries.isValidRequest(id_thread_6);//Unknown file line: 0, column: 0
  }
  public boolean MethodCall41_0(){
  i_thread_6 = 0;//R2.sysj line: 31, column: 3
  return false;
}
  public boolean MethodCall42_0(){
  return i_thread_6 == 4;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall43_0(){
  ;//R2.sysj line: 32, column: 3
  return false;
}
  public boolean MethodCall44_0(){
  ;//R2.sysj line: 28, column: 6
  return false;
}
  public boolean MethodCall45_0(){
  i_thread_6 = i_thread_6 + 1;//R2.sysj line: 35, column: 7
  return false;
}
  public boolean MethodCall46_0(){
  return i_thread_6 == 4;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall47_0(){
  ;//R2.sysj line: 32, column: 3
  return false;
}
  public boolean MethodCall48_0(){
  ;//R2.sysj line: 28, column: 6
  return false;
}
  public boolean MethodCall49_0(){
  i_thread_6 = i_thread_6 + 1;//R2.sysj line: 35, column: 7
  return false;
}
  public boolean MethodCall50_0(){
  i_thread_10 = 0;//R2.sysj line: 53, column: 7
  return false;
}
  public boolean MethodCall51_0(){
  return i_thread_10 == 4;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall52_0(){
  ;//R2.sysj line: 54, column: 7
  return false;
}
  public boolean MethodCall53_0(){
  i_thread_10 = i_thread_10 + 1;//R2.sysj line: 57, column: 4
  return false;
}
  public boolean MethodCall54_0(){
  return i_thread_10 == 4;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall55_0(){
  ;//R2.sysj line: 54, column: 7
  return false;
}
  public boolean MethodCall56_0(){
  i_thread_10 = i_thread_10 + 1;//R2.sysj line: 57, column: 4
  return false;
}
  public boolean MethodCall57_0(){
  id_thread_6 = null;//R2.sysj line: 13, column: 2
  return false;
}
  public boolean MethodCall58_0(){
  return Emergency2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall59_0(){
  return Emergency2_in.get_r_s() > Emergency2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall60_0(){
  tutu__10506 = 0;//R2.sysj line: 89, column: 2
  tutu__10506 = Emergency2_in.get_r_r();//R2.sysj line: 89, column: 2
  tutu__10506++;//R2.sysj line: 89, column: 2
  Emergency2_in.set_r_r(tutu__10506);//R2.sysj line: 89, column: 2
  Emergency2_in.get_val();//R2.sysj line: 89, column: 2
  return false;
}
  public boolean MethodCall61_0(){
  ;//R2.sysj line: 89, column: 2
  val_thread_11 = (Boolean)Emergency2_in.get_value();
return false;
}
  public boolean MethodCall62_0(){
  return val_thread_11;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall63_0(){
  tutu__10507 = 0;//R2.sysj line: 89, column: 2
  tutu__10507 = Emergency2_in.get_preempted() ? Emergency2_in.refresh() : 0;//R2.sysj line: 89, column: 2
  return false;
}
  public boolean MethodCall64_0(){
  return Emergency2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall65_0(){
  return Emergency2_in.get_r_s() > Emergency2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall66_0(){
  tutu__10506 = 0;//R2.sysj line: 89, column: 2
  tutu__10506 = Emergency2_in.get_r_r();//R2.sysj line: 89, column: 2
  tutu__10506++;//R2.sysj line: 89, column: 2
  Emergency2_in.set_r_r(tutu__10506);//R2.sysj line: 89, column: 2
  Emergency2_in.get_val();//R2.sysj line: 89, column: 2
  return false;
}
  public boolean MethodCall67_0(){
  ;//R2.sysj line: 89, column: 2
  val_thread_11 = (Boolean)Emergency2_in.get_value();
return false;
}
  public boolean MethodCall68_0(){
  return val_thread_11;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall69_0(){
  tutu__10507 = 0;//R2.sysj line: 89, column: 2
  tutu__10507 = Emergency2_in.get_preempted() ? Emergency2_in.refresh() : 0;//R2.sysj line: 89, column: 2
  return false;
}
  public boolean MethodCall70_0(){
  val_thread_11 = null;//R2.sysj line: 88, column: 2
  return false;
}
  public boolean MethodCall71_0(){
  return Emergency2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall72_0(){
  return Emergency2_in.get_r_s() > Emergency2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall73_0(){
  tutu__10591 = 0;//R2.sysj line: 89, column: 2
  tutu__10591 = Emergency2_in.get_r_r();//R2.sysj line: 89, column: 2
  tutu__10591++;//R2.sysj line: 89, column: 2
  Emergency2_in.set_r_r(tutu__10591);//R2.sysj line: 89, column: 2
  Emergency2_in.get_val();//R2.sysj line: 89, column: 2
  return false;
}
  public boolean MethodCall74_0(){
  ;//R2.sysj line: 89, column: 2
  val_thread_11 = (Boolean)Emergency2_in.get_value();
return false;
}
  public boolean MethodCall75_0(){
  return val_thread_11;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall76_0(){
  tutu__10592 = 0;//R2.sysj line: 89, column: 2
  tutu__10592 = Emergency2_in.get_preempted() ? Emergency2_in.refresh() : 0;//R2.sysj line: 89, column: 2
  return false;
}
  public boolean MethodCall77_0(){
  return ResetAC2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall78_0(){
  return ResetAC2_in.get_r_s() > ResetAC2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall79_0(){
  tutu__10613 = 0;//R2.sysj line: 102, column: 4
  tutu__10613 = ResetAC2_in.get_r_r();//R2.sysj line: 102, column: 4
  tutu__10613++;//R2.sysj line: 102, column: 4
  ResetAC2_in.set_r_r(tutu__10613);//R2.sysj line: 102, column: 4
  ResetAC2_in.get_val();//R2.sysj line: 102, column: 4
  return false;
}
  public boolean MethodCall80_0(){
  ;//R2.sysj line: 102, column: 4
  val_thread_12 = (Boolean)ResetAC2_in.get_value();
return false;
}
  public boolean MethodCall81_0(){
  return val_thread_12;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall82_0(){
  tutu__10614 = 0;//R2.sysj line: 102, column: 4
  tutu__10614 = ResetAC2_in.get_preempted() ? ResetAC2_in.refresh() : 0;//R2.sysj line: 102, column: 4
  return false;
}
  public boolean MethodCall83_0(){
  return ResetAC2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall84_0(){
  return ResetAC2_in.get_r_s() > ResetAC2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall85_0(){
  tutu__10613 = 0;//R2.sysj line: 102, column: 4
  tutu__10613 = ResetAC2_in.get_r_r();//R2.sysj line: 102, column: 4
  tutu__10613++;//R2.sysj line: 102, column: 4
  ResetAC2_in.set_r_r(tutu__10613);//R2.sysj line: 102, column: 4
  ResetAC2_in.get_val();//R2.sysj line: 102, column: 4
  return false;
}
  public boolean MethodCall86_0(){
  ;//R2.sysj line: 102, column: 4
  val_thread_12 = (Boolean)ResetAC2_in.get_value();
return false;
}
  public boolean MethodCall87_0(){
  return val_thread_12;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall88_0(){
  tutu__10614 = 0;//R2.sysj line: 102, column: 4
  tutu__10614 = ResetAC2_in.get_preempted() ? ResetAC2_in.refresh() : 0;//R2.sysj line: 102, column: 4
  return false;
}
  public boolean MethodCall89_0(){
  val_thread_12 = null;//R2.sysj line: 101, column: 4
  return false;
}
  public boolean MethodCall90_0(){
  return ResetAC2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall91_0(){
  return ResetAC2_in.get_r_s() > ResetAC2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall92_0(){
  tutu__10698 = 0;//R2.sysj line: 102, column: 4
  tutu__10698 = ResetAC2_in.get_r_r();//R2.sysj line: 102, column: 4
  tutu__10698++;//R2.sysj line: 102, column: 4
  ResetAC2_in.set_r_r(tutu__10698);//R2.sysj line: 102, column: 4
  ResetAC2_in.get_val();//R2.sysj line: 102, column: 4
  return false;
}
  public boolean MethodCall93_0(){
  ;//R2.sysj line: 102, column: 4
  val_thread_12 = (Boolean)ResetAC2_in.get_value();
return false;
}
  public boolean MethodCall94_0(){
  return val_thread_12;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall95_0(){
  tutu__10699 = 0;//R2.sysj line: 102, column: 4
  tutu__10699 = ResetAC2_in.get_preempted() ? ResetAC2_in.refresh() : 0;//R2.sysj line: 102, column: 4
  return false;
}
  public boolean MethodCall96_0(){
  return IncreaseCount2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall97_0(){
  return IncreaseCount2_o.get_w_s() == IncreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall98_0(){
  tutu__10745 = 0;//R2.sysj line: 114, column: 6
  tutu__10745 = IncreaseCount2_o.get_w_s();//R2.sysj line: 114, column: 6
  tutu__10745++;//R2.sysj line: 114, column: 6
  IncreaseCount2_o.set_w_s(tutu__10745);//R2.sysj line: 114, column: 6
  IncreaseCount2_o.set_value(true);
return false;
}
  public boolean MethodCall99_0(){
  return IncreaseCount2_o.get_w_s() == IncreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall100_0(){
  ;//R2.sysj line: 114, column: 6
  return false;
}
  public boolean MethodCall101_0(){
  tutu__10746 = 0;//R2.sysj line: 114, column: 6
  tutu__10746 = IncreaseCount2_o.get_preempted() ? IncreaseCount2_o.refresh() : 0;//R2.sysj line: 114, column: 6
  return false;
}
  public boolean MethodCall102_0(){
  return IncreaseCount2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall103_0(){
  return IncreaseCount2_o.get_w_s() == IncreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall104_0(){
  tutu__10721 = 0;//R2.sysj line: 114, column: 6
  tutu__10721 = IncreaseCount2_o.get_w_s();//R2.sysj line: 114, column: 6
  tutu__10721++;//R2.sysj line: 114, column: 6
  IncreaseCount2_o.set_w_s(tutu__10721);//R2.sysj line: 114, column: 6
  IncreaseCount2_o.set_value(true);
return false;
}
  public boolean MethodCall105_0(){
  return IncreaseCount2_o.get_w_s() == IncreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall106_0(){
  ;//R2.sysj line: 114, column: 6
  return false;
}
  public boolean MethodCall107_0(){
  return IncreaseCount2_o.get_w_s() == IncreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall108_0(){
  tutu__10722 = 0;//R2.sysj line: 114, column: 6
  tutu__10722 = IncreaseCount2_o.get_preempted() ? IncreaseCount2_o.refresh() : 0;//R2.sysj line: 114, column: 6
  return false;
}
  public boolean MethodCall109_0(){
  return IncreaseCount2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall110_0(){
  return IncreaseCount2_o.get_w_s() == IncreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall111_0(){
  tutu__10721 = 0;//R2.sysj line: 114, column: 6
  tutu__10721 = IncreaseCount2_o.get_w_s();//R2.sysj line: 114, column: 6
  tutu__10721++;//R2.sysj line: 114, column: 6
  IncreaseCount2_o.set_w_s(tutu__10721);//R2.sysj line: 114, column: 6
  IncreaseCount2_o.set_value(true);
return false;
}
  public boolean MethodCall112_0(){
  return IncreaseCount2_o.get_w_s() == IncreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall113_0(){
  ;//R2.sysj line: 114, column: 6
  return false;
}
  public boolean MethodCall114_0(){
  tutu__10722 = 0;//R2.sysj line: 114, column: 6
  tutu__10722 = IncreaseCount2_o.get_preempted() ? IncreaseCount2_o.refresh() : 0;//R2.sysj line: 114, column: 6
  return false;
}
  public boolean MethodCall115_0(){
  return DecreaseCount2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall116_0(){
  return DecreaseCount2_o.get_w_s() == DecreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall117_0(){
  tutu__10897 = 0;//R2.sysj line: 122, column: 8
  tutu__10897 = DecreaseCount2_o.get_w_s();//R2.sysj line: 122, column: 8
  tutu__10897++;//R2.sysj line: 122, column: 8
  DecreaseCount2_o.set_w_s(tutu__10897);//R2.sysj line: 122, column: 8
  DecreaseCount2_o.set_value(true);
return false;
}
  public boolean MethodCall118_0(){
  return DecreaseCount2_o.get_w_s() == DecreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall119_0(){
  ;//R2.sysj line: 122, column: 8
  return false;
}
  public boolean MethodCall120_0(){
  tutu__10898 = 0;//R2.sysj line: 122, column: 8
  tutu__10898 = DecreaseCount2_o.get_preempted() ? DecreaseCount2_o.refresh() : 0;//R2.sysj line: 122, column: 8
  return false;
}
  public boolean MethodCall121_0(){
  return DecreaseCount2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall122_0(){
  return DecreaseCount2_o.get_w_s() == DecreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall123_0(){
  tutu__10873 = 0;//R2.sysj line: 122, column: 8
  tutu__10873 = DecreaseCount2_o.get_w_s();//R2.sysj line: 122, column: 8
  tutu__10873++;//R2.sysj line: 122, column: 8
  DecreaseCount2_o.set_w_s(tutu__10873);//R2.sysj line: 122, column: 8
  DecreaseCount2_o.set_value(true);
return false;
}
  public boolean MethodCall124_0(){
  return DecreaseCount2_o.get_w_s() == DecreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall125_0(){
  ;//R2.sysj line: 122, column: 8
  return false;
}
  public boolean MethodCall126_0(){
  return DecreaseCount2_o.get_w_s() == DecreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall127_0(){
  tutu__10874 = 0;//R2.sysj line: 122, column: 8
  tutu__10874 = DecreaseCount2_o.get_preempted() ? DecreaseCount2_o.refresh() : 0;//R2.sysj line: 122, column: 8
  return false;
}
  public boolean MethodCall128_0(){
  return DecreaseCount2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall129_0(){
  return DecreaseCount2_o.get_w_s() == DecreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall130_0(){
  tutu__10873 = 0;//R2.sysj line: 122, column: 8
  tutu__10873 = DecreaseCount2_o.get_w_s();//R2.sysj line: 122, column: 8
  tutu__10873++;//R2.sysj line: 122, column: 8
  DecreaseCount2_o.set_w_s(tutu__10873);//R2.sysj line: 122, column: 8
  DecreaseCount2_o.set_value(true);
return false;
}
  public boolean MethodCall131_0(){
  return DecreaseCount2_o.get_w_s() == DecreaseCount2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall132_0(){
  ;//R2.sysj line: 122, column: 8
  return false;
}
  public boolean MethodCall133_0(){
  tutu__10874 = 0;//R2.sysj line: 122, column: 8
  tutu__10874 = DecreaseCount2_o.get_preempted() ? DecreaseCount2_o.refresh() : 0;//R2.sysj line: 122, column: 8
  return false;
}
  }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
