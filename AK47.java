class AK47 {
    String firingMode;
    String material;
    int magazineCapacity;
    int barrelLength;
    float weight;
    int rateOfFire;
    String manufacturer;
    int cost;
    boolean heatResistance;
    String gripType;

    public AK47() {
        System.out.println("AK-47 Details:");
    }

    public AK47(String firingMode) {
        this.firingMode = firingMode;
    }

    public AK47(String firingMode, String material) {
        this(firingMode);
        this.material = material;
    }

    public AK47(String firingMode, String material, int magazineCapacity) {
        this(firingMode, material);
        this.magazineCapacity = magazineCapacity;
    }

    public AK47(String firingMode, String material, int magazineCapacity, int barrelLength) {
        this(firingMode, material, magazineCapacity);
        this.barrelLength = barrelLength;
    }

    public AK47(String firingMode, String material, int magazineCapacity, int barrelLength, float weight) {
        this(firingMode, material, magazineCapacity, barrelLength);
        this.weight = weight;
    }

    public AK47(String firingMode, String material, int magazineCapacity, int barrelLength, float weight, int rateOfFire) {
        this(firingMode, material, magazineCapacity, barrelLength, weight);
        this.rateOfFire = rateOfFire;
    }

    public AK47(String firingMode, String material, int magazineCapacity, int barrelLength, float weight, int rateOfFire, String manufacturer) {
        this(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire);
        this.manufacturer = manufacturer;
    }

    public AK47(String firingMode, String material, int magazineCapacity, int barrelLength, float weight, int rateOfFire, String manufacturer, int cost) {
        this(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire, manufacturer);
        this.cost = cost;
    }

    public AK47(String firingMode, String material, int magazineCapacity, int barrelLength, float weight, int rateOfFire, String manufacturer, int cost, boolean heatResistance) {
        this(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire, manufacturer, cost);
        this.heatResistance = heatResistance;
    }

    public AK47(String firingMode, String material, int magazineCapacity, int barrelLength, float weight, int rateOfFire, String manufacturer, int cost, boolean heatResistance, String gripType) {
        this(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire, manufacturer, cost, heatResistance);
        this.gripType = gripType;
    }

    public void info() {
        System.out.println("Firing Mode: " + this.firingMode);
        System.out.println("Material: " + this.material);
        System.out.println("Magazine Capacity: " + this.magazineCapacity + " rounds");
        System.out.println("Barrel Length: " + this.barrelLength + " inches");
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Rate of Fire: " + this.rateOfFire + " rpm");
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Cost: $" + this.cost);
        System.out.println("Heat Resistance: " + this.heatResistance);
        System.out.println("Grip Type: " + this.gripType);
    }
}
