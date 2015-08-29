package loop_50optimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.*;

public class loop_50omp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static int[] a_thread_1;//loop_50.sysj line: 2, column: 3
  private static int[] b_thread_1;//loop_50.sysj line: 3, column: 3
  private static int[] c_thread_1;//loop_50.sysj line: 4, column: 3
  private static int t_thread_1;//loop_50.sysj line: 5, column: 3
  private static int r_thread_1;//loop_50.sysj line: 6, column: 3
  private static int j_thread_1;//loop_50.sysj line: 7, column: 3
  public static void main(String args[]){
    loop_50omp t_procs = new loop_50omp();
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
  a_thread_1 = new int[1];//loop_50.sysj line: 2, column: 3
  b_thread_1 = new int[1];//loop_50.sysj line: 3, column: 3
  c_thread_1 = new int[1];//loop_50.sysj line: 4, column: 3
  t_thread_1 = a_thread_1[0];//loop_50.sysj line: 5, column: 3
  r_thread_1 = b_thread_1[0];//loop_50.sysj line: 6, column: 3
  j_thread_1 = c_thread_1[0];//loop_50.sysj line: 7, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 8, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 9, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 10, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 11, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 12, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 13, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 14, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 15, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 16, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 17, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 18, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 19, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 20, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 21, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 22, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 23, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 24, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 25, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 26, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 27, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 28, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 29, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 30, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 31, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 32, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 33, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 34, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 35, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 36, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 37, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 38, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 39, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 40, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 41, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 42, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 43, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 44, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 45, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 46, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 47, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 48, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 49, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 50, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 51, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 52, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 53, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 54, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 55, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 56, column: 3
  t_thread_1 = r_thread_1 + j_thread_1;//loop_50.sysj line: 57, column: 3
  return false;
}
  }
        