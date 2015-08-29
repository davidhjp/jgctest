package motoroptimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.Signal;

public class motoromp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static Signal Step_1;
  private static Signal Hold_1;
  private static Signal Enable_1;
  private static Signal Coil1_1;
  private static Signal Coil2_1;
  private static Signal LongStep_1;
  private static int i_thread_6;//motor.sysj line: 99, column: 2
  private static int i_thread_2;//motor.sysj line: 12, column: 2
  private static int i_thread_3;//motor.sysj line: 36, column: 8
  private static int i_thread_4;//motor.sysj line: 64, column: 8
  public static void init(){
    Step_1 = new Signal();
    Hold_1 = new Signal();
    Enable_1 = new Signal();
    Coil1_1 = new Signal();
    Coil2_1 = new Signal();
    LongStep_1 = new Signal();
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
    else if(var == 6){
      retval = MethodCall6_0();
    }
    else if(var == 7){
      retval = MethodCall7_0();
    }
    else if(var == 8){
      retval = MethodCall8_0();
    }
    else if(var == 9){
      retval = MethodCall9_0();
    }
    else if(var == 10){
      retval = MethodCall10_0();
    }
    else if(var == 11){
      retval = MethodCall11_0();
    }
    else if(var == 12){
      retval = MethodCall12_0();
    }
    else if(var == 13){
      retval = MethodCall13_0();
    }
    else if(var == 14){
      retval = MethodCall14_0();
    }
    else if(var == 15){
      retval = MethodCall15_0();
    }
    else if(var == 16){
      retval = MethodCall16_0();
    }
    else if(var == 17){
      retval = MethodCall17_0();
    }
    else if(var == 18){
      retval = MethodCall18_0();
    }
    else if(var == 19){
      retval = MethodCall19_0();
    }
    else if(var == 20){
      retval = MethodCall20_0();
    }
    else if(var == 21){
      retval = MethodCall21_0();
    }
    else if(var == 22){
      retval = MethodCall22_0();
    }
    else if(var == 23){
      retval = MethodCall23_0();
    }
    else if(var == 24){
      retval = MethodCall24_0();
    }
    else if(var == 25){
      retval = MethodCall25_0();
    }
    else if(var == 26){
      retval = MethodCall26_0();
    }
    else if(var == 27){
      retval = MethodCall27_0();
    }
    else if(var == 28){
      retval = MethodCall28_0();
    }
    else if(var == 29){
      retval = MethodCall29_0();
    }
    else if(var == 30){
      retval = MethodCall30_0();
    }
    else if(var == 31){
      retval = MethodCall31_0();
    }
    else if(var == 32){
      retval = MethodCall32_0();
    }
    else if(var == 33){
      retval = MethodCall33_0();
    }
    else if(var == 34){
      retval = MethodCall34_0();
    }
    else if(var == 35){
      retval = MethodCall35_0();
    }
    else if(var == 36){
      retval = MethodCall36_0();
    }
    else if(var == 37){
      retval = MethodCall37_0();
    }
    else if(var == 38){
      retval = MethodCall38_0();
    }
    else if(var == 39){
      retval = MethodCall39_0();
    }
    else if(var == 40){
      retval = MethodCall40_0();
    }
    else if(var == 41){
      retval = MethodCall41_0();
    }
    else if(var == 42){
      retval = MethodCall42_0();
    }
    else if(var == 43){
      retval = MethodCall43_0();
    }
    else if(var == 44){
      retval = MethodCall44_0();
    }
    else if(var == 45){
      retval = MethodCall45_0();
    }
    else if(var == 46){
      retval = MethodCall46_0();
    }
    else if(var == 47){
      retval = MethodCall47_0();
    }
    else if(var == 48){
      retval = MethodCall48_0();
    }
    else if(var == 49){
      retval = MethodCall49_0();
    }
    else if(var == 50){
      retval = MethodCall50_0();
    }
    else if(var == 51){
      retval = MethodCall51_0();
    }
    else if(var == 52){
      retval = MethodCall52_0();
    }
    else if(var == 53){
      retval = MethodCall53_0();
    }
    else if(var == 54){
      retval = MethodCall54_0();
    }
    else if(var == 55){
      retval = MethodCall55_0();
    }
    else if(var == 56){
      retval = MethodCall56_0();
    }
    else if(var == 57){
      retval = MethodCall57_0();
    }
    else if(var == 58){
      retval = MethodCall58_0();
    }
    else if(var == 59){
      retval = MethodCall59_0();
    }
    else if(var == 60){
      retval = MethodCall60_0();
    }
    else if(var == 61){
      retval = MethodCall61_0();
    }
    else if(var == 62){
      retval = MethodCall62_0();
    }
    else if(var == 63){
      retval = MethodCall63_0();
    }
    else if(var == 64){
      retval = MethodCall64_0();
    }
    else if(var == 65){
      retval = MethodCall65_0();
    }
    else if(var == 66){
      retval = MethodCall66_0();
    }
    else if(var == 67){
      retval = MethodCall67_0();
    }
    else if(var == 68){
      retval = MethodCall68_0();
    }
    else if(var == 69){
      retval = MethodCall69_0();
    }
    else if(var == 70){
      retval = MethodCall70_0();
    }
    else if(var == 71){
      retval = MethodCall71_0();
    }
    else if(var == 72){
      retval = MethodCall72_0();
    }
    else if(var == 73){
      retval = MethodCall73_0();
    }
    else if(var == 74){
      retval = MethodCall74_0();
    }
    else if(var == 75){
      retval = MethodCall75_0();
    }
    else if(var == 76){
      retval = MethodCall76_0();
    }
    else if(var == 77){
      retval = MethodCall77_0();
    }
    else if(var == 78){
      retval = MethodCall78_0();
    }
    else if(var == 79){
      retval = MethodCall79_0();
    }
    else if(var == 80){
      retval = MethodCall80_0();
    }
    else if(var == 81){
      retval = MethodCall81_0();
    }

    else if(var == 0){ 
      for(int qw=0;qw<currsigs0.size();++qw){
	int rand496563282 = ((Signal)currsigs0.elementAt(qw)).getStatus() ? ((Signal)currsigs0.elementAt(qw)).setprepresent() : ((Signal)currsigs0.elementAt(qw)).setpreclear();
	((Signal)currsigs0.elementAt(qw)).setpreval(((Signal)currsigs0.elementAt(qw)).getValue());
      }
      currsigs0.removeAllElements();
    }
    else retval = cbackcall0_1(var);
    return retval;
  }
  private static boolean cbackcall0_1(int var){
    boolean retval = false;
    if(var == 82){
      retval = MethodCall82_0();
    }
    else if(var == 83){
      retval = MethodCall83_0();
    }
    else if(var == 84){
      retval = MethodCall84_0();
    }
    else if(var == 85){
      retval = MethodCall85_0();
    }
    else if(var == 86){
      retval = MethodCall86_0();
    }
    else if(var == 87){
      retval = MethodCall87_0();
    }
    else if(var == 88){
      retval = MethodCall88_0();
    }
    else if(var == 89){
      retval = MethodCall89_0();
    }
    else if(var == 90){
      retval = MethodCall90_0();
    }
    else if(var == 91){
      retval = MethodCall91_0();
    }
    else if(var == 92){
      retval = MethodCall92_0();
    }
    else if(var == 93){
      retval = MethodCall93_0();
    }
    else if(var == 94){
      retval = MethodCall94_0();
    }
    else if(var == 95){
      retval = MethodCall95_0();
    }
    else if(var == 96){
      retval = MethodCall96_0();
    }
    else if(var == 97){
      retval = MethodCall97_0();
    }
    else if(var == 98){
      retval = MethodCall98_0();
    }
    else if(var == 99){
      retval = MethodCall99_0();
    }
    else if(var == 100){
      retval = MethodCall100_0();
    }
    else if(var == 101){
      retval = MethodCall101_0();
    }
    else if(var == 102){
      retval = MethodCall102_0();
    }
    else if(var == 103){
      retval = MethodCall103_0();
    }
    else if(var == 104){
      retval = MethodCall104_0();
    }
    else if(var == 105){
      retval = MethodCall105_0();
    }
    else if(var == 106){
      retval = MethodCall106_0();
    }
    else if(var == 107){
      retval = MethodCall107_0();
    }
    else if(var == 108){
      retval = MethodCall108_0();
    }
    else if(var == 109){
      retval = MethodCall109_0();
    }
    else if(var == 110){
      retval = MethodCall110_0();
    }
    else if(var == 111){
      retval = MethodCall111_0();
    }
    else if(var == 112){
      retval = MethodCall112_0();
    }
    else if(var == 113){
      retval = MethodCall113_0();
    }
    else if(var == 114){
      retval = MethodCall114_0();
    }
    else if(var == 115){
      retval = MethodCall115_0();
    }
    else if(var == 116){
      retval = MethodCall116_0();
    }
    else if(var == 117){
      retval = MethodCall117_0();
    }
    else if(var == 118){
      retval = MethodCall118_0();
    }
    else if(var == 119){
      retval = MethodCall119_0();
    }
    else if(var == 120){
      retval = MethodCall120_0();
    }
    else if(var == 121){
      retval = MethodCall121_0();
    }
    else if(var == 122){
      retval = MethodCall122_0();
    }
    else if(var == 123){
      retval = MethodCall123_0();
    }
    else if(var == 124){
      retval = MethodCall124_0();
    }
    else if(var == 125){
      retval = MethodCall125_0();
    }
    else if(var == 126){
      retval = MethodCall126_0();
    }
    else if(var == 127){
      retval = MethodCall127_0();
    }
    else if(var == 128){
      retval = MethodCall128_0();
    }
    else if(var == 129){
      retval = MethodCall129_0();
    }
    else if(var == 130){
      retval = MethodCall130_0();
    }
    else if(var == 131){
      retval = MethodCall131_0();
    }

    else throw new RuntimeException("CaseNum: "+var+" not found");
    return retval;
  }

  public static boolean MethodCall1_0(){
    i_thread_6 = 0;//motor.sysj line: 99, column: 2
    i_thread_6 = 0;//motor.sysj line: 101, column: 4
    return false;
  }
  public static boolean MethodCall2_0(){
    i_thread_6 = i_thread_6 + 1;//motor.sysj line: 104, column: 8
    return false;
  }
  public static boolean MethodCall3_0(){
    return i_thread_6 > 10;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall4_0(){
    ;//motor.sysj line: 102, column: 4
    i_thread_6 = 0;//motor.sysj line: 112, column: 4
    return false;
  }
  public static boolean MethodCall5_0(){
    i_thread_6 = i_thread_6 + 1;//motor.sysj line: 115, column: 8
    return false;
  }
  public static boolean MethodCall6_0(){
    return i_thread_6 > 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall7_0(){
    ;//motor.sysj line: 113, column: 4
    return false;
  }
  public static boolean MethodCall8_0(){
    i_thread_2 = 0;//motor.sysj line: 12, column: 2
    return false;
  }
  public static boolean MethodCall9_0(){
    return i_thread_2 == 15;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall10_0(){
    ;//motor.sysj line: 13, column: 2
    return false;
  }
  public static boolean MethodCall11_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 36, column: 8
    return false;
  }
  public static boolean MethodCall12_0(){
    return i_thread_3 == 1;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall13_0(){
    ;//motor.sysj line: 37, column: 8
    return false;
  }
  public static boolean MethodCall14_0(){
    ;//motor.sysj line: 32, column: 2
    return false;
  }
  public static boolean MethodCall15_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 48, column: 8
    return false;
  }
  public static boolean MethodCall16_0(){
    return i_thread_3 == 2;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall17_0(){
    ;//motor.sysj line: 49, column: 8
    return false;
  }
  public static boolean MethodCall18_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 52, column: 5
    return false;
  }
  public static boolean MethodCall19_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 40, column: 5
    return false;
  }
  public static boolean MethodCall20_0(){
    i_thread_4 = 0;//motor.sysj line: 64, column: 8
    return false;
  }
  public static boolean MethodCall21_0(){
    return i_thread_4 == 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall22_0(){
    ;//motor.sysj line: 65, column: 8
    return false;
  }
  public static boolean MethodCall23_0(){
    i_thread_4 = i_thread_4 + 1;//motor.sysj line: 68, column: 5
    return false;
  }
  public static boolean MethodCall24_0(){
    i_thread_2 = i_thread_2 + 1;//motor.sysj line: 16, column: 6
    return false;
  }
  public static boolean MethodCall25_0(){
    i_thread_2 = 0;//motor.sysj line: 22, column: 2
    return false;
  }
  public static boolean MethodCall26_0(){
    return i_thread_2 == 10;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall27_0(){
    ;//motor.sysj line: 23, column: 2
    return false;
  }
  public static boolean MethodCall28_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 36, column: 8
    return false;
  }
  public static boolean MethodCall29_0(){
    return i_thread_3 == 1;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall30_0(){
    ;//motor.sysj line: 37, column: 8
    return false;
  }
  public static boolean MethodCall31_0(){
    ;//motor.sysj line: 32, column: 2
    return false;
  }
  public static boolean MethodCall32_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 48, column: 8
    return false;
  }
  public static boolean MethodCall33_0(){
    return i_thread_3 == 2;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall34_0(){
    ;//motor.sysj line: 49, column: 8
    return false;
  }
  public static boolean MethodCall35_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 52, column: 5
    return false;
  }
  public static boolean MethodCall36_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 40, column: 5
    return false;
  }
  public static boolean MethodCall37_0(){
    i_thread_4 = 0;//motor.sysj line: 64, column: 8
    return false;
  }
  public static boolean MethodCall38_0(){
    return i_thread_4 == 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall39_0(){
    ;//motor.sysj line: 65, column: 8
    return false;
  }
  public static boolean MethodCall40_0(){
    i_thread_4 = i_thread_4 + 1;//motor.sysj line: 68, column: 5
    return false;
  }
  public static boolean MethodCall41_0(){
    i_thread_2 = i_thread_2 + 1;//motor.sysj line: 26, column: 6
    return false;
  }
  public static boolean MethodCall42_0(){
    return i_thread_2 == 15;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall43_0(){
    ;//motor.sysj line: 13, column: 2
    return false;
  }
  public static boolean MethodCall44_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 36, column: 8
    return false;
  }
  public static boolean MethodCall45_0(){
    return i_thread_3 == 1;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall46_0(){
    ;//motor.sysj line: 37, column: 8
    return false;
  }
  public static boolean MethodCall47_0(){
    ;//motor.sysj line: 32, column: 2
    return false;
  }
  public static boolean MethodCall48_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 48, column: 8
    return false;
  }
  public static boolean MethodCall49_0(){
    return i_thread_3 == 2;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall50_0(){
    ;//motor.sysj line: 49, column: 8
    return false;
  }
  public static boolean MethodCall51_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 52, column: 5
    return false;
  }
  public static boolean MethodCall52_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 40, column: 5
    return false;
  }
  public static boolean MethodCall53_0(){
    i_thread_4 = 0;//motor.sysj line: 64, column: 8
    return false;
  }
  public static boolean MethodCall54_0(){
    return i_thread_4 == 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall55_0(){
    ;//motor.sysj line: 65, column: 8
    return false;
  }
  public static boolean MethodCall56_0(){
    i_thread_4 = i_thread_4 + 1;//motor.sysj line: 68, column: 5
    return false;
  }
  public static boolean MethodCall57_0(){
    i_thread_2 = i_thread_2 + 1;//motor.sysj line: 16, column: 6
    return false;
  }
  public static boolean MethodCall58_0(){
    return i_thread_2 == 15;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall59_0(){
    ;//motor.sysj line: 13, column: 2
    return false;
  }
  public static boolean MethodCall60_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 36, column: 8
    return false;
  }
  public static boolean MethodCall61_0(){
    return i_thread_3 == 1;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall62_0(){
    ;//motor.sysj line: 37, column: 8
    return false;
  }
  public static boolean MethodCall63_0(){
    ;//motor.sysj line: 32, column: 2
    return false;
  }
  public static boolean MethodCall64_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 48, column: 8
    return false;
  }
  public static boolean MethodCall65_0(){
    return i_thread_3 == 2;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall66_0(){
    ;//motor.sysj line: 49, column: 8
    return false;
  }
  public static boolean MethodCall67_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 52, column: 5
    return false;
  }
  public static boolean MethodCall68_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 40, column: 5
    return false;
  }
  public static boolean MethodCall69_0(){
    i_thread_4 = 0;//motor.sysj line: 64, column: 8
    return false;
  }
  public static boolean MethodCall70_0(){
    return i_thread_4 == 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall71_0(){
    ;//motor.sysj line: 65, column: 8
    return false;
  }
  public static boolean MethodCall72_0(){
    i_thread_4 = i_thread_4 + 1;//motor.sysj line: 68, column: 5
    return false;
  }
  public static boolean MethodCall73_0(){
    i_thread_2 = i_thread_2 + 1;//motor.sysj line: 16, column: 6
    return false;
  }
  public static boolean MethodCall74_0(){
    return i_thread_2 == 10;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall75_0(){
    ;//motor.sysj line: 23, column: 2
    return false;
  }
  public static boolean MethodCall76_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 36, column: 8
    return false;
  }
  public static boolean MethodCall77_0(){
    return i_thread_3 == 1;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall78_0(){
    ;//motor.sysj line: 37, column: 8
    return false;
  }
  public static boolean MethodCall79_0(){
    ;//motor.sysj line: 32, column: 2
    return false;
  }
  public static boolean MethodCall80_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 48, column: 8
    return false;
  }
  public static boolean MethodCall81_0(){
    return i_thread_3 == 2;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall82_0(){
    ;//motor.sysj line: 49, column: 8
    return false;
  }
  public static boolean MethodCall83_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 52, column: 5
    return false;
  }
  public static boolean MethodCall84_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 40, column: 5
    return false;
  }
  public static boolean MethodCall85_0(){
    i_thread_4 = 0;//motor.sysj line: 64, column: 8
    return false;
  }
  public static boolean MethodCall86_0(){
    return i_thread_4 == 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall87_0(){
    ;//motor.sysj line: 65, column: 8
    return false;
  }
  public static boolean MethodCall88_0(){
    i_thread_4 = i_thread_4 + 1;//motor.sysj line: 68, column: 5
    return false;
  }
  public static boolean MethodCall89_0(){
    i_thread_2 = i_thread_2 + 1;//motor.sysj line: 26, column: 6
    return false;
  }
  public static boolean MethodCall90_0(){
    ;//motor.sysj line: 32, column: 2
    return false;
  }
  public static boolean MethodCall91_0(){
    return i_thread_3 == 1;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall92_0(){
    ;//motor.sysj line: 37, column: 8
    return false;
  }
  public static boolean MethodCall93_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 48, column: 8
    return false;
  }
  public static boolean MethodCall94_0(){
    return i_thread_3 == 2;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall95_0(){
    ;//motor.sysj line: 49, column: 8
    return false;
  }
  public static boolean MethodCall96_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 52, column: 5
    return false;
  }
  public static boolean MethodCall97_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 40, column: 5
    return false;
  }
  public static boolean MethodCall98_0(){
    return i_thread_3 == 2;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall99_0(){
    ;//motor.sysj line: 49, column: 8
    return false;
  }
  public static boolean MethodCall100_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 52, column: 5
    return false;
  }
  public static boolean MethodCall101_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 36, column: 8
    return false;
  }
  public static boolean MethodCall102_0(){
    return i_thread_3 == 1;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall103_0(){
    ;//motor.sysj line: 37, column: 8
    return false;
  }
  public static boolean MethodCall104_0(){
    currsigs0.addElement(Enable_1);
    Enable_1.setValue(new Boolean(false));
    i_thread_3 = 0;//motor.sysj line: 48, column: 8
    return false;
  }
  public static boolean MethodCall105_0(){
    return i_thread_3 == 2;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall106_0(){
    ;//motor.sysj line: 49, column: 8
    return false;
  }
  public static boolean MethodCall107_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 52, column: 5
    return false;
  }
  public static boolean MethodCall108_0(){
    i_thread_3 = i_thread_3 + 1;//motor.sysj line: 40, column: 5
    return false;
  }
  public static boolean MethodCall109_0(){
    return i_thread_4 == 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall110_0(){
    ;//motor.sysj line: 65, column: 8
    return false;
  }
  public static boolean MethodCall111_0(){
    i_thread_4 = i_thread_4 + 1;//motor.sysj line: 68, column: 5
    return false;
  }
  public static boolean MethodCall112_0(){
    currsigs0.addElement(Coil1_1);
    Coil1_1.setValue(new Boolean(true));
    return false;
  }
  public static boolean MethodCall113_0(){
    currsigs0.addElement(Coil2_1);
    Coil2_1.setValue(new Boolean(true));
    return false;
  }
  public static boolean MethodCall114_0(){
    currsigs0.addElement(Coil1_1);
    Coil1_1.setValue(new Boolean(true));
    return false;
  }
  public static boolean MethodCall115_0(){
    currsigs0.addElement(Coil2_1);
    Coil2_1.setValue(new Boolean(true));
    return false;
  }
  public static boolean MethodCall116_0(){
    i_thread_6 = i_thread_6 + 1;//motor.sysj line: 104, column: 8
    return false;
  }
  public static boolean MethodCall117_0(){
    return i_thread_6 > 10;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall118_0(){
    ;//motor.sysj line: 102, column: 4
    i_thread_6 = 0;//motor.sysj line: 112, column: 4
    return false;
  }
  public static boolean MethodCall119_0(){
    i_thread_6 = i_thread_6 + 1;//motor.sysj line: 115, column: 8
    return false;
  }
  public static boolean MethodCall120_0(){
    return i_thread_6 > 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall121_0(){
    ;//motor.sysj line: 113, column: 4
    return false;
  }
  public static boolean MethodCall122_0(){
    i_thread_6 = i_thread_6 + 1;//motor.sysj line: 115, column: 8
    return false;
  }
  public static boolean MethodCall123_0(){
    return i_thread_6 > 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall124_0(){
    ;//motor.sysj line: 113, column: 4
    return false;
  }
  public static boolean MethodCall125_0(){
    i_thread_6 = 0;//motor.sysj line: 101, column: 4
    return false;
  }
  public static boolean MethodCall126_0(){
    i_thread_6 = i_thread_6 + 1;//motor.sysj line: 104, column: 8
    return false;
  }
  public static boolean MethodCall127_0(){
    return i_thread_6 > 10;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall128_0(){
    ;//motor.sysj line: 102, column: 4
    i_thread_6 = 0;//motor.sysj line: 112, column: 4
    return false;
  }
  public static boolean MethodCall129_0(){
    i_thread_6 = i_thread_6 + 1;//motor.sysj line: 115, column: 8
    return false;
  }
  public static boolean MethodCall130_0(){
    return i_thread_6 > 7;//Unknown file line: 0, column: 0
  }
  public static boolean MethodCall131_0(){
    ;//motor.sysj line: 113, column: 4
    return false;
  }

}
                                                                                                                                                                                                  
