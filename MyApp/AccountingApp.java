import javax.swing.JOptionPane;

public class AccountingApp {

    public static void main(String[] args) {

        double valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Enter a valueOfSupply"));
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = (income) * 0.5;
        double devidend2 = (income) * 0.3;
        double dividend3 = (income) * 0.2;

        System.out.println("Value of supply: " + valueOfSupply);
        System.out.println("Value of supply: " + vat);
        System.out.println("Total: " + total);
        System.out.println("Expense: " + expense);
        System.out.println("Income: " + income);
        System.out.println("Dividend1 : " + dividend1);
        System.out.println("Dividend2 : " + devidend2);
        System.out.println("Dividend : " + dividend3);

    }
}
