package R3optimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.*;
import UtilA.*;//R3.sysj line: 1, column: 1

public class R3omp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static input_Channel ActivateAlarm2_in;
  private static output_Channel ResetAC2_o;
  private static output_Channel ResetRC2_o;
  private static Signal AlarmOn_1;
  private static Signal AlarmOff_1;
  private static Signal ResetAlarm_1;
  private static Random random_thread_2;//R3.sysj line: 34, column: 7
  private static int tutu__434;//R3.sysj line: 17, column: 2
  private static int tutu__435;//R3.sysj line: 17, column: 2
  private static int tutu__163;//R3.sysj line: 7, column: 7
  private static int tutu__164;//R3.sysj line: 7, column: 7
  private static int tutu__139;//R3.sysj line: 7, column: 7
  private static int tutu__140;//R3.sysj line: 7, column: 7
  private static int tutu__212;//R3.sysj line: 9, column: 7
  private static int tutu__213;//R3.sysj line: 9, column: 7
  private static int tutu__188;//R3.sysj line: 9, column: 7
  private static int tutu__189;//R3.sysj line: 9, column: 7
  private static int tutu__466;//R3.sysj line: 17, column: 2
  private static int tutu__467;//R3.sysj line: 17, column: 2
  public static void main(String args[]){
    AlarmOn_1 = new Signal();
    AlarmOff_1 = new Signal();
    ResetAlarm_1 = new Signal();
    ResetAC2_o = new output_Channel();
    ResetRC2_o = new output_Channel();
    ActivateAlarm2_in = new input_Channel();
    R3omp t_procs = new R3omp();
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
  case 0: 
      for(int qw=0;qw<currsigs0.size();++qw){
              int rand496563282 = ((Signal)currsigs0.elementAt(qw)).getStatus() ? ((Signal)currsigs0.elementAt(qw)).setprepresent() : ((Signal)currsigs0.elementAt(qw)).setpreclear();
			((Signal)currsigs0.elementAt(qw)).setpreval(((Signal)currsigs0.elementAt(qw)).getValue());
			}
      currsigs0.removeAllElements();
            ActivateAlarm2_in.update_r_s();
      ResetAC2_o.update_w_r();
      ResetRC2_o.update_w_r();
      break;
      default: throw new RuntimeException("CaseNum: "+var+" not found");
      }
    return retval;
}
  public boolean MethodCall1_0(){
  random_thread_2 = new Random(466433123);//R3.sysj line: 34, column: 7
  return false;
}
  public boolean MethodCall2_0(){
  return ActivateAlarm2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall3_0(){
  return ActivateAlarm2_in.get_r_s() > ActivateAlarm2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall4_0(){
  tutu__434 = 0;//R3.sysj line: 17, column: 2
  tutu__434 = ActivateAlarm2_in.get_r_r();//R3.sysj line: 17, column: 2
  tutu__434++;//R3.sysj line: 17, column: 2
  ActivateAlarm2_in.set_r_r(tutu__434);//R3.sysj line: 17, column: 2
  ActivateAlarm2_in.get_val();//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall5_0(){
  ;//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall6_0(){
  tutu__435 = 0;//R3.sysj line: 17, column: 2
  tutu__435 = ActivateAlarm2_in.get_preempted() ? ActivateAlarm2_in.refresh() : 0;//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall7_0(){
  return random_thread_2.nextInt(2) == 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall8_0(){
  ;//R3.sysj line: 37, column: 2
  return false;
}
  public boolean MethodCall9_0(){
  return random_thread_2.nextInt(2) == 0;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall10_0(){
  ;//R3.sysj line: 37, column: 2
  return false;
}
  public boolean MethodCall11_0(){
  return ResetAC2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall12_0(){
  return ResetAC2_o.get_w_s() == ResetAC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall13_0(){
  tutu__163 = 0;//R3.sysj line: 7, column: 7
  tutu__163 = ResetAC2_o.get_w_s();//R3.sysj line: 7, column: 7
  tutu__163++;//R3.sysj line: 7, column: 7
  ResetAC2_o.set_w_s(tutu__163);//R3.sysj line: 7, column: 7
  ResetAC2_o.set_value(true);
return false;
}
  public boolean MethodCall14_0(){
  return ResetAC2_o.get_w_s() == ResetAC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall15_0(){
  ;//R3.sysj line: 7, column: 7
  return false;
}
  public boolean MethodCall16_0(){
  tutu__164 = 0;//R3.sysj line: 7, column: 7
  tutu__164 = ResetAC2_o.get_preempted() ? ResetAC2_o.refresh() : 0;//R3.sysj line: 7, column: 7
  return false;
}
  public boolean MethodCall17_0(){
  return ResetAC2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall18_0(){
  return ResetAC2_o.get_w_s() == ResetAC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall19_0(){
  tutu__139 = 0;//R3.sysj line: 7, column: 7
  tutu__139 = ResetAC2_o.get_w_s();//R3.sysj line: 7, column: 7
  tutu__139++;//R3.sysj line: 7, column: 7
  ResetAC2_o.set_w_s(tutu__139);//R3.sysj line: 7, column: 7
  ResetAC2_o.set_value(true);
return false;
}
  public boolean MethodCall20_0(){
  return ResetAC2_o.get_w_s() == ResetAC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall21_0(){
  ;//R3.sysj line: 7, column: 7
  return false;
}
  public boolean MethodCall22_0(){
  return ResetAC2_o.get_w_s() == ResetAC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall23_0(){
  tutu__140 = 0;//R3.sysj line: 7, column: 7
  tutu__140 = ResetAC2_o.get_preempted() ? ResetAC2_o.refresh() : 0;//R3.sysj line: 7, column: 7
  return false;
}
  public boolean MethodCall24_0(){
  return ResetAC2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall25_0(){
  return ResetAC2_o.get_w_s() == ResetAC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall26_0(){
  tutu__139 = 0;//R3.sysj line: 7, column: 7
  tutu__139 = ResetAC2_o.get_w_s();//R3.sysj line: 7, column: 7
  tutu__139++;//R3.sysj line: 7, column: 7
  ResetAC2_o.set_w_s(tutu__139);//R3.sysj line: 7, column: 7
  ResetAC2_o.set_value(true);
return false;
}
  public boolean MethodCall27_0(){
  return ResetAC2_o.get_w_s() == ResetAC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall28_0(){
  ;//R3.sysj line: 7, column: 7
  return false;
}
  public boolean MethodCall29_0(){
  tutu__140 = 0;//R3.sysj line: 7, column: 7
  tutu__140 = ResetAC2_o.get_preempted() ? ResetAC2_o.refresh() : 0;//R3.sysj line: 7, column: 7
  return false;
}
  public boolean MethodCall30_0(){
  return ResetRC2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall31_0(){
  return ResetRC2_o.get_w_s() == ResetRC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall32_0(){
  tutu__212 = 0;//R3.sysj line: 9, column: 7
  tutu__212 = ResetRC2_o.get_w_s();//R3.sysj line: 9, column: 7
  tutu__212++;//R3.sysj line: 9, column: 7
  ResetRC2_o.set_w_s(tutu__212);//R3.sysj line: 9, column: 7
  ResetRC2_o.set_value(true);
return false;
}
  public boolean MethodCall33_0(){
  return ResetRC2_o.get_w_s() == ResetRC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall34_0(){
  ;//R3.sysj line: 9, column: 7
  return false;
}
  public boolean MethodCall35_0(){
  tutu__213 = 0;//R3.sysj line: 9, column: 7
  tutu__213 = ResetRC2_o.get_preempted() ? ResetRC2_o.refresh() : 0;//R3.sysj line: 9, column: 7
  return false;
}
  public boolean MethodCall36_0(){
  return ResetRC2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall37_0(){
  return ResetRC2_o.get_w_s() == ResetRC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall38_0(){
  tutu__188 = 0;//R3.sysj line: 9, column: 7
  tutu__188 = ResetRC2_o.get_w_s();//R3.sysj line: 9, column: 7
  tutu__188++;//R3.sysj line: 9, column: 7
  ResetRC2_o.set_w_s(tutu__188);//R3.sysj line: 9, column: 7
  ResetRC2_o.set_value(true);
return false;
}
  public boolean MethodCall39_0(){
  return ResetRC2_o.get_w_s() == ResetRC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall40_0(){
  ;//R3.sysj line: 9, column: 7
  return false;
}
  public boolean MethodCall41_0(){
  return ResetRC2_o.get_w_s() == ResetRC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall42_0(){
  tutu__189 = 0;//R3.sysj line: 9, column: 7
  tutu__189 = ResetRC2_o.get_preempted() ? ResetRC2_o.refresh() : 0;//R3.sysj line: 9, column: 7
  return false;
}
  public boolean MethodCall43_0(){
  return ResetRC2_o.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall44_0(){
  return ResetRC2_o.get_w_s() == ResetRC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall45_0(){
  tutu__188 = 0;//R3.sysj line: 9, column: 7
  tutu__188 = ResetRC2_o.get_w_s();//R3.sysj line: 9, column: 7
  tutu__188++;//R3.sysj line: 9, column: 7
  ResetRC2_o.set_w_s(tutu__188);//R3.sysj line: 9, column: 7
  ResetRC2_o.set_value(true);
return false;
}
  public boolean MethodCall46_0(){
  return ResetRC2_o.get_w_s() == ResetRC2_o.get_w_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall47_0(){
  ;//R3.sysj line: 9, column: 7
  return false;
}
  public boolean MethodCall48_0(){
  tutu__189 = 0;//R3.sysj line: 9, column: 7
  tutu__189 = ResetRC2_o.get_preempted() ? ResetRC2_o.refresh() : 0;//R3.sysj line: 9, column: 7
  return false;
}
  public boolean MethodCall49_0(){
  return ActivateAlarm2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall50_0(){
  return ActivateAlarm2_in.get_r_s() > ActivateAlarm2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall51_0(){
  tutu__434 = 0;//R3.sysj line: 17, column: 2
  tutu__434 = ActivateAlarm2_in.get_r_r();//R3.sysj line: 17, column: 2
  tutu__434++;//R3.sysj line: 17, column: 2
  ActivateAlarm2_in.set_r_r(tutu__434);//R3.sysj line: 17, column: 2
  ActivateAlarm2_in.get_val();//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall52_0(){
  ;//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall53_0(){
  tutu__435 = 0;//R3.sysj line: 17, column: 2
  tutu__435 = ActivateAlarm2_in.get_preempted() ? ActivateAlarm2_in.refresh() : 0;//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall54_0(){
  return ActivateAlarm2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall55_0(){
  return ActivateAlarm2_in.get_r_s() > ActivateAlarm2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall56_0(){
  tutu__434 = 0;//R3.sysj line: 17, column: 2
  tutu__434 = ActivateAlarm2_in.get_r_r();//R3.sysj line: 17, column: 2
  tutu__434++;//R3.sysj line: 17, column: 2
  ActivateAlarm2_in.set_r_r(tutu__434);//R3.sysj line: 17, column: 2
  ActivateAlarm2_in.get_val();//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall57_0(){
  ;//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall58_0(){
  tutu__435 = 0;//R3.sysj line: 17, column: 2
  tutu__435 = ActivateAlarm2_in.get_preempted() ? ActivateAlarm2_in.refresh() : 0;//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall59_0(){
  return ActivateAlarm2_in.get_preempted();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall60_0(){
  return ActivateAlarm2_in.get_r_s() > ActivateAlarm2_in.get_r_r();//Unknown file line: 0, column: 0
  }
  public boolean MethodCall61_0(){
  tutu__466 = 0;//R3.sysj line: 17, column: 2
  tutu__466 = ActivateAlarm2_in.get_r_r();//R3.sysj line: 17, column: 2
  tutu__466++;//R3.sysj line: 17, column: 2
  ActivateAlarm2_in.set_r_r(tutu__466);//R3.sysj line: 17, column: 2
  ActivateAlarm2_in.get_val();//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall62_0(){
  ;//R3.sysj line: 17, column: 2
  return false;
}
  public boolean MethodCall63_0(){
  tutu__467 = 0;//R3.sysj line: 17, column: 2
  tutu__467 = ActivateAlarm2_in.get_preempted() ? ActivateAlarm2_in.refresh() : 0;//R3.sysj line: 17, column: 2
  return false;
}
  }
                                                                                                                                      