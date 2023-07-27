class Tv
{
int tvcost;
String tvbrand;
String tvcolour;
Tv(int tvcost,String tvbrand,String tvcolour)
{
this.tvcost=tvcost;
this.tvbrand=tvbrand;
this.tvcolour=tvcolour;
}
public static void main(String[] args)
{
Tv t1=new Tv(500000,"samsung","block");
System.out.println(t1.tvcost);
System.out.println(t1.tvbrand);
System.out.println(t1.tvcolour);
}
}
