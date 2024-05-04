//program to find shortest path from source to all other vertices in a weighed graph using Dijkstra's algorithm
import java.util.*;

public class Dijkstra{
    int d[]=new int[10];
    int p[]=new int[10];
    int visited[]=new int[10];

public void Dij(int[][]a,int s,int n)
{
    int u=-1,v,j;
    for(v=0;v<n;v++)
    {
        d[v]=99;
        p[v]= -1;
    }
    d[s]=0;
    for(i=0;i<n;i++)
    {
        int min=99;
        for(j=0;j<n;j++)
        {
            if(d[j]<min && visited[j]==0)
            {
                min=d[j];
                u=j;
            }
        }
        visited[u]=1;
        for(v=0;v<n;v++)
        {
            if((d[u]+a[u][v]<d[v]) && visited[v]==0)
            {
                d[v]=d[u]+a[u][v];
                p[v]=u;
            }
        }   
    }
}
void path(int v ,int s)
{
    if(p[v]!=-1)
    {
        path(p[v],s);
        System.out.println("->"+v);
    }
    else if(v==s)
    {
        System.out.println(v);
    }
    else
    {
        System.out.println("No path from"+s+"to"+v);
    }
}
void Display(int n,int s)
{
    int i;
    for(i=0;i<n;i++)
    {
        if(i!=s)
        {
            System.out.println("Distance of "+i+" from source "+s+" is "+d[i]);
            path(i,s);
        }
    }
}
public static void main(String[] args)
{
    int a[][]=new int[10][10];
    int n,s,i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of vertices");
    n=sc.nextInt();
    System.out.println("Enter the weighted matrix");
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter the source vertex");
    s=sc.nextInt();
    Dijkstra obj=new Dijkstra();
    obj.Dij(a,s,n);
    obj.Display(n,s);
    sc.close();
}
}
