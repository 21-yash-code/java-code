public class Account
{
    private int accntNo;
    private String accntHolderName;
    private double accntBalance;
    
    public Account(){
    	
    }
    public void setAccntNo(int a)
    {
        accntNo=a;
    }
    public void setAccntHolderName(String a)
    {
        accntHolderName=a;
    }
    public void setAccntBalance(double a)
    {
        accntBalance=a;
    }
    public double getAccntBalance()
    {
        return accntBalance;
    }
    public int getAccntNo()
    {
        return accntNo;
    }
    public String getAccntHolderName()
    {
        return accntHolderName;
    }
}