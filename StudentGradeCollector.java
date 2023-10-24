package task2.com;

import java.util.Scanner;

public class StudentGradeCollector {
    static Scanner v=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of subjects");
        int num[]=new int[v.nextInt()];
        System.out.println("To Obtain The Marks Out Of ?");
        int outOf=v.nextInt();
        System.out.println("Enter The Marks Of Each and Every Subject");
        for (int i = 0; i < num.length; i++) {
			num[i]=v.nextInt();			
		}
       int sumOfSub=sum(num);
       System.out.println("total marks  "+sumOfSub);
      int averageFound= average(sumOfSub,num.length);
      System.out.println("average percentage  "+averageFound);
    String grade=  gradeFinder(averageFound);
      System.out.println("the corresponding grade "+grade);
	}
	public static int sum(int num[])
	{
		int sum=0;
		
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	public static int average(int sumOfSub,int num)
	{
		int average=sumOfSub/num;
		return average;
	}
	public static String gradeFinder(int averageFound)
	{
		String Grade="";
		if(averageFound>90)
		{
			Grade="A+";
		}
		else if(averageFound>80)
		{
			Grade="A";
		}
		else if(averageFound>70)
		{
			Grade="B";
		}
		else if(averageFound>60)
		{
			Grade="C";
		}
		else if(averageFound>50)
		{
			Grade="D";
		}
		else if(averageFound<50)
		{
			Grade="F";
		}
		return Grade;
	}
}
