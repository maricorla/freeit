import java.util.Arrays;

public class Task3 {
    /*Напишите программу печати таблицы перевода расстояний
         из дюймов всантиметры для значений
        длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
         */
    public static void main(String[] args) {
        int[] dm = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] table = method(10) ;
       // printArray(table);
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(dm));



    }

    public static double[] method(int arrayLength) {
        double result = 0;
        double[] created = new double[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            result = (i+1) * 2.54;
            created[i] = result;

        }
        return created;

    }

    public static void printArray(double[] ar) {
        for (double value : ar) {
            System.out.println(value);
        }
    }
}
