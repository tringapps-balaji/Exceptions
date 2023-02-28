
import java.util.*;

class excep extends Exception{}

class bank_one{
    int number,bal=0,deposit,withdrawel;
    String name;
    Scanner sc = new Scanner (System.in);

    public bank_one(int no, String name) {
        this.number =no ;
        this.name = name;
    }



    void deposit(){

        System.out.println("Enter the deposit : ");
        deposit = sc.nextInt();
        bal=bal+deposit;
    }
    void withdrawel(){
        try{
            System.out.println("Enter the withdrawel : ");
            withdrawel = sc.nextInt();
            if(withdrawel>bal)throw new excep();
            else
            bal -= withdrawel;
        }
        catch(excep e ){
            System.out.println("You cannot take amount");
        }
    }
    void balance (){
        System.out.println("Current balance: "+bal);
    }


}


public class Bank
{
    public static void main(String[] args) {
        int num;
        int ch=0;
        Scanner bn= new Scanner(System.in);
        System.out.print("Enter the account number : ");
        num = bn.nextInt();
        System.out.print("Enter the name : ");
        String name =bn.next();
        bank_one obj = new bank_one(num,name);

        while (ch<4){
            System.out.println("1.Deposit / 2. Withdrawel / 3. current balance / 4.exit");
            System.out.println("Enter the choice : ");
            ch = bn.nextInt();

            switch (ch){
                case 1:
                    obj.deposit();
                    break;

                case 2:
                    obj.withdrawel();
                    break;

                case 3:
                    obj.balance();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");


            }
        }

    }
}


