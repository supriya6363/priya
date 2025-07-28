 class Restaurant {        
  public static final String RESTAURANT_NAME = "The Golden Spoon"; 
    public static String RESTAURANT_ADDRESS = "789 Culinary Lane, Foodville";
    public static int TOTAL_TABLES = 20; 
    private static double totalRevenue = 0.0; 
    protected static int openHoursPerDay = 12; 

    
    public static String getRestaurantName() {
        return RESTAURANT_NAME; 
    }

    public static void updateRestaurantAddress(String newAddress) {
        RESTAURANT_ADDRESS = newAddress; 
        System.out.println("Restaurant address updated to: " + RESTAURANT_ADDRESS);
    }

    public static void recordSale(double amount) {
        if (amount > 0) {
            totalRevenue += amount; 
            System.out.println("Sale recorded. Current total revenue: $" + totalRevenue);
        } else {
            System.out.println("Invalid sale amount.");
        }
    }

    public static double getTotalRevenue() {
        return totalRevenue; 
    }

    public static int getOperatingHours() {
        return openHoursPerDay; 
    }

    public static void main(String[] args) {
        System.out.println("Welcome to " + Restaurant.getRestaurantName());
        System.out.println("Located at: " + Restaurant.RESTAURANT_ADDRESS);
        System.out.println("Total tables: " + Restaurant.TOTAL_TABLES);
        System.out.println("Open for: " + Restaurant.getOperatingHours() + " hours daily.");
        System.out.println("Initial total revenue: $" + Restaurant.getTotalRevenue());

        Restaurant.recordSale(55.75);
        Restaurant.recordSale(120.00);
        Restaurant.recordSale(30.50);

        System.out.println("Current total revenue: $" + Restaurant.getTotalRevenue());

        Restaurant.updateRestaurantAddress("101 Gourmet Boulevard, Gastronomy City");
        System.out.println("Updated Restaurant Address: " + Restaurant.RESTAURANT_ADDRESS);
}
}



