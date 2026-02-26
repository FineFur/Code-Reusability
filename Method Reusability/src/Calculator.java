public class Calculator 
{
	double addTwo(double a , double b)
	{
		double result = a + b;
		return result;
	}
	
	double average(double x , double y) 
	{
		Calculator c1 = new Calculator();
		double avg = c1.addTwo(x, y)/2;
		return avg;
	}
	
	double discount(double n1 , double n2)
	{
		Calculator c2 = new Calculator();
		double desc = c2.average(n1 , n2)-((c2.average(n1, n2)) * 0.05);
		return desc;
	}
}
