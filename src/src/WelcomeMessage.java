
public class WelcomeMessage {
	private Counter counter;
	private String welcomeMsg = "Welcome";

	public WelcomeMessage(){
		this.counter = new Counter();
	}

	public WelcomeMessage(String welcomMsg){
		super();
		this.welcomeMsg = welcomMsg;
	}

    public void sayHello( String userName ) {
    	System.out.println(welcomeMsg + " " + userName);
    	this.counter.increment();
    }

    public long getCount() {
    	return this.counter.getCount();
    }
}
