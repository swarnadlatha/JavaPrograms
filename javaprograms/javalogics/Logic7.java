//Count of even number 30-50 without parameter & without return type with in the class(method)
class Logic7
{
	static void even()
	{
    int count=0;
	for(int i=30;i<=50;i++)
		{
		if(i%2==0)
			{
			count++;
			}
		}

	System.out.println("the count of even number" +count++);
	}

	public static void main(String[] args) 
	{
		even();
	}
}
