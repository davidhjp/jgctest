package camera;

public class Camera{
	public static Image takepicture(){
		int i = 123;
		int j = 456;
		int k = 789;
		
		for(int h=0;h<1000;++h){ //@WCA loop = 1000
		  i= i*j; k=i/k; j++;
		}

		return new Image();

	}
	
}
