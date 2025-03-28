class PalletRunner{
	
	 public static void main(String... args) {
		 
		 
		int capacity = 10;
        String material = "Wood";
        String color = "Brown";
        String surface = "Smooth";
        int durability = 2;
        boolean isReusable = true;
        int weight = 10;
        String design = "Flat";
        int cost = 500;
        boolean isRecyclable = true;
		 
		Pallet pallet1 = new Pallet();
        pallet1.info();

        Pallet pallet2 = new Pallet(capacity);
        pallet2.info();

        Pallet pallet3 = new Pallet(capacity, material);
        pallet3.info();

        Pallet pallet4 = new Pallet(capacity, material, color);
        pallet4.info();

        Pallet pallet5 = new Pallet(capacity, material, color, surface);
        pallet5.info();

        Pallet pallet6 = new Pallet(capacity, material, color, surface, durability);
        pallet6.info();

        Pallet pallet7 = new Pallet(capacity, material, color, surface, durability, isReusable);
        pallet7.info();

        Pallet pallet8 = new Pallet(capacity, material, color, surface, durability, isReusable, weight);
        pallet8.info();

        Pallet pallet9 = new Pallet(capacity, material, color, surface, durability, isReusable, weight, design);
        pallet9.info();

        Pallet pallet10 = new Pallet(capacity, material, color, surface, durability, isReusable, weight, design, cost);
        pallet10.info();

        Pallet pallet11 = new Pallet(capacity, material, color, surface, durability, isReusable, weight, design, cost, isRecyclable);
        pallet11.info();
    }
}
