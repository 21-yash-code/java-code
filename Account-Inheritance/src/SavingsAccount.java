public class SavingsAccount extends Account{
    private float minBalance;
    
    public SavingsAccount(){
    	
    }
    public void setMinBalance(float a)
    {
        minBalance=a;
    }
    public float getMinBalance()
    {
        return minBalance;
    }
    public String toString()
    {
        return String.format("AccountNo:"+getAccntNo()+"-AccountHolderName:"+getAccntHolderName()+"-AccountBalance:"+getAccntBalance()+"-MinimumBalance:" + minBalance);
    }
}