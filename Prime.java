//Writing a java program to find a prime numbers
public class Prime {
    public static void main(String[] args) {
        int n = 100;
        int i = 2;
        int count = 0;
        while (i <= n) {
            int j = 2;
            while (j <= i) {
                if (i % j == 0) {
                    break;
                }
                j++;
            }
            if (i == j) {
                System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println("The number of prime numbers between 1 and " + n + " is " + count);  
        
    }
}
