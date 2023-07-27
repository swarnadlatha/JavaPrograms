class parallogram
{
  static void area(int h,int b)
	{
		int  parallogramarea=h*b;
         System.out.println("the parallogram area is" +parallogramarea);
	}
}
class  parallogramwithparameter
{
  public static void main(String[] args) 
	{
		 parallogram.area(8,9);
	}
}
