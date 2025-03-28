class AK47Runner {
    public static void main(String[] args) {

        String firingMode = "Semi-auto";
        String material = "Steel";
        int magazineCapacity = 40;
        int barrelLength = 16;
        float weight = 3.8f;
        int rateOfFire = 600;
        String manufacturer = "Russia";
        int cost = 10000;
        boolean heatResistance = true;
        String gripType = "Polymer";

        AK47 ak1 = new AK47();
        ak1.info();

        AK47 ak2 = new AK47(firingMode);
        ak2.info();

        AK47 ak3 = new AK47(firingMode, material);
        ak3.info();

        AK47 ak4 = new AK47(firingMode, material, magazineCapacity);
        ak4.info();

        AK47 ak5 = new AK47(firingMode, material, magazineCapacity, barrelLength);
        ak5.info();

        AK47 ak6 = new AK47(firingMode, material, magazineCapacity, barrelLength, weight);
        ak6.info();

        AK47 ak7 = new AK47(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire);
        ak7.info();

        AK47 ak8 = new AK47(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire, manufacturer);
        ak8.info();

        AK47 ak9 = new AK47(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire, manufacturer, cost);
        ak9.info();

        AK47 ak10 = new AK47(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire, manufacturer, cost, heatResistance);
        ak10.info();

        AK47 ak11 = new AK47(firingMode, material, magazineCapacity, barrelLength, weight, rateOfFire, manufacturer, cost, heatResistance, gripType);
        ak11.info();
    }
}
