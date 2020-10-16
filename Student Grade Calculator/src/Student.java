
public class Student {
private int id;
private String name;
private int[] marks;
private float average;
private char grade;
private int nos;

	public Student()
	{
		
	}
	public void setnos(int nos)
	{
		this.nos=nos;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setMarks(int[] marks)
	{
		this.marks=marks;
	}
	public int[] getMarks()
	{
		return this.marks;
	}
	public void setAverage(float average)
	{
		this.average=average;
	}
	public float getAverage()
	{
		return this.average;
	}
	public void setGrade(char grade)
	{
		this.grade=grade;
	}
	public char getGrade()
	{
		return this.grade;
	}
	public void calculateAvg()
	{
		float sum=0;
		for(int i=0;i<nos;i++)
		{
			sum+=marks[i];
		}
		setAverage(sum/nos);
	}
	
	public void findGrade()
	{
		int c=0;
		for(int i=0;i<nos;i++)
		{
			if(marks[i]<50)
				c++;
		}
		if(c!=0)
			setGrade('F');
		else if(average>=80)
			setGrade('O');
		else
			setGrade('A');
		
	}
}