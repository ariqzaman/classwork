package sort;

public class recursionIntro {

	
	public static void main(String[] args) {
		
		int n = 40;
		//System.out.println("The " + n + "th Fibonacci is " + fibonacci(n) );
		hanoiSolution(8,"A", "B", "C");
		//System.out.println(factorialRecursion(10));
		
		//factorial(10);
		
		//helloWorld();
	}
	
	private static int fibonacci(int n) {
		if(n<=1)
		{
			return 1;
		}
		else
		{
			int previous = fibonacci(n-1); 
			//print("Before we find fibonacci " + n + " we need to find fibonacci " + (n-1) + ", which is " + previous);
			int beforePrevious = fibonacci(n-2);
			return previous + beforePrevious;
		}

	}

	private static int count = 1;
	
	public static void print(String s)
	{
		System.out.println(s);
		count++;
	}

	private static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg) {
		// TODO Auto-generated method stub
		if(numberOfDiscs <= 1)
		{
			print("Move " + startPeg + " to " + endPeg);
		}
		else
		{
			System.out.println("In order to move " + numberOfDiscs + " over to peg" + endPeg + " we must move " + (numberOfDiscs - 1) + " over to Peg" + midPeg+ " first.");
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
		
	}

	private static int factorialRecursion(int n) {
		// TODO Auto-generated method stub
		/**int fact = n;
		if(n == 1)
		{
			fact = fact * n;
			return fact;
		}
		else
		{
			fact = fact * factorialRecursion(n-1);
			return fact;
		}**/
		if(n>1)
		{
			return n* factorialRecursion(n-1);
		}
		return 1;
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int fact = n;
		for(int i = n-1; i>0; i--)
		{
			fact = fact * i;
		}
		System.out.println(fact);
		return fact;
	}

	private static void helloWorld() {
		// TODO Auto-generated method stub
		System.out.println("Using a for loop");
		for(int i = 0; i<5; i++)
		{
			System.out.println("Hello World x" + i);
		}
		System.out.println("Without using a forloop");
		forLoop(5, new Action(){//passing a method for a parameter = anonymous inner type = an implementation of an interface written into a parameter
			
			private int value = 0;

			public void act() {
				// TODO Auto-generated method stub
				System.out.println("Hello World x" + value);
				value++;
			}
		});
	}

	private static void forLoop(int i, Action action) {
		if(i<=0)//base case
		{
			return;
		}
		else
		{
			action.act();//standard action
			forLoop(i-1,action);//recursive call
		}
	}

}

