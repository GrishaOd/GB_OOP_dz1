import javax.lang.model.element.Name;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product1 = new Product();
        System.out.println(product1.displayInfo());

        product1.setPrice(-1400);
        product1.setName("~");
        System.out.println(product1.displayInfo());


        BottleOfWater bottleOfWater1 = new BottleOfWater("Brand #1", "Name #1", 210, 0.5);
        System.out.println(bottleOfWater1.displayInfo());
        BottleOfWater bottleOfWater2 = new BottleOfWater("Brand #2", "Name #2", 250, 0.5);
        System.out.println(bottleOfWater1.displayInfo());
        BottleOfWater bottleOfWater3 = new BottleOfWater("Brand #3", "Name #3", 310, 1);
        System.out.println(bottleOfWater1.displayInfo());
        Crisps crisps1 = new Crisps("Lays", "Tasty", 400, "Сыр");
        System.out.println(crisps1.displayInfo());
        Crisps crisps2 = new Crisps("Doritos", "Summer", 430, "Сметана и лук");
        System.out.println(crisps2.displayInfo());
        Crisps crisps3 = new Crisps("Pringles", "Orange", 520, "Паприка");
        System.out.println(crisps3.displayInfo());


        ArrayList<Product> list = new ArrayList<>();
        list.add(bottleOfWater1);
        list.add(bottleOfWater2);
        list.add(bottleOfWater3);
        list.add(new BottleOfWater("Brand #4", "Name #5", 310, 0.33));
        list.add(crisps1);
        list.add(crisps2);
        list.add(crisps3);
        list.add(new Crisps("Lays", "Classic", 400, "Соль"));

        VendingMachine vendingMachine = new VendingMachine(list);
        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Name #2",  0.5);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки нет(");
        }

        Crisps crispsRes = vendingMachine.getCrisps("Lays", "Сыр");
        if (crispsRes != null){
            System.out.println("Вы купили: ");
            System.out.println(crispsRes.displayInfo());
        }
        else {
            System.out.println("Таких чипсов нет(");
        }


    }
}
