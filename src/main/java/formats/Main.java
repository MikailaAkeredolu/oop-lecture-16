package formats;

public class Main {
    public static void main(String[] args) {
       // System.out.printf("Format to two decimal places %.4f", 99.68 );
//        String result = String.format("Format to two decimal places %.4f", 99.68);
//        System.out.println(result);

        String result = String.format("Format to two decimal places %,d", 10000000);
        System.out.println(result);



    }
}
