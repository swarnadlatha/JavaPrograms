class Phonepev1
{
 void pay() 
    {
System.out.println("pay via number");
    }
}
class Phonepev2
{
void pay()
	{
  System.out.println("pay via number ,contact & QR code");
   super.pay();
	}
}
class Phonepe
{
public static void main(String[] args) 
	{
		Phonepev2 p1=new Phonepev2();
		          p1.pay();
	}
}

