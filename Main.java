import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("fauzi", "26");
        obj.showMenu();
        
    }
    
}

class BankAccount{
    double balance;
    double previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

    void deposit(double amount){
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount ;
        }
    }
    void withdraw(double amount){
        if(amount != 0){
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction(){
        if(previousTransaction > 0 ){
            System.out.println("Deposited : " + previousTransaction);
        }
        else if (previousTransaction < 0){
            System.out.println("Withdraw : " +Math.abs(previousTransaction));
        }
        else{
            System.out.println("No Transaction Occured");
        }

    }

    void showMenu(){
        char option ='\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID " + customerId);
        System.out.println("\n Input Your option :");
        System.out.println("A : Check Your Balance" );
        System.out.println("B : Deposit ");
        System.out.println("C : Withdraw");
        System.out.println("D : Previous Transaction");
        System.out.println("E : Exit the System");

        do{
            System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
            System.out.println("Input your Option : " );
            System.out.println("+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            
            switch(option){
            case 'A'  :
                    System.out.println("--------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                    break;
            case 'B' :
                    System.out.println("--------------------------------------------");
                    System.out.println("Input an Amount to deposit" );
                    System.out.println("--------------------------------------------");
                    
                    double amount = scanner.nextDouble();
                    deposit(amount);
                    System.out.println("\n");
                    break;
            
            case 'C' :
                    System.out.println("--------------------------------------------");
                    System.out.println("Input an Amount to withdraw" );
                    System.out.println("--------------------------------------------");
                    
                    double amount2 = scanner.nextDouble();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

            case 'D' :
                    System.out.println("--------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("--------------------------------------------");
                    System.out.println("\n");
                    break;
            case 'E' :
                   System.out.println("===================================================================");
                   break;



            default :
                    System.out.println("Invalid option , Please input correct option !!!");
                    break;
            }
        }
        while(option != 'E');
             System.out.println("Thank for using My Services");

    }
     
}
