
public class main {

	public static void main(String[] args) {
		IHandler h=new Handler1();
		IHandler h1=new Handler2();
		h.setnext(h1);
		h.handlerequest();
		

	}

}
