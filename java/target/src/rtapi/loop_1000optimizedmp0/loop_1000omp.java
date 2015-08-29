package loop_1000optimizedmp0;
import java.util.*;
import java.io.*;
import com.jopdesign.sys.Const;
import com.jopdesign.sys.Native;
import systemj.lib.*;
import a.*;

public class loop_1000omp{
  private static boolean retval = false;
  private static int dl = 0;
  //private static Vector currsigs0 = new Vector();
  private static Signal S_1;
  private static Signal H_1;

  private static boolean a_thread_2;//loop_1000.sysj line: 3, column: 3
  private static Integer m_thread_1;//loop_1000.sysj line: 4, column: 3
  private static Integer r_thread_1;//loop_1000.sysj line: 4, column: 3

  private static Integer rr_thread_1;//loop_1000.sysj line: 4, column: 3

  private static a A;
  public static void main(String args[]){
    A = new a();
    A.b = new Integer (70);
    S_1 = new Signal();
    H_1 = new Signal();
    loop_1000omp t_procs = new loop_1000omp();
    boolean ret_bool = false;

    rr_thread_1  = new Integer(666);

    ret_bool = t_procs.cbackcall0_0(1);
  }
  /* Shows the traversing of call graph */
  public boolean cbackcall0_0(int var){
    MethodCall0_0();		/*Simple tests*/
    MethodCall0_1(); 		/* Reuse of space test */
    MethodCall0_2(); 	/*No reuse of space test*/
    MethodCall0_3();	/* Polymorphism test */
    return MethodCall0_4();	/*Deep copy test */
  }
  
  public boolean MethodCall0_4() {
    /* B and C should share the heap and should be the max of the two sizes */
    b B = new b(33);
    c C = new c(1001,101);
    a t;

    /* Use polymorphism for equality */
    a_thread_2 = true;
    if (a_thread_2){
      int b1 = B.getbb();
      t = new b(b1); 		/*Making deep copies*/
      ((b)t).bbb = new Integer(99);
    }
    else {
      int c1 = C.getcc();
      int c2 = C.getccc();
      t = new c(c1,c2); 	/*Making deep copies*/
      ((c)t).mm = new Integer(999);
    }

    /* Emit t via S_1 */
    S_1.setValue(t);

    if (a_thread_2)
      /* Print */
      System.out.println(((b)S_1.getValue()).bb);
    else {
      /* Print */
      System.out.println(((c)S_1.getValue()).cc);
      System.out.println(((c)S_1.getValue()).ccc);
    }

    return true;  }
  /* Polymorphism tests */
  public boolean MethodCall0_3(){
    /* B and C should share the heap and should be the max of the two sizes */
    a t;

    /* Use polymorphism for equality */
    a_thread_2 = true;
    if (a_thread_2){
      t = new b(33);
    }
    else {
      t = new c(1000,100);
    }

    /* Emit t via S_1 */
    S_1.setValue(t);

    if (a_thread_2)
      /* Print */
      System.out.println(((b)S_1.getValue()).bb);
    else {
      /* Print */
      System.out.println(((c)S_1.getValue()).cc);
      System.out.println(((c)S_1.getValue()).ccc);
    }

    return true;
  }

  public boolean MethodCall0_2(){
    Integer t;
    /* y and r should *not* share the space in heap space */

    /* Test 1 */
    a_thread_2 = true;
    if(a_thread_2) {
      Integer y = new Integer (100);
      t = y;
      m_thread_1 = t;
    }
    else {
      Integer r = new Integer(10);
      Integer r1 = r;
      t = r1;
    }
    r_thread_1 = t;

    S_1.setValue(m_thread_1);
    H_1.setValue(r_thread_1);
    System.out.println(S_1.getValue()); /*Result: 100*/
    System.out.println(H_1.getValue()); /*Result: 100*/
    
    return false;
  }

  public boolean MethodCall0_1(){
    Integer t;
    /* y and r should also share the space in heap space */

    /* Test 1 */
    a_thread_2 = true;
    if(a_thread_2) {
      Integer y = new Integer (70);
      t = y;
    }
    else {
      Integer r = new Integer(10);
      Integer r1 = r;
      t = r1;
    }
    r_thread_1 = t;
    m_thread_1 = t;

    S_1.setValue(r_thread_1);
    H_1.setValue(m_thread_1);
    System.out.println(S_1.getValue()); /*Result: 70*/
    System.out.println(H_1.getValue()); /*Result: 70*/
    
    return false;
  }
  public boolean MethodCall0_0(){
    Integer t;
    Integer r = new Integer(10);//loop_1000.sysj line: 5, column: 16
    Integer y = new Integer (100); /*This goes in normal heap space! */
    Integer r1 = r;

    /* Test 1 */
    S_1.setValue(A);
    System.out.println(((a)S_1.getValue()).b); /*Result: 70*/

    /* Test 2 */
    S_1.setValue(rr_thread_1);
    System.out.println(S_1.getValue()); /*Result: 666*/

    /* Test 3 */
    a_thread_2 = true;
    if(a_thread_2)
      t = rr_thread_1;
    else t = r1;

    S_1.setValue(t);
    System.out.println(S_1.getValue()); /*Result: 666*/
    
    /* Test 4 */
    a_thread_2 = false;
    if(a_thread_2)
      t = rr_thread_1;
    else t = r1;

    S_1.setValue(t);
    System.out.println(S_1.getValue()); /*Result: 10*/
    
    
    /* Test 5: array test */
    /* This works, because inside the java.lang.String class the
       character array is wrapped with a ava.lang.ArrayBound type
       annotation*/
    String s = new String("Hello, world");
    S_1.setValue(s);
    System.out.println(S_1.getValue()); /*Result: 10*/
    return false;
  }
}

