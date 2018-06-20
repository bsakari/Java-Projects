public class RealEstateListings {
    private double price,itemSize;
    private String propertyType;
    private int numBaths,numBeds;

    //Constructor for Land
    public RealEstateListings(double price,double itemSize, String propertyType){
        this.price = price;
        this.itemSize = itemSize;
        this.propertyType = propertyType;
        numBaths = 0;
        numBeds = 0;
    }
    //Constructor for a House
    public RealEstateListings(double price,double itemSize, String propertyType, int numBeds, int numBaths){
        this.price = price;
        this.itemSize = itemSize;
        this.propertyType = propertyType;
        this.numBeds = numBeds;
        this.numBaths = numBaths;
    }
    public String toString(){
        return "Price = "+price+"\nItem Size = "+itemSize
                +"\nProperty Type = "+propertyType
                +"\nNumber of Bedrooms = "+numBeds
                +"\nNumber of Bathrooms = "+numBaths;
    }
}
