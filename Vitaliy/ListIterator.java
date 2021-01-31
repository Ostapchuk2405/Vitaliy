
public interface ListIterator extends Iterator<Object> {

	boolean hasPrevious();
	
	void set(Object e); 
	
	@Override
	void remove();
}
