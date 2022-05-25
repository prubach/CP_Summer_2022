package pl.waw.sgh.bank;

public class PlayWithBank {

    public static void main(String[] args) /*throws NegativeAmountException */ {
        Bank bank = new Bank("MyBank");
        Customer c1 = bank.newCustomer("Anne", "Smith", "anne@smith.com");
        Customer c2 = bank.newCustomer("John", "Brown", "john@brown.com");
        Account a1 = bank.newAccount(c1);
        Account a2 = bank.newAccount(c1);

        Account a3 = bank.newAccount(c2);
        Account a4 = bank.newAccount(c2);
        System.out.println(bank);
        try {
//            Account a5 = null;
//            a5.deposit(333.0);
            a1.deposit(100.0);
            a1.deposit(20.0);
            //a1.charge(-10.0);
            //a1.charge(200.0);
            a1.charge(50.0);
            System.out.println(bank);
            bank.transfer(a1, a2, 90.0);
            System.out.println(bank);
// 1
/*
        } catch (NotEnoughMoneyException ne) {
            System.out.println("Got exception: " + ne);
        } catch (NegativeAmountException ne) {
            System.out.println("Got exception: " + ne);
        }
*/
// 2
/*
        } catch (NotEnoughMoneyException | NegativeAmountException ne) {
            System.out.println("Got exception: " + ne);
        }
*/
// 3
/*
    // Don't use this approach unless absolutely necessary - this hides potential bugs
        } catch (Exception ne) {
            System.out.println("Got exception: " + ne);
        }
*/
// 4
        } catch (BankException ne) {
            System.out.println("Got exception: " + ne);
        }
    }
}
