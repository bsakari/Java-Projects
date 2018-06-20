import javax.swing.*;

public class RealEstate {
    public static void main(String[] args) {
        RealEstateListings Land,House;
        Land = new RealEstateListings(9000000,3.5,"Land");
        House = new RealEstateListings(8000000,4,"House",4,2);
//        System.out.println(Land.toString());
        JOptionPane.showMessageDialog(null,Land.toString());
//        System.out.println(House.toString());
        JOptionPane.showMessageDialog(null,House.toString());
    }
}
