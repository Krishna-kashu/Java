class Glass{
    static void seller(String name, String location, String contact, String license, double rating) {
        System.out.println("Glass Seller - Name: " + name + ", Location: " + location + ", Contact: " + contact + ", License: " + license + ", Rating: " + rating);
    }
    static void buyer(String name, String location, String contact, String purpose, double budget) {
        System.out.println("Glass Buyer - Name: " + name + ", Location: " + location + ", Contact: " + contact + ", Purpose: " + purpose + ", Budget: " + budget);
    }
}