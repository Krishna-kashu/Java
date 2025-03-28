class ArmyRunner{
	
	public static void main(String[] args) {
		
		String armyType = "Navy";
        boolean hasRankSystem = false;
        String trainingType = "Advanced";
        String uniformColor = "Green";
        String vehicles = "Jeeps";
        int totalTrainees = 78;
        float budget = 67.67f;
        boolean hasLimitedResources = true;
        String strategy = "Offensive";
        String discipline = "Strict";
		
		
		Army army1 = new Army();
        army1.info();
		
		Army army2 = new Army(armyType);
        army2.info();
		
		Army army3 = new Army(armyType, hasRankSystem);
        army3.info();

		Army army4 = new Army(armyType, hasRankSystem, trainingType);
        army4.info();
		
		Army army5 = new Army(armyType, hasRankSystem, trainingType, uniformColor);
        army5.info();
		
		Army army6 = new Army(armyType, hasRankSystem, trainingType, uniformColor, vehicles);
        army6.info();
		
		Army army7 = new Army(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees);
        army7.info();
		
		Army army8 = new Army(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees, budget);
        army8.info();

		Army army9 = new Army(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees, budget, hasLimitedResources);
        army9.info();
		
		Army army10 = new Army(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees, budget, hasLimitedResources, strategy);
        army10.info();
		
		Army army11 = new Army(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees, budget, hasLimitedResources, strategy, discipline);
        army11.info();
		
	}
	

	
}