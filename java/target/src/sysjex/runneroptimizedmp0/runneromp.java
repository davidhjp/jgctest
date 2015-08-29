package runneroptimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.*;

public class runneromp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static Signal HEARTATTACK_1;
  private static Signal METER_1;
  private static Signal SECOND_1;
  private static Signal HEARTBEAT_1;
  private static Signal STEP_1;
  private static Signal WALK_1;
  private static Signal JUMP_1;
  private static Signal RUN_1;
  private static Signal GOTOHOSPITAL_1;
  private static int meters_thread_2;//runner.sysj line: 16, column: 5
  private static int u_thread_5;//runner.sysj line: 63, column: 7
  private static int seconds_thread_3;//runner.sysj line: 33, column: 4
  public static void main(String args[]){
    HEARTATTACK_1 = new Signal();
    METER_1 = new Signal();
    SECOND_1 = new Signal();
    HEARTBEAT_1 = new Signal();
    STEP_1 = new Signal();
    WALK_1 = new Signal();
    JUMP_1 = new Signal();
    RUN_1 = new Signal();
    GOTOHOSPITAL_1 = new Signal();
    runneromp t_procs = new runneromp();
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
  case 0: 
      for(int qw=0;qw<currsigs0.size();++qw){
              int rand496563282 = ((Signal)currsigs0.elementAt(qw)).getStatus() ? ((Signal)currsigs0.elementAt(qw)).setprepresent() : ((Signal)currsigs0.elementAt(qw)).setpreclear();
			((Signal)currsigs0.elementAt(qw)).setpreval(((Signal)currsigs0.elementAt(qw)).getValue());
			}
      currsigs0.removeAllElements();
            break;
      default: throw new RuntimeException("CaseNum: "+var+" not found");
      }
    return retval;
}
  public boolean MethodCall1_0(){
  meters_thread_2 = 0;//runner.sysj line: 16, column: 5
  return false;
}
  public boolean MethodCall2_0(){
  u_thread_5 = 0;//runner.sysj line: 63, column: 7
  return false;
}
  public boolean MethodCall3_0(){
  return meters_thread_2 == 100;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall4_0(){
  ;//runner.sysj line: 19, column: 2
  return false;
}
  public boolean MethodCall5_0(){
    return false;
}
  public boolean MethodCall6_0(){
  meters_thread_2 = meters_thread_2 + 1;//runner.sysj line: 27, column: 8
  return false;
}
  public boolean MethodCall7_0(){
  ;//runner.sysj line: 17, column: 5
  return false;
}
  public boolean MethodCall8_0(){
  return seconds_thread_3 == 15;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall9_0(){
  ;//runner.sysj line: 35, column: 6
  return false;
}
  public boolean MethodCall10_0(){
  seconds_thread_3 = seconds_thread_3 + 1;//runner.sysj line: 44, column: 5
  return false;
}
  public boolean MethodCall11_0(){
  return u_thread_5 == 150;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall12_0(){
  ;//runner.sysj line: 64, column: 7
  return false;
}
  public boolean MethodCall13_0(){
  return u_thread_5 < 101;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall14_0(){
  return u_thread_5 < 133;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall15_0(){
  return u_thread_5 < 140;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall16_0(){
  u_thread_5 = u_thread_5 + 1;//runner.sysj line: 76, column: 4
  return false;
}
  public boolean MethodCall17_0(){
  return u_thread_5 == 139;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall18_0(){
  u_thread_5 = u_thread_5 + 1;//runner.sysj line: 76, column: 4
  return false;
}
  public boolean MethodCall19_0(){
  return u_thread_5 == 139;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall20_0(){
  return u_thread_5 < 140;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall21_0(){
  u_thread_5 = u_thread_5 + 1;//runner.sysj line: 76, column: 4
  return false;
}
  public boolean MethodCall22_0(){
  return u_thread_5 == 139;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall23_0(){
  u_thread_5 = u_thread_5 + 1;//runner.sysj line: 76, column: 4
  return false;
}
  public boolean MethodCall24_0(){
  return u_thread_5 == 139;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall25_0(){
  return u_thread_5 < 133;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall26_0(){
  return u_thread_5 < 140;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall27_0(){
  u_thread_5 = u_thread_5 + 1;//runner.sysj line: 76, column: 4
  return false;
}
  public boolean MethodCall28_0(){
  return u_thread_5 == 139;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall29_0(){
  u_thread_5 = u_thread_5 + 1;//runner.sysj line: 76, column: 4
  return false;
}
  public boolean MethodCall30_0(){
  return u_thread_5 == 139;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall31_0(){
  return u_thread_5 < 140;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall32_0(){
  u_thread_5 = u_thread_5 + 1;//runner.sysj line: 76, column: 4
  return false;
}
  public boolean MethodCall33_0(){
  return u_thread_5 == 139;//Unknown file line: 0, column: 0
  }
  public boolean MethodCall34_0(){
  u_thread_5 = u_thread_5 + 1;//runner.sysj line: 76, column: 4
  return false;
}
  public boolean MethodCall35_0(){
  return u_thread_5 == 139;//Unknown file line: 0, column: 0
  }
  }
                                                