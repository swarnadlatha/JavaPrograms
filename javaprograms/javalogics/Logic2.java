//sum of odd number 30-50 without parameter & without return type with in the class(method)
class Logic2
{
	static void Odd()
	{
		int sum=0;
		for(int i=30;i<=50;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
System.out.println("the sum of odd number:" +sum);
	}
public static void main(String[] args) 
	{
		Odd();
	}
}
