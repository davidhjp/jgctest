package abrooptimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.*;

public class abroomp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static Signal A;
  private static Signal B;
  private static Signal R;
  private static Signal O;
  public static void main(String args[]){
    A = new Signal();
    B = new Signal();
    R = new Signal();
    O = new Signal();
    abroomp t_procs = new abroomp();
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
                                