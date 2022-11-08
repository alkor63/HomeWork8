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

        i = 0;
        for (; i<2 ; i++) System.out.print(floats[i]+", ");
        System.out.println(floats[i]);

        i = 0;
        for (; i<7 ; i++) System.out.print(chess[i]+", ");
        System.out.println(chess[i]);
// reverse printing
        System.out.println("reverse printing of arrays");
        i = 2;
        for (; i>0 ; i--) System.out.print(nums[i]+", ");
        System.out.println(nums[i]);

        i = 2;
        for (; i>0 ; i--) System.out.print(floats[i]+", ");
        System.out.println(floats[i]);

        i = 7;
        for (; i>0 ; i--) System.out.print(chess[i]+", ");
        System.out.println(chess[i]);
// все нечётные числа делаем чётными
        System.out.println("\n odd numbers --> even (+1)");
        int j = nums.length;
        for (i = 0; i<(j) ; i++) {
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
 //       }
        System.out.println("\nпроверяем, чем ГСЧ заполнил наш массив ");
            for (j=0; j<3; j++) {
                for (i=10*j; i<(10*(j+1)); i++)  System.out.print(arr[i]+" ");
                System.out.println();
            }

            int payMin = 200_000;
            int payMax = 100_000;
            for (i=0; i<30; i++) {
                if (arr[i] < payMin) payMin = arr[i];
                if (arr[i] > payMax) payMax = arr[i];

}
        System.out.println("Минимальная сумма трат за день составила "+ payMin +" рублей");
        System.out.println("Максимальная сумма трат за день составила "+ payMax +" рублей");
    }
}