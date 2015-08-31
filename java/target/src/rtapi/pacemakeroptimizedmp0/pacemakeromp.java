package pacemakeroptimizedmp0;
import java.util.*;
import systemj.lib.Signal;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import org.pacemaker.*;//pacemaker.sysj line: 6, column: 1

public class pacemakeromp{
	private static boolean retval = false;
	private static int dl = 0;
	private static Vector currsigs0 = new Vector();
	private static Signal PWAVE_1;
	private static Signal QRScomplex_1;
	private static Signal VAI_1;
	private static Signal DDIR_1;
	private static Signal STATE_1;
	private static Signal lastVentricularActivity_1;
	private static Signal lastAtriumActivity_1;
	private static Signal atriumActivityOccured_1;
	private static Signal ventricularActivityOccured_1;
	private static Signal PVARP_5;
	private static Signal VAI2_5;
	private static Signal AVI_11;
	private static Signal PVARPAVI_11;
	private static int i_thread_2;//pacemaker.sysj line: 224, column: 8
	private static int l_thread_2;//pacemaker.sysj line: 231, column: 6
	private static int i_thread_6;//pacemaker.sysj line: 28, column: 7
	private static int i_thread_8;//pacemaker.sysj line: 73, column: 8
	private static int i_thread_9;//pacemaker.sysj line: 87, column: 3
	private static int i_thread_10;//pacemaker.sysj line: 101, column: 5
	private static int i_thread_12;//pacemaker.sysj line: 133, column: 5
	private static int i_thread_14;//pacemaker.sysj line: 174, column: 8
	private static int i_thread_15;//pacemaker.sysj line: 192, column: 3
	private static int st_thread_1;//pacemaker.sysj line: 311, column: 7
	private static int i_thread_4;//pacemaker.sysj line: 272, column: 5
	public static void main(String args[]){
		PWAVE_1 = new Signal();
		QRScomplex_1 = new Signal();
		VAI_1 = new Signal();
		DDIR_1 = new Signal();
		STATE_1 = new Signal();
		lastVentricularActivity_1 = new Signal();
		lastAtriumActivity_1 = new Signal();
		atriumActivityOccured_1 = new Signal();
		ventricularActivityOccured_1 = new Signal();
		PVARP_5 = new Signal();
		VAI2_5 = new Signal();
		AVI_11 = new Signal();
		PVARPAVI_11 = new Signal();
		pacemakeromp t_procs = new pacemakeromp();
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
		else if(var == 143){
			retval = MethodCall143_0();
		}
		else if(var == 144){
			retval = MethodCall144_0();
		}
		else if(var == 145){
			retval = MethodCall145_0();
		}
		else if(var == 146){
			retval = MethodCall146_0();
		}
		else if(var == 147){
			retval = MethodCall147_0();
		}
		else if(var == 148){
			retval = MethodCall148_0();
		}
		else if(var == 149){
			retval = MethodCall149_0();
		}
		else if(var == 150){
			retval = MethodCall150_0();
		}
		else if(var == 151){
			retval = MethodCall151_0();
		}
		else if(var == 152){
			retval = MethodCall152_0();
		}
		else if(var == 153){
			retval = MethodCall153_0();
		}
		else if(var == 154){
			retval = MethodCall154_0();
		}
		else if(var == 155){
			retval = MethodCall155_0();
		}
		else if(var == 156){
			retval = MethodCall156_0();
		}
		else if(var == 157){
			retval = MethodCall157_0();
		}
		else if(var == 158){
			retval = MethodCall158_0();
		}
		else if(var == 159){
			retval = MethodCall159_0();
		}
		else if(var == 160){
			retval = MethodCall160_0();
		}
		else if(var == 161){
			retval = MethodCall161_0();
		}
		else if(var == 162){
			retval = MethodCall162_0();
		}

		else retval = cbackcall0_2(var);
		return retval;
	}
	private boolean cbackcall0_2(int var){
		boolean retval = false;
		if(var == 163){
			retval = MethodCall163_0();
		}
		else if(var == 164){
			retval = MethodCall164_0();
		}
		else if(var == 165){
			retval = MethodCall165_0();
		}
		else if(var == 166){
			retval = MethodCall166_0();
		}
		else if(var == 167){
			retval = MethodCall167_0();
		}
		else if(var == 168){
			retval = MethodCall168_0();
		}
		else if(var == 169){
			retval = MethodCall169_0();
		}
		else if(var == 170){
			retval = MethodCall170_0();
		}
		else if(var == 171){
			retval = MethodCall171_0();
		}
		else if(var == 172){
			retval = MethodCall172_0();
		}
		else if(var == 173){
			retval = MethodCall173_0();
		}
		else if(var == 174){
			retval = MethodCall174_0();
		}
		else if(var == 175){
			retval = MethodCall175_0();
		}
		else if(var == 176){
			retval = MethodCall176_0();
		}
		else if(var == 177){
			retval = MethodCall177_0();
		}
		else if(var == 178){
			retval = MethodCall178_0();
		}
		else if(var == 179){
			retval = MethodCall179_0();
		}
		else if(var == 180){
			retval = MethodCall180_0();
		}

		else throw new RuntimeException("CaseNum: "+var+" not found");
		return retval;
	}

