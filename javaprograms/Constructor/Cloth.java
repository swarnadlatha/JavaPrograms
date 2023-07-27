class Cloth
{
String clothcolour;
int clothcost;
char clothsize;
Cloth(String a,int b,char c)
{
clothcolour=a;
clothcost=b;
clothsize=c;
}
public static void main(String[] args)
{
Cloth c1=new Cloth("yellow",500,'M');
System.out.println("the cloth colour is" +c1.clothcolour);
System.out.println("the cloth cost is" +c1.clothcost);
System.out.println("the cloth size is" +c1.clothsize);
}
}