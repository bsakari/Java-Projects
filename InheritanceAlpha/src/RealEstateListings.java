public class RealEstateListings {
    private double price,itemSize;
    private String propertyType;
    private int numBeds,numBaths;
    //Generate Land Constructor
    public RealEstateListings
    (double price, double itemSize,String propertyType){
       this.price = price;
       this.itemSize = itemSize;
       this.propertyType = propertyType;
       numBeds = 0;
       numBaths = 0;
    }
    //Generate a constructor for a House
    public RealEstateListings(double price, double itemSize, String propertyType, int numBeds,int numBaths){
        this.price = price;
        this.itemSize = itemSize;
        this.propertyType = propertyType;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
    }
    public String toString(){
        return "Price = "+price+"\nProperty Type = "+propertyType
                +"\nProperty Size = "+itemSize
                +"\nNumber of Bedrooms = "+numBeds+
                "\nNumber of Bathrooms = "+numBaths;
    }
}
