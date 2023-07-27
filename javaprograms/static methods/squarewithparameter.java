class square 
{
  static void area(int a)
	{
		int squarearea=a*a;
         System.out.println("the square area is" +squarearea);
	}
}
class squarewithparameter
{
  public static void main(String[] args) 
	{
		square.area(7);
	}
}
