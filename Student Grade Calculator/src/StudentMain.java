import java.util.Scanner;
public class StudentMain {
	static Scanner sc=new Scanner(System.in);
	public static Student getStudentDetails()
	{
		int id,nos=0;
		String name;
		System.out.println("Enter the id:");
		id=sc.nextInt();
		System.out.println("Enter the name:");
		name=sc.next();
		while(nos<1)
		{
			System.out.println("Enter the no of subjects:");
			nos=sc.nextInt();
			if(nos>0)	
				break;
			else
				System.out.println("Invalid number of subject");
		}
		int[] marks = new int[nos];
		for(int i=1;i<=nos;i++)
		{	
			do {
				System.out.println("Enter mark for subject "+i+":");
				marks[i-1]=sc.nextInt();
				if((marks[i-1]>=0)&&(marks[i-1]<101))
					break;
				else
					System.out.println("Invalid Mark");
			}while((marks[i-1]<0)||(marks[i-1]>100));
		}
		Student obj=new Student();
		obj.setId(id);
		obj.setName(name);
		obj.setnos(nos);
		obj.setMarks(marks);
		return obj;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=getStudentDetails();
		stu.calculateAvg();
		stu.findGrade();
		System.out.println("Id:"+stu.getId());
		System.out.println("Name:"+stu.getName());
		System.out.printf("Average:%.2f",stu.getAverage());
		System.out.println("\nGrade:"+stu.getGrade());
				
	}

}
