package pl.waw.sgh.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;

    private List<Customer> customerList = new ArrayList<>();

    private List<Account> accountList = new ArrayList<>();

    private Integer lastCustomerID = 0;

    private Integer lastAccountID = 1000;

    public Bank(String name) {
        this.name = name;
    }

    public Customer newCustomer(String firstName, String lastName, String email) {
        Customer cust = new Customer(lastCustomerID++, firstName, lastName, email);
        customerList.add(cust);
        return cust;
    }

    public Account newAccount(Customer customer, String currency) {
        Account acc = new Account(lastAccountID++, currency, customer);
        accountList.add(acc);
        return acc;
    }

    public Account newAccount(Customer customer) {
        return newAccount(customer, "EUR");
    }

    //TODO - to implement
    public void transfer(Account fromAccount, Account toAccount, Double amount) throws NegativeAmountException {
        fromAccount.charge(amount);
        toAccount.deposit(amount);
    }

    //TODO - to implement
    public void transfer(Integer fromAccountID, Integer toAccountID, Double amount) throws NegativeAmountException {
        Account fromAccount = findAccountByID(fromAccountID);
        Account toAccount = findAccountByID(toAccountID);
        if ((fromAccount!=null) && (toAccount!=null)) {
            transfer(fromAccount, toAccount, amount);
        } else {
            System.out.println("One of the accounts not found!!!");
        }
    }

    //TODO
    public Account findAccountByID(Integer accID) {
        for (Account acc : accountList) {
            if (acc.getAccountID()==accID) {
                return acc;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ",\n cust=" + customerList +
                ",\n acc=" + accountList +
                '}';
    }
}
