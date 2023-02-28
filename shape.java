import java.util.Scanner;

class ass2 extends Exception{}
class cal {
                            //triangle
    int l,w,b,h,r,hyp,br;
    String sname;
    cal (String s,int base, int height, int hypotenous){
        sname = s;
        b = base;
        h = height;
        hyp = hypotenous;
        System.out.println("Triangle is created ");
    }
    cal (String s,int radius){
        sname = s;
        r = radius;
        System.out.println("circle is created");
    }
    cal (String s,int length,int breath) {
        sname = s;
        l = length;
        b = breath;
        System.out.println("Rectangle is created");
    }
    void area(int b, int h) {
        double  area = 0.5 * b * h;
        System.out.println(" Area of the triangle is : "+area);
    }
    void perimeter (int a,int b,int c){
        int perimeter = a+b+c;
        System.out.println(" perimeter of the triangle is : "+perimeter);
    }

    // circle

    void area (double radius ){
        double area = 3.14*radius*radius;
        System.out.println(" Area of the  circle is : "+area);
    }
    void perimeter(double radius){
        double perimeter = 2*3.14*radius;
        System.out.println(" perimeter of the circle is : "+perimeter);
    }

        //rectangle

    void area (double  breath,double height){
        double area =  breath * height;
        System.out.println(" Area of the rectangle is : "+area);
    }
    void perimeter (int breath, int height ){
        int perimeter = 2*(breath+height);
        System.out.println(" perimeter of the rectangle is : "+perimeter);
    }

}


public class shape {
    public static void main(String[]args){
        int choice;
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1.Triangle  2.Circle 3. Rectangle  4. Exit");

            System.out.println("Enter the choice : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:   //triangle
try {
    System.out.println("Enter the base : ");
    int base = sc.nextInt();
    System.out.println("Enter the height : ");
    int width = sc.nextInt();
    System.out.println("Enter the hypoteneous value: ");
    int hypotenous = sc.nextInt();
    if(base<0 || width<0 || hypotenous<0)
        throw new ass2();
    else {
        cal t = new cal("triangle", base, width, hypotenous);
        t.area(base, width);
        t.perimeter(base, width, hypotenous);
    }
}
catch(ass2 e ){
    System.out.println("Not allowed negative values ");
}
                    break;

                case 2:     //circle
try {
    System.out.println("Enter the radius : ");
    int radius = sc.nextInt();
    if (radius < 0)
        throw new ass2();
    else {
        cal c = new cal("circle", radius);
        c.area(radius);
        c.perimeter(radius);
    }
}
catch(ass2 e ){
    System.out.println("Not allowed negative values ");
}
                    break;

                case 3:  //rectangle
                    try {
                        System.out.println("Enter the breath value : ");
                        int breath = sc.nextInt();
                        System.out.println("Enter the height value : ");
                        int height = sc.nextInt();
                        if (breath < 0 || height < 0)
                            throw new ass2();
                        else {
                            cal r = new cal("rectangle", breath, height);
                            r.area(breath, height);
                            r.perimeter(breath, height);
                        }
                    }
                    catch(ass2 e ){
                        System.out.println("Not allowed negative values ");
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default :
                    System.out.println("Invalid choice : ");


            }
        }
    }
}
