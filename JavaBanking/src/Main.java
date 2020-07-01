public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bank of America");

        bank.addBranch("Dallas");

        bank.addCustomer("Dallas", "George", 100.21);
        bank.addCustomer("Dallas", "Roberta", 59.87);
        bank.addCustomer("Dallas", "Julian", 17.28);

        bank.addBranch("Houston");
        bank.addCustomer("Houston", "Robert", 100.00);
        bank.addCustomer("Houston", "Earl", 6.27);
        bank.addCustomer("Houston", "Davis", 7.21);

        bank.addCustomerTransaction("Dallas", "George", 44.22);
        bank.addCustomerTransaction("Dallas", "George", 87.92);
        bank.addCustomerTransaction("Dallas", "George", 25.31);
        bank.addCustomerTransaction("Houston", "Earl", 72.22);
        bank.addCustomerTransaction("Houston", "Davis", 14.65);
        bank.addCustomerTransaction("Dallas", "Roberta", 4.78);

        bank.listCustomers("Dallas", true);
    }

}
