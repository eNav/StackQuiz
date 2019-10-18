
public interface ISTACK<X> {
	public ISTACK<X> push(X v);
	//adds top to stack
	public ISTACK<X> top();
	//gets top of Stack
	public ISTACK<X> pop();
	//removes the top from the stack
	public boolean emptyStack?();
	//Purpose: to check if stack is empty
}
