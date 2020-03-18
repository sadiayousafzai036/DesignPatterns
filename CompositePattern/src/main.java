
public class main {

	public static void main(String[] args) {
		IComponent c1=new Leaf("Leaf1",0);
		IComponent c2=new Leaf("Leaf2",1);
		IComponent c3=new Composite("Composite1",0);
		c3.addchild(c1);
		c3.addchild(c2);
		IComponent c4=new Leaf("Leaf3",2);
		Composite c=new Composite("Composite2",1);
		c.addchild(c4);
		c.addchild(c3);
		c.printDescription();

	}

}
