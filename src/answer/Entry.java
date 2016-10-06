package answer;

import java.util.AbstractCollection;
import java.util.Iterator;

public abstract class Entry extends AbstractCollection<Entry> implements Iterable<Entry> {

	public abstract String getContent();
	
	public int size(){
		return 1;
	}
	
	public Entry car(){
		return this;
	}
	
	public Entry cdr(){
		return null;
	}
	
	public boolean add(Entry e){
		return false;
	}
	
	@Override
	public Iterator<Entry> iterator() {
		return new MyIterator(this);
	}

}
