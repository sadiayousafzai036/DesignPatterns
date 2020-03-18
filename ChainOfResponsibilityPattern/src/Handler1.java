
public class Handler1 implements IHandler {
    private IHandler next=null;
	@Override
	public void handlerequest() {
		System.out.println("H1");
		if (next!=null) {
			this.next.handlerequest();
		}
		
	}

	@Override
	public void setnext(IHandler h) {
		this.next=h;
		
	}

}
