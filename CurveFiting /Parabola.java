//Write a java program for fitting curve for second degree parabola
import java.util.Scanner;  
import java.lang.ArrayIndexOutOfBoundsException;

public class Parabola 
{
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);    
    int n;
    double sumx=0,sumy=0,sumxy=0,sumx2=0,sumx3=0,sumx4=0,sumx2y=0;  
    System.out.println("Enter the number of points");
    n = sc.nextInt();
   double y[] = new double[n];
    double xy[] = new double[n];
    double x2y[] = new double[n];
    double x[] = new double[n];
    double x2[] = new double[n];
    double x3[] = new double[n];
    double x4[] = new double[n];
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
    for(int i=0;i<n;i++)
    {
        xy[i] = x[i]*y[i];
        x2y[i] = x[i]*x[i]*y[i];
        x2[i] = x[i]*x[i];
        x3[i] = x[i]*x[i]*x[i];
        x4[i] = x[i]*x[i]*x[i]*x[i];
        sumxy += xy[i];
        sumx2y += x2y[i];
        sumx2 += x2[i];
        sumx3 += x3[i];
        sumx4 += x4[i];
    }
    System.out.println("X\tY\tXY\tX2\tX3\tX4\tX2Y");
    for(int i=0;i<n;i++)
    {
        System.out.println(x[i]+"\t"+y[i]+"\t"+xy[i]+"\t"+x2[i]+"\t"+x3[i]+"\t"+x4[i]+"\t"+x2y[i]);
    }
    System.out.println("The value of sum of x = "+sumx);
    System.out.println("The value of sum of y = "+sumy);
    System.out.println("The value of sum of xy = "+sumxy);
    System.out.println("The value of sum of x2 = "+sumx2);
    System.out.println("The value of sum of x3 = "+sumx3);
    System.out.println("The value of sum of x4 = "+sumx4);
    System.out.println("The value of sum of x2y = "+sumx2y);
    double A[][] = {{n,sumx,sumx2},{sumx,sumx2,sumx3},{sumx2,sumx3,sumx4}};
    double B[][] = {{sumy},{sumxy},{sumx2y}};
    double D = determinant(A);
    double D2[][] = {{n,sumx,sumx2},{sumxy,sumx2,sumx3},{sumx2y,sumx3,sumx4}};
    double D3[][] = {{n,sumy,sumx2},{sumx,sumxy,sumx3},{sumx2,sumx2y,sumx4}};
    double D4[][] = {{n,sumx,sumy},{sumxy,sumx2,sumx2y},{sumx2,sumx3,sumx4}};
    double a1 = determinant(D2)/D;
    double b1 = determinant(D3)/D;
    double c1 = determinant(D4)/D;
    System.out.println("The value of a = "+a1);
    System.out.println("The value of b = "+b1);
    System.out.println("The value of c = "+c1);
    System.out.println("The equation of the parabola is y = "+a1+"x^2 + "+b1+"x + "+c1);
    sc.close();
    }
    public static double determinant(double A[][])
    {
        double det = 0;
        det = A[0][0]*((A[1][1]*A[2][2])-(A[1][2]*A[2][1]))-A[0][1]*((A[1][0]*A[2][2])-(A[1][2]*A[2][0]))+A[0][2]*((A[1][0]*A[2][1])-(A[1][1]*A[2][0]));
        return det;
    }
}
