class Soap{
	public static void main(String[] args){
	String brand="Dove";
	boolean isFragrant=true;
	float cost=30.35f;      //7 decimal digits
	double weight=100.55;  //16 decimal digits
	int quantity=20;
	long barcode=1234564600937009L;
	String md="06-07-2024";
	char grade='A';
	byte rating =5;
	short expiryYear=2026;
	boolean isOrganic=false;
	

	System.out.println("\n___Information About The Soap___\n");
	System.out.println("\nBrand Name: "+brand);
	System.out.println("\nCost: "+cost+"$");
	System.out.println("\nWeight: "+weight+"g");
	System.out.println("\nIs Fragrant: "+isFragrant);
	System.out.println("\nOrganic: "+isOrganic);
	System.out.println("\nQuantity: "+quantity);
	System.out.println("\nGrade: "+grade);
	System.out.println("\nRating: "+rating);
	System.out.println("\nManufactured date: "+md);
	System.out.println("\nExpiry Year: "+expiryYear);
	System.out.println("\nBardcode: "+barcode);
	
	
	brand="Santoor";
	isFragrant=false;
	cost=40.35f;      //7 decimal digits
	weight=150.55;  //16 decimal digits
	quantity=10;
	barcode=1234564609937009L;
	md="07-07-2024";
	grade='B';
	rating=4;
	expiryYear=2027;
	isOrganic=true;
	
	System.out.println("\n___Renitialized Information About The Soap___\n");
	System.out.println("\nBrand Name: "+brand);
	System.out.println("\nCost: "+cost+"$");
	System.out.println("\nWeight: "+weight+"g");
	System.out.println("\nIs Fragrant: "+isFragrant);
	System.out.println("\nOrganic: "+isOrganic);
	System.out.println("\nQuantity: "+quantity);
	System.out.println("\nGrade: "+grade);
	System.out.println("\nRating: "+rating);
	System.out.println("\nManufactured date: "+md);
	System.out.println("\nExpiry Year: "+expiryYear);
	System.out.println("\nBardcode: "+barcode);
	
	
	}

}

class Watch{
	public static void main(String[] args){
		String brand="Rolex";
		float price=5999.95f;
		double dia=45.03;
		int warrantyYear=5;
		long serialnumber=763409219348975L;
		char model='K';
		byte batterylife=7;
		boolean isWaterProof=true;
		short manufacturingyear=2024;
		boolean hasSmartFeatures=false;
		
		System.out.println("Watch Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Diameter: " + dia);
        System.out.println("Warranty (years): " + warrantyYear);
        System.out.println("Serial Number: " + serialnumber);
        System.out.println("Water Resistant: " + isWaterProof);
        System.out.println("Model: " + model);
        System.out.println("Battery Life (days): " + batterylife);
        System.out.println("Manufacturing Year: " + manufacturingyear);
        System.out.println("Has Smart Features: " + hasSmartFeatures);
		
		brand="Titin";
		price=4999.95f;
		dia=43.03;
		warrantyYear=5;
		serialnumber=7634092193487895L;
		model='V';
		batterylife=6;
		isWaterProof=false;
		manufacturingyear=2025;
		hasSmartFeatures=true;
		
		System.out.println("\nReinitialized Watch Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Diameter: " + dia);
        System.out.println("Warranty (years): " + warrantyYear);
        System.out.println("Serial Number: " + serialnumber);
        System.out.println("Water Resistant: " + isWaterProof);
        System.out.println("Model: " + model);
        System.out.println("Battery Life (days): " + batterylife);
        System.out.println("Manufacturing Year: " + manufacturingyear);
        System.out.println("Has Smart Features: " + hasSmartFeatures);
		
	}
	
}


