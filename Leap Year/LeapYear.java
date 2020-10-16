import java.util.Scanner;
class LeapYear
{
    public static void main(String args[])
    {
        int i;
        boolean leap=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        i=sc.nextInt();
        if ((i>999)&&(i<10000))
        {
            if (i%4==0)
        {
            if (i%100==0)
            {
                if(i%400==0)
                leap=true;
                else
                leap=false;
            }
            else
            leap=true;
        }
        else 
        leap=false;
        
        if (leap)
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
        }
        else
        System.out.println("Invalid Year");
            
        }
}