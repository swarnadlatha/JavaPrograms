class sector 
{
	static void area(int r)
	{
		double sectorarea=0.5*r*r;
        System.out.println("the sector area is" +sectorarea);
	}
}
class sectorwithparameter
{
    public static void main(String[] args) 
	{
		sector.area(3);
	}
}
