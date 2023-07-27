class sector
{
	static void area()
	{
     int r=6;
	double sectorarea=0.5*r*r;
	System.out.println("the  sector area is:" +sectorarea);
	}
}
class staticmethodsector
    {

	public static void main(String[] args) 
	{
		 sector.area();
	}
}