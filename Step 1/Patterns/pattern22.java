package Patterns;

public class pattern22 
{
    public static void main(String[] args) {
        int rows=7;
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=rows;j++)
            {
                if(i==1||i==rows||j==1||j==rows)
                    System.out.print("4");
                else if(i==2||i==rows-1||j==2||j==rows-1)
                    System.out.print("3");
                else if(i==3||i==rows-2||j==3||j==rows-2)
                    System.out.print("2");
                else 
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
