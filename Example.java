class Example{
	public static void main(String[] args){
		int age = 16;
		if (age<18){
			System.out.println("Minor");
		}
	
	}
}


class IfElse{
	public static void main(String[] args){
		int num = 20;
		if (num>10){
			System.out.println(num+" is greater than 10");
		}
		else
			System.out.println(num+" is lesser than 10");
	}
}


class ForLoop{
	public static void main(String[] args){
		int a=10;
		for(int i=a;i<=20;i++)
		System.out.println(i);
	}
}

class Example2{
	public static void main(String[] args){
		int x=20;
		int y=37;
		float result;
		while (y>1){
			result=(float)x/y;
			System.out.println(result);
			y--;
		}
		
	}
}

class Switch{
	public static void main(String[] args){
	int day = 2;
		switch(day){
			case 1:
					System.out.println("Monday");
					break;
			case 2:
					System.out.println("Tuesday");
					break;
			case 3:
					System.out.println("Wednesday");
					break;
			case 4:
					System.out.println("Thursday");
					break;
			case 5:
					System.out.println("Friday");
					break;
			case 6:
					System.out.println("Saturday");
					break;
			case 7:
					System.out.println("Sunday");
					break;
			default :
					System.out.println("Oops! Looks like you've discovered a day that doesn’t exist.");
					break;
			
					
					}
	}
}
