
import java.util.Scanner;

class ass3 extends Exception{}
public class Main {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the student name:");
        String name=sc.next();
        System.out.println("enter the student grade:");
        String grade=sc.next();
        gpa obj=new gpa(name);
        obj.gpa_Calculate(grade);

        System.out.println(obj.disp_gpa());
        obj.update_gpa();
    }
}

class gpa{
    String name;

int count=0;
    int temp,gpa=0;
    public gpa(String name) {
        this.name = name;
    }


    public void gpa_Calculate(String grade){


        switch (grade) {
            case "A":
                temp = 1;
                gpa += temp;
                break;

            case "B":
                temp = 2;
                gpa+= temp;
                break;

            case "C":
                temp = 3;
                gpa+= temp;
                break;


            case "D":
                temp = 4;
                gpa+= temp;
                break;


            default:

                System.out.println("Invalid choice");

        }



    }
    public String disp_gpa()
    {
        return name+" has "+gpa+" gpa ";
    }
    public void  update_gpa()
    {
        Scanner  sc= new Scanner(System.in);
        try {
            System.out.println("do you need to update gpa(yes/no)");
            String des = sc.next();
            if (des.equals("yes")) {
                gpa = 0;
                System.out.println("enter the student grade:");
                String grade = sc.next();
                count++;
                if (count > 3)
                    throw new ass3();
                else {
                    gpa_Calculate(grade);
                    System.out.println(disp_gpa());
                }

            } else {
                System.exit(0);
            }
            update_gpa();
        }
        catch (ass3 e){
            System.out.println("cannot modify gpa more than 3 times");
        }
    }

}



