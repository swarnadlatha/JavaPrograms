class Area1 
{
	 static void trapezoid()
	     {
		 double a=4.5;
		 double b=3.5;
		 int h=10;
		double trapezoidarea=a+b*h;
		System.out.println("the trapezoid area is:" +trapezoidarea);
		return;
	     }
	static void circle()
	     {
		final double pi=3.14;
		      int    r=10;
		double circlearea=pi*r*r;
		 System.out.println("the circle area is:" +circlearea);
		 return;
          }
	 static void ellipse()
	      {
		 final double pi=3.142;
		 int a=5;
		 int b=6;
		double ellipsearea=pi*a*b;
		 System.out.println("the ellipse area is:" +ellipsearea);
		 return;
	       }
		 static void sector()
	       {
			 double r=3.5;
			 int s=25;
			double sectorarea=r*r*s;
			 System.out.println("the sector area is:" +sectorarea);
			 return;
	       }
			 public static void main(String[] args)
	       {
		 System.out.println("-----main start-------");
			          trapezoid();
					  circle();
					  ellipse();
					  sector();
		System.out.println("------main end-----");
	       }
}





