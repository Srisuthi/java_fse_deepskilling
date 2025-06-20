import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "T-shirt", "Clothing"),
            new Product(103, "Smartphone", "Electronics"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Watch", "Accessories")
        };

        // 🔎 Linear Search
        System.out.println("Linear Search Result:");
        Product found1 = Search.linearSearch(products, "Smartphone");
        System.out.println(found1 != null ? found1 : "Product not found");

        // 📋 Sort array before Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // 🔎 Binary Search
        System.out.println("Binary Search Result:");
        Product found2 = Search.binarySearch(products, "Smartphone");
        System.out.println(found2 != null ? found2 : "Product not found");
    }
}
