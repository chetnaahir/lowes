
public class multilevelint {
	static class A {
	    public void printA()
	    {
	        System.out.println("HI");
	    }
	}
	 
	static class B extends A {
	    public void printB() { System.out.println("HEY"); }
	}
	 
	static class C extends B {
	    public void printC()
	    {
	        System.out.println("HELLO");
	    }
	}
	 
	public static class Main {
	    public static void main(String[] args)
	    {
	        C g = new C();
	        g.printA();
	        g.printB();
	        g.printC();
	    }
	}
}
