//Fitting curve for Straight Line
import java.util.Scanner;   
class main
{
    public static void main(String[] args)
    {
     float sumy=0,sumxy=0,sumx2=0,sumx=0;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of points");
        int n = sc.nextInt();
        float x[] = new float[n];
        float y[] = new float[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value of x"+(i+1));
            x[i] = sc.nextInt();
            sumx =+ x[i];
            System.out.println("Enter the value of y"+(i+1));
            y[i] = sc.nextInt();
            sumy =+ y[i];
        }        
        float xy[] = new float[n];
        float x2[] = new float[n];   
        for(int i=0;i<n;i++)
        {
            xy[i] = x[i]*y[i];
            System.out.println("The value of xy"+(i+1)+" = "+xy[i]);
            sumxy =+ xy[i];
            x2[i] = x[i]*x[i];
            System.out.println("The value of x square"+(i+1)+" = "+x2[i]); 
            sumx2 =+ x2[i];
        }
        System.out.println("The value of sum of x = "+sumx);
        System.out.println("The value of sum of y = "+sumy);
        System.out.println("The value of sum of xy = "+sumxy);
        System.out.println("The value of sum of x2 = "+sumx2);
        float a = (n*sumxy-sumx*sumy)/(n*sumx2-sumx*sumx);
        float b = (sumy-a*sumx)/n;
        System.out.println("The value of a = "+a);
        System.out.println("The value of b = "+b);
        System.out.println("The equation of the curve is y = "+a+"x + "+b);
        sc.close();
    }
}