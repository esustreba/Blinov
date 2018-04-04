package task01;

public class SumArgs {
    public static void main(String[] args) {
        int s=0, p=1;

        for(int i = 0; i <args.length; i ++){
            int sum = Integer.parseInt(args[i]);
            s=s+sum;
            p=p*sum;
        }

        System.out.println("Sum: " +s);
        System.out.println("Proiz: "+p);
    }
}
