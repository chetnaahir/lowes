@FunctionalInterface
interface Rect{
    double area(double l,double b);
}
@FunctionalInterface
interface SimpleInterest{
    double simint(double p,double r,double t);
}
@FunctionalInterface
interface Circle{
    double areac(double radius);
}
public class interestandarea {
    public static void main(String[] args) throws Exception{
         Rect i1 = (l,b)->{
             double i = l * b;
             return i;
         };
         System.out.println("Area of Rectangle : "+i1.area(50, 70));
         SimpleInterest i2 = (p,r,t)->{
                double i = p*r*t;
                return i;
         };
         System.out.println("Simple Interest : "+i2.simint(13, 5, 4));
         Circle i3 = (r)->{
             double i = 3.14*r*r;
             return i;
         };
         System.out.println("Area of Circle : "+i3.areac(20));
    }
}