class Bulb {
    int wattage;
    String colorTemperature;
    int lifespan;
    String type;
    int brightness;
    String brand;
    boolean isDimmable;
    String baseType;
    float price;
    boolean isSmartBulb;

    public Bulb() {
        System.out.println("Bulb Details:");
    }

    public Bulb(int wattage) {
        this.wattage = wattage;
		System.out.println("\n");
    }

    public Bulb(int wattage, String colorTemperature) {
        this(wattage);
        this.colorTemperature = colorTemperature;
    }

    public Bulb(int wattage, String colorTemperature, int lifespan) {
        this(wattage, colorTemperature);
        this.lifespan = lifespan;
    }

    public Bulb(int wattage, String colorTemperature, int lifespan, String type) {
        this(wattage, colorTemperature, lifespan);
        this.type = type;
    }

    public Bulb(int wattage, String colorTemperature, int lifespan, String type, int brightness) {
        this(wattage, colorTemperature, lifespan, type);
        this.brightness = brightness;
    }

    public Bulb(int wattage, String colorTemperature, int lifespan, String type, int brightness, String brand) {
        this(wattage, colorTemperature, lifespan, type, brightness);
        this.brand = brand;
    }

    public Bulb(int wattage, String colorTemperature, int lifespan, String type, int brightness, String brand, boolean isDimmable) {
        this(wattage, colorTemperature, lifespan, type, brightness, brand);
        this.isDimmable = isDimmable;
    }

    public Bulb(int wattage, String colorTemperature, int lifespan, String type, int brightness, String brand, boolean isDimmable, String baseType) {
        this(wattage, colorTemperature, lifespan, type, brightness, brand, isDimmable);
        this.baseType = baseType;
    }

    public Bulb(int wattage, String colorTemperature, int lifespan, String type, int brightness, String brand, boolean isDimmable, String baseType, float price) {
        this(wattage, colorTemperature, lifespan, type, brightness, brand, isDimmable, baseType);
        this.price = price;
    }

    public Bulb(int wattage, String colorTemperature, int lifespan, String type, int brightness, String brand, boolean isDimmable, String baseType, float price, boolean isSmartBulb) {
        this(wattage, colorTemperature, lifespan, type, brightness, brand, isDimmable, baseType, price);
        this.isSmartBulb = isSmartBulb;
    }

    public void info() {
        System.out.println("Wattage: " + this.wattage + "W");
        System.out.println("Color Temperature: " + this.colorTemperature);
        System.out.println("Lifespan: " + this.lifespan + " hours");
        System.out.println("Type: " + this.type);
        System.out.println("Brightness: " + this.brightness );
        System.out.println("Brand: " + this.brand);
        System.out.println("Is Dimmable: " + this.isDimmable);
        System.out.println("Base Type: " + this.baseType);
        System.out.println("Price: " + this.price);
        System.out.println("Is Smart Bulb: " + this.isSmartBulb);
    }
}
