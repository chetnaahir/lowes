import java.util.*;

class productcat
{
   String pname;
   int pid,qty;
   float price, totalcost;
   void accept()
   {
    Scanner sc= new Scanner(System.in);
    try{
      System.out.println("Enter the Product Name: ");
      pname = sc.next();
      System.out.println("Enter pid : ");
      pid= sc.nextInt();
      System.out.println("Enter quantity : ");
      qty= sc.nextInt();
      System.out.println("Enter price : ");
      price= sc.nextFloat();
    }catch(Exception e){}
    finally {
        sc.close();
    }
   }
    void display() {
    	totalcost= qty * price;
    	System.out.println("Pid: "+pid+ "\nproduct name: "+pname+ "\nquantity: "+ qty+"\nprice: "+price+"\ntotal amount: "+totalcost);
    	
    }
}

class bill{
	public static void main(String args[])
	{
		int n;
		float t=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter how many product: ");
			n= sc.nextInt();
		}
		productcat p1[]= new productcat[n];
		for(int i=0; i<n;i++) {
			p1[i]= new productcat();
			p1[i].accept();
		}
		for(int i=0;i<n;i++) {
			p1[i].display();
		}
		for(int i=0;i<n;i++) {
			t= t+ p1[i].totalcost;
			System.out.println("Total cost is: "+t);
		}
		}
	}