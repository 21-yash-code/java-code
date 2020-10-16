import java.util.*;
public class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] words=input.split(" ");
        int n=words.length;
        int i,j,f;
        int max_f=0,max_i=0;
        int[] frequency=new int[n];
        for(i=0;i<n;i++)
        {
            f=0;
            String a=words[i];
            for(j=i+1;j<n;j++)
            {
                String b=words[j];
                if(a.equals(b))
                f++;
                
            }
            frequency[i]=f;
            if(max_f<f)
            {
                max_f=f;
                max_i=i;
            }
        }
//        System.out.println("maximum frequency is "+max_f+" of word "+(words[max_i]));
        if (max_f!=0)
        {
            for(i=0;i<n;i++)
            {
                f=frequency[i];
                if(f==max_f)
                System.out.println(words[i]);
            }
        }
        else if (max_f==0)
        System.out.println("No repetition of words");
    }
}