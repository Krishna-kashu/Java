class WalletRunner {
    public static void main(String[] args) {
        
        String material = "Leather";
        String color = "Black";
        String size = "Medium";
        int cardSlot = 4;
        int compartment = 3;
        String closureType = "Zipper";
        boolean hasCoinPocket = true;
        boolean isWaterProof = true;
        int durability = 5;
        String userType = "Men";
        boolean customized = false;

        Wallet wallet0 = new Wallet();
        wallet0.info();

        Wallet wallet1 = new Wallet(material);
        wallet1.info();

        Wallet wallet2 = new Wallet(material, color);
        wallet2.info();

        Wallet wallet3 = new Wallet(material, color, size);
        wallet3.info();

        Wallet wallet4 = new Wallet(material, color, size, cardSlot);
        wallet4.info();

        Wallet wallet5 = new Wallet(material, color, size, cardSlot, compartment);
        wallet5.info();

        Wallet wallet6 = new Wallet(material, color, size, cardSlot, compartment, closureType);
        wallet6.info();

        Wallet wallet7 = new Wallet(material, color, size, cardSlot, compartment, closureType, hasCoinPocket);
        wallet7.info();

        Wallet wallet8 = new Wallet(material, color, size, cardSlot, compartment, closureType, hasCoinPocket, isWaterProof);
        wallet8.info();

        Wallet wallet9 = new Wallet(material, color, size, cardSlot, compartment, closureType, hasCoinPocket, isWaterProof, durability);
        wallet9.info();

        Wallet wallet10 = new Wallet(material, color, size, cardSlot, compartment, closureType, hasCoinPocket, isWaterProof, durability, userType);
        wallet10.info();

        Wallet wallet11 = new Wallet(material, color, size, cardSlot, compartment, closureType, hasCoinPocket, isWaterProof, durability, userType, customized);
        wallet11.info();
    }
}
