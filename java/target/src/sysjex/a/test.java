package a;
import systemj.lib.Signal;
public class test {
  public static Signal S;
  public test.titi uu;
  class titi {
    Integer g;
    titi() {}
    titi(int y) {g=y;}
  }
  public void m1 () {
    Integer a = new Integer(100);
    a = a + 1;
    titi tt = new titi();
    uu = new titi(10000);
    tt.g = a;
    S.setValue(tt);
    S.setValue(uu);
    m2(a,tt);
    System.out.println(a);
    System.out.println(tt.g);
  }

  public void m2(Integer b,test.titi tt){
    uu.g = new Integer(45);
    b = new Integer (10);
    tt.g = b;
  }

  public static void main(String[] args) {
    test t = new test();
    t.m1();
  }
}
