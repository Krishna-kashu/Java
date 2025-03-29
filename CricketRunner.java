class CricketRunner{
		public static void main(String... args){
			String[] players={"Virat","ABD"};
			String day="Wednesday";
			Cricket.matchDetails(day, players);
			
			String names="Virat";
			Cricket.matchDetails(names, 20, 600);
			
			String[] playerName={"Virat","ABD","Karthik"};
			int[] matches={4,3,2};
			int[] runs={67,78,67};
			Cricket.matchDetails(playerName, matches, runs);
		}
}