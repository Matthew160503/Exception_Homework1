import java.util.Random;

public class Program {
    static Random rand = new Random();
    public static void main(String[] args) {
        //int num = task1Err1();
        //task1Err2();
        //task1Err3();
        //task2();
        //task3();
    }

    // 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    public static int task1Err1(){
        int divide = 10/0;
        return divide;
    }

    public static void task1Err2(){
        int[] arr = new int[10];
        System.out.println(arr[11]);
    }

    public static void task1Err3(){
        int num = -3;
        int[] arr = new int[num];
    }

    /**
    2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
    необходимо как-то оповестить пользователя.
    **/

    public static void task2(){
        int[] array_1 = createArray();
        System.out.println("Первый массив:");
        for (int i : array_1) System.out.print(i + " ");
        System.out.println();
        int[] array_2 = createArray();
        System.out.println("Второй массив:");
        for (int i : array_2) System.out.print(i + " ");
        System.out.println();
        System.out.println("Результирующий массив:");
        int[] res = operationForTask2(array_1, array_2);
        for (int i : res) System.out.print(i + " ");
    }

    public static int[] operationForTask2(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Размерности двух массивов не совпадают");
        }
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i]-arr2[i];
        }
        return res;
    }

    public static int[] createArray(){
        int[] array = new int[4 + rand.nextInt(2)];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }

    /**
    3) (Дополнительно) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, 
    необходимо как-то оповестить пользователя.
    Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
    **/

    public static void task3(){
        int[] array_1 = createArray();
        System.out.println("Первый массив:");
        for (int i : array_1) System.out.print(i + " ");
        System.out.println();
        int[] array_2 = createArray();
        System.out.println("Второй массив:");
        for (int i : array_2) System.out.print(i + " ");
        System.out.println();
        System.out.println("Результирующий массив:");
        double[] res = operationForTask3(array_1, array_2);
        for (double i : res) System.out.print(i + " ");
    }

    public static double[] operationForTask3(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            throw new RuntimeException("Размерности двух массивов не совпадают");
        }
        double[] res = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0){
                throw new RuntimeException(String.format("Деление на ноль (по индексу %d) запрещено! ", i));
            }
            res[i] = (double)arr1[i]/arr2[i];
        }
        return res;
    }
}