
public class Invoker {
	ICommand lightson;
	ICommand lightsoff;
	
	public Invoker(ICommand c) {
		this.lightson=c;
		this.lightsoff=c;
	}
	
	public void clickon() {
		this.lightson.execute();
	}
	
	public void clickoff() {
		this.lightson.unexecute();
	}

}