	public boolean MethodCall1_0(){
		currsigs0.addElement(ventricularActivityOccured_1);
		ventricularActivityOccured_1.setValue(new Boolean(true));
		currsigs0.addElement(atriumActivityOccured_1);
		atriumActivityOccured_1.setValue(new Boolean(false));
		currsigs0.addElement(STATE_1);
		STATE_1.setValue(new Integer(0));
		return false;
	}
	public boolean MethodCall2_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 0;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall3_0(){
		Intervals.printA();//pacemaker.sysj line: 222, column: 6
		i_thread_2 = 0;//pacemaker.sysj line: 224, column: 8
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 225, column: 23
		return false;
	}
	public boolean MethodCall4_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall5_0(){
		Intervals.printB();//pacemaker.sysj line: 230, column: 6
		l_thread_2 = 0;//pacemaker.sysj line: 231, column: 6
		return false;
	}
	public boolean MethodCall6_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 2;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall7_0(){
		Intervals.printC();//pacemaker.sysj line: 248, column: 6
		System.out.println("===== DDDR Mode =====");//pacemaker.sysj line: 249, column: 6
		return false;
	}
	public boolean MethodCall8_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 252, column: 8
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 253, column: 23
		return false;
	}
	public boolean MethodCall9_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 3;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall10_0(){
		Intervals.printD();//pacemaker.sysj line: 284, column: 6
		l_thread_2 = 0;//pacemaker.sysj line: 285, column: 6
		return false;
	}
	public boolean MethodCall11_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 288, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 289, column: 18
		return false;
	}
	public boolean MethodCall12_0(){
		return atriumActivityOccured_1.getpreval() == Boolean.FALSE;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall13_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 28, column: 7
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 29, column: 14
		return false;
	}
	public boolean MethodCall14_0(){
		System.out.println("A : PWAVE NOT detected!");//pacemaker.sysj line: 38, column: 8
		return false;
	}
	public boolean MethodCall15_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 46, column: 5
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 47, column: 12
		return false;
	}
	public boolean MethodCall16_0(){
		System.out.println("A : Time elapse since last atrium activity <= VAI, NOT pacing...");//pacemaker.sysj line: 52, column: 17
		return false;
	}
	public boolean MethodCall17_0(){
		i_thread_8 = 0;//pacemaker.sysj line: 73, column: 8
		i_thread_8 = i_thread_8 + 1;//pacemaker.sysj line: 74, column: 22
		return false;
	}
	public boolean MethodCall18_0(){
		i_thread_9 = 0;//pacemaker.sysj line: 87, column: 3
		i_thread_9 = i_thread_9 + 1;//pacemaker.sysj line: 88, column: 17
		return false;
	}
	public boolean MethodCall19_0(){
		i_thread_10 = 0;//pacemaker.sysj line: 101, column: 5
		i_thread_10 = i_thread_10 + 1;//pacemaker.sysj line: 102, column: 19
		return false;
	}
	public boolean MethodCall20_0(){
		return ventricularActivityOccured_1.getpreval() == Boolean.FALSE;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall21_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 133, column: 5
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 134, column: 19
		return false;
	}
	public boolean MethodCall22_0(){
		System.out.println("V : QRSComplex NOT detected");//pacemaker.sysj line: 148, column: 4
		return false;
	}
	public boolean MethodCall23_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 155, column: 8
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 156, column: 23
		return false;
	}
	public boolean MethodCall24_0(){
		System.out.println("V : Time elapse since last ventricular activity <= PVARP+VAI, NOT pacing...");//pacemaker.sysj line: 161, column: 13
		return false;
	}
	public boolean MethodCall25_0(){
		i_thread_14 = 0;//pacemaker.sysj line: 174, column: 8
		i_thread_14 = i_thread_14 + 1;//pacemaker.sysj line: 175, column: 22
		return false;
	}
	public boolean MethodCall26_0(){
		i_thread_15 = 0;//pacemaker.sysj line: 192, column: 3
		i_thread_15 = i_thread_15 + 1;//pacemaker.sysj line: 193, column: 18
		return false;
	}
	public boolean MethodCall27_0(){
		st_thread_1 = ((Integer)STATE_1.getpreval()).intValue();//pacemaker.sysj line: 311, column: 7
		currsigs0.addElement(STATE_1);
		int rr = (st_thread_1 = st_thread_1 + 1);
		STATE_1.setValue(new Integer(rr));
		currsigs0.addElement(ventricularActivityOccured_1);
		ventricularActivityOccured_1.setValue(new Boolean(true));
		currsigs0.addElement(atriumActivityOccured_1);
		atriumActivityOccured_1.setValue(new Boolean(false));
		return false;
	}
	public boolean MethodCall28_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 0;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall29_0(){
		Intervals.printA();//pacemaker.sysj line: 222, column: 6
		i_thread_2 = 0;//pacemaker.sysj line: 224, column: 8
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 225, column: 23
		return false;
	}
	public boolean MethodCall30_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall31_0(){
		Intervals.printB();//pacemaker.sysj line: 230, column: 6
		l_thread_2 = 0;//pacemaker.sysj line: 231, column: 6
		return false;
	}
	public boolean MethodCall32_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 2;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall33_0(){
		Intervals.printC();//pacemaker.sysj line: 248, column: 6
		System.out.println("===== DDDR Mode =====");//pacemaker.sysj line: 249, column: 6
		return false;
	}
	public boolean MethodCall34_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 252, column: 8
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 253, column: 23
		return false;
	}
	public boolean MethodCall35_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 3;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall36_0(){
		Intervals.printD();//pacemaker.sysj line: 284, column: 6
		l_thread_2 = 0;//pacemaker.sysj line: 285, column: 6
		return false;
	}
	public boolean MethodCall37_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 288, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 289, column: 18
		return false;
	}
	public boolean MethodCall38_0(){
		return atriumActivityOccured_1.getpreval() == Boolean.FALSE;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall39_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 28, column: 7
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 29, column: 14
		return false;
	}
	public boolean MethodCall40_0(){
		System.out.println("A : PWAVE NOT detected!");//pacemaker.sysj line: 38, column: 8
		return false;
	}
	public boolean MethodCall41_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 46, column: 5
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 47, column: 12
		return false;
	}
	public boolean MethodCall42_0(){
		System.out.println("A : Time elapse since last atrium activity <= VAI, NOT pacing...");//pacemaker.sysj line: 52, column: 17
		return false;
	}
	public boolean MethodCall43_0(){
		i_thread_8 = 0;//pacemaker.sysj line: 73, column: 8
		i_thread_8 = i_thread_8 + 1;//pacemaker.sysj line: 74, column: 22
		return false;
	}
	public boolean MethodCall44_0(){
		i_thread_9 = 0;//pacemaker.sysj line: 87, column: 3
		i_thread_9 = i_thread_9 + 1;//pacemaker.sysj line: 88, column: 17
		return false;
	}
	public boolean MethodCall45_0(){
		i_thread_10 = 0;//pacemaker.sysj line: 101, column: 5
		i_thread_10 = i_thread_10 + 1;//pacemaker.sysj line: 102, column: 19
		return false;
	}
	public boolean MethodCall46_0(){
		return ventricularActivityOccured_1.getpreval() == Boolean.FALSE;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall47_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 133, column: 5
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 134, column: 19
		return false;
	}
	public boolean MethodCall48_0(){
		System.out.println("V : QRSComplex NOT detected");//pacemaker.sysj line: 148, column: 4
		return false;
	}
	public boolean MethodCall49_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 155, column: 8
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 156, column: 23
		return false;
	}
	public boolean MethodCall50_0(){
		System.out.println("V : Time elapse since last ventricular activity <= PVARP+VAI, NOT pacing...");//pacemaker.sysj line: 161, column: 13
		return false;
	}
	public boolean MethodCall51_0(){
		i_thread_14 = 0;//pacemaker.sysj line: 174, column: 8
		i_thread_14 = i_thread_14 + 1;//pacemaker.sysj line: 175, column: 22
		return false;
	}
	public boolean MethodCall52_0(){
		i_thread_15 = 0;//pacemaker.sysj line: 192, column: 3
		i_thread_15 = i_thread_15 + 1;//pacemaker.sysj line: 193, column: 18
		return false;
	}
	public boolean MethodCall53_0(){
		return i_thread_2 >= (Intervals.VAI + Intervals.AVI) * 2;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall54_0(){
		;//pacemaker.sysj line: 223, column: 6
		return false;
	}
	public boolean MethodCall55_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 225, column: 23
		return false;
	}
	public boolean MethodCall56_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 225, column: 23
		return false;
	}
	public boolean MethodCall57_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 235, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 236, column: 18
		return false;
	}
	public boolean MethodCall58_0(){
		return i_thread_2 >= 4;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall59_0(){
		;//pacemaker.sysj line: 234, column: 8
		return false;
	}
	public boolean MethodCall60_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 239, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 240, column: 18
		return false;
	}
	public boolean MethodCall61_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 236, column: 18
		return false;
	}
	public boolean MethodCall62_0(){
		return i_thread_2 >= Intervals.QRS + 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall63_0(){
		;//pacemaker.sysj line: 238, column: 8
		l_thread_2 = l_thread_2 + 1;//pacemaker.sysj line: 242, column: 8
		return false;
	}
	public boolean MethodCall64_0(){
		return l_thread_2 == 2;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall65_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 240, column: 18
		return false;
	}
	public boolean MethodCall66_0(){
		return i_thread_2 >= Intervals.PVARP + 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall67_0(){
		;//pacemaker.sysj line: 251, column: 6
		return false;
	}
	public boolean MethodCall68_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 256, column: 8
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 257, column: 23
		return false;
	}
	public boolean MethodCall69_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 253, column: 23
		return false;
	}
	public boolean MethodCall70_0(){
		return i_thread_2 >= Intervals.P + 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall71_0(){
		;//pacemaker.sysj line: 255, column: 6
		return false;
	}
	public boolean MethodCall72_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 257, column: 23
		return false;
	}
	public boolean MethodCall73_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 261, column: 8
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 262, column: 23
		return false;
	}
	public boolean MethodCall74_0(){
		return i_thread_2 >= Intervals.PVARP + 10;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall75_0(){
		;//pacemaker.sysj line: 260, column: 6
		System.out.println("===== DDIR Mode =====");//pacemaker.sysj line: 264, column: 6
		return false;
	}
	public boolean MethodCall76_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 262, column: 23
		return false;
	}
	public boolean MethodCall77_0(){
		i_thread_4 = 0;//pacemaker.sysj line: 272, column: 5
		i_thread_4 = i_thread_4 + 1;//pacemaker.sysj line: 273, column: 20
		return false;
	}
	public boolean MethodCall78_0(){
		return i_thread_4 >= Intervals.P + 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall79_0(){
		;//pacemaker.sysj line: 271, column: 3
		return false;
	}
	public boolean MethodCall80_0(){
		i_thread_4 = i_thread_4 + 1;//pacemaker.sysj line: 273, column: 20
		return false;
	}
	public boolean MethodCall81_0(){
		i_thread_4 = 0;//pacemaker.sysj line: 277, column: 5
		i_thread_4 = i_thread_4 + 1;//pacemaker.sysj line: 278, column: 20
		return false;
	}
	public boolean MethodCall82_0(){
		return i_thread_4 >= 10;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall83_0(){
		;//pacemaker.sysj line: 276, column: 3
		return false;
	}
	public boolean MethodCall84_0(){
		i_thread_4 = i_thread_4 + 1;//pacemaker.sysj line: 278, column: 20
		return false;
	}
	public boolean MethodCall85_0(){
		return i_thread_2 >= Intervals.PVARP + 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall86_0(){
		;//pacemaker.sysj line: 287, column: 8
		return false;
	}
	public boolean MethodCall87_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 292, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 293, column: 18
		return false;
	}
	public boolean MethodCall88_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 289, column: 18
		return false;
	}
	public boolean MethodCall89_0(){
		return i_thread_2 >= Intervals.P + 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall90_0(){
		;//pacemaker.sysj line: 291, column: 8
		return false;
	}
	public boolean MethodCall91_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 296, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 297, column: 18
		return false;
	}
	public boolean MethodCall92_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 293, column: 18
		return false;
	}
	public boolean MethodCall93_0(){
		return i_thread_2 >= 4;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall94_0(){
		;//pacemaker.sysj line: 295, column: 8
		return false;
	}
	public boolean MethodCall95_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 300, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 301, column: 18
		return false;
	}
	public boolean MethodCall96_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 297, column: 18
		return false;
	}
	public boolean MethodCall97_0(){
		return i_thread_2 >= Intervals.QRS + 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall98_0(){
		;//pacemaker.sysj line: 299, column: 8
		return false;
	}
	public boolean MethodCall99_0(){
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 301, column: 18
		return false;
	}
	public boolean MethodCall100_0(){
		l_thread_2 = l_thread_2 + 1;//pacemaker.sysj line: 304, column: 8
		if(l_thread_2 == 3) {//pacemaker.sysj line: 305, column: 8
			Intervals.terminate();//pacemaker.sysj line: 306, column: 3
		}
		return false;
	}
	public boolean MethodCall101_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 288, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 289, column: 18
		return false;
	}
	public boolean MethodCall102_0(){
		return i_thread_6 >= Intervals.P;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall103_0(){
		;//pacemaker.sysj line: 27, column: 5
		System.out.println("A : PWAVE detected!");//pacemaker.sysj line: 31, column: 5
		return false;
	}
	public boolean MethodCall104_0(){
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 29, column: 14
		return false;
	}
	public boolean MethodCall105_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 28, column: 7
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 29, column: 14
		return false;
	}
	public boolean MethodCall106_0(){
		System.out.println("A : PWAVE NOT detected!");//pacemaker.sysj line: 38, column: 8
		return false;
	}
	public boolean MethodCall107_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 46, column: 5
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 47, column: 12
		return false;
	}
	public boolean MethodCall108_0(){
		System.out.println("A : Time elapse since last atrium activity <= VAI, NOT pacing...");//pacemaker.sysj line: 52, column: 17
		return false;
	}
	public boolean MethodCall109_0(){
		return i_thread_6 == 2;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall110_0(){
		;//pacemaker.sysj line: 45, column: 3
		currsigs0.addElement(ventricularActivityOccured_1);
		ventricularActivityOccured_1.setValue(new Boolean(false));
		currsigs0.addElement(atriumActivityOccured_1);
		atriumActivityOccured_1.setValue(new Boolean(true));
		System.out.println("A : Atrium paced");//pacemaker.sysj line: 51, column: 3
		return false;
	}
	public boolean MethodCall111_0(){
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 47, column: 12
		return false;
	}
	public boolean MethodCall112_0(){
		currsigs0.addElement(atriumActivityOccured_1);
		atriumActivityOccured_1.setValue(new Boolean(true));
		currsigs0.addElement(ventricularActivityOccured_1);
		ventricularActivityOccured_1.setValue(new Boolean(false));
		System.out.println("A : Intrinsic activity sensed");//pacemaker.sysj line: 60, column: 6
		return false;
	}
	public boolean MethodCall113_0(){
		return atriumActivityOccured_1.getpreval() == Boolean.FALSE;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall114_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 28, column: 7
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 29, column: 14
		return false;
	}
	public boolean MethodCall115_0(){
		System.out.println("A : PWAVE NOT detected!");//pacemaker.sysj line: 38, column: 8
		return false;
	}
	public boolean MethodCall116_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 46, column: 5
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 47, column: 12
		return false;
	}
	public boolean MethodCall117_0(){
		System.out.println("A : Time elapse since last atrium activity <= VAI, NOT pacing...");//pacemaker.sysj line: 52, column: 17
		return false;
	}
	public boolean MethodCall118_0(){
		return i_thread_8 >= Intervals.PVARP;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall119_0(){
		;//pacemaker.sysj line: 72, column: 6
		return false;
	}
	public boolean MethodCall120_0(){
		i_thread_8 = i_thread_8 + 1;//pacemaker.sysj line: 74, column: 22
		return false;
	}
	public boolean MethodCall121_0(){
		i_thread_8 = 0;//pacemaker.sysj line: 73, column: 8
		i_thread_8 = i_thread_8 + 1;//pacemaker.sysj line: 74, column: 22
		return false;
	}
	public boolean MethodCall122_0(){
		return i_thread_9 >= Intervals.VAI;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall123_0(){
		;//pacemaker.sysj line: 86, column: 8
		return false;
	}
	public boolean MethodCall124_0(){
		i_thread_9 = i_thread_9 + 1;//pacemaker.sysj line: 88, column: 17
		return false;
	}
	public boolean MethodCall125_0(){
		i_thread_9 = 0;//pacemaker.sysj line: 87, column: 3
		i_thread_9 = i_thread_9 + 1;//pacemaker.sysj line: 88, column: 17
		return false;
	}
	public boolean MethodCall126_0(){
		return i_thread_10 >= Intervals.VAI;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall127_0(){
		;//pacemaker.sysj line: 100, column: 3
		return false;
	}
	public boolean MethodCall128_0(){
		i_thread_10 = i_thread_10 + 1;//pacemaker.sysj line: 102, column: 19
		return false;
	}
	public boolean MethodCall129_0(){
		i_thread_10 = 0;//pacemaker.sysj line: 101, column: 5
		i_thread_10 = i_thread_10 + 1;//pacemaker.sysj line: 102, column: 19
		return false;
	}
	public boolean MethodCall130_0(){
		return i_thread_12 >= Intervals.QRS;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall131_0(){
		;//pacemaker.sysj line: 132, column: 3
		return false;
	}
	public boolean MethodCall132_0(){
		System.out.println("V : QRSComplex detected!");//pacemaker.sysj line: 141, column: 6
		return false;
	}
	public boolean MethodCall133_0(){
		currsigs0.addElement(atriumActivityOccured_1);
		atriumActivityOccured_1.setValue(new Boolean(false));
		currsigs0.addElement(ventricularActivityOccured_1);
		ventricularActivityOccured_1.setValue(new Boolean(true));
		System.out.println("V : Intrinsic activity sensed");//pacemaker.sysj line: 145, column: 6
		return false;
	}
	public boolean MethodCall134_0(){
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 134, column: 19
		return false;
	}
	public boolean MethodCall135_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 133, column: 5
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 134, column: 19
		return false;
	}
	public boolean MethodCall136_0(){
		System.out.println("V : QRSComplex NOT detected");//pacemaker.sysj line: 148, column: 4
		return false;
	}
	public boolean MethodCall137_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 155, column: 8
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 156, column: 23
		return false;
	}
	public boolean MethodCall138_0(){
		System.out.println("V : Time elapse since last ventricular activity <= PVARP+VAI, NOT pacing...");//pacemaker.sysj line: 161, column: 13
		return false;
	}
	public boolean MethodCall139_0(){
		return i_thread_12 == 2;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall140_0(){
		;//pacemaker.sysj line: 154, column: 6
		currsigs0.addElement(atriumActivityOccured_1);
		atriumActivityOccured_1.setValue(new Boolean(false));
		System.out.println("V : Ventrium paced");//pacemaker.sysj line: 159, column: 6
		currsigs0.addElement(ventricularActivityOccured_1);
		ventricularActivityOccured_1.setValue(new Boolean(true));
		return false;
	}
	public boolean MethodCall141_0(){
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 156, column: 23
		return false;
	}
	public boolean MethodCall142_0(){
		return ventricularActivityOccured_1.getpreval() == Boolean.FALSE;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall143_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 133, column: 5
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 134, column: 19
		return false;
	}
	public boolean MethodCall144_0(){
		System.out.println("V : QRSComplex NOT detected");//pacemaker.sysj line: 148, column: 4
		return false;
	}
	public boolean MethodCall145_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 155, column: 8
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 156, column: 23
		return false;
	}
	public boolean MethodCall146_0(){
		System.out.println("V : Time elapse since last ventricular activity <= PVARP+VAI, NOT pacing...");//pacemaker.sysj line: 161, column: 13
		return false;
	}
	public boolean MethodCall147_0(){
		return i_thread_14 >= Intervals.AVI;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall148_0(){
		;//pacemaker.sysj line: 173, column: 6
		return false;
	}
	public boolean MethodCall149_0(){
		i_thread_14 = i_thread_14 + 1;//pacemaker.sysj line: 175, column: 22
		return false;
	}
	public boolean MethodCall150_0(){
		System.out.println("V : Waiting on VAI since it is in DDIR mode");//pacemaker.sysj line: 180, column: 8
		return false;
	}
	public boolean MethodCall151_0(){
		i_thread_14 = 0;//pacemaker.sysj line: 174, column: 8
		i_thread_14 = i_thread_14 + 1;//pacemaker.sysj line: 175, column: 22
		return false;
	}
	public boolean MethodCall152_0(){
		return i_thread_15 >= Intervals.PVARP + Intervals.AVI;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall153_0(){
		;//pacemaker.sysj line: 191, column: 8
		return false;
	}
	public boolean MethodCall154_0(){
		i_thread_15 = i_thread_15 + 1;//pacemaker.sysj line: 193, column: 18
		return false;
	}
	public boolean MethodCall155_0(){
		i_thread_15 = 0;//pacemaker.sysj line: 192, column: 3
		i_thread_15 = i_thread_15 + 1;//pacemaker.sysj line: 193, column: 18
		return false;
	}
	public boolean MethodCall156_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 0;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall157_0(){
		Intervals.printA();//pacemaker.sysj line: 222, column: 6
		i_thread_2 = 0;//pacemaker.sysj line: 224, column: 8
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 225, column: 23
		return false;
	}
	public boolean MethodCall158_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 1;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall159_0(){
		Intervals.printB();//pacemaker.sysj line: 230, column: 6
		l_thread_2 = 0;//pacemaker.sysj line: 231, column: 6
		return false;
	}
	public boolean MethodCall160_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 2;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall161_0(){
		Intervals.printC();//pacemaker.sysj line: 248, column: 6
		System.out.println("===== DDDR Mode =====");//pacemaker.sysj line: 249, column: 6
		return false;
	}
	public boolean MethodCall162_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 252, column: 8
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 253, column: 23
		return false;
	}
	public boolean MethodCall163_0(){
		return ((Integer)STATE_1.getpreval()).intValue() == 3;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall164_0(){
		Intervals.printD();//pacemaker.sysj line: 284, column: 6
		l_thread_2 = 0;//pacemaker.sysj line: 285, column: 6
		return false;
	}
	public boolean MethodCall165_0(){
		i_thread_2 = 0;//pacemaker.sysj line: 288, column: 3
		i_thread_2 = i_thread_2 + 1;//pacemaker.sysj line: 289, column: 18
		return false;
	}
	public boolean MethodCall166_0(){
		return atriumActivityOccured_1.getpreval() == Boolean.FALSE;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall167_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 28, column: 7
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 29, column: 14
		return false;
	}
	public boolean MethodCall168_0(){
		System.out.println("A : PWAVE NOT detected!");//pacemaker.sysj line: 38, column: 8
		return false;
	}
	public boolean MethodCall169_0(){
		i_thread_6 = 0;//pacemaker.sysj line: 46, column: 5
		i_thread_6 = i_thread_6 + 1;//pacemaker.sysj line: 47, column: 12
		return false;
	}
	public boolean MethodCall170_0(){
		System.out.println("A : Time elapse since last atrium activity <= VAI, NOT pacing...");//pacemaker.sysj line: 52, column: 17
		return false;
	}
	public boolean MethodCall171_0(){
		i_thread_8 = 0;//pacemaker.sysj line: 73, column: 8
		i_thread_8 = i_thread_8 + 1;//pacemaker.sysj line: 74, column: 22
		return false;
	}
	public boolean MethodCall172_0(){
		i_thread_9 = 0;//pacemaker.sysj line: 87, column: 3
		i_thread_9 = i_thread_9 + 1;//pacemaker.sysj line: 88, column: 17
		return false;
	}
	public boolean MethodCall173_0(){
		i_thread_10 = 0;//pacemaker.sysj line: 101, column: 5
		i_thread_10 = i_thread_10 + 1;//pacemaker.sysj line: 102, column: 19
		return false;
	}
	public boolean MethodCall174_0(){
		return ventricularActivityOccured_1.getpreval() == Boolean.FALSE;//Unknown file line: 0, column: 0
	}
	public boolean MethodCall175_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 133, column: 5
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 134, column: 19
		return false;
	}
	public boolean MethodCall176_0(){
		System.out.println("V : QRSComplex NOT detected");//pacemaker.sysj line: 148, column: 4
		return false;
	}
	public boolean MethodCall177_0(){
		i_thread_12 = 0;//pacemaker.sysj line: 155, column: 8
		i_thread_12 = i_thread_12 + 1;//pacemaker.sysj line: 156, column: 23
		return false;
	}
	public boolean MethodCall178_0(){
		System.out.println("V : Time elapse since last ventricular activity <= PVARP+VAI, NOT pacing...");//pacemaker.sysj line: 161, column: 13
		return false;
	}
	public boolean MethodCall179_0(){
		i_thread_14 = 0;//pacemaker.sysj line: 174, column: 8
		i_thread_14 = i_thread_14 + 1;//pacemaker.sysj line: 175, column: 22
		return false;
	}
	public boolean MethodCall180_0(){
		i_thread_15 = 0;//pacemaker.sysj line: 192, column: 3
		i_thread_15 = i_thread_15 + 1;//pacemaker.sysj line: 193, column: 18
		return false;
	}

}

