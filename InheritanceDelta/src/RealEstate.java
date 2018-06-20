import javax.swing.*;

public class RealEstate {
    public static void main(String[] args) {
        RealEstateListings Land,House;
        Land = new RealEstateListings(1000000,2.1,
                "Land");
        House = new RealEstateListings(2500000,3,
                "House",3,2);
        JOptionPane.showMessageDialog(null,"Land Details\n"
    +(Land.toString()));
        JOptionPane.showMessageDialog(null,"House Details\n"
    +(House.toString()));

    }
}
