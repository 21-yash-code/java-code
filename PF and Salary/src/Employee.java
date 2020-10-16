public class Employee {
    private String name;
    private float salary,netsalary;
    public Employee(){}
    public Employee(String a,float b)
    {
        setName(a);
        setSalary(b);
    }
    public void setName(String a){
        name=a;
    }
    public String getName()
    {
        return name;
    }
    public float getSalary(){
        return salary;
    }
    public void setSalary(float b)
    {
        salary=b;
    }
    public void setNetsalary(float c)
    {
        netsalary=c;
    }
    public float getNetsalary(){
        return netsalary;
    }
}