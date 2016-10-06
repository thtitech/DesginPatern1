package answer;

public class Cons extends Entry {
	
	private Entry car;
	
	private Entry cdr;
	
	public Cons(){
		car = null;
		cdr = null;
	}
	
	public Cons(Entry car, Entry cdr){
		if(car == null) throw new NullPointerException();
		this.car = car;
		this.cdr = cdr;
	}
	
	public boolean add(Entry e){
		if(car == null){
			//this is cons cell whose size is 0
			car = e;
			return true;
		}else if(cdr == null){
			cdr = new Cons(e,null);
			return true;
		}else{
			return cdr.add(e);
		}
	}
	
	@Override
	public Entry car() {
		return car;
	}

	@Override
	public Entry cdr() {
		return cdr;
	}

	@Override
	public int size(){
		if(car == null){
			return 0;
		}else if(cdr == null){
			return 1;
		}else{
			return 1 + cdr.size();
		}
	}
	
	@Override
	public String getContent() {
		if((car == null) && (cdr == null)) return "[(),()]";
		if(cdr == null) return "[" + car.getContent() + ",()" + "]";
		return "[" + car.getContent() + "," + cdr.getContent() + "]";
	}
}
