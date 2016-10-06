package exercise;

public class Content extends Entry {

	public String str;
	
	public Content(String str){
		this.str = str;
	}
	
	@Override
	public String getContent() {
		return str;
	}

}
