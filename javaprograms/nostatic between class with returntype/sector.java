class area
{
void sector()
{
int r=65;
double sectorarea=0.5*r*r;
System.out.println("the sector area is" +sectorarea);
}
}
class sector
{
public static void main(String[] args)
{
area a1=new area();
a1.sector();
}
}
