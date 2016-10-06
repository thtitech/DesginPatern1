package answer;

public class Content extends Entry{
	
	private String str;
	
	public Content(String str){
		this.str = str;
	}
	
	@Override
	public String getContent(){
		return str;
	}

}
