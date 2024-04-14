class LCM {
    static int GCD(int p, int q) {
        int a = Math.max(p, q);
        int b = Math.min(p, q);
        int c = -1;

        while (c != 0) {
            c = a % b;
            a = b;
            b = c;
        }

        return a;
    }

    public static void main(String[] args) {
        int x = 12, y = 16;

        int gcd = GCD(x, y);

        int lcm = (x * y) / (gcd);
        
        System.out.println("LCM is " + lcm);
    }
}
