import javax.swing.JOptionPane;

public class AccountingArrayApp {

    public static void main(String[] args) {

        double valueOfSupply = Double.parseDouble(JOptionPane.showInputDialog("Enter a valueOfSupply"));
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        // 배열. 서로 연관된 데이터를 정리정돈 하는 수단
        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        double dividend1 = (income) * dividendRates[0];
        double devidend2 = (income) * dividendRates[1];
        double dividend3 = (income) * dividendRates[2];

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
