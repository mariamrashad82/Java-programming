package MariamMethods;

public class varArgs {
    public static void main(String[] args) {
        calculator c = new calculator();
        int[]nums={2,3,77};
        c.printAllArrayNumbers(nums);
        c.printAllNumbers(23,456,676,58675);
        c.printAllNumbers(3,5,7,8);
    }
}
