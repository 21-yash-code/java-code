import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the AccountNumber: ");
        int a=Integer.parseInt(sc.next());
        System.out.print("Enter the Account Holder Name: ");
        String b=sc.next();
        
        System.out.print("Enter the Account Balance: ");
        double c=sc.nextDouble();
        
        System.out.print("Enter the Minimum Balance: ");
        float d=sc.nextFloat();
        sc.close();
        SavingsAccount acobj=new SavingsAccount();
        acobj.setAccntNo(a);
        acobj.setAccntHolderName(b);
        acobj.setAccntBalance(c);
        acobj.setMinBalance(d);
        System.out.println(acobj);
    }
}