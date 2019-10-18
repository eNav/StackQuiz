

public class NMTLSTACK<X> implements ISTACK<X> {
	private X car;
	private StackIList<X> cdr;
	
	public NMTLSTACK(X f, ISTACK<X> r) {
		car = f;
		cdr = r;	}
	
	public NMTLSTACK<X> push(X v){
		return new NMTLSTACK<X>(v,this);	}
	
	public X top() throws Exception{return car;}
	public X rest() throws Exception{return cdr;}
	
	private NMTLSTACK<X> revhelper(ISTACK<X> l, ISTACK<X>res)
	//ACCUM INV: reverse(this) == append(reverse(l), res)
	{try {if(l.isEmpty()) {return res;}
	else{return (revhelper(l.rest(), res.cons(l.first())));}}
	catch(Exception e) {
		System.out.println("Error StackNMTLIST append: "+ e.getMessage());
		return this;}	}
	
	public ISTACK<X> reverse() {return(revhelper(this, new NMTLSTACK<X>()));}
	
}
