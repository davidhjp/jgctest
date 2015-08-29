package CruiseManageroptimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.Signal;

public class CruiseManageromp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static Signal set_1;
  private static Signal off_1;
  private static Signal resume_1;
  private static Signal quickAccel_1;
  private static Signal quickDecel_1;
  private static Signal brakePressed_1;
  private static Signal clock_1;
  private static Signal speed_1;
  private static Signal zregulOff_1;
  private static Signal regulStdby_1;
  private static Signal regulSet_1;
  private static Signal regulResume_1;
  private static Signal speedSet_1;
  private static Signal cruiseSpeed_1;
  private static Signal testt1_1;
  private static short t_thread_2;//CruiseManager.sysj line: 288, column: 2
  private static int stateVar_thread_6;//CruiseManager.sysj line: 32, column: 7
  private static short sysjtmpspeedInDataWITH1_thread_5;//CruiseManager.sysj line: 24, column: 2
  private static short sysjtmpspeedtrans00_thread_6;//CruiseManager.sysj line: 42, column: 3
  private static short sysjtmpspeedtrans11_thread_6;//CruiseManager.sysj line: 66, column: 7
  private static short sysjtmpspeedtrans21_thread_6;//CruiseManager.sysj line: 109, column: 9
  private static short sysjtmpspeedtrans31_thread_6;//CruiseManager.sysj line: 176, column: 4
  private static short sysjtmpspeedtrans41_thread_6;//CruiseManager.sysj line: 219, column: 6
  private static short sysjtmpcruiseSpeedInDataWITH1_thread_7;//CruiseManager.sysj line: 260, column: 6
  public static void main(String args[]){
    set_1 = new Signal();
    off_1 = new Signal();
    resume_1 = new Signal();
    quickAccel_1 = new Signal();
    quickDecel_1 = new Signal();
    brakePressed_1 = new Signal();
    clock_1 = new Signal();
    speed_1 = new Signal();
    zregulOff_1 = new Signal();
    regulStdby_1 = new Signal();
    regulSet_1 = new Signal();
    regulResume_1 = new Signal();
    speedSet_1 = new Signal();
    cruiseSpeed_1 = new Signal();
    testt1_1 = new Signal();
    CruiseManageromp t_procs = new CruiseManageromp();
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
    private boolean cbackcall0_1(int var){
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
    else if(var == 132){
    retval = MethodCall132_0();
    }
    else if(var == 133){
    retval = MethodCall133_0();
    }
    else if(var == 134){
    retval = MethodCall134_0();
    }
    else if(var == 135){
    retval = MethodCall135_0();
    }
    else if(var == 136){
    retval = MethodCall136_0();
    }
    else if(var == 137){
    retval = MethodCall137_0();
    }
    else if(var == 138){
    retval = MethodCall138_0();
    }
    else if(var == 139){
    retval = MethodCall139_0();
    }
    else if(var == 140){
    retval = MethodCall140_0();
    }
    else if(var == 141){
    retval = MethodCall141_0();
    }
    else if(var == 142){
    retval = MethodCall142_0();
    }

    else throw new RuntimeException("CaseNum: "+var+" not found");
    return retval;
    }

        public boolean MethodCall1_0(){
t_thread_2 = 9;//CruiseManager.sysj line: 288, column: 2
currsigs0.addElement(speed_1);
    short tmpval634860 = t_thread_2;
speed_1.setValue(new Short(tmpval634860));
    return false;
    }
    public boolean MethodCall2_0(){
System.out.println("tick 0-A");//CruiseManager.sysj line: 291, column: 2
    return false;
    }
    public boolean MethodCall3_0(){
System.out.println("tick 0-B");//CruiseManager.sysj line: 308, column: 6
    return false;
    }
    public boolean MethodCall4_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 32, column: 7
    return false;
    }
    public boolean MethodCall5_0(){
System.out.println("tick 1-A");//CruiseManager.sysj line: 293, column: 2
    return false;
    }
    public boolean MethodCall6_0(){
System.out.println("tick 2-A");//CruiseManager.sysj line: 295, column: 2
    return false;
    }
    public boolean MethodCall7_0(){
System.out.println("tick 3-A");//CruiseManager.sysj line: 297, column: 2
    return false;
    }
    public boolean MethodCall8_0(){
System.out.println("tick 4-A");//CruiseManager.sysj line: 299, column: 2
    return false;
    }
    public boolean MethodCall9_0(){
System.out.println("tick 1-B");//CruiseManager.sysj line: 310, column: 6
    return false;
    }
    public boolean MethodCall10_0(){
System.out.println("tick 2-B");//CruiseManager.sysj line: 312, column: 6
    return false;
    }
    public boolean MethodCall11_0(){
System.out.println("tick 3-B");//CruiseManager.sysj line: 314, column: 6
    return false;
    }
    public boolean MethodCall12_0(){
System.out.println("tick 4-B");//CruiseManager.sysj line: 316, column: 6
    return false;
    }
    public boolean MethodCall13_0(){
sysjtmpspeedInDataWITH1_thread_5 = 0;//CruiseManager.sysj line: 24, column: 2
sysjtmpspeedInDataWITH1_thread_5 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 25, column: 2
currsigs0.addElement(speed_1);
    short tmpval634861 = sysjtmpspeedInDataWITH1_thread_5;
speed_1.setValue(new Short(tmpval634861));
    return false;
    }
    public boolean MethodCall14_0(){
return stateVar_thread_6 == 0;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall15_0(){
return stateVar_thread_6 == 1;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall16_0(){
return stateVar_thread_6 == 2;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall17_0(){
return stateVar_thread_6 == 3;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall18_0(){
return stateVar_thread_6 == 4;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall19_0(){
sysjtmpspeedtrans00_thread_6 = 0;//CruiseManager.sysj line: 42, column: 3
sysjtmpspeedtrans00_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 43, column: 3
    return false;
    }
    public boolean MethodCall20_0(){
return sysjtmpspeedtrans00_thread_6 > 50 && sysjtmpspeedtrans00_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall21_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 45, column: 5
    return false;
    }
    public boolean MethodCall22_0(){
;//CruiseManager.sysj line: 38, column: 4
    return false;
    }
    public boolean MethodCall23_0(){
sysjtmpspeedtrans00_thread_6 = 0;//CruiseManager.sysj line: 42, column: 3
sysjtmpspeedtrans00_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 43, column: 3
    return false;
    }
    public boolean MethodCall24_0(){
return sysjtmpspeedtrans00_thread_6 > 50 && sysjtmpspeedtrans00_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall25_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 45, column: 5
    return false;
    }
    public boolean MethodCall26_0(){
;//CruiseManager.sysj line: 38, column: 4
    return false;
    }
    public boolean MethodCall27_0(){
sysjtmpspeedtrans00_thread_6 = 0;//CruiseManager.sysj line: 42, column: 3
sysjtmpspeedtrans00_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 43, column: 3
    return false;
    }
    public boolean MethodCall28_0(){
return sysjtmpspeedtrans00_thread_6 > 50 && sysjtmpspeedtrans00_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall29_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 45, column: 5
    return false;
    }
    public boolean MethodCall30_0(){
;//CruiseManager.sysj line: 38, column: 4
    return false;
    }
    public boolean MethodCall31_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 61, column: 5
    return false;
    }
    public boolean MethodCall32_0(){
;//CruiseManager.sysj line: 57, column: 6
    return false;
    }
    public boolean MethodCall33_0(){
sysjtmpspeedtrans11_thread_6 = 0;//CruiseManager.sysj line: 66, column: 7
sysjtmpspeedtrans11_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 67, column: 7
    return false;
    }
    public boolean MethodCall34_0(){
return sysjtmpspeedtrans11_thread_6 > 50 && sysjtmpspeedtrans11_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall35_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 69, column: 9
    return false;
    }
    public boolean MethodCall36_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 75, column: 9
    return false;
    }
    public boolean MethodCall37_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 80, column: 4
    return false;
    }
    public boolean MethodCall38_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 85, column: 6
    return false;
    }
    public boolean MethodCall39_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 61, column: 5
    return false;
    }
    public boolean MethodCall40_0(){
;//CruiseManager.sysj line: 57, column: 6
    return false;
    }
    public boolean MethodCall41_0(){
sysjtmpspeedtrans11_thread_6 = 0;//CruiseManager.sysj line: 66, column: 7
sysjtmpspeedtrans11_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 67, column: 7
    return false;
    }
    public boolean MethodCall42_0(){
return sysjtmpspeedtrans11_thread_6 > 50 && sysjtmpspeedtrans11_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall43_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 69, column: 9
    return false;
    }
    public boolean MethodCall44_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 75, column: 9
    return false;
    }
    public boolean MethodCall45_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 80, column: 4
    return false;
    }
    public boolean MethodCall46_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 85, column: 6
    return false;
    }
    public boolean MethodCall47_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 61, column: 5
    return false;
    }
    public boolean MethodCall48_0(){
;//CruiseManager.sysj line: 57, column: 6
    return false;
    }
    public boolean MethodCall49_0(){
sysjtmpspeedtrans11_thread_6 = 0;//CruiseManager.sysj line: 66, column: 7
sysjtmpspeedtrans11_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 67, column: 7
    return false;
    }
    public boolean MethodCall50_0(){
return sysjtmpspeedtrans11_thread_6 > 50 && sysjtmpspeedtrans11_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall51_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 69, column: 9
    return false;
    }
    public boolean MethodCall52_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 75, column: 9
    return false;
    }
    public boolean MethodCall53_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 80, column: 4
    return false;
    }
    public boolean MethodCall54_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 85, column: 6
    return false;
    }
    public boolean MethodCall55_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 104, column: 7
    return false;
    }
    public boolean MethodCall56_0(){
;//CruiseManager.sysj line: 100, column: 8
    return false;
    }
    public boolean MethodCall57_0(){
sysjtmpspeedtrans21_thread_6 = 0;//CruiseManager.sysj line: 109, column: 9
sysjtmpspeedtrans21_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 110, column: 9
    return false;
    }
    public boolean MethodCall58_0(){
return sysjtmpspeedtrans21_thread_6 > 50 && sysjtmpspeedtrans21_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall59_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 112, column: 4
    return false;
    }
    public boolean MethodCall60_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 104, column: 7
    return false;
    }
    public boolean MethodCall61_0(){
;//CruiseManager.sysj line: 100, column: 8
    return false;
    }
    public boolean MethodCall62_0(){
sysjtmpspeedtrans21_thread_6 = 0;//CruiseManager.sysj line: 109, column: 9
sysjtmpspeedtrans21_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 110, column: 9
    return false;
    }
    public boolean MethodCall63_0(){
return sysjtmpspeedtrans21_thread_6 > 50 && sysjtmpspeedtrans21_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall64_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 112, column: 4
    return false;
    }
    public boolean MethodCall65_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 123, column: 8
    return false;
    }
    public boolean MethodCall66_0(){
;//CruiseManager.sysj line: 100, column: 8
    return false;
    }
    public boolean MethodCall67_0(){
sysjtmpspeedtrans11_thread_6 = 0;//CruiseManager.sysj line: 128, column: 10
sysjtmpspeedtrans11_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 129, column: 10
    return false;
    }
    public boolean MethodCall68_0(){
return sysjtmpspeedtrans11_thread_6 > 50 && sysjtmpspeedtrans11_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall69_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 131, column: 5
    return false;
    }
    public boolean MethodCall70_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 137, column: 5
    return false;
    }
    public boolean MethodCall71_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 142, column: 7
    return false;
    }
    public boolean MethodCall72_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 147, column: 9
    return false;
    }
    public boolean MethodCall73_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 123, column: 8
    return false;
    }
    public boolean MethodCall74_0(){
;//CruiseManager.sysj line: 100, column: 8
    return false;
    }
    public boolean MethodCall75_0(){
sysjtmpspeedtrans11_thread_6 = 0;//CruiseManager.sysj line: 128, column: 10
sysjtmpspeedtrans11_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 129, column: 10
    return false;
    }
    public boolean MethodCall76_0(){
return sysjtmpspeedtrans11_thread_6 > 50 && sysjtmpspeedtrans11_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall77_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 131, column: 5
    return false;
    }
    public boolean MethodCall78_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 137, column: 5
    return false;
    }
    public boolean MethodCall79_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 142, column: 7
    return false;
    }
    public boolean MethodCall80_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 147, column: 9
    return false;
    }
    public boolean MethodCall81_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 123, column: 8
    return false;
    }
    public boolean MethodCall82_0(){
;//CruiseManager.sysj line: 100, column: 8
    return false;
    }
    public boolean MethodCall83_0(){
sysjtmpspeedtrans11_thread_6 = 0;//CruiseManager.sysj line: 128, column: 10
sysjtmpspeedtrans11_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 129, column: 10
    return false;
    }
    public boolean MethodCall84_0(){
return sysjtmpspeedtrans11_thread_6 > 50 && sysjtmpspeedtrans11_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall85_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 131, column: 5
    return false;
    }
    public boolean MethodCall86_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 137, column: 5
    return false;
    }
    public boolean MethodCall87_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 142, column: 7
    return false;
    }
    public boolean MethodCall88_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 147, column: 9
    return false;
    }
    public boolean MethodCall89_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 104, column: 7
    return false;
    }
    public boolean MethodCall90_0(){
;//CruiseManager.sysj line: 100, column: 8
    return false;
    }
    public boolean MethodCall91_0(){
sysjtmpspeedtrans21_thread_6 = 0;//CruiseManager.sysj line: 109, column: 9
sysjtmpspeedtrans21_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 110, column: 9
    return false;
    }
    public boolean MethodCall92_0(){
return sysjtmpspeedtrans21_thread_6 > 50 && sysjtmpspeedtrans21_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall93_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 112, column: 4
    return false;
    }
    public boolean MethodCall94_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 171, column: 9
    return false;
    }
    public boolean MethodCall95_0(){
;//CruiseManager.sysj line: 167, column: 3
    return false;
    }
    public boolean MethodCall96_0(){
sysjtmpspeedtrans31_thread_6 = 0;//CruiseManager.sysj line: 176, column: 4
sysjtmpspeedtrans31_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 177, column: 4
    return false;
    }
    public boolean MethodCall97_0(){
return sysjtmpspeedtrans31_thread_6 > 50 && sysjtmpspeedtrans31_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall98_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 179, column: 6
    return false;
    }
    public boolean MethodCall99_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 185, column: 6
    return false;
    }
    public boolean MethodCall100_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 190, column: 8
    return false;
    }
    public boolean MethodCall101_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 195, column: 10
    return false;
    }
    public boolean MethodCall102_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 171, column: 9
    return false;
    }
    public boolean MethodCall103_0(){
;//CruiseManager.sysj line: 167, column: 3
    return false;
    }
    public boolean MethodCall104_0(){
sysjtmpspeedtrans31_thread_6 = 0;//CruiseManager.sysj line: 176, column: 4
sysjtmpspeedtrans31_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 177, column: 4
    return false;
    }
    public boolean MethodCall105_0(){
return sysjtmpspeedtrans31_thread_6 > 50 && sysjtmpspeedtrans31_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall106_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 179, column: 6
    return false;
    }
    public boolean MethodCall107_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 185, column: 6
    return false;
    }
    public boolean MethodCall108_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 190, column: 8
    return false;
    }
    public boolean MethodCall109_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 195, column: 10
    return false;
    }
    public boolean MethodCall110_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 171, column: 9
    return false;
    }
    public boolean MethodCall111_0(){
;//CruiseManager.sysj line: 167, column: 3
    return false;
    }
    public boolean MethodCall112_0(){
sysjtmpspeedtrans31_thread_6 = 0;//CruiseManager.sysj line: 176, column: 4
sysjtmpspeedtrans31_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 177, column: 4
    return false;
    }
    public boolean MethodCall113_0(){
return sysjtmpspeedtrans31_thread_6 > 50 && sysjtmpspeedtrans31_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall114_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 179, column: 6
    return false;
    }
    public boolean MethodCall115_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 185, column: 6
    return false;
    }
    public boolean MethodCall116_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 190, column: 8
    return false;
    }
    public boolean MethodCall117_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 195, column: 10
    return false;
    }
    public boolean MethodCall118_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 214, column: 4
    return false;
    }
    public boolean MethodCall119_0(){
;//CruiseManager.sysj line: 210, column: 5
    return false;
    }
    public boolean MethodCall120_0(){
sysjtmpspeedtrans41_thread_6 = 0;//CruiseManager.sysj line: 219, column: 6
sysjtmpspeedtrans41_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 220, column: 6
    return false;
    }
    public boolean MethodCall121_0(){
return sysjtmpspeedtrans41_thread_6 > 50 && sysjtmpspeedtrans41_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall122_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 222, column: 8
    return false;
    }
    public boolean MethodCall123_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 228, column: 8
    return false;
    }
    public boolean MethodCall124_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 233, column: 10
    return false;
    }
    public boolean MethodCall125_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 238, column: 5
    return false;
    }
    public boolean MethodCall126_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 214, column: 4
    return false;
    }
    public boolean MethodCall127_0(){
;//CruiseManager.sysj line: 210, column: 5
    return false;
    }
    public boolean MethodCall128_0(){
sysjtmpspeedtrans41_thread_6 = 0;//CruiseManager.sysj line: 219, column: 6
sysjtmpspeedtrans41_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 220, column: 6
    return false;
    }
    public boolean MethodCall129_0(){
return sysjtmpspeedtrans41_thread_6 > 50 && sysjtmpspeedtrans41_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall130_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 222, column: 8
    return false;
    }
    public boolean MethodCall131_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 228, column: 8
    return false;
    }
    public boolean MethodCall132_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 233, column: 10
    return false;
    }
    public boolean MethodCall133_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 238, column: 5
    return false;
    }
    public boolean MethodCall134_0(){
stateVar_thread_6 = 0;//CruiseManager.sysj line: 214, column: 4
    return false;
    }
    public boolean MethodCall135_0(){
;//CruiseManager.sysj line: 210, column: 5
    return false;
    }
    public boolean MethodCall136_0(){
sysjtmpspeedtrans41_thread_6 = 0;//CruiseManager.sysj line: 219, column: 6
sysjtmpspeedtrans41_thread_6 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 220, column: 6
    return false;
    }
    public boolean MethodCall137_0(){
return sysjtmpspeedtrans41_thread_6 > 50 && sysjtmpspeedtrans41_thread_6 < 170;//Unknown file line: 0, column: 0
    }
    public boolean MethodCall138_0(){
stateVar_thread_6 = 1;//CruiseManager.sysj line: 222, column: 8
    return false;
    }
    public boolean MethodCall139_0(){
stateVar_thread_6 = 2;//CruiseManager.sysj line: 228, column: 8
    return false;
    }
    public boolean MethodCall140_0(){
stateVar_thread_6 = 3;//CruiseManager.sysj line: 233, column: 10
    return false;
    }
    public boolean MethodCall141_0(){
stateVar_thread_6 = 4;//CruiseManager.sysj line: 238, column: 5
    return false;
    }
    public boolean MethodCall142_0(){
sysjtmpcruiseSpeedInDataWITH1_thread_7 = 0;//CruiseManager.sysj line: 260, column: 6
sysjtmpcruiseSpeedInDataWITH1_thread_7 = ((Short)speed_1.getpreval()).shortValue();//CruiseManager.sysj line: 261, column: 6
currsigs0.addElement(cruiseSpeed_1);
    int tmpval634862 = sysjtmpcruiseSpeedInDataWITH1_thread_7;
cruiseSpeed_1.setValue(new Integer(tmpval634862));
    return false;
    }

}
                                                                                                                                                                                                                                                                                                                                                                                                    
