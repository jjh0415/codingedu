import javax.swing.JOptionPane;
//field variable 
//	Method는 서로 연관된 코드를 모아서 이름을 붙인 정리정돈 상자

public class AccountingMethodApp {

    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;

    // Local variable
    public static void main(String[] args) {

        valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Enter a valueOfSupply"));
        vatRate = 0.1;
        expenseRate = 0.3;
        print();
    }

    private static void print() {
        System.out.println("Value of supply: " + valueOfSupply);
        System.out.println("Value of supply: " + getVAT());
        System.out.println("Total: " + getTotal());
        System.out.println("Expense: " + getExpense());
        System.out.println("Income: " + getIncome());
        System.out.println("Dividend1 : " + getDividend1());
        System.out.println("Dividend2 : " + getDividend2());
        System.out.println("Dividend : " + getDividend3());
    }

    private static double getDividend1() {
        return getIncome() * 0.5;
    }

    private static double getDividend2() {
        return getIncome() * 0.3;
    }

    private static double getDividend3() {
        return getIncome() * 0.2;
    }

    private static double getIncome() {
        return valueOfSupply - getExpense();
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return valueOfSupply + getVAT();
    }

    private static double getVAT() {
        return valueOfSupply * vatRate;
    }
}
