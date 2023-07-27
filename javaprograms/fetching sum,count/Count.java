class Count 
{
	static void counting()
	{
		int count=0;
		int num=123456;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count++);
	}

	public static void main(String[] args) 
	{
		counting();
	}
}
