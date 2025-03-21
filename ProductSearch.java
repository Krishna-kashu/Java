/*
ProductSearch
double getPriceByProduct(Strig productName);//22
String[] getBrandsByProduct(String productName);//24
void searchProductAvailability(String productName);//23


*/

class ProductSearch {
    static double getPriceByProduct(String productName) {
        if (productName == "Laptop") {
            //System.out.println("55000.0");
			return 55000;
        }
        else if (productName == "Smartphone") {
            //System.out.println("20000");
			long price=20000;
			return price;
        }
        else if (productName == "Headphones") {
           
			long price1=20000;
			return price1;
        }else if (productName == "Tablet") {
           
			long price2=30000;
			return price2;
        }else if (productName == "Smartwatch") {
            
			long price3=15000;
			return price3;
        }else if (productName == "Monitor") {
            
			long price=12000;
			return price;
        }else if (productName == "Keyboard") {
           
			long price=2500;
			return price;
        }else if (productName == "Mouse") {
            
			long price=1200;
			return price;
        }else if (productName == "Printer") {
            
			long price=18000;
			return price;
        }else if (productName == "Speakers") {
            
			long price=5000;
			return price;
        }else if (productName == "Camera") {
           
			long price=15000;
			return price;
        }else if (productName == "Routers") {
            
			long price=3500;
			return price;
        }else if (productName == "SSD") {
            
			long price=6000;
			return price;
        }else if (productName == "Hard Drive") {
            
			long price=4000;
			return price;
        }else if (productName == "Gaming Console") {
           
			long price=40000;
			return price;
        }else if (productName == "Refrigerator") {
            
			long price=45000;
			return price;
        }else if (productName == "Refrigerator") {
           
			long price=30000;
			return price;
        }else if (productName == "Washing Machine") {
            
			long price=25000;
			return price;
        }else if (productName == "Microwave Oven") {
            
			long price=12000;
			return price;
        }else if (productName == "Air Conditioner") {
            
			long price=40000;
			return price;
        }else if (productName == "Bluetooth Speaker") {
            
			long price=35000;
			return price;
        }else if (productName == "Power Bank") {
            
			long price=2000;
			return price;
        }else if (productName == "Wireless Earbuds") {
            
			long price=5000;
			return price;
        }else if (productName == "Smart Bulb") {
			long price=1500;
			return price;
        }else if (productName == "Gaming Mouse") {
            
			long price=4000;
			return price;
        }else if (productName == "Graphics Card") {
           
			long price=70000;
			return price;
        }else if (productName == "External HDD") {
            
			long price=8000;
			return price;
        }else if (productName == "Fitness Band") {
            
			long price=3500;
			return price;
        }else if (productName == "Drone") {
            
			long price=70000;
			return price;
        }else if (productName == "Projector") {
            
			long price=55000;
			return price;
        }
        System.out.println("Product not found!");
         return 0;
    }