class Napkin {
    public static void main(String[] args) {
        String brand = "SoftTouch";
        float price = 20.45f;
        double thickness = 0.5;
        int packSize = 100;
        long itemCode = 6543210987654L;
        boolean isRecyclable = true;
        char size = 'M';
        byte softnessLevel = 8;
        short manufacturingYear = 2024;
        boolean isPerfumed = false;

        System.out.println("\nNapkin Details:");
        System.out.println("\nBrand: " + brand);
        System.out.println("\nPrice: " + price);
        System.out.println("\nThickness: " + thickness);
        System.out.println("\nPack Size: " + packSize);
        System.out.println("\nItem Code: " + itemCode);
        System.out.println("\nRecyclable: " + isRecyclable);
        System.out.println("\nSize: " + size);
        System.out.println("\nSoftness Level: " + softnessLevel);
        System.out.println("\nManufacturing Year: " + manufacturingYear);
        System.out.println("\nPerfumed: " + isPerfumed);
		
		brand = "Bella";
        price = 50.75f;
        thickness = 0.7;
        packSize = 150;
        itemCode = 6543215898987654L;
        isRecyclable = false;
        size = 'L';
        softnessLevel = 9;
        manufacturingYear = 2025;
        isPerfumed = true;

        System.out.println("\n\nreinitialized Napkin Details:");
        System.out.println("\nBrand: " + brand);
        System.out.println("\nPrice: " + price);
        System.out.println("\nThickness: " + thickness);
        System.out.println("\nPack Size: " + packSize);
        System.out.println("\nItem Code: " + itemCode);
        System.out.println("\nRecyclable: " + isRecyclable);
        System.out.println("\nSize: " + size);
        System.out.println("\nSoftness Level: " + softnessLevel);
        System.out.println("\nManufacturing Year: " + manufacturingYear);
        System.out.println("\nPerfumed: " + isPerfumed);
    }
}


