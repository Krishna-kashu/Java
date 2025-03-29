class Cricket{
		public static void matchDetails(String day, String... player_name){
			
			System.out.println("matchDetails in Cricket is running");
			for(String name:player_name){
				System.out.println(name+" match is on: "+ day);
			}
		}
		public static void matchDetails(String player_name, int numOfMatches, int totalRuns){
			
				int avg=totalRuns/numOfMatches;
            System.out.println("\n2nd method matchDetails in Cricket is running");
			System.out.println("\n"+player_name+"s avg score is "+ avg);
			
		}
		public static void matchDetails(String[] player_name, int[] numOfMatches, int[] totalRuns){
			
			for(int index=0;index<3;index++){
				int avg=totalRuns[index]/numOfMatches[index];
				System.out.println("Avg of"+ player_name[index]+" is"+ avg);
			}
		}
		
		
}


