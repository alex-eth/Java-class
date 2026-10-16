import java.util.ArrayList;


class Agency {

    private static int count = 0;
    private String code;
    private String address ;
    public Agency(String address) {
        count++;
        this.code = getClass().getName() + ": " + count;
        this.address = address;
    
    }

    
    public String getCode() {
        return code;
    
    }


    public String toString() {
        return code + " (" + address + ")";
    
    }
}


class Client {

    private static int count = 0;
    private String code;
    private String firstName;
    private String lastName;
    private String address;
    private Agency agency;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    public Client(String firstName, String lastName, String address, Agency agency) {
        count++;
        this.code = getClass().getName() +  " :" + count;
        this.firstName = firstName ;
        this.lastName = lastName;
        this.address = address;
        this.agency = agency;
    }

    public Agency getAgency() {
        return agency;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public String toString() {
        String result = code + " : " + firstName+ " " + lastName + "," + address + ", " + agency.getCode();
        for (Account account : accounts) {
            result += "\n    " + account;
        }
        return result;
    }
}



class Account {
    
    
    protected static int count=  0;
    protected String code ;
    protected double balance;
    protected Client owner;
    protected Agency agency;

    
    public Account(Client owner, double balance) 
    {
        
        count++;
        this.code = getClass().getName()+ ":"+ count;
        this.owner = owner;
        this.agency = owner.getAgency() ;
        this.balance = balance;
        owner.addAccount(this);
        
    }
    public void deposit(double amount) {
        balance += amount;
        
    }

    public void withdraw(double amount) {
        balance -= amount;
        
    }


    public double getBalance() {
        return balance;
    
    }

    
    public String toString() {
        return code + " : balance = " + balance + " euros";
    }
}




class SavingsAccount extends Account {
    
    private double interestRate = 6;
    public SavingsAccount(Client owner, double balance) {
        super(owner, balance);
    }

   
    public void calculateInterest() {
        balance += balance * interestRate / 100;
    }


}

class CheckingAccount extends Account {
   
    public CheckingAccount(Client owner, double balance) {
        super(owner, balance);
    }
    public void deposit(double amount) {
        balance += amount - 1;
    }
    public void withdraw(double amount) {
        balance -= amount + 1;
    }


}

public class BankApplication {
    
    public static void main(String[] args) {
        Agency agency = new Agency("10 Main Street");
        Client[] clients = new Client[4];
        clients[0] = new Client("John", "Smith", "1 Rue A", agency);
        clients[1] = new Client("Emma", "Brown", "2 Rue B", agency);
        clients[2] = new Client("Paul", "Martin", "3 Rue C", agency);
        clients[3] = new Client("Lisa", "Davis", "4 Rue D", agency);
        new SavingsAccount(clients[0], 1000);
        new CheckingAccount(clients[1], 2500);
        new CheckingAccount(clients[2], 0);
        new CheckingAccount(clients[2], 3000);
        new SavingsAccount(clients[3], 2300);
        new CheckingAccount(clients[3], 0);
        for (Client client : clients) {
            System.out.println(client);
        }
        System.out.println();
        clients[0].getAccounts().get(0).deposit(500);
        clients[1].getAccounts().get(0).withdraw(200);
        clients[2].getAccounts().get(1).deposit(100);
        clients[3].getAccounts().get(1).deposit(50);
        for (Client client : clients) {
            System.out.println(client);
        
        }
    
    }



}
