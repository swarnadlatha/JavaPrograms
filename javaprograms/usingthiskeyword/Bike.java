class Bike
{
int bikecost;
String bikebrand;
String bikecolour;
Bike(int bikecost,String bikebrand,String bikecolour)
{
this.bikecost=bikecost;
this.bikebrand=bikebrand;
this.bikecolour=bikecolour;
}
public static void main(String[] args)
{
Bike b1=new Bike(500000,"FZ","green");
System.out.println(b1.bikecost);
System.out.println(b1.bikebrand);
System.out.println(b1.bikecolour);
}
}
