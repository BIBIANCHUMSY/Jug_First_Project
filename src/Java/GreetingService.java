package Java;

public class GreetingService {

    public String greet (String name) {
        return "Welcome to NaijaJUG,  " + name + "!";
    }
    public void printGreeting(String name) {
        System.out.println(greet(name));
    }
}
