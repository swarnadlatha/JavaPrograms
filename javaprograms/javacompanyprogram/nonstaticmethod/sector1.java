class sector1
{
void area(int r)
{
double sectorarea=0.5*r*r;
System.out.println("the sector area is" +sectorarea);
}
public static void main(String[] args)
{
sector1 s1=new sector1();
         s1.area(9);
}
}