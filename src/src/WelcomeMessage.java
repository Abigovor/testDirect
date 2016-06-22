
public class WelcomeMessage {
	private String welcomeMsg;

	public WelcomeMessage(){
		this.welcomeMsg = "Welcome";
	}

	public WelcomeMessage(String welcomMsg){
		this.welcomeMsg = welcomMsg;
	}

    public void sayHello( String userName ) {
    	System.out.println(welcomeMsg + " " + userName);
    }
}
