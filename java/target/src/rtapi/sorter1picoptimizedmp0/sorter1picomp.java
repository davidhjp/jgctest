package sorter1picoptimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.Signal;
import camera.*;//sorter1pic.sysj line: 1, column: 1

public class sorter1picomp{
  private static boolean retval = false;
  private static int dl = 0;
  private static Vector currsigs0 = new Vector();
  private static Signal NEWITEM;
  private static Signal ITEMPICKED;
  private static Signal ITEMRECOGNIZED;
  private static Signal STOPLOADER;
  private static Signal picture_1;
  private static Signal edgepicture_1;
  private static int load_thread_2;//sorter1pic.sysj line: 8, column: 5
  private static int CAPACITY_thread_2;//sorter1pic.sysj line: 9, column: 5
  private static Image imm_thread_4;//sorter1pic.sysj line: 24, column: 4
  private static Image imm2_thread_4;//sorter1pic.sysj line: 25, column: 4
  private static String picc_thread_5;//sorter1pic.sysj line: 29, column: 4
  private static String picc2_thread_5;//sorter1pic.sysj line: 30, column: 4
  private static String picc_thread_6;//sorter1pic.sysj line: 34, column: 4
  private static String picc2_thread_6;//sorter1pic.sysj line: 35, column: 4
  public static void init(){
NEWITEM = new Signal();
  ITEMPICKED = new Signal();
  ITEMRECOGNIZED = new Signal();
  STOPLOADER = new Signal();
  picture_1 = new Signal();
  edgepicture_1 = new Signal();
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
load_thread_2 = 0;//sorter1pic.sysj line: 8, column: 5
CAPACITY_thread_2 = 10;//sorter1pic.sysj line: 9, column: 5
    return false;
    }
    public static boolean MethodCall2_0(){
load_thread_2 = load_thread_2 + 1;//sorter1pic.sysj line: 11, column: 24
    return false;
    }
    public static boolean MethodCall3_0(){
load_thread_2 = load_thread_2 - 1;//sorter1pic.sysj line: 12, column: 27
    return false;
    }
    public static boolean MethodCall4_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall5_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall6_0(){
load_thread_2 = load_thread_2 - 1;//sorter1pic.sysj line: 12, column: 27
    return false;
    }
    public static boolean MethodCall7_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall8_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall9_0(){
load_thread_2 = load_thread_2 + 1;//sorter1pic.sysj line: 11, column: 24
    return false;
    }
    public static boolean MethodCall10_0(){
load_thread_2 = load_thread_2 - 1;//sorter1pic.sysj line: 12, column: 27
    return false;
    }
    public static boolean MethodCall11_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall12_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall13_0(){
load_thread_2 = load_thread_2 - 1;//sorter1pic.sysj line: 12, column: 27
    return false;
    }
    public static boolean MethodCall14_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall15_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall16_0(){
load_thread_2 = load_thread_2 + 1;//sorter1pic.sysj line: 11, column: 24
    return false;
    }
    public static boolean MethodCall17_0(){
load_thread_2 = load_thread_2 - 1;//sorter1pic.sysj line: 12, column: 27
    return false;
    }
    public static boolean MethodCall18_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall19_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall20_0(){
load_thread_2 = load_thread_2 - 1;//sorter1pic.sysj line: 12, column: 27
    return false;
    }
    public static boolean MethodCall21_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall22_0(){
return load_thread_2 >= CAPACITY_thread_2;//Unknown file line: 0, column: 0
    }
    public static boolean MethodCall23_0(){
imm_thread_4 = Camera.takepicture();//sorter1pic.sysj line: 24, column: 4
imm2_thread_4 = new Image(imm_thread_4);//sorter1pic.sysj line: 25, column: 4
currsigs0.addElement(picture_1);
    picture_1.setValue(imm2_thread_4);
    return false;
    }
    public static boolean MethodCall24_0(){
picc_thread_5 = (String)Process_Image.edge_detection((Image)picture_1.getpreval());//sorter1pic.sysj line: 29, column: 4
picc2_thread_5 = new String(picc_thread_5);//sorter1pic.sysj line: 30, column: 4
currsigs0.addElement(edgepicture_1);
    edgepicture_1.setValue(picc2_thread_5);
    return false;
    }
    public static boolean MethodCall25_0(){
picc_thread_6 = ((Image)edgepicture_1.getpreval()).get_item_type();//sorter1pic.sysj line: 34, column: 4
picc2_thread_6 = new String(picc_thread_6);//sorter1pic.sysj line: 35, column: 4
currsigs0.addElement(ITEMRECOGNIZED);
    ITEMRECOGNIZED.setValue(picc2_thread_6);
    return false;
    }

}
                                                                                          
