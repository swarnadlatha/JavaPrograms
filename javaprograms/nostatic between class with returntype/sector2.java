class Area
{
double sector()
{
int r=65;
double sector=0.5*r*r;
return sector ;
}
}
class sector2
{
public static void main(String[] args)
{
Area a1=new Area();
double	sectorarea=a1.sector();
System.out.println("the sector area is" +sectorarea);
}
}