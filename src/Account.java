public class Account {

    private String name;

    double balance;

    public Account() {
        this.balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;  //Uttaget lyckades
        } else {
            System.out.println("Inte tillräckligt med saldo för att ta ut" + amount);
            return false; //Uttaget misslyckades
        }
        }
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Kontot tillhör " + name + " och har ett saldo på " + balance + " kronor.";
    }
}
