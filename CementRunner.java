class CementRunner {
    public static void main(String[] args) {
        int grade = 33;
        String color = "Gray";
        String fineness = "Medium";
        float density = 3.15f;
        String waterRequirement = "Low";
        int shelfLife = 3;
        int packing = 50;
        String application = "Bridges";
        String texture = "Powdery";
        boolean isWetManufacturing = true;

        Cement cement1 = new Cement();
		System.out.println("\n");
        cement1.info();

        Cement cement2 = new Cement(grade);
		System.out.println("\n");
        cement2.info();

        Cement cement3 = new Cement(grade, color);
		System.out.println("\n");
        cement3.info();

        Cement cement4 = new Cement(grade, color, fineness);
		System.out.println("\n");
		System.out.println("\n");
        cement4.info();

        Cement cement5 = new Cement(grade, color, fineness, density);
		System.out.println("\n");
        cement5.info();

        Cement cement6 = new Cement(grade, color, fineness, density, waterRequirement);
		System.out.println("\n");
        cement6.info();

        Cement cement7 = new Cement(grade, color, fineness, density, waterRequirement, shelfLife);
		System.out.println("\n");
        cement7.info();

        Cement cement8 = new Cement(grade, color, fineness, density, waterRequirement, shelfLife, packing);
		System.out.println("\n");
        cement8.info();

        Cement cement9 = new Cement(grade, color, fineness, density, waterRequirement, shelfLife, packing, application);
		System.out.println("\n");
        cement9.info();

        Cement cement10 = new Cement(grade, color, fineness, density, waterRequirement, shelfLife, packing, application, texture);
		System.out.println("\n");
        cement10.info();

        Cement cement11 = new Cement(grade, color, fineness, density, waterRequirement, shelfLife, packing, application, texture, isWetManufacturing);
		System.out.println("\n");
        cement11.info();
    }
}
