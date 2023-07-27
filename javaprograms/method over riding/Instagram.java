class Instagramv1 
{
	void post()
	{
    System.out.println("post stories");
	}
}
class Instagramv2 extends Instagramv1 
{
	void post()
	{
    System.out.println("post stories & Reels");
	}
}
class Instagram
{
public static void main(String[] args) 
	{
	Instagramv2 i1=new Instagramv2();
	            i1.post();
	}
}
