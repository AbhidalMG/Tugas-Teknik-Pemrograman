package PRAKTIK3;
import java.util.Scanner;

public class Strings { // Pastikan nama class Strings (pakai 's')
    public static void main (java.lang.String[] args) {
        // Gunakan tipe data String standar Java
        java.lang.String[] strList; 
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print ("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine(); // Penting: membersihkan buffer setelah nextInt()

        strList = new java.lang.String[size];

        System.out.println ("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            strList[i] = scan.nextLine();
        }

        // Panggil insertionSort sesuai spesifikasi poin 4
        Sorting.insertionSort(strList);

        System.out.println ("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.print(strList[i] + " ");
        }
        System.out.println();
    }
}