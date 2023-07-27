class trapezoid
{
  static void area(int h,int a,int b)
	{
		double  trapezoidarea=0.5*h*b*a;
         System.out.println("the trapezoid area is" +trapezoidarea);
	}
}
class  trapezoidwithparameter
{
  public static void main(String[] args) 
	{
		 trapezoid.area(8,9,4);
	}
}
