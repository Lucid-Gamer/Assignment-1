package assignment1;
import java.util.Scanner;

public class MathOperation {
	private int x,y,z;
	private double num,mid,root;
	private double trig,rad;
	static Scanner sc = new Scanner(System.in);
	
	public void init()
	{	int a , b;
		System.out.print("Enter the first number: ");
		a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		b = sc.nextInt();
		
		this.x = a;
		this.y = b;
	}
	
	/*========================================================================================================*/
	
	public int fact(int x) 
	{
		int f = 1;
		for (int i = 1; i <= x; i++) {
			f = f * x;
		}
		return f;
	} 
	
	/*========================================================================================================*/
	
	public void add() 
	{
		int carry;
		 while(y!=0)
	        {
	            carry = x & y;
	            x = x ^ y;
	            y = carry << 1;
	            z = x;
	        }
	}
	
	/*========================================================================================================*/
	
	public double sin(double x)
	{
		this.rad = x * (22/7) / 360;
		int j;
		trig = rad;
		for (int i = 1; i <= x; i++) 
		{
				if (i%2 != 0) 
				{
					j = (2*i)+1;
					trig = trig - (power(rad,j)/fact(j));
				}
				else
				{
					j = (2*i)+1;
					trig = trig + (power(rad,j)/fact(j));
				}
			
		}
		return trig;
	}
	
	/*========================================================================================================*/
	
	/*public double sin(double a)
	{double temp = 1;
	   int denominator = -1;
	   if(a != 0) 
	   {
	      for (int i = 0; i <= a; i++) 
	      {
	         denominator += 2;
	         if(i % 2 == 0) 
	         {
	            temp = temp + (Math.pow(a, denominator) / fact(denominator));
	         } 
	         else 
	         {
	            temp = temp - (Math.pow(a, denominator) / fact(denominator));
	         }
	      }
	   }
	   return temp;
	}*/
	
	/*========================================================================================================*/
	public void mul()
	{
		z = 0;
		while(y > 0)
		{
			if ((y & 01) != 0)
			{
				z = z + x;
			}
			x = x << 1;
			y = y >> 1;
		}
	}
	
	/*========================================================================================================*/
	
	public float pow()
	{
//		z = (int) Math.pow(x, y);
		int a = 1;
		float p = 1;
		while(a<=y)
		{
			p = p * x;
			a++;
		}
		return p;
	}
	
	/*========================================================================================================*/
	
	public void sqroot()
	{
		System.out.println("Enter the number: ");
		num = sc.nextDouble();
		
		double n = num;
		mid = 1.0;
		double e = 0.000001;
		
		while (num - mid > e) 
		{
			num = (num + mid)/2;
			mid = n/num;
		}
		root = num;
	}
	
	/*========================================================================================================*/
	
	public static int power(int m,int n)
	{
		int a = 1;
		int p = 1;
		while(a<=n)
		{
			p = p * m;
			a++;
		}
		return p;
	}
	
	/*========================================================================================================*/
	
	public static double power(double m,int n)
	{
		int a = 1;
		double p = 1.0;
		while(a<=n)
		{
			p = p * m;
			a++;
		}
		return p;
	}
	
	/*========================================================================================================*/
	
	public double diff(double a,double b) 
	{
		if (a>b) 
		{
			return a-b;
		}
		else
		{
			return b-a;
		}
	}
	
	/*========================================================================================================*/
	
	public double nthroot(double x,int root)
	{
		double start = 0;
		double end = x;
		double error = 1;
		double e = 0.00000001;
		while (error >= e) 
		{
			mid = (start+end)/2;
			error = diff(x,power(mid,root));
			if (power(mid,root)>x) 
			{
			  end = mid;
			}
			else
			{
				start = mid;
			}
		} 
		return mid;
		
	}
	
	/*========================================================================================================*/
	
	/*static double absolute(double a, double b)
	{
		if(a>b)
		   {
			return a-b;
		   }
		else 
		   {
			return b-a;
		   }
	}*/
	
	/*========================================================================================================*/
	
	/*public static void nthroot(double x,int n)
	{
	        double low, high;
	        if (x >= 0 && x <= 1)
	        {
	            low = x;
	            high = 1;
	        }
	        else
	        {
	            low = 1;
	            high = x;
	        }
	        double e = 0.00000001;
	        double result = (low + high) / 2;
	        while (absolute((power(result, n)), x)>= e)
	        {
	            if (power(result, n) > x)
	                {
	            	high = result;
	                }
	            else
	                {
	            	 low = result;
	                 result = (low + high) / 2;
	                }
	        }
	        System.out.println(result);
	    }*/

	
	
	public void display(){System.out.println("Result = "+mid);}
	
	public void Display(){System.out.println("Result = "+z);}
	
	public void DisplayRoot(){System.out.println("Result = "+root);}
	
	public void Displaysin(){System.out.println("Result = "+trig);}
	
	 public static void main(String[] args) {
		MathOperation m = new MathOperation();
		int repeat = 1;
		do{
			System.out.println("1. Addition \n2. Multiplication \n3. Power \n4. Square root \n5. nthroot");
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				m.init();
				m.add();
				m.Display();
				break;
				
			case 2:
				m.init();
				m.mul();
				m.Display();
				break;
				
			case 3:
				m.init();
				m.pow();
				m.display();
				break;
				
			case 4: 
				m.sqroot();
				m.DisplayRoot();
				break;
				
			case 6:
				System.out.print("Enter The number: ");
				int q = sc.nextInt();
				double l = m.sin(q);
				/*m.Displaysin();*/
				System.out.println("Result = "+l);
				break;
				
			case 5:
				System.out.print("Enter The number: ");
				double num = sc.nextDouble();
				System.out.println("Enter the root: ");
				int root = sc.nextInt();
				m.nthroot(num,root);
				m.display();
				break;

			default: System.out.println("Your choice shoulde be between 1 and 4");
				break;
			}
			System.out.println("Enter your choice: \n1=repeat \n0=exit");
			repeat = sc.nextInt();
			
		}while(repeat != 0);
	}

}
