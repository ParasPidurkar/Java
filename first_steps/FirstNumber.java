public class FirstNumber {

    public static void main(String[] args){
        int number = 5;
        System.out.println("Number =>"+number);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }
    }
    
}
