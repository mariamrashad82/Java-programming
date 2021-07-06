package mariam_abstraction_practice.churchEx;

public abstract class Servant {
    public void pray (String talk){
        System.out.println("Servant is praying from " + talk);
    }

    public abstract void meeting();
}
