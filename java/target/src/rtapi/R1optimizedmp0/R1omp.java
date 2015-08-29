package R1optimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.*;
import UtilA.*;//R1.sysj line: 1, column: 1

public class R1omp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static input_Channel ResetRC2_in;
  private static input_Channel IncreaseCount2_in;
  private static input_Channel DecreaseCount2_in;
  private static output_Channel Emergency2_o;
  private static output_Channel ActivateAlarm2_o;
  private static Signal Presence_1;
  private static Signal TimeOutRC_1;
  private static Signal TriggerRC_1;
  private static Signal LightLevel_1;
  private static Signal SetIntensity_1;
  private static Signal armed_4;
  private static Signal disarmed_4;
  private static Signal INC_4;
  private static Signal DEC_4;
  private static Signal RRC_4;
  private static Signal tempsigyo_4;
  private static Signal tempsigyo2_4;
  private static Random random_thread_2;//R1.sysj line: 157, column: 7
  private static Integer SetValue_thread_6;//R1.sysj line: 10, column: 7
  private static Integer CurrentLightLevel_thread_6;//R1.sysj line: 11, column: 7
  private static int count_thread_9;//R1.sysj line: 68, column: 6
  private static Boolean val_thread_11;//R1.sysj line: 110, column: 4
  private static int tutu__1423;//R1.sysj line: 111, column: 4
  private static int tutu__1424;//R1.sysj line: 111, column: 4
  private static Boolean val_thread_12;//R1.sysj line: 122, column: 6
  private static int tutu__1530;//R1.sysj line: 123, column: 6
  private static int tutu__1531;//R1.sysj line: 123, column: 6
  private static Boolean val_thread_13;//R1.sysj line: 134, column: 8
  private static int tutu__1637;//R1.sysj line: 135, column: 8
  private static int tutu__1638;//R1.sysj line: 135, column: 8
  private static int i_thread_6;//R1.sysj line: 21, column: 3
  private static int tutu__815;//R1.sysj line: 53, column: 4
  private static int tutu__816;//R1.sysj line: 53, column: 4
  private static int tutu__791;//R1.sysj line: 53, column: 4
  private static int tutu__792;//R1.sysj line: 53, column: 4
  private static int tutu__864;//R1.sysj line: 55, column: 4
  private static int tutu__865;//R1.sysj line: 55, column: 4
  private static int tutu__840;//R1.sysj line: 55, column: 4
  private static int tutu__841;//R1.sysj line: 55, column: 4
  private static int tutu__1408;//R1.sysj line: 111, column: 4
  private static int tutu__1409;//R1.sysj line: 111, column: 4
  private static int tutu__1493;//R1.sysj line: 111, column: 4
  private static int tutu__1494;//R1.sysj line: 111, column: 4
  private static int tutu__1515;//R1.sysj line: 123, column: 6
  private static int tutu__1516;//R1.sysj line: 123, column: 6
  private static int tutu__1600;//R1.sysj line: 123, column: 6
  private static int tutu__1601;//R1.sysj line: 123, column: 6
  private static int tutu__1622;//R1.sysj line: 135, column: 8
  private static int tutu__1623;//R1.sysj line: 135, column: 8
  private static int tutu__1707;//R1.sysj line: 135, column: 8
  private static int tutu__1708;//R1.sysj line: 135, column: 8
  public static void main(String args[]){
    Presence_1 = new Signal();
    TimeOutRC_1 = new Signal();
    TriggerRC_1 = new Signal();
    LightLevel_1 = new Signal();
    SetIntensity_1 = new Signal();
    armed_4 = new Signal();
    disarmed_4 = new Signal();
    INC_4 = new Signal();
    DEC_4 = new Signal();
    RRC_4 = new Signal();
    tempsigyo_4 = new Signal();
    tempsigyo2_4 = new Signal();
    Emergency2_o = new output_Channel();
    ActivateAlarm2_o = new output_Channel();
    ResetRC2_in = new input_Channel();
    IncreaseCount2_in = new input_Channel();
    DecreaseCount2_in = new input_Channel();
    R1omp t_procs = new R1omp();
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
            ResetRC2_in.update_r_s();
      IncreaseCount2_in.update_r_s();
      DecreaseCount2_in.update_r_s();
      Emergency2_o.update_w_r();
      ActivateAlarm2_o.update_w_r();
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
  case 134 : retval = MethodCall134_0();
  break;
  case 135 : retval = MethodCall135_0();
  break;
  case 136 : retval = MethodCall136_0();
  break;
  case 137 : retval = MethodCall137_0();
  break;
  case 138 : retval = MethodCall138_0();
  break;
  case 139 : retval = MethodCall139_0();
  break;
  default: throw new RuntimeException("CaseNum: "+var+" not found");
      }
    return retval;
}
  public boolean MethodCall1_0(){
  random_thread_2 = new Random(320543853);//R1.sysj line: 157, column: 7
  return false;
}
  public boolean MethodCall2_0(){
  currsigs0.addElement(LightLevel_1);
  LightLevel_1.setValue(2);
return false;
}
  public boolean MethodCall3_0(){
  SetValue_thread_6 = 10;//R1.sysj line: 10, column: 7
  CurrentLightLevel_thread_6 = 0;//R1.sysj line: 11, column: 7
  return false;
}
  public boolean MethodCall4_0(){
  count_thread_9 = 0;//R1.sysj line: 68, column: 6
  return false;
}
  public boolean MethodCall5_0(){
  return count_thread_9 != 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall6_0(){
  val_thread_11 = null;//R1.sysj line: 110, column: 4
  return false;
}
  public boolean MethodCall7_0(){
  return IncreaseCount2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall8_0(){
  return IncreaseCount2_in.get_r_s() > IncreaseCount2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall9_0(){
  tutu__1423 = 0;//R1.sysj line: 111, column: 4
  tutu__1423 = IncreaseCount2_in.get_r_r();//R1.sysj line: 111, column: 4
  tutu__1423++;//R1.sysj line: 111, column: 4
  IncreaseCount2_in.set_r_r(tutu__1423);//R1.sysj line: 111, column: 4
  IncreaseCount2_in.get_val();//R1.sysj line: 111, column: 4
  return false;
}
  public boolean MethodCall10_0(){
  ;//R1.sysj line: 111, column: 4
  val_thread_11 = (Boolean)IncreaseCount2_in.get_value();
return false;
}
  public boolean MethodCall11_0(){
  return val_thread_11;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall12_0(){
  tutu__1424 = 0;//R1.sysj line: 111, column: 4
  tutu__1424 = IncreaseCount2_in.get_preempted() ? IncreaseCount2_in.refresh() : 0;//R1.sysj line: 111, column: 4
  return false;
}
  public boolean MethodCall13_0(){
  val_thread_12 = null;//R1.sysj line: 122, column: 6
  return false;
}
  public boolean MethodCall14_0(){
  return DecreaseCount2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall15_0(){
  return DecreaseCount2_in.get_r_s() > DecreaseCount2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall16_0(){
  tutu__1530 = 0;//R1.sysj line: 123, column: 6
  tutu__1530 = DecreaseCount2_in.get_r_r();//R1.sysj line: 123, column: 6
  tutu__1530++;//R1.sysj line: 123, column: 6
  DecreaseCount2_in.set_r_r(tutu__1530);//R1.sysj line: 123, column: 6
  DecreaseCount2_in.get_val();//R1.sysj line: 123, column: 6
  return false;
}
  public boolean MethodCall17_0(){
  ;//R1.sysj line: 123, column: 6
  val_thread_12 = (Boolean)DecreaseCount2_in.get_value();
return false;
}
  public boolean MethodCall18_0(){
  return val_thread_12;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall19_0(){
  tutu__1531 = 0;//R1.sysj line: 123, column: 6
  tutu__1531 = DecreaseCount2_in.get_preempted() ? DecreaseCount2_in.refresh() : 0;//R1.sysj line: 123, column: 6
  return false;
}
  public boolean MethodCall20_0(){
  val_thread_13 = null;//R1.sysj line: 134, column: 8
  return false;
}
  public boolean MethodCall21_0(){
  return ResetRC2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall22_0(){
  return ResetRC2_in.get_r_s() > ResetRC2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall23_0(){
  tutu__1637 = 0;//R1.sysj line: 135, column: 8
  tutu__1637 = ResetRC2_in.get_r_r();//R1.sysj line: 135, column: 8
  tutu__1637++;//R1.sysj line: 135, column: 8
  ResetRC2_in.set_r_r(tutu__1637);//R1.sysj line: 135, column: 8
  ResetRC2_in.get_val();//R1.sysj line: 135, column: 8
  return false;
}
  public boolean MethodCall24_0(){
  ;//R1.sysj line: 135, column: 8
  val_thread_13 = (Boolean)ResetRC2_in.get_value();
return false;
}
  public boolean MethodCall25_0(){
  return val_thread_13;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall26_0(){
  tutu__1638 = 0;//R1.sysj line: 135, column: 8
  tutu__1638 = ResetRC2_in.get_preempted() ? ResetRC2_in.refresh() : 0;//R1.sysj line: 135, column: 8
  return false;
}
  public boolean MethodCall27_0(){
  return random_thread_2.nextInt(2) == 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall28_0(){
  currsigs0.addElement(LightLevel_1);
  LightLevel_1.setValue(2);
return false;
}
  public boolean MethodCall29_0(){
  i_thread_6 = 0;//R1.sysj line: 21, column: 3
  return false;
}
  public boolean MethodCall30_0(){
  return i_thread_6 == 4;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall31_0(){
  ;//R1.sysj line: 22, column: 3
  return false;
}
  public boolean MethodCall32_0(){
  ;//R1.sysj line: 13, column: 2
  return false;
}
  public boolean MethodCall33_0(){
  i_thread_6 = i_thread_6 + 1;//R1.sysj line: 25, column: 7
  return false;
}
  public boolean MethodCall34_0(){
  return i_thread_6 == 4;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall35_0(){
  ;//R1.sysj line: 22, column: 3
  return false;
}
  public boolean MethodCall36_0(){
  ;//R1.sysj line: 13, column: 2
  return false;
}
  public boolean MethodCall37_0(){
  i_thread_6 = i_thread_6 + 1;//R1.sysj line: 25, column: 7
  return false;
}
  public boolean MethodCall38_0(){
  CurrentLightLevel_thread_6 = (Integer)LightLevel_1.getpreval();
SetValue_thread_6 = LightControl.adjustLight(CurrentLightLevel_thread_6);//R1.sysj line: 38, column: 6
  currsigs0.addElement(SetIntensity_1);
  SetIntensity_1.setValue(SetValue_thread_6);
return false;
}
  public boolean MethodCall39_0(){
  return Emergency2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall40_0(){
  return Emergency2_o.get_w_s() == Emergency2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall41_0(){
  tutu__815 = 0;//R1.sysj line: 53, column: 4
  tutu__815 = Emergency2_o.get_w_s();//R1.sysj line: 53, column: 4
  tutu__815++;//R1.sysj line: 53, column: 4
  Emergency2_o.set_w_s(tutu__815);//R1.sysj line: 53, column: 4
  Emergency2_o.set_value(true);
return false;
}
  public boolean MethodCall42_0(){
  return Emergency2_o.get_w_s() == Emergency2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall43_0(){
  ;//R1.sysj line: 53, column: 4
  return false;
}
  public boolean MethodCall44_0(){
  tutu__816 = 0;//R1.sysj line: 53, column: 4
  tutu__816 = Emergency2_o.get_preempted() ? Emergency2_o.refresh() : 0;//R1.sysj line: 53, column: 4
  return false;
}
  public boolean MethodCall45_0(){
  return Emergency2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall46_0(){
  return Emergency2_o.get_w_s() == Emergency2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall47_0(){
  tutu__791 = 0;//R1.sysj line: 53, column: 4
  tutu__791 = Emergency2_o.get_w_s();//R1.sysj line: 53, column: 4
  tutu__791++;//R1.sysj line: 53, column: 4
  Emergency2_o.set_w_s(tutu__791);//R1.sysj line: 53, column: 4
  Emergency2_o.set_value(true);
return false;
}
  public boolean MethodCall48_0(){
  return Emergency2_o.get_w_s() == Emergency2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall49_0(){
  ;//R1.sysj line: 53, column: 4
  return false;
}
  public boolean MethodCall50_0(){
  return Emergency2_o.get_w_s() == Emergency2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall51_0(){
  tutu__792 = 0;//R1.sysj line: 53, column: 4
  tutu__792 = Emergency2_o.get_preempted() ? Emergency2_o.refresh() : 0;//R1.sysj line: 53, column: 4
  return false;
}
  public boolean MethodCall52_0(){
  return Emergency2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall53_0(){
  return Emergency2_o.get_w_s() == Emergency2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall54_0(){
  tutu__791 = 0;//R1.sysj line: 53, column: 4
  tutu__791 = Emergency2_o.get_w_s();//R1.sysj line: 53, column: 4
  tutu__791++;//R1.sysj line: 53, column: 4
  Emergency2_o.set_w_s(tutu__791);//R1.sysj line: 53, column: 4
  Emergency2_o.set_value(true);
return false;
}
  public boolean MethodCall55_0(){
  return Emergency2_o.get_w_s() == Emergency2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall56_0(){
  ;//R1.sysj line: 53, column: 4
  return false;
}
  public boolean MethodCall57_0(){
  tutu__792 = 0;//R1.sysj line: 53, column: 4
  tutu__792 = Emergency2_o.get_preempted() ? Emergency2_o.refresh() : 0;//R1.sysj line: 53, column: 4
  return false;
}
  public boolean MethodCall58_0(){
  return ActivateAlarm2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall59_0(){
  return ActivateAlarm2_o.get_w_s() == ActivateAlarm2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall60_0(){
  tutu__864 = 0;//R1.sysj line: 55, column: 4
  tutu__864 = ActivateAlarm2_o.get_w_s();//R1.sysj line: 55, column: 4
  tutu__864++;//R1.sysj line: 55, column: 4
  ActivateAlarm2_o.set_w_s(tutu__864);//R1.sysj line: 55, column: 4
  ActivateAlarm2_o.set_value(true);
return false;
}
  public boolean MethodCall61_0(){
  return ActivateAlarm2_o.get_w_s() == ActivateAlarm2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall62_0(){
  ;//R1.sysj line: 55, column: 4
  return false;
}
  public boolean MethodCall63_0(){
  tutu__865 = 0;//R1.sysj line: 55, column: 4
  tutu__865 = ActivateAlarm2_o.get_preempted() ? ActivateAlarm2_o.refresh() : 0;//R1.sysj line: 55, column: 4
  return false;
}
  public boolean MethodCall64_0(){
  return ActivateAlarm2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall65_0(){
  return ActivateAlarm2_o.get_w_s() == ActivateAlarm2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall66_0(){
  tutu__840 = 0;//R1.sysj line: 55, column: 4
  tutu__840 = ActivateAlarm2_o.get_w_s();//R1.sysj line: 55, column: 4
  tutu__840++;//R1.sysj line: 55, column: 4
  ActivateAlarm2_o.set_w_s(tutu__840);//R1.sysj line: 55, column: 4
  ActivateAlarm2_o.set_value(true);
return false;
}
  public boolean MethodCall67_0(){
  return ActivateAlarm2_o.get_w_s() == ActivateAlarm2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall68_0(){
  ;//R1.sysj line: 55, column: 4
  return false;
}
  public boolean MethodCall69_0(){
  return ActivateAlarm2_o.get_w_s() == ActivateAlarm2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall70_0(){
  tutu__841 = 0;//R1.sysj line: 55, column: 4
  tutu__841 = ActivateAlarm2_o.get_preempted() ? ActivateAlarm2_o.refresh() : 0;//R1.sysj line: 55, column: 4
  return false;
}
  public boolean MethodCall71_0(){
  return ActivateAlarm2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall72_0(){
  return ActivateAlarm2_o.get_w_s() == ActivateAlarm2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall73_0(){
  tutu__840 = 0;//R1.sysj line: 55, column: 4
  tutu__840 = ActivateAlarm2_o.get_w_s();//R1.sysj line: 55, column: 4
  tutu__840++;//R1.sysj line: 55, column: 4
  ActivateAlarm2_o.set_w_s(tutu__840);//R1.sysj line: 55, column: 4
  ActivateAlarm2_o.set_value(true);
return false;
}
  public boolean MethodCall74_0(){
  return ActivateAlarm2_o.get_w_s() == ActivateAlarm2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall75_0(){
  ;//R1.sysj line: 55, column: 4
  return false;
}
  public boolean MethodCall76_0(){
  tutu__841 = 0;//R1.sysj line: 55, column: 4
  tutu__841 = ActivateAlarm2_o.get_preempted() ? ActivateAlarm2_o.refresh() : 0;//R1.sysj line: 55, column: 4
  return false;
}
  public boolean MethodCall77_0(){
  count_thread_9 = count_thread_9 + 1;//R1.sysj line: 74, column: 5
  return false;
}
  public boolean MethodCall78_0(){
  count_thread_9 = count_thread_9 - 1;//R1.sysj line: 77, column: 5
  return false;
}
  public boolean MethodCall79_0(){
  count_thread_9 = count_thread_9 + 1;//R1.sysj line: 85, column: 3
  return false;
}
  public boolean MethodCall80_0(){
  return count_thread_9 != 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall81_0(){
  count_thread_9 = 0;//R1.sysj line: 68, column: 6
  return false;
}
  public boolean MethodCall82_0(){
  return count_thread_9 != 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall83_0(){
  return IncreaseCount2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall84_0(){
  return IncreaseCount2_in.get_r_s() > IncreaseCount2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall85_0(){
  tutu__1408 = 0;//R1.sysj line: 111, column: 4
  tutu__1408 = IncreaseCount2_in.get_r_r();//R1.sysj line: 111, column: 4
  tutu__1408++;//R1.sysj line: 111, column: 4
  IncreaseCount2_in.set_r_r(tutu__1408);//R1.sysj line: 111, column: 4
  IncreaseCount2_in.get_val();//R1.sysj line: 111, column: 4
  return false;
}
  public boolean MethodCall86_0(){
  ;//R1.sysj line: 111, column: 4
  val_thread_11 = (Boolean)IncreaseCount2_in.get_value();
return false;
}
  public boolean MethodCall87_0(){
  return val_thread_11;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall88_0(){
  tutu__1409 = 0;//R1.sysj line: 111, column: 4
  tutu__1409 = IncreaseCount2_in.get_preempted() ? IncreaseCount2_in.refresh() : 0;//R1.sysj line: 111, column: 4
  return false;
}
  public boolean MethodCall89_0(){
  return IncreaseCount2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall90_0(){
  return IncreaseCount2_in.get_r_s() > IncreaseCount2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall91_0(){
  tutu__1408 = 0;//R1.sysj line: 111, column: 4
  tutu__1408 = IncreaseCount2_in.get_r_r();//R1.sysj line: 111, column: 4
  tutu__1408++;//R1.sysj line: 111, column: 4
  IncreaseCount2_in.set_r_r(tutu__1408);//R1.sysj line: 111, column: 4
  IncreaseCount2_in.get_val();//R1.sysj line: 111, column: 4
  return false;
}
  public boolean MethodCall92_0(){
  ;//R1.sysj line: 111, column: 4
  val_thread_11 = (Boolean)IncreaseCount2_in.get_value();
return false;
}
  public boolean MethodCall93_0(){
  return val_thread_11;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall94_0(){
  tutu__1409 = 0;//R1.sysj line: 111, column: 4
  tutu__1409 = IncreaseCount2_in.get_preempted() ? IncreaseCount2_in.refresh() : 0;//R1.sysj line: 111, column: 4
  return false;
}
  public boolean MethodCall95_0(){
  val_thread_11 = null;//R1.sysj line: 110, column: 4
  return false;
}
  public boolean MethodCall96_0(){
  return IncreaseCount2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall97_0(){
  return IncreaseCount2_in.get_r_s() > IncreaseCount2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall98_0(){
  tutu__1493 = 0;//R1.sysj line: 111, column: 4
  tutu__1493 = IncreaseCount2_in.get_r_r();//R1.sysj line: 111, column: 4
  tutu__1493++;//R1.sysj line: 111, column: 4
  IncreaseCount2_in.set_r_r(tutu__1493);//R1.sysj line: 111, column: 4
  IncreaseCount2_in.get_val();//R1.sysj line: 111, column: 4
  return false;
}
  public boolean MethodCall99_0(){
  ;//R1.sysj line: 111, column: 4
  val_thread_11 = (Boolean)IncreaseCount2_in.get_value();
return false;
}
  public boolean MethodCall100_0(){
  return val_thread_11;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall101_0(){
  tutu__1494 = 0;//R1.sysj line: 111, column: 4
  tutu__1494 = IncreaseCount2_in.get_preempted() ? IncreaseCount2_in.refresh() : 0;//R1.sysj line: 111, column: 4
  return false;
}
  public boolean MethodCall102_0(){
  return DecreaseCount2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall103_0(){
  return DecreaseCount2_in.get_r_s() > DecreaseCount2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall104_0(){
  tutu__1515 = 0;//R1.sysj line: 123, column: 6
  tutu__1515 = DecreaseCount2_in.get_r_r();//R1.sysj line: 123, column: 6
  tutu__1515++;//R1.sysj line: 123, column: 6
  DecreaseCount2_in.set_r_r(tutu__1515);//R1.sysj line: 123, column: 6
  DecreaseCount2_in.get_val();//R1.sysj line: 123, column: 6
  return false;
}
  public boolean MethodCall105_0(){
  ;//R1.sysj line: 123, column: 6
  val_thread_12 = (Boolean)DecreaseCount2_in.get_value();
return false;
}
  public boolean MethodCall106_0(){
  return val_thread_12;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall107_0(){
  tutu__1516 = 0;//R1.sysj line: 123, column: 6
  tutu__1516 = DecreaseCount2_in.get_preempted() ? DecreaseCount2_in.refresh() : 0;//R1.sysj line: 123, column: 6
  return false;
}
  public boolean MethodCall108_0(){
  return DecreaseCount2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall109_0(){
  return DecreaseCount2_in.get_r_s() > DecreaseCount2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall110_0(){
  tutu__1515 = 0;//R1.sysj line: 123, column: 6
  tutu__1515 = DecreaseCount2_in.get_r_r();//R1.sysj line: 123, column: 6
  tutu__1515++;//R1.sysj line: 123, column: 6
  DecreaseCount2_in.set_r_r(tutu__1515);//R1.sysj line: 123, column: 6
  DecreaseCount2_in.get_val();//R1.sysj line: 123, column: 6
  return false;
}
  public boolean MethodCall111_0(){
  ;//R1.sysj line: 123, column: 6
  val_thread_12 = (Boolean)DecreaseCount2_in.get_value();
return false;
}
  public boolean MethodCall112_0(){
  return val_thread_12;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall113_0(){
  tutu__1516 = 0;//R1.sysj line: 123, column: 6
  tutu__1516 = DecreaseCount2_in.get_preempted() ? DecreaseCount2_in.refresh() : 0;//R1.sysj line: 123, column: 6
  return false;
}
  public boolean MethodCall114_0(){
  val_thread_12 = null;//R1.sysj line: 122, column: 6
  return false;
}
  public boolean MethodCall115_0(){
  return DecreaseCount2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall116_0(){
  return DecreaseCount2_in.get_r_s() > DecreaseCount2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall117_0(){
  tutu__1600 = 0;//R1.sysj line: 123, column: 6
  tutu__1600 = DecreaseCount2_in.get_r_r();//R1.sysj line: 123, column: 6
  tutu__1600++;//R1.sysj line: 123, column: 6
  DecreaseCount2_in.set_r_r(tutu__1600);//R1.sysj line: 123, column: 6
  DecreaseCount2_in.get_val();//R1.sysj line: 123, column: 6
  return false;
}
  public boolean MethodCall118_0(){
  ;//R1.sysj line: 123, column: 6
  val_thread_12 = (Boolean)DecreaseCount2_in.get_value();
return false;
}
  public boolean MethodCall119_0(){
  return val_thread_12;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall120_0(){
  tutu__1601 = 0;//R1.sysj line: 123, column: 6
  tutu__1601 = DecreaseCount2_in.get_preempted() ? DecreaseCount2_in.refresh() : 0;//R1.sysj line: 123, column: 6
  return false;
}
  public boolean MethodCall121_0(){
  return ResetRC2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall122_0(){
  return ResetRC2_in.get_r_s() > ResetRC2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall123_0(){
  tutu__1622 = 0;//R1.sysj line: 135, column: 8
  tutu__1622 = ResetRC2_in.get_r_r();//R1.sysj line: 135, column: 8
  tutu__1622++;//R1.sysj line: 135, column: 8
  ResetRC2_in.set_r_r(tutu__1622);//R1.sysj line: 135, column: 8
  ResetRC2_in.get_val();//R1.sysj line: 135, column: 8
  return false;
}
  public boolean MethodCall124_0(){
  ;//R1.sysj line: 135, column: 8
  val_thread_13 = (Boolean)ResetRC2_in.get_value();
return false;
}
  public boolean MethodCall125_0(){
  return val_thread_13;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall126_0(){
  tutu__1623 = 0;//R1.sysj line: 135, column: 8
  tutu__1623 = ResetRC2_in.get_preempted() ? ResetRC2_in.refresh() : 0;//R1.sysj line: 135, column: 8
  return false;
}
  public boolean MethodCall127_0(){
  return ResetRC2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall128_0(){
  return ResetRC2_in.get_r_s() > ResetRC2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall129_0(){
  tutu__1622 = 0;//R1.sysj line: 135, column: 8
  tutu__1622 = ResetRC2_in.get_r_r();//R1.sysj line: 135, column: 8
  tutu__1622++;//R1.sysj line: 135, column: 8
  ResetRC2_in.set_r_r(tutu__1622);//R1.sysj line: 135, column: 8
  ResetRC2_in.get_val();//R1.sysj line: 135, column: 8
  return false;
}
  public boolean MethodCall130_0(){
  ;//R1.sysj line: 135, column: 8
  val_thread_13 = (Boolean)ResetRC2_in.get_value();
return false;
}
  public boolean MethodCall131_0(){
  return val_thread_13;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall132_0(){
  tutu__1623 = 0;//R1.sysj line: 135, column: 8
  tutu__1623 = ResetRC2_in.get_preempted() ? ResetRC2_in.refresh() : 0;//R1.sysj line: 135, column: 8
  return false;
}
  public boolean MethodCall133_0(){
  val_thread_13 = null;//R1.sysj line: 134, column: 8
  return false;
}
  public boolean MethodCall134_0(){
  return ResetRC2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall135_0(){
  return ResetRC2_in.get_r_s() > ResetRC2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall136_0(){
  tutu__1707 = 0;//R1.sysj line: 135, column: 8
  tutu__1707 = ResetRC2_in.get_r_r();//R1.sysj line: 135, column: 8
  tutu__1707++;//R1.sysj line: 135, column: 8
  ResetRC2_in.set_r_r(tutu__1707);//R1.sysj line: 135, column: 8
  ResetRC2_in.get_val();//R1.sysj line: 135, column: 8
  return false;
}
  public boolean MethodCall137_0(){
  ;//R1.sysj line: 135, column: 8
  val_thread_13 = (Boolean)ResetRC2_in.get_value();
return false;
}
  public boolean MethodCall138_0(){
  return val_thread_13;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall139_0(){
  tutu__1708 = 0;//R1.sysj line: 135, column: 8
  tutu__1708 = ResetRC2_in.get_preempted() ? ResetRC2_in.refresh() : 0;//R1.sysj line: 135, column: 8
  return false;
}
  }
                                                                                                                                                                                                                                                                                                                                                      
