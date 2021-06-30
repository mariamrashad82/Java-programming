package day56_abstraction.greeting;

public class MountainLanguage implements Greeting{
    @Override
    public void hi() {
        System.out.println("Zeeee");
    }

    @Override
    public void bye() {
        System.out.println("Buaaa");
    }
}
