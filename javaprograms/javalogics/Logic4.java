//Multiplication of even number 30-50 without parameter & without return type with in the class(method)
class Logic4 
{
	static void even()
	{
		int mul=1;
		for(int i=30;i<=50;i++)
		{
			if(i%2==0)
			{
				mul=mul+i;
			}
		}
		
		System.out.println("the multiplication of even number" +mul);
	}

public static void main(String[] args) 
	{
		even();
	}
}
