import java.text.DecimalFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            double purchasePrice = 10.81;
            double salesTax = 0.05;
            double purchaseTax = purchasePrice * salesTax;
            double purchaseTaxed = purchasePrice + purchaseTax;
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("The sales tax for the purchase of " + purchasePrice + " is " + df.format(purchaseTax) + ". The total price will be " + df.format(purchaseTaxed) + ".");
    }
}