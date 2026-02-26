package Patterns;

public class pattern15 {
    public static void main(String[] args) {
        int c=65;
        for(int i=1;i<=5;i++)
        {
            c=65;
            for(int j=5;j>=i;j--)
            {
                char x=(char)c;
                System.out.print(x);
                c=c+1;
            }
            System.out.println();
        }
    }
    
}
