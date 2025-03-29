class Movie{
	public static void movieInfo(MovieName movie){
		if(movie==MovieName.KANTARA){
	  System.out.println("Movie name: "+movie+", Directed by Rishab Shetty");
		}else if(movie==MovieName.KGF){
			System.out.println("Movie name: "+movie+", Directed by Prashanth Neel");
		}else if(movie==MovieName.U_TURN){
			System.out.println("Movie name: "+movie+", Directed by Pawan Kumar");
		}else if(movie==MovieName.RAJAKUMARA){
			System.out.println("Movie name: "+movie+", Directed by Santhosh Ananddram");
		}else if(movie==MovieName.LUCIA){
			System.out.println("Movie name: "+movie+", Directed by Pawan Kumar");
		}else if(movie==MovieName.MUNGARU_MALE){
			System.out.println("Movie name: "+movie+", Directed by Yogaraj Bhat");
		}else{
			System.out.println("Movie not found");
		}
	}
}

