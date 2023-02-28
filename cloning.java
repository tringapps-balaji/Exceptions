import java.util.*;
class ass5 extends Exception{}
class cloning implements Cloneable {
    int x1, y1;

    cloning(int a, int b) {
        x1 = a;
        y1 = b;
    }

    public Object clone() throws CloneNotSupportedException

    {
        return super.clone();
    }

    boolean equals(int x, int y) {
        boolean result = ((x1 == x) && (y1 == y)) ? true : false;
        return result;
    }

}

class twod {
    public static void main(String args[]) throws CloneNotSupportedException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.printf(" Enter 1st Coordinates  \n");
            System.out.printf("\n Enter a value  : ");
            int x = sc.nextInt();
            System.out.printf(" Enter b value  : ");
            int y = sc.nextInt();

            cloning obj = new cloning(x, y);
            cloning obj1 = (cloning) obj.clone();

            System.out.printf("\n Enter 2nd Coordinates  \n");
            System.out.printf("\n Enter a value : ");
            int x1 = sc.nextInt();
            System.out.printf(" Enter b value : ");
            int y1 = sc.nextInt();
            if (x < 0 || y < 0 || x1 < 0 || y1 < 0)
                throw new ass5();
            else {
                boolean Sol = obj1.equals(x1, y1);
                System.out.printf(" Both are " + Sol);
            }
        }
        catch (ass5 e)
        {
            System.out.println("Negative Points are Not Accepted ... ");
        }
    }
}