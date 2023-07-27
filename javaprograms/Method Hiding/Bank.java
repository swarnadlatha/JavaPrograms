class Bankv1 
{
void statement()
	{
	System.out.println("check statement in bank");
	}
}
class Bankv2 
{

	void statement()
	{
	System.out.println("check statement in online bank");
	super.statement();
	}
}
class Bank
{
public static void main(String[] args) 
	{
		Bankv2 b2=new Bankv2();
		       b2.statement();
	}
}
