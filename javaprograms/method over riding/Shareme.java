class Sharemev1 
{
	void share()
	{
   System.out.println("share via bluetooth only");
	}
}
class  Sharemev2 extends Sharemev1
{
	void share()
	{
    System.out.println("share via bluetooth & QR Code");
	}
}
	class Shareme
	{
 public static void main(String[] args) 
	{
	Sharemev2 s2=new Sharemev2();
	          s2.share();
	}
}
