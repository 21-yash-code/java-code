public class PermanentEmployee extends Employee{
    private float pfpercentage,pfamount;
    public PermanentEmployee(){}
    public PermanentEmployee(String a,float b,float c)
    {
        super(a,b);
        setPfpercentage(c);
        //setPfamount(e);
    }
    public void setPfpercentage(float d)
    {
        pfpercentage=d;
    }
    public float getPfpercentage(){
        return pfpercentage;
    }
    public void setPfamount(float e)
    {
        pfamount=e;
    }
    public float getPfamount(){
        return pfamount;
    }
    public void findNetSalary(){
        float a=pfpercentage*getSalary()/100;
        setPfamount(a);
        float s=getSalary()-a;
        setNetsalary(s);
    }
    public boolean validateInput()
    {
        if(getSalary()>0&&pfpercentage>=0)
            return true;
        else
            return false;
    }
}