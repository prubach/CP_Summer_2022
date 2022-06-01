package pl.waw.sgh.bank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bank implements Serializable {

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
    public void transfer(Account fromAccount, Account toAccount, Double amount) throws NegativeAmountException, NotEnoughMoneyException {
        fromAccount.charge(amount);
        toAccount.deposit(amount);
    }

    //TODO - to implement
    public void transfer(Integer fromAccountID, Integer toAccountID, Double amount) throws NegativeAmountException, NotEnoughMoneyException {
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

    public Customer findFirstCustomer() {
        if (customerList.size()>0)
            return customerList.get(0);
        else
            return null;
    }

    public Customer prevCustomer(Customer curCust) {
        int curCustIdx = customerList.indexOf(curCust);
        if (curCustIdx > 0) {
            return customerList.get(curCustIdx - 1);
        } else {
            //customerList.size()
            return null;
        }
    }

    public Customer nextCustomer(Customer curCust) {
        int curCustIdx = customerList.indexOf(curCust);
        if (curCustIdx < customerList.size()-1) {
            return customerList.get(curCustIdx + 1);
        } else {
            //customerList.size()
            return null;
        }
    }

    public List<Account> findAccountByCustomer(Customer cust) {
        List<Account> acList = new ArrayList<>();
        for (Account acc : accountList) {
            if (acc.getCustomer()==cust)
                acList.add(acc);
        }
        return acList;
    }

    public void deleteAccount(Account acc) {
        accountList.remove(acc);
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
