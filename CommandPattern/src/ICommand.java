
public interface ICommand {
     public void execute();
     public void unexecute();
     public void setReceiver(Receiver r);
}
