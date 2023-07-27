class sector2
{
double area()
{
int r=10;
double sector =0.5*r*r;
return sector;
}
public static void main(String[] args)
{
sector2 s1=new  sector2();
double  sectorarea=s1.area();
System.out.println("the  sector area is" + sectorarea);
}
}