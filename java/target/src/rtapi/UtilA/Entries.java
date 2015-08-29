package UtilA;
import java.util.Vector;

public class Entries {
	public static Vector list; 
	static {
		list = new Vector();
		list.addElement("paul");
	}
	public static boolean isValidRequest(String id){
		return list.contains(id);
	}
}
