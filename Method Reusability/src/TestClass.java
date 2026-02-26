public class TestClass 
{
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		
		System.out.println("Addition is : " + cal.addTwo(10, 20));
		System.out.println("Average = " + cal.average(10, 20));
        System.out.println("Discount = " + cal.discount(10, 20));
	}
}
