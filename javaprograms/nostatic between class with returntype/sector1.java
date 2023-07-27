class Area
{
void sector(int r) 
	{
double sectorarea=0.5*r*r;
System.out.println("the sector area is" +sectorarea);
}
}
class sector1
{
public static void main(String[] args)
{
Area a1=new Area();
a1.sector(75);
}
}