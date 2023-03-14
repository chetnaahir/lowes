import java.util.Scanner;

public class prodt {
    public static void main(String args[]) {
    	int pid,qty;
    	String pname;
    	int left;
    	float price, totalcost;
    	int main_st=100000;
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the Product Name: ");
        pname = sc.next();
        System.out.println("Enter pid : ");
        pid= sc.nextInt();
        System.out.println("Enter quantity : ");
        qty= sc.nextInt();
        System.out.println("Enter price : ");
        price= sc.nextFloat();
        //System.out.println("Enter stock needed : ");
        //stock= sc.nextInt();
        
        totalcost= qty * price;
        left=main_st-qty;
        System.out.println("Total cost of product "+pname+" of id "+pid+" is "+ totalcost);
        System.out.println("The stock left is: "+ left);
        
    }
}
