class Methodwithargumentarea1 
{
	 static void trapezoid(double a,double b,int h)
	{
         double trapezoidarea=0.5*a+b*h;
		System.out.println("the trapezoid area is:" +trapezoidarea);
		return;
	}
	 static void circle(double pi,int r)
	{
         double circlearea=pi*r*r;
		System.out.println("the circle area is:" +circlearea);
		return;
	}

 static void ellipse(double pi,int a,int b)
	{
         double  ellipsearea=pi*a*b;
		System.out.println("the  ellipse area is:" + ellipsearea);
		return;
	}

 static void sector(double r,int s)
	{
         double sectorarea=0.5*r*r*s;
		System.out.println("the sector area is:" +sectorarea);
		return;
	}
	public static void main(String[] args)
	{
		trapezoid(0.6,0.2,6);
		circle(3.142,4);
		ellipse(3.142,2,3);
		sector(0.7,7);
	}
}