class Pillow {
    public static void main(String[] args) {
        String brand = "SleepWell";
        float price = 799.50f;
        double length = 24.5;
        int warrantyYears = 2;
        long barcode = 1357924680123L;
        boolean isMemoryFoam = true;
        char size = 'L';
        byte softnessLevel = 9;
        short manufacturingYear = 2023;
        boolean isHypoallergenic = true;

        System.out.println("Pillow Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Warranty (years): " + warrantyYears);
        System.out.println("Barcode: " + barcode);
        System.out.println("Memory Foam: " + isMemoryFoam);
        System.out.println("Size: " + size);
        System.out.println("Softness Level: " + softnessLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Hypoallergenic: " + isHypoallergenic);
		
		brand = "Kurlon";
        price = 599.50f;
        length = 25.5;
        warrantyYears = 3;
        barcode = 1357924680123L;
        isMemoryFoam = true;
        size = 'L';
        softnessLevel = 9;
        manufacturingYear = 2023;
		isHypoallergenic = true;

        System.out.println("\n\nReinitialized Pillow Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Warranty (years): " + warrantyYears);
        System.out.println("Barcode: " + barcode);
        System.out.println("Memory Foam: " + isMemoryFoam);
        System.out.println("Size: " + size);
        System.out.println("Softness Level: " + softnessLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Hypoallergenic: " + isHypoallergenic);
    }
}

class Bed {
    public static void main(String[] args) {
        String brand = "ComfortRest";
        float price = 19999.99f;
        double width = 72.5;
        int warrantyYears = 10;
        long barcode = 9876543215678L;
        boolean isWooden = true;
        char size = 'K';
        byte firmnessLevel = 7;
        short manufacturingYear = 2022;
        boolean hasStorage = true;

        System.out.println("Bed Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Width: " + width);
        System.out.println("Warranty (years): " + warrantyYears);
        System.out.println("Barcode: " + barcode);
        System.out.println("Wooden: " + isWooden);
        System.out.println("Size: " + size);
        System.out.println("Firmness Level: " + firmnessLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Has Storage: " + hasStorage);
		
		brand = "Nilkamal";
        price = 18999.74f;
        width = 85.5;
        warrantyYears = 7;
        barcode = 976565443215678L;
        isWooden = false;
        size = 'B';
        firmnessLevel = 8;
        manufacturingYear = 2023;
        hasStorage = false;

        System.out.println("\n Reinitialized Bed Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Width: " + width);
        System.out.println("Warranty (years): " + warrantyYears);
        System.out.println("Barcode: " + barcode);
        System.out.println("Wooden: " + isWooden);
        System.out.println("Size: " + size);
        System.out.println("Firmness Level: " + firmnessLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Has Storage: " + hasStorage);
    }
}

class Ring {
    public static void main(String[] args) {
        String material = "Gold";
        float price = 4999.99f;
        double weight = 10.5;
        int karat = 22;
        long serialNumber = 123456789999L;
        boolean hasDiamond = true;
        char size = 'M';
        byte durabilityLevel = 9;
        short manufacturingYear = 2021;
        boolean isEngraved = false;

        System.out.println("Ring Details:");
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Karat: " + karat);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Has Diamond: " + hasDiamond);
        System.out.println("Size: " + size);
        System.out.println("Durability Level: " + durabilityLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Engraved: " + isEngraved);
		
		material = "Silver";
        price = 2299.99f;
        weight = 12.5;
        karat = 21;
        serialNumber = 1232336789999L;
        hasDiamond = false;
        size = 'S';
		durabilityLevel = 10;
        manufacturingYear = 2020;
        isEngraved = true;

        System.out.println("\nReinitialized Ring Details:");
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Karat: " + karat);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Has Diamond: " + hasDiamond);
        System.out.println("Size: " + size);
        System.out.println("Durability Level: " + durabilityLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Engraved: " + isEngraved);
		
    }
}

class Bag {
    public static void main(String[] args) {
        String brand = "American Tourister";
        float price = 3499.99f;
        double capacity = 50.5;
        int warrantyYears = 5;
        long barcode = 112233445566L;
        boolean isWaterproof = true;
        char size = 'L';
        byte durabilityLevel = 8;
        short manufacturingYear = 2023;
        boolean hasLaptopCompartment = true;

        System.out.println("Bag Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Warranty (years): " + warrantyYears);
        System.out.println("Barcode: " + barcode);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Size: " + size);
        System.out.println("Durability Level: " + durabilityLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Laptop Compartment: " + hasLaptopCompartment);
		
		brand = "Wildcraft";
        price = 1999.99f;
        capacity = 30.5;
        warrantyYears = 4;
        barcode = 11223344556677L;
        isWaterproof = false;
        size = 'M';
		durabilityLevel = 6;
		manufacturingYear = 2022;
        hasLaptopCompartment = false;

        System.out.println("\nReinitialized Bag Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Warranty (years): " + warrantyYears);
        System.out.println("Barcode: " + barcode);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Size: " + size);
        System.out.println("Durability Level: " + durabilityLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Laptop Compartment: " + hasLaptopCompartment);
    }
}

class Hat {
    public static void main(String[] args) {
        String brand = "Nike";
        float price = 999.99f;
        double brimSize = 4.5;
        int warrantyYears = 1;
        long barcode = 998877665544L;
        boolean isAdjustable = true;
        char size = 'M';
        byte comfortLevel = 8;
        short manufacturingYear = 2024;
        boolean isUVProtected = true;

        System.out.println("Hat Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Brim Size: " + brimSize);
        System.out.println("Warranty (years): " + warrantyYears);
        System.out.println("Barcode: " + barcode);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("Size: " + size);
        System.out.println("Comfort Level: " + comfortLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("UV Protected: " + isUVProtected);
		
		brand = "HRX";
		price = 599.99f;
        brimSize = 3.5;
        warrantyYears = 3;
        barcode = 998877665544L;
        isAdjustable = false;
        size = 'X';
		comfortLevel = 7;
        manufacturingYear = 2022;
        isUVProtected = false;

        System.out.println("Reinitialized Hat Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Brim Size: " + brimSize);
        System.out.println("Warranty (years): " + warrantyYears);
        System.out.println("Barcode: " + barcode);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("Size: " + size);
        System.out.println("Comfort Level: " + comfortLevel);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("UV Protected: " + isUVProtected);
    }
}
