class Ksrtcv1 
{
	void ticket()
	{
   System.out.println("by giving paper ticket");
	}
}
class  Ksrtcv2 extends Ksrtcv1
{
	void ticket()
	{
    System.out.println("by giving printing ticket & paper ticket");
	}
}
	class Ksrtc
	{
 public static void main(String[] args) 
	{
	Ksrtcv2 k1=new Ksrtcv2();
	  k1.ticket();
	}
}
