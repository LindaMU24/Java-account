public class App {

    public void run (){
       // Skapa nytt konto med saldo och namn
        Account myAccount = new Account("Alice", 1538348.50);

        //Använd deposit och withdraw
        myAccount.deposit(500);
        myAccount.withdraw(200);

        //Skriv ut kontoinformationen
        System.out.println(myAccount);
    }

}

