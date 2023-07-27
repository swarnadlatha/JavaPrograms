//Count of odd number 30-50 without parameter & without return type with in the class(method)
class Logic8
{
	static void odd()
	{
    int count=0;
	for(int i=30;i<=50;i++)
		{
		if(i%2==1)
			{
			count++;
			}
		}

	System.out.println("the count of odd number" +count++);
	}

	public static void main(String[] args) 
	{
		odd();
	}
}
