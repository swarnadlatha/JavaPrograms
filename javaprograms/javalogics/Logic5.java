//Multiplication of odd number 30-50 without parameter & without return type with in the class(method)
class Logic5
{
	static void odd()
	{
		int mul=1;
		for(int i=30;i<50;i++)
		{
			if(i%2==1)
			{
				mul=mul*i;
			}
		}
				System.out.println("the multiplication of odd number" +mul );
			
		}

public static void main(String[] args) 
	{
	odd();	
	}
}
