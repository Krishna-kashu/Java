class WineRunner {
    public static void main(String[] args) {

        String wineType = "Red Wine";
        int alcoholContent = 13;
        String grapeVariety = "Cabernet Sauvignon";
        int agingTime = 5;
        int bottleSize = 750;
        String taste = "Dry";
        boolean hasAcidity = true;
        String sugarContent = "Low";
        float price = 49.99f;
        String bottleMaterial = "Glass";

        Wine wine1 = new Wine();
        wine1.info();

        Wine wine2 = new Wine(wineType);
        wine2.info();

        Wine wine3 = new Wine(wineType, alcoholContent);
        wine3.info();

        Wine wine4 = new Wine(wineType, alcoholContent, grapeVariety);
        wine4.info();

        Wine wine5 = new Wine(wineType, alcoholContent, grapeVariety, agingTime);
        wine5.info();

        Wine wine6 = new Wine(wineType, alcoholContent, grapeVariety, agingTime, bottleSize);
        wine6.info();

        Wine wine7 = new Wine(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste);
        wine7.info();

        Wine wine8 = new Wine(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste, hasAcidity);
        wine8.info();

        Wine wine9 = new Wine(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste, hasAcidity, sugarContent);
        wine9.info();

        Wine wine10 = new Wine(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste, hasAcidity, sugarContent, price);
        wine10.info();
        System.out.println();

        Wine wine11 = new Wine(wineType, alcoholContent, grapeVariety, agingTime, bottleSize, taste, hasAcidity, sugarContent, price, bottleMaterial);
        wine11.info();
    }
}
