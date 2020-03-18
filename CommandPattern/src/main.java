
public class main {

	public static void main(String[] args) {
          ICommand c=new Command();
          c.setReceiver(new Receiver());
          c.execute();
          c.unexecute();
	}

}
