import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class SumTask implements Runnable {
    private int awal, akhir;
    private long partialSum = 0;
    private String NamaThread;

    public SumTask(int awal, int akhir, String NamaThread) {
        this.awal = awal;
        this.akhir = akhir;
        this.NamaThread = NamaThread;
    }

    @Override
    public void run() {
        System.out.println(NamaThread + " mengerjakan rentang: " + awal + " - " + akhir);
        for (int i = awal; i <= akhir; i++) {
            partialSum += i;
        }
        System.out.println(NamaThread + " selesai. Hasil Parsial: " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class PenjumlahanParalel {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Thread: ");
        int numThreads = sc.nextInt();
        System.out.print("Masukkan Angka Akhir: ");
        int AngkaAkhir = sc.nextInt();

        List<Thread> threads = new ArrayList<>();
        List<SumTask> tasks = new ArrayList<>();

        int JarakPerThread = AngkaAkhir / numThreads;
        int MulaiDari = 1;

        // 1. Divide: Membagi tugas ke masing-masing thread
        for (int i = 0; i < numThreads; i++) {
            int AkhirDari = (i == numThreads - 1) ? AngkaAkhir : MulaiDari + JarakPerThread - 1;
            
            SumTask task = new SumTask(MulaiDari, AkhirDari, "Thread-" + (i + 1));
            Thread t = new Thread(task);
            
            tasks.add(task);
            threads.add(t);
            
            t.start(); // Memulai eksekusi thread
            MulaiDari = AkhirDari + 1;
        }

        // 2. Synchronization: Menunggu semua thread selesai
        long totalSum = 0;
        for (int i = 0; i < threads.size(); i++) {
            threads.get(i).join(); // Memastikan thread utama menunggu thread i selesai
            totalSum += tasks.get(i).getPartialSum();
        }

        System.out.println("------------------------------------");
        System.out.println("HASIL AKHIR TOTAL: " + totalSum);
        
        sc.close();
    }
}