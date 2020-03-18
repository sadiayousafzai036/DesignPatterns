
public class Leaf implements IComponent {
	private String name;
	private int salary;
	public Leaf(String s,int a) {
		this.name=s;
		this.salary=a;
	}
	@Override
	public void printDescription() {
		System.out.println("Name = "+ name + "\n" + "Salary = " + salary + "\n");
		
	}
	@Override
	public void addchild(IComponent e) {
		// TODO Auto-generated method stub
		
	}

}
