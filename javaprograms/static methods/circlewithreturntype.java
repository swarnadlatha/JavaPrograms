class circle
{
	static double area()
	{
		double pi=3.142;
	    int r=4;
		double circle=pi*r*r;
		return circle;
	}
}
class  circlewithreturntype
{
 public static void main(String[] args) 
	{
		double  circlearea= circle.area();
		System.out.println("the  circle area is" +circlearea);
	}
}