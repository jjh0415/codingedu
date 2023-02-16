import javax.swing.JOptionPane;
//field variable 
//	Method는 서로 연관된 코드를 모아서 이름을 붙인 정리정돈 상자

class Accounting {
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    public void print() {
        System.out.println("Value of supply: " + valueOfSupply);
        System.out.println("Value of supply: " + getVAT());
        System.out.println("Total: " + getTotal());
        System.out.println("Expense: " + getExpense());
        System.out.println("Income: " + getIncome());
        System.out.println("Dividend1 : " + getDividend1());
        System.out.println("Dividend2 : " + getDividend2());
        System.out.println("Dividend : " + getDividend3());
    }

    private double getDividend1() {
        return getIncome() * 0.5;
    }

    private double getDividend2() {
        return getIncome() * 0.3;
    }

    private double getDividend3() {
        return getIncome() * 0.2;
    }

    private double getIncome() {
        return valueOfSupply - getExpense();
    }

    private double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private double getTotal() {
        return valueOfSupply + getVAT();
    }

    private double getVAT() {
        return valueOfSupply * vatRate;
    }
}

public class AccountingInstenceApp {

    // Local variable
    public static void main(String[] args) {

        // instance
        Accounting a1 = new Accounting();
        a1.valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Enter a valueOfSupply"));
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;
        a1.print();

        Accounting a2 = new Accounting();
        a2.valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Enter a valueOfSupply"));
        a2.vatRate = 0.05;
        a2.expenseRate = 0.2;
        a2.print();

    }

}