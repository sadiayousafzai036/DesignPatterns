import java.awt.List;
import java.util.ArrayList;

public class Composite implements IComponent {
	ArrayList<IComponent> components = new ArrayList<IComponent>();
	private String name;
	private int salary;
	public Composite(String s,int a) {
		this.name=s;
		this.salary=a;
	}
	@Override
	public void printDescription() {
		System.out.println("Name = "+ name + "\n" + "Salary = " + salary + "\n");
		for (IComponent obj:components) {
			obj.printDescription();
		}
		
	}

	@Override
	public void addchild(IComponent e) {
		components.add(e);
	} 
}
