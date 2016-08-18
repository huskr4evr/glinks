import java.lang.*;

public class calcHandicap {


    public static void main(String[] args) {
	Float index = Float.parseFloat(args[0]);
	Float slope = Float.parseFloat(args[1]);
 
//	System.out.println("Value parsed :"+index);
//	System.out.println("Value parsed :"+slope);

 
	int coursehandycap = (int) Math.ceil((index * slope) / 113 );
        
       System.out.println(coursehandycap);
    }
}
