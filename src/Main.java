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

        int j = nums.length;
        for (i = 0; i<(j) ; i++) {
            if(nums[i]%2 != 0) nums[i] +=1;
            System.out.print(nums[i]+", ");
        }
        System.out.println(" - все нечётные числа сделали чётными (+1)");

    }
}