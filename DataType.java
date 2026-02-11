import java.util.Scanner;
public class DataType {
    public static void main(String[] args) {
        java.math.BigInteger n;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Masukkan berapa kasus yang ingin dicek:");
        int t = scanner.nextInt();
        java.math.BigInteger [] arr = new java.math.BigInteger[t];
        for (int i = 0; i < t; i++) {
            System.out.print("Masukkan nilai n: ");
            n = scanner.nextBigInteger();
            arr[i] = n;
        }
        for (int i = 0; i < t; i++) {
            n = arr[i];
        if (n.compareTo(java.math.BigInteger.valueOf(Byte.MIN_VALUE)) > 0 
            && n.compareTo(java.math.BigInteger.valueOf(Byte.MAX_VALUE)) 
            < 0 && n.compareTo(java.math.BigInteger.valueOf(Short.MIN_VALUE)) > 0 
            && n.compareTo(java.math.BigInteger.valueOf(Short.MAX_VALUE)) 
            < 0 && n.compareTo(java.math.BigInteger.valueOf(Integer.MIN_VALUE)) > 0 
            && n.compareTo(java.math.BigInteger.valueOf(Integer.MAX_VALUE)) < 0){
            System.out.println(n + " can be fitted in\n*short\n*int\n*long");
        }
        else if (n.compareTo(java.math.BigInteger.valueOf(Short.MIN_VALUE)) > 0 
            && n.compareTo(java.math.BigInteger.valueOf(Short.MAX_VALUE)) 
            < 0 && n.compareTo(java.math.BigInteger.valueOf(Integer.MIN_VALUE)) > 0 
            && n.compareTo(java.math.BigInteger.valueOf(Integer.MAX_VALUE)) < 0){
            System.out.println(n + " can be fitted in\n*int\n*long");
        }
        else if (n.compareTo(java.math.BigInteger.valueOf(Integer.MIN_VALUE)) > 0 
            && n.compareTo(java.math.BigInteger.valueOf(Integer.MAX_VALUE)) < 0){
            System.out.println(n + " can be fitted in\n*long");
        }
        else if (n.compareTo(java.math.BigInteger.valueOf(Byte.MIN_VALUE)) < 0 
            || n.compareTo(java.math.BigInteger.valueOf(Byte.MAX_VALUE)) > 0){
            System.out.println(n + " can't be fitted anywhere.");
        }
        
    }
    
    }
}

