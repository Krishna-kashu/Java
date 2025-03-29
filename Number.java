class Number{
	public static void value(int b){
		System.out.println(b);
		if(b<10){
			Number.value(b+1);
		}	
	} 
}