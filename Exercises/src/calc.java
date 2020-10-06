import java.util.Arrays;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        int[] arr = putInArray();
        System.out.println(Arrays.toString(arr));
        double medioResult = mediaResult(arr);
        System.out.println(medioResult);

    }

    public static double mediaResult(int[] array){
        int sum = 0;
        for(int i = 0; i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum + " sum");
        double result = (double) sum/array.length;
        return result;
    }


    public static int[] putInArray() {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            System.out.println("Enter your vote please (0-10)");
            int value;
            do{
                value = sc.nextInt();
                if (value<0 || value>10) {
                    System.out.println("Error enter again");
                }

            } while(value<0 || value>10);

            array[i] = value;
        }
        return array;
    }


}
