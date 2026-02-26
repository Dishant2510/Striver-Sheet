package Patterns;

public class pattern16 {
    public static void main(String[] args) {
        int c=65;
        for(int i=1;i<=5;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                char x=(char)c;
                System.out.print(x);
                
            }
            System.out.println();
            c=c+1;
        }
    }
    
}
