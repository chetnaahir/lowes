
public class empsal {
   public static void main(String[] args) {
	   // int eid= 103546;
	   // String ename= "Jon Brandon";
	   int basic= 10000;
	   System.out.println(salary(basic));
   }
   
   static double salary(int basic) {
	   double hra, da, ta;
	   hra= 0.12 *basic;
	   da=0.09*basic;
	   ta=0.08*basic;
	   double gross;
	   gross= basic+hra+da+ta;
	   if(gross>= 25000) {
		   System.out.println("A");
	   }else if(10000<= gross && gross<25000) {
		   System.out.println("B");
	   }else{
		   System.out.println("C");
	   }
	   return gross;
	   //gross>=25k-A,gross>=10k<25--B,else C)
   }
}
