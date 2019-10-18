package Stack;

import Stack.ISTACK;
import Stack.NMTSTACK;

public class MTSTACK<X> implements ISTACK<X> {
	public MTSTACK() {};  
	public ISTACK<X> pop() throws Exception{
		throw new Exception("Method pop applied to an empty stack");}
	
	public ISTACK<X> push (X v){return new NMTSTACK<X>(v, this);}
	
	public X top() throws Exception{
		throw new Exception("Method first applied to an empty stack");}
	
	public boolean emptyStack() {return true;}
	
	public ISTACK<X> reverse() {return this;}
	
	public ISTACK<X> stackrest() throws Exception {
		throw new Exception("Method first applied to an empty stack");
	}
	public String ToString() {return null;}
	

}
