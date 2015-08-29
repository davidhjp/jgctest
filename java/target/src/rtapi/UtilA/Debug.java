package UtilA;

public class Debug {
	private static boolean enabled = false;
	public static void setEnabled(){enabled = true;}
	public static void println(String str) {if(enabled) System.out.println(str);}
	public static void exitt(){System.exit(1);}
}
