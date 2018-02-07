package e01ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<Integer> {
	
	private List<Integer> elements;
	private int currentIndex = 0;

	public ListyIterator() {
		elements = new ArrayList<>();
	}

	public void create(List<String>list) {
		for (String t : list) {
			elements.add(0, Integer.parseInt(t.substring(0, 1)));
		}
	}

	public Integer print() {
		if(elements.size() == 0)
			throw new IllegalArgumentException("Invalid Operation!");
		return elements.get(currentIndex);
	}
	
	public boolean move() {
		if(this.hasNext()){
			currentIndex++;
			return true;
		}
		return false;
	}

	public boolean hasNext() {
		if(currentIndex < elements.size() -1){
			return true;
		}
		return false;
	}
	
	public void push(List<String> elements) {
		this.create(elements);
	}
	
	public int pop() {
		if (elements.size() == 0)
			throw new IllegalArgumentException("No elements");
		else{
		int element = elements.get(0);
		elements.remove(0);
		return element;
		}
	}
	
	//Internal forEach using new instance of Iterator(), starting from index 0
	public void printAll() {
		Iterator<Integer> iterator = iterator();
		while(iterator.hasNext()) {
			int thisElement = iterator.next();
			System.out.print(thisElement);
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		
		return new Iterator<Integer>() {
			private int currentIndex = 0;

			@Override
			public boolean hasNext() {
				return currentIndex < elements.size();
			}

			@Override
			public Integer next() {
				return elements.get(currentIndex++);
			}
		};
	}

	
}