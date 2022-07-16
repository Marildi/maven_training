package marynadidyk;

/*  Счастливый билет
        Условия:
        1) Числа >= 0 && <= 9;
        2) a + b + c = d + e + f;

        Positive scenario:
        [1, 2, 3, 3, 2, 1]
        [0, 9, 0, 9, 0, 0]

        Negative scenarios:
        [10, 2, 1, 2, 1, 10] - BV
        [-1, 1, 1, 1, 1, -1] - BV
        [2, 3, 4, 5, 6, 7] - a + b + c ≠ d + e + f
        [ , 1, 2, 1, 2, 1] - a = null
        [i, 1, 1, 1, 1, 1] - incorrect type
        [U+0031, 1, 1, 1, 1, 1] - incorrect type
        [1.2, 1, 1, 1, 1, 1.2] - incorrect type
        */
public class LuckyTicket{
/*    public static void main(String[] args) throws IllegalArgumentException{
        int[] array = {11, 1, 8, 1, 8, 11};
        System.out.println("Is ticket lucky: " + isTicketLucky(array));
    }*/

    public static boolean isTicketLucky(int[] array) {
        boolean result = false;

        for (int j : array) {
            if (j < 0 || j > 9) {
                throw new IllegalArgumentException();
            } else if (j >= 0 && j <= 9) ;
            int firstSum = array[0] + array[1] + array[2];
            int secondSum = array[3] + array[4] + array[5];

            if (firstSum == secondSum) {
                result = true;
            } else if (firstSum != secondSum) {
                result = false;
            }
        }
        return result;
    }
}


