package exercise;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<Entry> list = new ArrayList<Entry>();
		for(int i = 0; i < 10; i++){
			list.add(new Content(String.valueOf(i)));
		}
		for(Entry e: list){
			System.out.println(e.getContent());
		}
	}
}
