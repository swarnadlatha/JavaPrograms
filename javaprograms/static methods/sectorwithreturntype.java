class sector 
{
	static double area()
	{
		int r=7;
		double sector=0.5*r*r;
		return sector;
	}
}
	class sectorwithreturntype
	{
	public static void main(String[] args) 
	{
		double sectorarea=sector.area();
		System.out.println("the sector area is" +sectorarea);
	}
}
