class Mobile
{
double Mobilecost;
String Mobilemodelname;
String Mobilecolour;
Mobile(double a,String b,String c)
{
Mobilecost=a;
Mobilemodelname=b;
Mobilecolour=c;
return;
}
public static void main(String[] args)
{
Mobile M1=new Mobile(200000.00,"redme","skyblue");
System.out.println("the mobile cost is"   +M1.Mobilecost);
System.out.println("the mobile model name is"   +M1.Mobilemodelname);
System.out.println("the mobile  colour is"   +M1.Mobilecolour);
}
}