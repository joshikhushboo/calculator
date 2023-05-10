import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        int c;
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("enter operation:");
        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
        c=sc.nextInt();
        switch(c){
            case 1:
            System.out.println( a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
            System.out.println(a/b);
            break;
            default:
            System.out.println("invalid");
    }
    sc.close();
    
}}
