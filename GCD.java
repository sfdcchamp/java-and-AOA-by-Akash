class GCD {
    public static void main(String[] args) {
        int x = 12, y = 16;

        int a = Math.max(x, y);
        int b = Math.min(x, y);
        int c = -1;

        while (c != 0) {
            c = a % b;
            a = b;
            b = c;
        }

        System.out.println("GCD is " + a);
    }
}