    static String[] getBrandsByProduct(String productName) {
        if (productName == "Laptop") {
            String[] laptops={"Dell, HP, Lenovo, Asus, Apple"};
            return laptops;
        }
        else if (productName == "Smartphone") {
            String[] smartphones={"Samsung, Apple, OnePlus, Google, Xiaomi"};
            return smartphones;
        }else if (productName == "Smartwatch") {
            String[] Smartwatchs={"Apple, Samsung, Garmin, Fitbit, Fossil"};
            return Smartwatchs;
        }else if (productName == "Headphones") {
            String[] headphones={" Sony, Bose, JBL, Sennheiser, Boat"};
            return headphones;
        }else if (productName == "Tablet") {
            String[] Tablets={"Apple, Samsung, Lenovo, Microsoft, Huawei"};
            return Tablets;
        }else if (productName == "Monitor") {
            String[] Monitors={"Dell, LG, ASUS, Samsung, BenQ"};
            return Monitors;
        }else if (productName == "Keyboard") {
            String[] Keyboards={"Logitech, Razer, Corsair, HyperX, Microsoft"};
            return Keyboards;
        }else if (productName == "Mouse") {
            String[] Mouses={"Logitech, Razer, Corsair, HP, Dell"};
            return Mouses;
        }else if (productName == "Printer") {
            String[] Printers={"HP, Canon, Epson, Brother, Xerox"};
            return Printers;
        }else if (productName == "Speakers") {
            String[] Speakers={"JBL, Bose, Sony, Marshall, Boat"};
            return Speakers;
        }else if (productName == "Camera") {
            String[] Camera={"Canon, Nikon, Sony, Fujifilm, Panasonic"};
            return Camera;
        }else if (productName == "Router") {
           String[] Router={"TP-Link, Netgear, ASUS, D-Link, Cisco"};
            return Router;
        }else if (productName == "SSD") {
            String[] SSD={"Samsung, Western Digital, Kingston, Crucial, Seagate"};
            return SSD;
        }else if (productName == "Hard Drive") {
            String[] Drives={"Seagate, Western Digital, Toshiba, Samsung, Adata"};
            return Drives;
        }else if (productName == "Gaming Console") {
            String[] Consoles={"Sony PlayStation, Microsoft Xbox, Nintendo Switch"};
            return Consoles;
        }else if (productName == "Power Bank") {
            String[] power_banks={"MI, Anker, Realme, Ambrane, OnePlus"};
            return power_banks;
        }else if (productName == "Bluetooth Earbuds") {
            String[] Earbuds={"Apple, Samsung, Boat, OnePlus, Sony"};
            return Earbuds;
        }else if (productName == "Graphics Card") {
            String[] Graphics={"NVIDIA, AMD, ASUS, MSI, Gigabyte"};
            return Graphics;
        }else if (productName == "Electric Scooter") {
            String[] Electric={"Ather, Ola, Hero, Bajaj, TVS"};
            return Electric;
        }else if (productName == "Projector") {
            String[] Projector={"Epson, BenQ, Sony, ViewSonic, LG"};
            return Projector;
        }else if (productName == "Smart TV") {
            String[] Smart={"Samsung, LG, Sony, TCL, OnePlus"};
            return Smart;
        }else if (productName == "Air Conditioner") {
            String[] Conditioner={"Daikin, LG, Voltas, Samsung, Blue Star"};
            return Conditioner;
        }else if (productName == "Microwave Oven") {
            String[] Microwave={"IFB, Samsung, LG, Panasonic, Morphy Richards"};
            return Microwave;
        }
        else if (productName == "Fitness Band") {
            String[] Fitness={"Fitbit, Xiaomi, Samsung, Garmin, Honor"};
            return Fitness;
        }
        System.out.println("No brands available!");
		return null;
    }

    static void searchProductAvailability(String productName) {
    if (productName == "Laptop" || productName == "Smartphone" || productName == "Headphones" || 
        productName == "Tablet" || productName == "Smartwatch" || productName == "Monitor" || 
        productName == "Keyboard" || productName == "Mouse" || productName == "Printer" || 
        productName == "Speakers" || productName == "Camera" || productName == "Routers" || 
        productName == "SSD" || productName == "Hard Drive" || productName == "Gaming Console" || 
        productName == "Refrigerator" || productName == "Washing Machine" || productName == "Microwave Oven" || 
        productName == "Air Conditioner" || productName == "Bluetooth Speaker" || productName == "Power Bank" || 
        productName == "Wireless Earbuds" || productName == "Smart Bulb" || productName == "Gaming Mouse" || 
        productName == "Graphics Card" || productName == "Drone" || productName == "Projector") {
        
        System.out.println(productName + " is available.");
    } else if (productName == "Fitness Band" || productName == "External HDD") {
        System.out.println(productName + " is not available.");
    } else {
        System.out.println("Product not found!");
    }
}

}


