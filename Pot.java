class Pot {
    public static void main(String[] Args) {
        double pot1 = 12.5;
        double pot2 = 8.3;
        double pot3 = 15.2;
        double pot4 = 10.0;
        double pot5 = 20.7;

        double[] potDiameters = {pot1, pot3, pot4, pot5, pot2, 18.4};
        
        for (int i = 0; i <= 5; i++) {
            System.out.println((i + 1) + ") " + "\nPot diameter: " + potDiameters[i] + " cm");
        }

        System.out.println("\n");
        for (double diameter : potDiameters) {
            System.out.println(diameter + " cm");
        }
    }
}


class Router {
    public static void main(String[] args) {
        int router1 = 100; 
        int router2 = 150;
        int router3 = 300;
        int router4 = 500;
        int router5 = 1000;

        int[] routers = {router1, router3, router4, router5, router2, 1200};
        
        for (int i = 0; i <= 5; i++) {
            System.out.println((i + 1) + ") \nMy router speed is " + routers[i] + " Mbps");
        }

      
        for (int speed : routers) {
            System.out.println(speed + " Mbps");
        }
    }
}

