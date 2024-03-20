
// Find how many numbers in the array have an even number of digits

public class EvenDigits1295 {

    // No static in LC
    static int findNums(int[] arr) {
        int count = 0;

        for(int num: arr) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    // My solution
//    static boolean even(int num) {
//        String str = String.valueOf(num);
//        int count = str.length();
//        return count % 2 == 0;
//    }

    static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    static int digits(int num) {
        if(num < 0) {
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}

