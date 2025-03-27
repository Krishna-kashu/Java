class JamoonRunner{
	
	public static void main(String[] args){

	Jamoon jamoon= new Jamoon();
	
	System.out.println("default jamoon color is: "+jamoon.color);
	System.out.println("default value for has_seed is: "+jamoon.has_seed);
	System.out.println("default jamoon weight is: "+jamoon.weight);
	System.out.println("default origin is: "+jamoon.origin);
	
	jamoon.color="Black";
	jamoon.has_seed=true;
	jamoon.weight=35.00f;
	jamoon.origin="India";
	
	System.out.println("\nupdated jamoon color is: "+jamoon.color);
	System.out.println("updated value for has_seed is: "+jamoon.has_seed);
	System.out.println("updated jamoon weight is: "+jamoon.weight);
	System.out.println("updated origin is: "+jamoon.origin);
	
}
}