package washingoptimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.Signal;

public class washingomp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static Signal washon_1;
  private static Signal washoff_1;
  private static Signal spinon_1;
  private static Signal spinoff_1;
  private static Signal WASHING_1;
  private static Signal DRYING_1;
  public static void main(String args[]){
    washon_1 = new Signal();
    washoff_1 = new Signal();
    spinon_1 = new Signal();
    spinoff_1 = new Signal();
    WASHING_1 = new Signal();
    DRYING_1 = new Signal();
    washingomp t_procs = new washingomp();
        while(true){
    int ret = 0;
    boolean ret_bool = false;
    int data_call_word=Native.rd(Const.DPCR_ADDR);
    if(((data_call_word >> 31)&0x001) > 0){
    int case_number = (data_call_word>>16) & 0x7FFF;
    int clock_domain = data_call_word & 0xF;
    if(clock_domain == 0){
    ret_bool = t_procs.cbackcall0_0(case_number);
    }
    else throw new RuntimeException();
    }
    int dprr = ret_bool ? 0x0003 : 0x0002;
    Native.wr(dprr, (Const.RESULT_ADDR));
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
                                                          
