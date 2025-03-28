class Pallet {

    int capacity;
    String material;
    String color;
    String surface;
    int durability;
    boolean isReusable;
    int weight;
    String design;
    int cost;
    boolean isRecyclable;
	
	
    public Pallet() {
        System.out.println("Pallet Details:");
    }

    public Pallet(int capacity) {
        this.capacity = capacity;
    }

    public Pallet(int capacity, String material) {
        this(capacity);
        this.material = material;
    }

    public Pallet(int capacity, String material, String color) {
        this(capacity, material);
		
		
        this.color = color;
    }

    public Pallet(int capacity, String material, String color, String surface) {
        this(capacity, material, color);
        this.surface = surface;
    }

    public Pallet(int capacity, String material, String color, String surface, int durability) {
        this(capacity, material, color, surface);
        this.durability = durability;
    }

    public Pallet(int capacity, String material, String color, String surface, int durability, boolean isReusable) {
        this(capacity, material, color, surface, durability);
        this.isReusable = isReusable;
    }

    public Pallet(int capacity, String material, String color, String surface, int durability, boolean isReusable, int weight) {
        this(capacity, material, color, surface, durability, isReusable);
        this.weight = weight;
    }

    public Pallet(int capacity, String material, String color, String surface, int durability, boolean isReusable, int weight, String design) {
        this(capacity, material, color, surface, durability, isReusable, weight);
        this.design = design;
    }

    public Pallet(int capacity, String material, String color, String surface, int durability, boolean isReusable, int weight, String design, int cost) {
        this(capacity, material, color, surface, durability, isReusable, weight, design);
        this.cost = cost;
    }

    public Pallet(int capacity, String material, String color, String surface, int durability, boolean isReusable, int weight, String design, int cost, boolean isRecyclable) {
        this(capacity, material, color, surface, durability, isReusable, weight, design, cost);
        this.isRecyclable = isRecyclable;
    }
	public void info() {
        System.out.println("Pallet capacity: " + this.capacity);
        System.out.println("Pallet material: " + this.material);
        System.out.println("Pallet color: " + this.color);
        System.out.println("Pallet surface: " + this.surface);
        System.out.println("Pallet durability: " + this.durability);
        System.out.println("Pallet isReusable: " + this.isReusable);
        System.out.println("Pallet weight: " + this.weight);
        System.out.println("Pallet design: " + this.design);
        System.out.println("Pallet cost: " + this.cost);
        System.out.println("Pallet isRecyclable: " + this.isRecyclable);
    }
}