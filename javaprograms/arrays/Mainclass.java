class Grandfather
{
	int farmhouse=100;

}


class Father extends Grandfather
{
	//farmhouse
	int site=30;
}

class Son extends Father
{ //farmhouse
	//site
	int cycle=1;
}

class Mainclass
{
	public static void main(String[] args) 
	{
		Son s1 = new Son();
		System.out.println(s1.cycle);
		System.out.println(s1.site);
		System.out.println(s1.farmhouse);

	}
}