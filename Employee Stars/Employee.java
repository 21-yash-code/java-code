public class Employee{
    
    private String employeeId;
    private double salary;
    private String[] certification;
    private int rating;
    private int noc;
    private double incr;
    
    public Employee(String employeeId, double salary, String[] certification)
    {
        this.employeeId=employeeId;
        this.salary=salary;
        this.certification=certification;
        this.rating=0;
    }
    public double calculateIncrement()
    {
        if(this.rating==1)
        this.incr=2;
        else if(this.rating==2)
        this.incr=3.5;
        else if (this.rating==3)
        this.incr=5;
        else if (this.rating==4)
        this.incr=7.5;
        else if (this.rating==5)
        this.incr=10;
        else
        this.incr=0;
        this.incr=(this.salary*this.incr/100);
        this.salary+=this.incr;
        return(this.incr);
    }
    public void findRating()
    {
        String a="";
        
        for(int i=0;i<this.noc;i++)
        {
            a=this.certification[i];
            a=a.toUpperCase();
            if ((a.equals("JAVA"))||(a.equals("ORACLE"))||(a.equals("GCUX"))||(a.equals("CCNA"))||(a.equals("AWS")))
            this.rating++;
        }
        
    }
    public double getSalary()
    {
        return(this.salary);
    }
    public int getRating()
    {
        return(this.rating);
    }
    public void setnoc(int noc)
    {
        this.noc=noc;
    }
    
}