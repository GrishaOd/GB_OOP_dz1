import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Crisps getCrisps(String brand, String crispsTaste){
        for (Product product : products){
            if (product instanceof Crisps){
                Crisps crisps = (Crisps) product;
                if (crisps.getBrand().equals(brand) && crisps.getCrispsTaste().equals(crispsTaste)){
                    return crisps;
                }
            }
        }
        return null;
    }
}
