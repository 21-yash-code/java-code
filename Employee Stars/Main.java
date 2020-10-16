import java.util.*;
public class Main{
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the employee id:");
    String empid=sc.nextLine();
    System.out.println("Enter the salary:");
    double sal=sc.nextDouble();
    System.out.println("Enter the no of certification complete:");
    int noc=sc.nextInt();
    String[] course=new String[noc];
    System.out.println("Enter the Certification names:");
    int i;
    for (i=0;i<noc;i++)
    {
        course[i]=sc.next();
    }
    sc.close();
    Employee obj=new Employee(empid,sal,course);
    obj.setnoc(noc);
    obj.findRating();
    System.out.println("Your rating is "+obj.getRating());
    double incr=obj.calculateIncrement();
    System.out.printf("Increment amount is "+"%.02f",incr);
    sal=obj.getSalary();
    System.out.printf("\nCurrent salary "+"%.02f",sal);
    }
    
}