package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		int hungerRating = 5;

		if(!(hungerRating < 6)) {
			System.out.println("Not Hungry");
		}else {
			System.out.println("I'm starving...");
		}
		
	 int favoriteTemp = 75;
	 int currentTemp = 100;
	 String opinion;	 
	 
		 if(favoriteTemp == currentTemp) {
		 	if(currentTemp < favoriteTemp -30) {
		 		opinion = "it's Pretty Darn Cold ...";		 
		 	}else if(currentTemp < favoriteTemp - 20) {
		 		opinion = "It's kinda cold out..";		 
		 	}else if (currentTemp > favoriteTemp + 10) {
				opinion = "It's hot out";
		 	}else {
		 		opinion = "It's a beautiful day..";
		 	}
		 	System.out.println(opinion);
		 }else {
			 opinion = "unknown temp";
		 }
		 
	int month = 8;
	String monthString;
	
	switch (month) {
	case 1:monthString = "January";
		break;
	case 2:monthString = "February";
		break;
	case 3:monthString = "March";
		break;
	case 4:monthString = "April";
		break;
	case 5:monthString = "May";
		break;
	case 6:monthString = "june";
		break;
	case 7:monthString = "july";
		break;	
	default: monthString = "unknown Month";		
	}

	System.out.println(monthString);
		
	}	
}
