class Home
{
String homename;
int homecost;
String homecolour;
Home(String homename,int homecost,String homecolour)
{
this.homename=homename;
this.homecost=homecost;
this.homecolour=homecolour;
}
public static void main(String[] args)
{
Home h1=new Home("chandra",3000000,"Orange");
System.out.println(h1.homename);
System.out.println(h1.homecost);
System.out.println(h1.homecolour);
}
}
