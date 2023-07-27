class Meeshov1 
{
void app()
	{
	System.out.println("meesho app colour pink");
	}
}
class Meeshov2 
{

	void app()
	{
	System.out.println("meesho app colour pink & purple");
	super.app();
	}
}
class Meesho
{
public static void main(String[] args) 
	{
		Meeshov2 m2=new Meeshov2();
		       m2.app();
	}
}
