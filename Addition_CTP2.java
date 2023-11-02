package day2;

public class Addition_CTP2 {
	static int addition (int num1, int num2)
	{
		int a=num1+num2;
		return(a);
	}
	static int addition (int num1, int num2, int num3)
	{
		int b=num1+num2+num3;
		return(b);
	}
	public static void main(String[] args)
	{
		int a=addition(10,10);
		int b=addition(8,9,10);
		System.out.println("The sum of two integers is "+a);
		System.out.println("The sum of two integers is "+b);
	}

}
