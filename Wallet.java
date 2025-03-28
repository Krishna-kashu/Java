class Wallet {

    String material;
    String color;
    String size;
    int cardSlot = 4;
    int compartment = 3;
    String closureType;
    boolean hasCoinPocket;
    boolean isWaterProof = true;
    int durability;
    String userType;
    boolean customized;
	
	
     public Wallet() {
        System.out.println("Wallet Details:");
    }

    public Wallet(String material) {
        this.material = material;
		System.out.println("\n*******\n");
    }

     public Wallet(String material, String color) {
        this(material);
        this.color = color;
    }

    public Wallet(String material, String color, String size) {
        this(material, color);
        this.size = size;
    }

    public Wallet(String material, String color, String size, int cardSlot) {
        this(material, color, size);
        this.cardSlot = cardSlot;
    }

    public Wallet(String material, String color, String size, int cardSlot, int compartment) {
        this(material, color, size, cardSlot);
        this.compartment = compartment;
    }

    public Wallet(String material, String color, String size, int cardSlot, int compartment, String closureType) {
        this(material, color, size, cardSlot, compartment);
        this.closureType = closureType;
    }

    public Wallet(String material, String color, String size, int cardSlot, int compartment, String closureType, boolean hasCoinPocket) {
        this(material, color, size, cardSlot, compartment, closureType);
        this.hasCoinPocket = hasCoinPocket;
    }

     public Wallet(String material, String color, String size, int cardSlot, int compartment, String closureType, boolean hasCoinPocket, boolean isWaterProof) {
        this(material, color, size, cardSlot, compartment, closureType, hasCoinPocket);
        this.isWaterProof = isWaterProof;
    }

    public Wallet(String material, String color, String size, int cardSlot, int compartment, String closureType, boolean hasCoinPocket, boolean isWaterProof, int durability) {
        this(material, color, size, cardSlot, compartment, closureType, hasCoinPocket, isWaterProof);
        this.durability = durability;
    }

    public Wallet(String material, String color, String size, int cardSlot, int compartment, String closureType, boolean hasCoinPocket, boolean isWaterProof, int durability, String userType) {
        this(material, color, size, cardSlot, compartment, closureType, hasCoinPocket, isWaterProof, durability);
        this.userType = userType;
    }
	
	public Wallet(String material, String color, String size, int cardSlot, int compartment, String closureType, boolean hasCoinPocket, boolean isWaterProof, int durability, String userType, boolean customized) {
        this(material, color, size, cardSlot, compartment, closureType, hasCoinPocket, isWaterProof, durability, userType);
        this.customized = customized;
    }

  public void info() {
        System.out.println("Wallet Material: " + this.material);
        System.out.println("Wallet Color: " + this.color);
        System.out.println("Wallet Size: " + this.size);
        System.out.println("Card Slot: " + this.cardSlot);
        System.out.println("Compartment: " + this.compartment);
        System.out.println("Closure Type: " + this.closureType);
        System.out.println("Has Coin Pocket: " + this.hasCoinPocket);
        System.out.println("Is Waterproof: " + this.isWaterProof);
        System.out.println("Durability: " + this.durability);
        System.out.println("User Type: " + this.userType);
        System.out.println("Customized: " + this.customized);
    }
}

