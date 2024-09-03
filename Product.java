import java.util.Scanner;

public class Product {
    String name;
    double price;
    boolean salesTax;
    String category;

    Product() {
        name = "new item";
        price = 1;
        salesTax = true;
        category = "hardware";
    }

    enum noTaxItems  {
        fruits , vegetables , meat , dairy
    }

//    Product [] categoryArray = noTaxItems.values();

    Scanner sc = new Scanner(System.in);

    Product getValuesAndSetValues(Product obj) {
        System.out.println("Enter the category of the product");
        category = sc.nextLine();
        System.out.println("Enter the name of the product");
        name = sc.nextLine();
        System.out.println("Enter the price of the product");
        price = sc.nextInt();
        for (noTaxItems item : noTaxItems.values()) {
            if (obj.category.equalsIgnoreCase(item.name())) {
                obj.salesTax = false;
                System.out.println("Sales tax is not applied on " + item.name() + " products.");
                break;
            }
        }
        if (salesTax){
            price = price + (price * 0.08);
        }

        System.out.println(obj.salesTax + " , " + obj.name + "  , " + obj.price);
        return obj;
    }


    public static void main(String[] args) {
        Product firstObj = new Product();
        firstObj.getValuesAndSetValues(firstObj);
    }
}
