class HairRunner{
	
	public static void main(String[] args){

	Hair hair= new Hair();
	
	System.out.println("default hair color is: "+hair.color);
	System.out.println("default value for is_curly is: "+hair.is_curly);
	System.out.println("default hair growth_rate is: "+hair.growth_rate);
	System.out.println("default length is: "+hair.length);
	
	hair.color="Black";
	hair.is_curly=true;
	hair.growth_rate=0.05f;
	hair.length=2.0f;
	
	System.out.println("\nupdated hair color is: "+hair.color);
	System.out.println("updated value for is_curly is: "+hair.is_curly);
	System.out.println("updated hair growth_rate is: "+hair.growth_rate);
	System.out.println("updated length is: "+hair.length);
	
}
}