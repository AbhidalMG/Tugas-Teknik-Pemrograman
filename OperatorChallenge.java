public class OperatorChallenge {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Nilai a setelah increment: " + ++a*2);
        boolean result = (++a * 2 > b) && (b++ % 3 == 1);

        System.out.println("Nilai a: " + a);
        System.out.println("Hasil Boolean: " + result);
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
    }
}
