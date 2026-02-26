package Patterns;

public class pattern18 
{
    public static void main(String[] args) 
    {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = (char) ('E' - i);

            for (char c = ch; c <= 'E'; c++) {
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}