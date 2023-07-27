class Jspiderv1 
{
void scan()
	{
	System.out.println("scan via card");
	}
}
class Jspiderv2 
{

	void scan()
	{
	System.out.println("scan via card & QR code");
	super.scan();
	}
}
class Jspider
{
public static void main(String[] args) 
	{
		Jspiderv2 j2=new Jspiderv2();
		          j2.scan();
	}
}
