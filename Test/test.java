class test
{
	public static void main (String args[])
	{
		/*System.out.println(""+12345%10);//5
		System.out.println(""+((12345%100)/(10)));//45
		//100 is 10^2, 10 is 10^1
		System.out.println(""+((12345%1000)/(100)));//345--> 100 is 10^2
		//System.out.println(""+12345%10000);*/

		int a=123%10;
		int b=123%100;
		int c=b/10;
		int sum=a+(b%10)+(b/10);

		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("c:"+c);
		System.out.println("sum:"+sum);
		

		



		

	}
}