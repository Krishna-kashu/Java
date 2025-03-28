class Cement {

    int grade;
    String color;
    String fineness;
    float density;
    String waterRequirement;
    int shelfLife;
    int packing;
    String application;
    String texture;
    boolean isWetManufacturing;

    public Cement() {
        System.out.println("Cement Details:");
    }

    public Cement(int grade) {
        this.grade = grade;
    }

    public Cement(int grade, String color) {
        this(grade);
        this.color = color;
    }

    public Cement(int grade, String color, String fineness) {
        this(grade, color);
        this.fineness = fineness;
    }

    public Cement(int grade, String color, String fineness, float density) {
        this(grade, color, fineness);
        this.density = density;
    }

    public Cement(int grade, String color, String fineness, float density, String waterRequirement) {
        this(grade, color, fineness, density);
        this.waterRequirement = waterRequirement;
		
    }

    public Cement(int grade, String color, String fineness, float density, String waterRequirement, int shelfLife) {
        this(grade, color, fineness, density, waterRequirement);
        this.shelfLife = shelfLife;
    }

    public Cement(int grade, String color, String fineness, float density, String waterRequirement, int shelfLife, int packing) {
        this(grade, color, fineness, density, waterRequirement, shelfLife);
        this.packing = packing;
    }

    public Cement(int grade, String color, String fineness, float density, String waterRequirement, int shelfLife, int packing, String application) {
        this(grade, color, fineness, density, waterRequirement, shelfLife, packing);
        this.application = application;
    }

    public Cement(int grade, String color, String fineness, float density, String waterRequirement, int shelfLife, int packing, String application, String texture) {
        this(grade, color, fineness, density, waterRequirement, shelfLife, packing, application);
        this.texture = texture;
    }

    public Cement(int grade, String color, String fineness, float density, String waterRequirement, int shelfLife, int packing, String application, String texture, boolean isWetManufacturing) {
        this(grade, color, fineness, density, waterRequirement, shelfLife, packing, application, texture);
        this.isWetManufacturing = isWetManufacturing;
    }

    public void info() {
        System.out.println("Cement Grade: " + this.grade);
        System.out.println("Cement Color: " + this.color);
        System.out.println("Cement Fineness: " + this.fineness);
        System.out.println("Cement Density : " + this.density + " g/cm³");
        System.out.println("Water Requirement: " + this.waterRequirement);
        System.out.println("Shelf Life: " + this.shelfLife + " years");
        System.out.println("Packing: " + this.packing + " kg");
        System.out.println("Application: " + this.application);
        System.out.println("Texture: " + this.texture);
        System.out.println("is this cement Wet Manufacturing: " + (this.isWetManufacturing));
    }
}

