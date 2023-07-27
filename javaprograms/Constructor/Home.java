class Home
{
String homename;
double homecost;
String homecolour; ;
Home(String a,double b,String c)
{
homename=a;
homecost=b;
homecolour=c;
}
public static void main(String[] args)
{
Home h1=new Home("swarna",1000000.5,"greenred");
System.out.println("the home name is"  +h1.homename);
System.out.println("the home cost is" +h1.homecost);
System.out.println("the home colour is"+h1.homecolour);
}
}

