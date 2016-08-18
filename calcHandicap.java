import java.lang.*;

	

class TestHandicap{

	public static void main(String[] args) {
		Double index = Double.parseDouble(args[0]);
		Double slope = Double.parseDouble(args[1]);
		int x = calcHandicap(index, slope);
		System.out.println(x);
    	}


// returns course handicap based on player index and course slope rating

	public static int calcHandicap(double index, double slope) {
		int StandardSlopeRating = 113;
		int coursehandicap = (int) Math.ceil((index * slope) / StandardSlopeRating );
		return coursehandicap;
	}
}
	
