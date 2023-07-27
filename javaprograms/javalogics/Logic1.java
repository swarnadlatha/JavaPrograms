//sum of even number 30-50 without parameter & without return type with in the class(method)
class Logic1
{
	static void Even()
	{
	int sum=0;
	for(int i=30;i<=50;i++)
	    {
		   if(i%2==0)
		   {
			sum=sum+i;
		    }
		}
		System.out.println(sum);
	}
public static void main(String [] args)
    {
	Even();
    }
}
