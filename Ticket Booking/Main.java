import java.util.Scanner;
public class Main 
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfBookings,availableTickets,ticketid,price,noOfTickets,i,j=0;
        System.out.println("Enter no of bookings:");
        noOfBookings=sc.nextInt();
        System.out.println("Enter the available tickets:");
        availableTickets=sc.nextInt();
        while(j<noOfBookings)
        {
            Ticket obj=new Ticket();
            obj.setAvailableTickets(availableTickets);
            System.out.println("Enter the ticketid:");
            ticketid=sc.nextInt();
            System.out.println("Enter the price:");
            price=sc.nextInt();
            System.out.println("Enter the no of tickets:");
            noOfTickets=sc.nextInt();
        
            obj.setTicketid(ticketid);
            obj.setPrice(price);
        
            j++;
            i=obj.calculateTicketCost(noOfTickets);
            if(i!=-1)
            {
                System.out.println("Available tickets: "+availableTickets);
                System.out.println("Total amount:"+i);
                availableTickets=obj.getAvailableTickets();
                System.out.println("Available ticket after booking:"+availableTickets);
            }
            else
            {
                System.out.println("Tickets not sufficient / available");
                break;    
            }
            
        }
    }
}