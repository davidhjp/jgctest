package hrtcsoptimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.Signal;

public class hrtcsomp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static Signal TOUCH;
  private static Signal GREEN_LIGHT;
  private static int counter_thread_3;//hrtcs.sysj line: 9, column: 7
  public static void init(){
    TOUCH = new Signal();
    GREEN_LIGHT = new Signal();
  }
  public static void main(String args[]){
    init();
    while(true){
      int ret = 0;
      boolean ret_bool = false;
      int data_call_word=Native.rd(Const.DPCR_ADDR);
      if(((data_call_word >> 31)&0x001) > 0){
	int case_number = (data_call_word>>16) & 0x7FFF;
	int clock_domain = data_call_word & 0xF;
	if(clock_domain == 0){
	  ret_bool = cbackcall0_0(case_number);
	}
	else throw new RuntimeException();
      }
      int dprr = ret_bool ? 0x0003 : 0x0002;
      Native.wr(dprr, (Const.RESULT_ADDR));
    }
  }
    
  private static boolean cbackcall0_0(int var){
    boolean retval = false;
    if(var == 1){
      retval = MethodCall1_0();
    }
    else if(var == 2){
      retval = MethodCall2_0();
    }
    else if(var == 3){
      retval = MethodCall3_0();
    }
    else if(var == 4){
      retval = MethodCall4_0();
    }
    else if(var == 5){
      retval = MethodCall5_0();
    }

    else if(var == 0){ 
      for(int qw=0;qw<currsigs0.size();++qw){
	int rand496563282 = ((Signal)currsigs0.elementAt(qw)).getStatus() ? ((Signal)currsigs0.elementAt(qw)).setprepresent() : ((Signal)currsigs0.elementAt(qw)).setpreclear();
	((Signal)currsigs0.elementAt(qw)).setpreval(((Signal)currsigs0.elementAt(qw)).getValue());
      }
      currsigs0.removeAllElements();
    }
    else throw new RuntimeException("CaseNum: "+var+" not found");
    return retval;
  }

  public static boolean MethodCall1_0(){
    counter_thread_3 = 0;//hrtcs.sysj line: 9, column: 7
    counter_thread_3 = counter_thread_3 + 1;//hrtcs.sysj line: 11, column: 8
    return false;
  }
  public static boolean MethodCall2_0(){
    return counter_thread_3 == 10;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall3_0(){
    ;//hrtcs.sysj line: 8, column: 6
    return false;
  }
  public static boolean MethodCall4_0(){
    counter_thread_3 = counter_thread_3 + 1;//hrtcs.sysj line: 11, column: 8
    return false;
  }
  public static boolean MethodCall5_0(){
    counter_thread_3 = 0;//hrtcs.sysj line: 9, column: 7
    counter_thread_3 = counter_thread_3 + 1;//hrtcs.sysj line: 11, column: 8
    return false;
  }

}
                                  
