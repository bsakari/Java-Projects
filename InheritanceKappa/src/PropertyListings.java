public class PropertyListings {
    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int getNumBeds;


    public PropertyListings(double askingPrice, String propertyType, double lotSize) {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        numBaths = 0;
        getNumBeds = 0;
    }

    public PropertyListings(double askingPrice, String propertyType, double lotSize, int numBaths, int getNumBeds) {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.getNumBeds = getNumBeds;
    }

    public String toString() {
        return "Asking Price = " + askingPrice + "\nProperty Type = " + propertyType + "\nLot Size = " + lotSize + "\nNumber of Bathrooms = " + numBaths + "\nNumber of Bedrooms = " + getNumBeds;
    }
}


