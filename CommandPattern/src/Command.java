
public class Command implements ICommand {
    private Receiver p;
	@Override
	public void execute() {
		this.p.actionOn();		
	}

	@Override
	public void unexecute() {
		this.p.actionOff();
	}

	@Override
	public void setReceiver(Receiver r) {
	    this.p=r;
	}

}
