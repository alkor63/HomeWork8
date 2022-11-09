import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//  МАССИВЫ !!!
        System.out.println(" *****  HomeWork#8 - Arrays ! *****");
// задача 1 - объявляем массивы, заполняем ячейки
        int [] nums = new int [3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        double [] floats = {1.57, 7.654, 9.986};
        char [] chess = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
// выводимс в консоль содержитмое массивов
// arrays printing
        System.out.println("*** arrays printing ***");
        int i = 0;
        for (; i<2 ; i++) System.out.print(nums[i]+", ");
        System.out.println(nums[i]);

        for (i = 0; i<2 ; i++) System.out.print(floats[i]+", ");
        System.out.println(floats[i]);

        for (i = 0; i<7 ; i++) System.out.print(chess[i]+", ");
        System.out.println(chess[i]);
// reverse printing
        System.out.println("reverse printing of arrays");
        for (i = 2; i>0 ; i--) System.out.print(nums[i]+", ");
        System.out.println(nums[i]);

        for (i = 2; i>0 ; i--) System.out.print(floats[i]+", ");
        System.out.println(floats[i]);

        for (i = 7; i>0 ; i--) System.out.print(chess[i]+", ");
        System.out.println(chess[i]);
// все нечётные числа делаем чётными
        System.out.println("\n odd numbers --> even (+1)");
        int j = nums.length;
        for (i = 0; i<j ; i++) {
            if (nums[i] % 2 != 0) nums[i] += 1;
            if (i < (j - 1)) System.out.print(nums[i] + ", ");
            else System.out.println(nums[i]+" - все нечётные числа сделали чётными (+1)");
        }
// part 2
//        int[] arr = generateRandomArray();
//        public static int[] generateRandomArray() {
// так и не понял как этот генератор случайных чисел (ГСЧ) сделать "на уровне main"
// поэтому запустил ГСЧ внутри main
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for ( i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
//            return arr;
//        }
        System.out.println("\nпроверяем, чем ГСЧ заполнил наш массив ");
            for (j=0; j<3; j++) {
                for (i=10*j; i<(10*(j+1)); i++)  System.out.print(arr[i]+" ");
                System.out.println();
            }
            int paySum = 0;
            int payMin = 200_000;
            int payMax = 100_000;
            for (i=0; i<30; i++) {
                paySum = paySum + arr[i];
                if (arr[i] < payMin) payMin = arr[i];
                if (arr[i] > payMax) payMax = arr[i];
            }
            double averagePay = paySum*1.0 / arr.length;
        System.out.println("\nСумма трат за месяц составила "+paySum+" рублей");
        System.out.println("\nМинимальная сумма трат за день составила "+ payMin +" рублей");
        System.out.println("Максимальная сумма трат за день составила "+ payMax +" рублей");
        System.out.println("\nСредняя сумма трат за месяц составила "+averagePay+" рублей");
// Вариант решения с foreach
        System.out.println("То же решение через foreach");
        paySum = 0;
        payMin = 200_000;
        payMax = 100_000;
        for (int payDay : arr) {
            paySum += payDay;
            if (payDay < payMin) payMin = payDay;
            if (payDay > payMax) payMax = payDay;
        }
        averagePay = paySum*1.0 / arr.length;
        System.out.println("\nСумма трат за месяц составила "+paySum+" рублей");
        System.out.println("\nМинимальная сумма трат за день составила "+ payMin +" рублей");
        System.out.println("Максимальная сумма трат за день составила "+ payMax +" рублей");
        System.out.println("\nСредняя сумма трат за месяц составила "+averagePay+" рублей");

// Задача 4 - реверсировать строки (ряд символов)

// *** задачки со звёздочкапми ***
// создать матрицу 3х3
// обе диагонали заполнить "1" (в одном цикле)
//  если индексы матрицы i и j, то одна диагональ (i=j), а вторая (i+j) = maxIndex = .lenght-1
        System.out.println("Создаем матрицу 3х3 с диагоналями из 1");
        int mSize = 3;
        int matrix3[][] = new int[3][3];
        for (i=0; i<mSize; i++) {
            for (j=0; j<mSize; j++) {
                if (i==j || (i+j)==(mSize-1))
                    matrix3[i][j] = 1;
                else  matrix3[i][j] = 0;
            }
        }
        for (int[] row:matrix3){
            for (int column:row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
        System.out.println("Усложним задачу.\n теперь матрица 10х10 из цифр 1 с 8 в диагоналях");
        mSize = 10;
        int matrix1[][] = new int[mSize][mSize];
        for (i=0; i<mSize; i++) {
            for (j=0; j<mSize; j++) {
                if (i==j || (i+j)==(mSize-1))
                    matrix1[i][j] = 8;
                else  matrix1[i][j] = 1;
            }
        }
        for (int[] row:matrix1){
            for (int column:row){
                System.out.print(column+" ");
            }
            System.out.println();
        }
//
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] arr2 = new int[5];
        int maxIndex = arr1.length-1;
        for (i=0; i<=maxIndex; i++)
            arr2[i] = arr1[maxIndex-i];
        System.out.println("\n задача 6. Начальный массив:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("после реверса в другой массив:");
        System.out.println(Arrays.toString(arr2));
        int k = arr1.length/2;  // int даже при нечетном length
        for (i=0; i<k; i++) {
            int tmp = arr1[i];
            arr1[i] = arr1[maxIndex-i];
            arr1[maxIndex-i] = tmp;
        }
        System.out.println("Задача 7. Реверс с помощью дополнительной переменной tmp");
        System.out.println(Arrays.toString(arr1));
// Дан массив из 10 чисел. Найти пары чисел, дающих в сумме -2
        int[] arr3 = {-6,2,5,-8,8,10,4,-7,12,1};
        System.out.println("\nЗадача 8. Дан массив из 10 чисел:");
        System.out.println(Arrays.toString(arr3));
        System.out.println("Находим пары чисел, дающих в сумме -2");
        for (i=0;i<arr3.length-1;i++){
            for (j=i+1;j<arr3.length;j++){
                if((arr3[i]+arr3[j]) == -2) System.out.println("сумма чисел "+arr3[i]+" и "+arr3[j]+" равна -2");
            }
        }
    }
}