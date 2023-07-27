class Phonepev1 
{
	void pay()
	{
    System.out.println("pay via number");
	}
}
class  Phonepev2 extends Phonepev1
{
	void pay()
	{
    System.out.println("pay via number,contact & QR code");
	}
}
class Phonepe
{
public static void main(String[] args) 
	 {
		Phonepev2 p2=new Phonepev2();
		   p2.pay();
	}
}
