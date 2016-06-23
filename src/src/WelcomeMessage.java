
public class WelcomeMessage {
	private long count;
	private String welcomeMsg;

	public WelcomeMessage(){
		this.welcomeMsg = "Welcome";
	}

	public WelcomeMessage(String welcomMsg){
		this.welcomeMsg = welcomMsg;
	}

    public void sayHello( String userName ) {
    	System.out.println(welcomeMsg + " " + userName);
    	count++;
    }

    public long getCount() {
    	return count;
    }
}
