package PRAKTIK1;

public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double totalSales, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.totalSales = totalSales;
        this.commissionRate = commissionRate;
    }
    
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }

    @Override
    public double pay(){
        double basepay = super.pay();
        double comissionPay = totalSales*commissionRate;
        totalSales=0;
        return basepay + comissionPay;
    }

    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        result += "\nCommission Rate: " + commissionRate;
        return result;
    }
}
