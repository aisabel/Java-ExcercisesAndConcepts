package otherExcercises;

public class GDCofTwoNumbers {
    /*Java program to find GCD (greatest common factor) of two
      numbers using Euclidean algorithm
    */
        // Function to return gcd of x and y
        // recursively
        static int GCD(int x, int y)
        {
            if (y == 0)
                return x;
            return GCD(y, x % y);
        }

        public static void main(String[] args)
        {
            int x = 36, y = 60;
            System.out.println("The GCD of " + x + " and " + y + " is: " + GCD(x, y));
        }
    }

