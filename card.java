import java.util.*;

class ass6 extends Exception{}
class card implements  Cloneable  {
    public static void main (String[]args) throws CloneNotSupportedException {
        card c1 = new card();
        if (c1.cardnumber().equals("true")) {
            System.out.println("same card number");
        }
         else {
             System.out.println("Different card number");
            }
         card c2 = (card)c1.clone();
         System.out.println("Card Holder Name : "+c2.holdername);
         System.out.println("Card number : "+c2.cardnumber);
         System.out.println("Card Expire Date : "+c2.expiredate);
        }
        String holdername,cardnumber,expiredate;
        String name = "karthick";
        String number = "12345678";
        String date = "10";

        public card(){
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Enter the card holder name : ");
                holdername = sc.next();
                System.out.println("Enter the card number : ");
                cardnumber = sc.next();
                System.out.println("Enter the card expire date : ");
                expiredate = sc.next();
                if (cardnumber.length() < 8)
                    throw new ass6();

            }
            catch (ass6 e)
            {
                System.out.println("Card Number Must Have 8 Digits ");
            }
        }
        String cardnumber(){
            if (cardnumber.equals(number)) {
                return "true";
            }
             else{
                 return "false";
            }
        }
        public Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }


}


