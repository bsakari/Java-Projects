public class Property {
    public static void main(String[] args) {
        PropertyListings Land = new PropertyListings(1000,"land",2.1);
        PropertyListings House = new PropertyListings(2500000,"House", 1.5,3,4);
        System.out.println(Land.toString());
        System.out.println(House.toString());
    }
}
