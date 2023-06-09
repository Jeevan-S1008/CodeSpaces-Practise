import java.util.Scanner;   
class main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of points");
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value of x"+(i+1));
            x[i] = sc.nextInt();
            System.out.println("Enter the value of y"+(i+1));
            y[i] = sc.nextInt();
        }        
        int xy[] = new int[n];
        int x2[] = new int[n];   
        for(int i=0;i<n;i++)
        {
            xy[i] = x[i]*y[i];
            System.out.println("The value of "xy[i]);
            x2[i] = x[i]*x[i];
            System.out.println(x2[i]); 
        }
    }
}