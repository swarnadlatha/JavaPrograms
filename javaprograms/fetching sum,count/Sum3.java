class Sum3 
{
	static void suming()
	{
		int sum=0;
		int num=32432543;
		while(num!=0)
		{
			int rem=num%10;
			if(rem==3)
			{
				sum=sum+rem;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
	  suming();	
	}
}
