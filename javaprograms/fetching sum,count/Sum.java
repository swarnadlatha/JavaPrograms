class Sum
{
static void suming()
 {
int sum=0;
int num=1246;
while(num!=0)
  {
int rem=num%10;
sum=sum+rem;
num=num/10;
  }
  System.out.println(sum);
 }
 public static void main(String[] args)
	{
	 suming();
	}
}