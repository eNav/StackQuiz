
public class NMTLSTACK<X> implements ISTACK<X> {
	private X car;
	private StackIList<X> cdr;
	
	public NMTLSTACK(X f, ISTACK<X> r) {
		car = f;
		cdr = r;	}
	
	

}
