class Runner{
	public static void main(String[] args){
		int a = 1;
		
		Add.value(a);
	}
}

class Add{
	public static void value(int b){
		System.out.println(b);
		b += 1;
		if(b<=10){
			Add.value(b);
		}	
	} 
}
	
	
