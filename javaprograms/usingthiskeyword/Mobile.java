class Mobile
{
int mobilecost;
String mobilemodlename;
String mobilecolour;
Mobile(int mobilecost,String mobilemodlename,String mobilecolour)
{
this.mobilecost=mobilecost;
this.mobilemodlename=mobilemodlename;
this.mobilecolour=mobilecolour;
}
public static void main(String[] args)
{
Mobile m1=new Mobile(20000,"redme","blue");
System.out.println(m1.mobilecost);
System.out.println(m1.mobilemodlename);
System.out.println(m1.mobilecolour);
}
}





