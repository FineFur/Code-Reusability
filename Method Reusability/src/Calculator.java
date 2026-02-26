public class Calculator 
{
	double addTwo(double a , double b)
	{	
		return a + b ; 
	}
	
	double average(double x , double y) 
	{	
		return addTwo(x,y)/2;
	}
	
	double discount(double n1 , double n2)
	{
		return average(n1 , n2)-((average(n1, n2)) * 0.05);
	}
}

//public class Calculator 
//{
//	double addTwo(double a , double b)
//	{
//		double result = a + b;
//		return result;
//	}
//	
//	double average(double x , double y) 
//	{
//		Calculator c1 = new Calculator();
//		double avg = (addTwo(x, y))/2;
//		return avg;
//	}
//	
//	double discount(double n1 , double n2)
//	{
//		Calculator c2 = new Calculator();
//		double desc = average(n1 , n2)-((average(n1, n2)) * 0.05);
//		return desc;
//	}
//}

  /* Commented code provides the repeated output like this :
	30.0
	Addition is : 30.0
	30.0
	15.0
	Average = 15.0
	30.0
	15.0
	30.0
	15.0
	14.25
	Discount = 14.25
 */

// Therefore, to avoid repeated output directly return is used in the uncommented code.