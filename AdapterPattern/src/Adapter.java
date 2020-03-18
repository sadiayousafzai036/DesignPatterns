
public class Adapter implements ITarget {
	Adaptee a;
    
	public Adapter(Adaptee s) {
		this.a=s;
	}
	@Override
	public void sayhello() {
		a.hellomessage("OOP");
		
	}

}
