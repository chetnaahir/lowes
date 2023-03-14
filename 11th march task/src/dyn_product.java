import java.util.Scanner;
public class dyn_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        String[] productIds = new String[n];
        String[] productNames = new String[n];
        double[] unitPrices = new double[n];
        int[] quantities = new int[n];
        int[] stocks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i+1) + ":");
            System.out.print("Product ID: ");
            productIds[i] = sc.next();
            System.out.print("Product Name: ");
            productNames[i] = sc.next();
            System.out.print("Unit Price: ");
            unitPrices[i] = sc.nextDouble();
            System.out.print("Quantity: ");
            quantities[i] = sc.nextInt();
            System.out.print("Stocks: ");
            stocks[i] = sc.nextInt();
        }
        
        System.out.println("Details of the products:");
        for (int i = 0; i < n; i++) {
            double cost = unitPrices[i] * quantities[i];
            
            System.out.println("Product ID: " + productIds[i]);
            System.out.println("Product Name: " + productNames[i]);
            System.out.println("Unit Price: " + unitPrices[i]);
            System.out.println("Quantity: " + quantities[i]);
            System.out.println("Stocks: " + stocks[i]);
            if (quantities[i] > stocks[i]) {
                System.out.println("Out of Stock");
            } else {
                System.out.println("Total Cost: " + cost);
                System.out.println("Remaining Stocks: " + (stocks[i] - quantities[i]));
            }
        }
    }
}