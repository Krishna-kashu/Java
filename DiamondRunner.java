
class DiamondRunner {
    public static void main(String[] args) {
		
	int hardness=10;
    String color="Transparent";
    String origin="Synthetic";
    String composition="Carbon";
    String heatResistance="Extreme";
    String surfaceFinish="Smooth";
    String crystalSystem="Hexagonal";
    String cuttingDifficulty="Extreme";
    boolean isRare=true;
    boolean waterAbsorption=false;
		
		
        Diamond Diamond1 = new Diamond();
        Diamond1.info();

        Diamond Diamond2 = new Diamond(hardness);
        Diamond2.info();

        Diamond Diamond3 = new Diamond(hardness, color);
        Diamond3.info();

        Diamond Diamond4 = new Diamond(hardness, color, origin);
        Diamond4.info();

        Diamond Diamond5 = new Diamond(hardness, color, origin, composition);
        Diamond5.info();

        Diamond Diamond6 = new Diamond(hardness, color, origin, composition, heatResistance);
        Diamond6.info();

        Diamond Diamond7 = new Diamond(hardness, color, origin, composition, heatResistance, surfaceFinish);
        Diamond7.info();

        Diamond Diamond8 = new Diamond(hardness, color, origin, composition, heatResistance, surfaceFinish, crystalSystem);
        Diamond8.info();

        Diamond Diamond9 = new Diamond(hardness, color, origin, composition, heatResistance, surfaceFinish, crystalSystem, cuttingDifficulty);
        Diamond9.info();

        Diamond Diamond10 = new Diamond(hardness, color, origin, composition, heatResistance, surfaceFinish, crystalSystem, cuttingDifficulty, isRare);
        Diamond10.info();

        Diamond Diamond11 = new Diamond(hardness, color, origin, composition, heatResistance, surfaceFinish, crystalSystem, cuttingDifficulty, isRare, waterAbsorption);
        Diamond11.info();
    }
}