
public class Counter {
	private long count;
	
	public Counter(){
		this.count = 0;
	}

    public void increment() {
    	count++;
    }

    public long getCount() {
    	return count;
    }
}
