public class TestClass 
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		
		double res_1 = cal.addTwo(10, 20);
		System.out.println("Addition is : " + res_1);
		
		double res_2 = cal.average(10, 20);
		System.out.println("Average : " + res_2);
		
		double res_3 = cal.discount(10, 20);
        System.out.println("Discount : " + res_3);
	}
}
