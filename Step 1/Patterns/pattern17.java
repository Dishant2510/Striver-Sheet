package Patterns;

public class pattern17 {
    public static void main(String[] args) {
        int rows=4;
        for(int i=0;i<=rows;i++)
        {
            for(int j=1;j<=rows-i;j++)
            {
                System.out.print(" ");
            }
            int c=64;
            for(int j=1;j<=i;j++)
            {
                c++;
                char x=(char)c;
                System.out.print(x);
            }
            c--;
            for(;c>=65;c--)
            {
                
                char x=(char)c;
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
