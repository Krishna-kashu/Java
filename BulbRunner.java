class BulbRunner {
    public static void main(String[] args) {

        int wattage = 12;
        String colorTemperature = "Cool White";
        int lifespan = 20000;
        String type = "LED";
        int brightness = 1200;
        String brand = "Philips";
        boolean isDimmable = true;
        String baseType = "E27";
        float price = 15.99f;
        boolean isSmartBulb = true;

        Bulb bulb1 = new Bulb();
        bulb1.info();

        Bulb bulb2 = new Bulb(wattage);
        bulb2.info();

        Bulb bulb3 = new Bulb(wattage, colorTemperature);
        bulb3.info();

        Bulb bulb4 = new Bulb(wattage, colorTemperature, lifespan);
        bulb4.info();

        Bulb bulb5 = new Bulb(wattage, colorTemperature, lifespan, type);
        bulb5.info();

        Bulb bulb6 = new Bulb(wattage, colorTemperature, lifespan, type, brightness);
        bulb6.info();

        Bulb bulb7 = new Bulb(wattage, colorTemperature, lifespan, type, brightness, brand);
        bulb7.info();

        Bulb bulb8 = new Bulb(wattage, colorTemperature, lifespan, type, brightness, brand, isDimmable);
        bulb8.info();

        Bulb bulb9 = new Bulb(wattage, colorTemperature, lifespan, type, brightness, brand, isDimmable, baseType);
        bulb9.info();

        Bulb bulb10 = new Bulb(wattage, colorTemperature, lifespan, type, brightness, brand, isDimmable, baseType, price);
        bulb10.info();

        Bulb bulb11 = new Bulb(wattage, colorTemperature, lifespan, type, brightness, brand, isDimmable, baseType, price, isSmartBulb);
        bulb11.info();
    }
}
