class Bike
{
int bikecost;
String bikebrand;
String bikecolour;
Bike(int a,String b,String c)
{
bikecost=a;
bikebrand=b;
bikecolour=c;
}
public static void main(String[] args)
{
Bike b1=new Bike( 200000,"FZ","green");
System.out.println("the bike cost is" +b1.bikecost);
System.out.println("the bike brand is" +b1.bikebrand);
System.out.println("the bike colour is" +b1.bikecolour);
}
}