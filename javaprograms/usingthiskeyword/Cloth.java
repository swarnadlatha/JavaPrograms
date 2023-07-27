class Cloth
{
String clothcolour;
int clothcost;
char clothsize;
Cloth(String clothcolour,int clothcost,char clothsize)
{
this.clothcolour=clothcolour;
this.clothcost=clothcost;
this.clothsize=clothsize;
}
public static void main(String[] args)
{
Cloth c1=new Cloth("pink",3000,'M');
System.out.println(c1.clothcolour);
System.out.println(c1.clothcost);
System.out.println(c1.clothsize);
}
}