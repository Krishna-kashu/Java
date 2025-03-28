/*  1. Pallet
2. Diamond/Diamond
3.Cement
4. Poster: width,length,content,material
declare info method
5. Wallet
6. Army
7. Ak47
8. Wine
9. Stanza
10. Bulb

*/

class Diamond {

    int hardness;
    String color;
    String origin;
    String composition;
    String heatResistance;
    String surfaceFinish;
    String crystalSystem;
    String cuttingDifficulty;
    boolean isRare;
    boolean waterAbsorption;
	
	
	
    public Diamond() {
        System.out.println("Diamond Details:");
    }

    public Diamond(int hardness) {
		System.out.println("\n************");
        this.hardness = hardness;
    }

    public Diamond(int hardness, String color) {
        this(hardness);
        this.color = color;
    }

    public Diamond(int hardness, String color, String origin) {
        this(hardness, color);
        this.origin = origin;
    }

    public Diamond(int hardness, String color, String origin, String composition) {
        this(hardness, color, origin);
        this.composition = composition;
    }

    public Diamond(int hardness, String color, String origin, String composition, String heatResistance) {
        this(hardness, color, origin, composition);
        this.heatResistance = heatResistance;
    }

    public Diamond(int hardness, String color, String origin, String composition, String heatResistance, String surfaceFinish) {
        this(hardness, color, origin, composition, heatResistance);
        this.surfaceFinish = surfaceFinish;
    }

    public Diamond(int hardness, String color, String origin, String composition, String heatResistance, String surfaceFinish, String crystalSystem) {
        this(hardness, color, origin, composition, heatResistance, surfaceFinish);
        this.crystalSystem = crystalSystem;
    }

    public Diamond(int hardness, String color, String origin, String composition, String heatResistance, String surfaceFinish, String crystalSystem, String cuttingDifficulty) {
        this(hardness, color, origin, composition, heatResistance, surfaceFinish, crystalSystem);
        this.cuttingDifficulty = cuttingDifficulty;
    }

    public Diamond(int hardness, String color, String origin, String composition, String heatResistance, String surfaceFinish, String crystalSystem, String cuttingDifficulty, boolean isRare) {
        this(hardness, color, origin, composition, heatResistance, surfaceFinish, crystalSystem, cuttingDifficulty);
        this.isRare = isRare;
    }

    public Diamond(int hardness, String color, String origin, String composition, String heatResistance, String surfaceFinish, String crystalSystem, String cuttingDifficulty, boolean isRare, boolean waterAbsorption) {
        this(hardness, color, origin, composition, heatResistance, surfaceFinish, crystalSystem, cuttingDifficulty, isRare);
        this.waterAbsorption = waterAbsorption;
    }

    public void info() {
        System.out.println("Diamond hardness: " + this.hardness);
        System.out.println("Diamond color: " + this.color);
        System.out.println("Diamond color: " + this.origin);
        System.out.println("Diamond composition: " + this.composition);
        System.out.println("heatResistance: " + this.heatResistance);
        System.out.println("Diamond surfaceFinish: " + this.surfaceFinish);
        System.out.println("crystalSystem: " + this.crystalSystem);
        System.out.println("Diamond cuttingDifficulty: " + this.cuttingDifficulty);
        System.out.println("Diamond isRare: " + this.isRare);
        System.out.println("Diamond waterAbsorption: " + this.waterAbsorption);
    }
}



