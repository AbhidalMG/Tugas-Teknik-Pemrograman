class Account {
    int balance = 150;
}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account();
        Account acc2 = new Account();

        System.out.println("--- TRANSFER FULUS ---");
        System.out.println("Saldo Awal acc1: " + acc1.balance);
        System.out.println("Saldo Awal acc2: " + acc2.balance);

        System.out.println("\n--- PROSES TRANSFER ---");
        // Thread 1: Menjumlahkan/ transfer fulus dari acc1 ke acc2
        Thread t1 = new Thread(() -> {
            synchronized (acc1) { //Pada blok ini, Thread 1 mencoba mengunci acc1 untuk transfer dari acc1 ke acc2, jadi thread ini akan sama dengan thread 2 yang sudah mengunci acc1.
                System.out.println("Thread 1 sedang mengunci acc1 untuk transfer dari acc1 ke acc2");
                try { Thread.sleep(100); } catch (Exception e) {} // Simulasi dengan memberikan jeda. Mengapa diperlukan Exception?

                synchronized (acc2) { //Pada blok ini, Thread 1 mencoba mengunci acc2 untuk transfer dari acc2 ke acc1, jadi thread ini akan sama dengan thread 2 yang sudah mengunci acc2.
                    System.out.println("Thread 1 sedang mengunci acc2 untuk transfer dari acc2 ke acc1");
                    acc2.balance += acc1.balance;
                   
                }
            }
        });

        // Thread 2: Menjumlahkan/ transfer fulus dari acc2 ke acc1
        Thread t2 = new Thread(() -> {
            synchronized (acc1) { //Pada blok ini, Thread 2 mencoba mengunci acc1 untuk transfer dari acc1 ke acc2, jadi thread ini akan sama dengan thread 1 yang sudah mengunci acc1.
                System.out.println("Thread 2 sedang mengunci acc1 untuk transfer dari acc1 ke acc2");
                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (acc2) { //Pada blok ini, Thread 2 mencoba mengunci acc2 untuk transfer dari acc2 ke acc1, jadi thread ini akan sama dengan thread 1 yang sudah mengunci acc2.
                    System.out.println("Thread 2 sedang mengunci acc2 untuk transfer dari acc2 ke acc1");
                    acc1.balance += acc2.balance;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("\n--- HASIL AKHIR ---");
        System.out.println("Saldo Akhir acc1: " + acc1.balance);
		System.out.println("Saldo Akhir acc2: " + acc2.balance);
    }
}
