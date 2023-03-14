interface A {
    public void add();
}
 
interface B {
    public void mul();
}
 
interface C extends A, B {
    public void div();
}
class mulin implements C {
    @Override public void div()
    {
        System.out.println("division happened");
    }
 
    public void abc() { System.out.println("something"); }

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("addition happened");
	}

	@Override
	public void mul() {
		System.out.println("multiplication happened");
		
	}
}


public class multipleint {
	public static void main(String[] args)
    {
        mulin m = new mulin();
        m.add();
        m.mul();
        m.div();
    }
}
