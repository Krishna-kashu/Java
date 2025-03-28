class Army{
	
	String armyType;
    boolean hasRankSystem;
    String trainingType;
    String uniformColor;
    String vehicles;
    int totalTrainees;
    float budget;
    boolean hasLimitedResources;
    String strategy;
    String discipline;
	
	public Army() {
        System.out.println("Army Details:");
    }

    public Army(String armyType) {
        this.armyType = armyType;
    }

    public Army(String armyType, boolean hasRankSystem) {
        this(armyType);
        this.hasRankSystem = hasRankSystem;
    }

    public Army(String armyType, boolean hasRankSystem, String trainingType) {
        this(armyType, hasRankSystem);
        this.trainingType = trainingType;
    }

    public Army(String armyType, boolean hasRankSystem, String trainingType, String uniformColor) {
        this(armyType, hasRankSystem, trainingType);
        this.uniformColor = uniformColor;
    }

    public Army(String armyType, boolean hasRankSystem, String trainingType, String uniformColor, String vehicles) {
        this(armyType, hasRankSystem, trainingType, uniformColor);
        this.vehicles = vehicles;
    }

    public Army(String armyType, boolean hasRankSystem, String trainingType, String uniformColor, String vehicles, int totalTrainees) {
        this(armyType, hasRankSystem, trainingType, uniformColor, vehicles);
        this.totalTrainees = totalTrainees;
    }

    public Army(String armyType, boolean hasRankSystem, String trainingType, String uniformColor, String vehicles, int totalTrainees, float budget) {
        this(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees);
        this.budget = budget;
    }

    public Army(String armyType, boolean hasRankSystem, String trainingType, String uniformColor, String vehicles, int totalTrainees, float budget, boolean hasLimitedResources) {
        this(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees, budget);
        this.hasLimitedResources = hasLimitedResources;
    }

    public Army(String armyType, boolean hasRankSystem, String trainingType, String uniformColor, String vehicles, int totalTrainees, float budget, boolean hasLimitedResources, String strategy) {
        this(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees, budget, hasLimitedResources);
        this.strategy = strategy;
    }

    public Army(String armyType, boolean hasRankSystem, String trainingType, String uniformColor, String vehicles, int totalTrainees, float budget, boolean hasLimitedResources, String strategy, String discipline) {
        this(armyType, hasRankSystem, trainingType, uniformColor, vehicles, totalTrainees, budget, hasLimitedResources, strategy);
        this.discipline = discipline;
    }
	
	public void info() {
        System.out.println("Army Type: " + this.armyType);
        System.out.println("Has Rank System: " + this.hasRankSystem);
        System.out.println("Training Type: " + this.trainingType);
        System.out.println("Uniform Color: " + this.uniformColor);
        System.out.println("Vehicles: " + this.vehicles);
        System.out.println("Total Trainees: " + this.totalTrainees);
        System.out.println("Budget: " + this.budget);
        System.out.println("Has Limited Resources: " + this.hasLimitedResources);
        System.out.println("Strategy: " + this.strategy);
        System.out.println("Discipline: " + this.discipline);
    }
	
}