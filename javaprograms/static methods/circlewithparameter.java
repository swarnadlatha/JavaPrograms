class circle
{
  static void area(double pi,int r)
	{
		double  circlearea=pi*r*r;
         System.out.println("the circle area is" +circlearea);
	}
}
class   circlewithparameter
{
  public static void main(String[] args) 
	{
		  circle.area(3.142,9);
	}
}