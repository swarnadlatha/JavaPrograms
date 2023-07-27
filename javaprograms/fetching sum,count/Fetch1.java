class Fetch1 
{
	static void fetching()
	{
		int num=654367;
		while(num!=0)
		{
			int rem=num%100;
     System.out.println(rem);
	       num=num/100;
		}
	}
	public static void main(String[] args) 
	{
		fetching();
	}
}
