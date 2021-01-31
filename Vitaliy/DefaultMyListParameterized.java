import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultMyListParameterized<T> implements MyListParameterized<T>, ListIterableParameterized<T> {

	private Node<T> first;
	private Node<T> last;
	private int size;
	
	public Object removeNodeByIndex (int index) {
		return unlink(getNodeByIndex(index));
	}
	
	Object unlink (Node<T> element) {
		Object obj = element.data;
		Node<T> next = element.next;
		Node<T> previous = element.previous;
			
		if (previous == null) {
			first = next;
		} else {
			previous.next = next;
			element.previous = null;
		}
		if (next == null) {
			last = previous;
		} else {
			next.previous = previous;
			element.next = null;
		}
			
		element.data = null;
		size--;
		return obj;	
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterableParameterized<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(T e) {
		// TODO Auto-generated method stub
		final Node<T> lastNode = last;
        final Node<T> newNode = new Node<>(lastNode, element, null);
        last = newNode;
        if (lastNode == null) {
			first = newNode;
		} else {
			lastNode.next = newNode;
		}
        size++;
	}
		

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for (Node<T> x = first; x != null; ) {
			Node<T> next = x.next;
			x.data = null;
			x.next = null;
			x.previous = null;
			x = next;
		}
		last = null;
		first = null;
		size = 0;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		if (obj == null) {
			for (Node<T> x = first; x != null; x = x.next) {
				if (x.data == null) {
					unlink(x);
					return true;
				}
			}		
		} else {
			for (Node<T> x = first; x != null; x = x.next) {
				if (x.data.equals(obj)) {
					unlink(x);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] result = new Object[size];
		int index = 0;
		for (Node<T> x = first; x != null; x = x.next) {
			result[index++] = x.data;
		}
		return result;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		if (o == null) {
			for (Node<T> x = first; x != null; x = x.next) {
				if (x.data == null) {
					return true;
				}
			}
		} else {
			for (Node<T> x = first; x != null; x = x.next) {
				if (x.data.equals(o)) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean containsAll(MyListParameterized<?> c) {
		// TODO Auto-generated method stub
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			if (!contains(array[i])) {
				return false;
			};
		}	
		return true;
	}

}
