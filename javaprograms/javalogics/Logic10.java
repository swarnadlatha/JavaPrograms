class Logic10 
{
	static void fizzbuzz()
	{
		int no=21;
		if((no%3==0)&&(no%7==0))
		{
			System.out.println("fizz buzz");
		}
		else if(no%3==0)
		{
			System.out.println("fizz fizz");
		}
		else if(no%7==0)
		{
			System.out.println("buzz buzz");
		}
		else
				{
				System.out.println("invalid number");
				}
	}

public static void main(String[] args) 
	{
		fizzbuzz();
	}
}
