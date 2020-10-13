import java.util.*;
class Saddlepoint
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the size of the matrix");
        int n=sc.nextInt();int a[][]=new int[n][n];int b[]=new int[n];int c=0;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                a[x][y]=sc.nextInt();
                if(x==y)
                {
                    b[c]=a[x][y];c++;
                }
            }}
        int pos=0;
        for(int x=0;x<n;x++)
        {
            int max=a[x][0];int min=a[x][0];
            for(int y=0;y<n;y++)
            {
                if(a[x][y]<min)
                    min=a[x][y];
                if(a[y][x]>max)
                    max=a[y][x];
            }
            if(max==min)
            {
                pos=-1;
                System.out.println("SADDLE POINT="+max);
                break;
            }
        }
        if(pos!=-1)
            System.out.println("NO SADDLE POINT");
        for(int x=0;x<b.length-1;x++)
        {
            for(int y=0;y<b.length-x-1;y++)
            {
                if(b[y]>b[y+1])
                {
                    int temp=b[y];
                    b[y]=b[y+1];
                    b[y+1]=temp;
                }
            }
        }
        System.out.println("MATRIX AFTER SORTING THE PRINCIPAL DIAGONAL");int c1=0;
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<n;y++)
            {
                if(x==y)
                {
                    System.out.print(b[c1]+"\t");c1++;
                }
                else
                    System.out.print(a[x][y]+"\t");
            }
            System.out.println();
        }
    }
}

     