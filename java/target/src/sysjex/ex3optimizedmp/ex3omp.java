package ex3optimizedmp;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;

public class ex3omp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static Signal A_1;
  private static Signal B_1;
  private static Signal C1_1;
  private static Signal C2_1;
  private static Signal C3_1;
  private static Signal D_1;
  private static Signal E_1;
  private static Signal F_1;
  private static Signal G_1;
  public static void main(String args[]){
    A_1 = new Signal();
    B_1 = new Signal();
    C1_1 = new Signal();
    C2_1 = new Signal();
    C3_1 = new Signal();
    D_1 = new Signal();
    E_1 = new Signal();
    F_1 = new Signal();
    G_1 = new Signal();
    ex3omp t_procs = new ex3omp();
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
for(int qw=0;qw<currsigs0.size();++qw){
            int rand496563282 = ((Signal)currsigs0.elementAt(qw)).getStatus() ? ((Signal)currsigs0.elementAt(qw)).setprepresent() : ((Signal)currsigs0.elementAt(qw)).setpreclear();
			((Signal)currsigs0.elementAt(qw)).setpreval(((Signal)currsigs0.elementAt(qw)).getValue());
			}
    currsigs0.removeAllElements();
        return false;
}
}
                                                                                                                                                                                                                                                                                                                                                                                                                          