class Car1
{
double carcost;
String carmodelname;
String cartype;
Car1(double a,String b,String c)
{
carcost=a;
carmodelname=b;
cartype=c;
}
public static void main(String[] args)
{
Car1 c1=new Car1(500000.45,"bmw","diesel");
System.out.println("the car cost is" +c1.carcost);
System.out.println("the car model name is" +c1.carmodelname);
System.out.println("the car type is" +c1.cartype);
}
}
