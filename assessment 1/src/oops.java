
public class oops {
  //single inheritance-- only a single parent class and child class. The child class inherits the attrivutes and methods of parent class.
	static class A{
		public void abc() {
			System.out.print("a");
		}	
	}
	static class B extends A {
		public void def() {
			System.out.print("b");
		}
	}
	public static void main(String[] args) {
		B be=new B();
		be.abc();
		be.def();
	}
	
}
