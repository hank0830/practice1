import java.util.Scanner;
public class fuck{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //print triangle
        for(int i = 1 ; i <= n ; i++){
            printNChar(i,'*');
            printNChar(i,'+');
            printNChar(i,'-');

            System.out.println();
        }
    }
    public static void printNChar(int n, char c){
        for(int i = 1 ;i <= n ;i++){
            System.out.print(c);
        }
    }
}