import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String a=sc.next();
        System.out.println("Enter the salary:");
        float b=sc.nextFloat();
        System.out.println("Enter the pfpercentage:");
        float c=sc.nextFloat();
        sc.close();
        PermanentEmployee obj=new PermanentEmployee(a,b,c);
        boolean valid=obj.validateInput();
        if(valid)
        {
            obj.findNetSalary();
            System.out.println("Employee Name:"+obj.getName());
            System.out.printf("PF Amount:%.2f",obj.getPfamount());
            System.out.printf("\nNetsalary:%.2f",obj.getNetsalary());
        }
        else
        System.out.println("Error!!! Unable to calculate the NetSalary.");
    }
}