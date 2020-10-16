public class Ticket
{
    private int ticketid;
    private int price;
    private static int availableTickets;

    public Ticket()
    {
    	
    }

    public static void setAvailableTickets(int at)
    {
        if(at>0)
        availableTickets=at;
        else
        System.exit(1);
    }
    public void setTicketid(int ticketid)
    {
        this.ticketid=ticketid;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int calculateTicketCost(int nooftickets)
    {
        if(availableTickets>nooftickets)
        {
            setAvailableTickets((availableTickets- nooftickets));
            return(price*nooftickets);
        }
        else
        return -1;
    }
    public static int getAvailableTickets()
    {
        return(availableTickets);
    }
    public int getPrice()
    {
        return(this.price);
    }
    public int getTicketid()
    {
        return(this.ticketid);
    }
}