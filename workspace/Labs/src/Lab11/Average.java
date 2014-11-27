package Lab11;

public class Average {
    public static void main(String[] args) {
        if (args.length > 0) {
            double total = 0;
            double average;
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                total += num;
            }
            average = total / args.length;
            System.out.println(average);
        } else {
            System.out.println("No Arugments");
        }
    }
}