class Jspiderv1 
{
void course()
	{
	System.out.println("course via full stack development");
	}
}
class Jspiderv2 
{

	void course()
	{
	System.out.println("course via full stack development & hybrid course");
	super.course();
	}
}
class Jspider1
{
public static void main(String[] args) 
	{
		Jspiderv2 j2=new Jspiderv2();
		          j2.course();
	}
}
