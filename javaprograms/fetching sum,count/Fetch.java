class Fetch 
{
	static void fetching()
	{
		int num=1246;
		while(num!=0)
		{
			int rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}
	public static void main(String[] args) 
	{
		fetching();
	}
}