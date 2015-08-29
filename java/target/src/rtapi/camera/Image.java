package camera;
public class Image{
  public static String get_item_type () {
    int i = 123;
    int j = 456;
    int k = 789;
    i= i*j; k=i/k; j++;
    i= i*j; k=i/k; j++;
    i= i*j; k=i/k; j++;
    i= i*j; k=i/k; j++;
    i= i*j; k=i/k; j++;
    return "apple";
  }
  
  public Image () {
    int i = 123;
    int j = 456;
    int k = 789;
    for(int h=0;h<100;++h){ //@WCA loop=100
      i= i*j; k=i/k; j++;
    }
  }
  public Image (Image x) {
    int i = 123;
    int j = 456;
    int k = 789;
    for(int h=0;h<100;++h){ //@WCA loop=100
      i= i*j; k=i/k; j++;
    }
  }
}
