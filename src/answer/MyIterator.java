package answer;

import java.util.Iterator;

public class MyIterator implements Iterator<Entry> {

	private Entry entry;
	
	public MyIterator(Entry entry){
		this.entry = entry;
	}
	
	@Override
	public boolean hasNext() {
		if(entry == null) return false;
		return true;
	}

	@Override
	public Entry next() {
		Entry e = entry.car();
		this.entry = entry.cdr();
		return e;
	}

}
