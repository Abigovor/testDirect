/**
 * Created by admin on 10.01.2015.
 */
public class Main {
    public static void main(String[] args) {
        WelcomeMessage welcome = new WelcomeMessage();
        welcome.sayHello("Git");
        System.out.println("Idea + GIT");
        System.out.println("Say hello run: " + welcome.getCount());
    }
}
