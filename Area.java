//Write a java program to calculate the area of a rectangle, a triangle or a circle based on user choice
import java.util.Scanner;
class area
{
    public static void main(String[] args) 
    {
        int choice;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:\n1.Rectangle\n2.Triangle\n3.Circle");
        choice = sc.nextInt();
        switch(choice)
        {
            case 1:
                int l,b;
                System.out.println("Enter length and breadth of rectangle:");
                l = sc.nextInt();
                b = sc.nextInt();
                area = l*b;
                System.out.println("Area of rectangle is "+area);
                break;
            case 2:
                int h,b;
                System.out.println("Enter height and base of triangle:");
                h = sc.nextInt();
                b = sc.nextInt();
                area = 0.5*h*b;
                System.out.println("Area of triangle is "+area);
                break;
            case 3:
                int r;
                System.out.println("Enter radius of circle:");
                r = sc.nextInt();
                area = 3.14*r*r;
                System.out.println("Area of circle is "+area);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}