//Fitting curve for Straight Line
import java.util.Scanner;   
class StraightLine
{
    public static void main(String[] args)
    {
        double sumy=0,sumxy=0,sumx2=0,sumx=0;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of points");
        int n = sc.nextInt();s
        double x[] = new double[n];
        double y[] = new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value of x"+(i+1));
            x[i] = sc.nextDouble();
            sumx += x[i];
        }        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value of y"+(i+1));
            y[i] = sc.nextDouble();
            sumy += y[i];
        }
        double xy[] = new double[n];
        double x2[] = new double[n];  
        System.out.println("X\tY\tXY\tX2"); 
        for(int i=0;i<n;i++)
        {
            xy[i] = x[i]*y[i];
            x2[i] = x[i]*x[i];
            System.out.println(x[i]+"\t"+y[i]+"\t"+xy[i]+"\t"+x2[i]); 
            sumxy += xy[i];
            sumx2 += x2[i];
        }
        System.out.println("The value of sum of x = "+sumx);
        System.out.println("The value of sum of y = "+sumy);
        System.out.println("The value of sum of xy = "+sumxy);
        System.out.println("The value of sum of x2 = "+sumx2);
        double a = (n*sumxy-sumx*sumy)/(n*sumx2-sumx*sumx);
        double b = (sumy-a*sumx)/n;
        System.out.println("The value of a = "+a);
        System.out.println("The value of b = "+b);
        System.out.println("The equation of the line is y = "+a+"x + "+b);
        sc.close();
    }
}