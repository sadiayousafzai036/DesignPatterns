
public class Handler2 implements IHandler {
	 private IHandler next=null;
	@Override
	public void handlerequest() {
		if (next!=null) {
			this.next.handlerequest();
		}
		else {
		System.out.println("H2");
		}
	}

	@Override
	public void setnext(IHandler h) {
		this.next=h;
		
	}

}
