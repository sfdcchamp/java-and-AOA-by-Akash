public class DivisorsInRange {
    
     static int countDivisorsInRange(int k, int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (k % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int k = 24; 
        int n = 10; 
        
        int divisorsInRange = countDivisorsInRange(k, n);
        
        System.out.println("Number of divisors of " + k + " within the range [1, " + n + "]: " + divisorsInRange);
    }
}
