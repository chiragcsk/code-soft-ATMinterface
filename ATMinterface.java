import java.util.Scanner;

class bankAccount{
        private double balance ;
        public bankAccount( double initialBalance){
            this.balance= initialBalance;
        }
        public double getBalance(){
            return balance;
        }
        public void deposit(double amount){
            if (amount>0){
                balance+=amount;
                System.out.println("success deposited");
            }else{
                System.out.println("invalid deposit amount");
            }
        }
        public void withdraw( double amount){
            if (amount>0&&amount<= balance){
                balance-=amount;
                System.out.println("successfully withdraw");
            }else{
                System.out.println("insufficient balance or invalid amount");
            }
        }
            }

            class ATM{
            private  bankAccount account;
            public ATM(bankAccount account){
                this.account=account;
            }
            public void showMenu(){
                Scanner scan=new Scanner(System.in);
                int choice;
                do {
                    System.out.println("     ATM Menu   ");
                    System.out.println("1. check Balance   ");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdrawn");
                    System.out.println("4. Exit");
                    System.out.println("Enter your choice");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("current Balance " + account.getBalance());
                            break;
                        case 2:
                            System.out.println("Enter Deposit Amount $ ");
                            double depositAmount = scan.nextDouble();
                            account.deposit(depositAmount);
                            break;
                        case 3:
                            System.out.println("Enter Withdrawal Amount $");
                            double withdrawAmount = scan.nextDouble();
                            account.withdraw(withdrawAmount);
                            break;
                        case 4:
                            System.out.println("thanks for visiting our ATM interface");
                            break;
                        default:
                            System.out.println("invalid choice. try again");
                    }
                }
                    while(choice != 4);
                    scan.close();
                }

                }

public class ATMinterface {
    public static void main(String[] args) {
        bankAccount userAccount= new bankAccount(5000);
        ATM atm = new ATM(userAccount);
        atm.showMenu();
    }
}
