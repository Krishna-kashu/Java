class Wine {

    String wineType;
    int alcoholContent;
    String grapeVariety;
    int agingTime;
    int bottleSize;
    String taste;
    boolean hasAcidity;
    String sugarContent;
    float price;
    String bottleMaterial;

    public Wine() {
        System.out.println("Wine Details:");
    }

    public Wine(String wineType) {
        this();
        this.wineType = wineType;
		System.out.println();
    }

    public Wine(String wineType, int alcoholContent) {
        this(wineType);
        this.alcoholContent = alcoholContent;
    }

    public Wine(String wineType, int alcoholContent, String grapeVariety) {
        this(wineType, alcoholContent);
        this.grapeVariety = grapeVariety;
    }

    public Wine(String wineType, int alcoholContent, String grapeVariety, int agingTime) {
        this(wineType, alcoholContent, grapeVariety);
        this.agingTime = agingTime;
    }

    public Wine(String wineType, int alcoholContent, String grapeVariety, int agingTime, int bottleSize) {
        this(wineType, alcoholContent, grapeVariety, agingTime);
        this.bottleSize = bottleSize;
    }

    public Wine(String wineType, int alcoholContent, String grapeVariety, int agingTime, int bottleSize, String taste) {
        this(wineType, alcoholContent, grapeVariety, agingTime, bottleSize);
        this.taste = taste;
    }

    public Wine(String wineType, int alcoholContent, String grapeVariety, int agingTime, int bottleSize, String taste, boolean hasAcidity) {
        this(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste);
        this.hasAcidity = hasAcidity;
    }

    public Wine(String wineType, int alcoholContent, String grapeVariety, int agingTime, int bottleSize, String taste, boolean hasAcidity, String sugarContent) {
        this(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste, hasAcidity);
        this.sugarContent = sugarContent;
    }

    public Wine(String wineType, int alcoholContent, String grapeVariety, int agingTime, int bottleSize, String taste, boolean hasAcidity, String sugarContent, float price) {
        this(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste, hasAcidity, sugarContent);
        this.price = price;
    }

    public Wine(String wineType, int alcoholContent, String grapeVariety, int agingTime, int bottleSize, String taste, boolean hasAcidity, String sugarContent, float price, String bottleMaterial) {
        this(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste, hasAcidity, sugarContent, price);
        this.bottleMaterial = bottleMaterial;
    }

    public void info() {
        System.out.println("Wine Type: " + this.wineType);
        System.out.println("Alcohol Content: " + this.alcoholContent + "%");
        System.out.println("Grape Variety: " + this.grapeVariety);
        System.out.println("Aging Time: " + this.agingTime + " years");
        System.out.println("Bottle Size: " + this.bottleSize + " ml");
        System.out.println("Taste: " + this.taste);
        System.out.println("Has Acidity: " + this.hasAcidity);
        System.out.println("Sugar Content: " + this.sugarContent);
        System.out.println("Price: $" + this.price);
        System.out.println("Bottle Material: " + this.bottleMaterial);
    }
}
