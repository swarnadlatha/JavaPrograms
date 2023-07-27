class Car
{
int carcost;
String carmodlename;
String carcolour;
Car(int carcost,String carmodlename,String carcolour)
{
this.carcost=carcost;
this.carmodlename=carmodlename;
this.carcolour=carcolour;
}
public static void main(String[] args)
{
Car c1=new Car(200000,"bmw","red");
System.out.println(c1.carcost);
System.out.println(c1.carmodlename);
System.out.println(c1.carcolour);
}
}
