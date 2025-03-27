class ShirtRunner{
	
	public static void main(String[] args){

	
	Shirt shirt= new Shirt();
	
	
	System.out.println("default color is: "+shirt.color);
	System.out.println("default value of fabric: "+shirt.fabric);
	System.out.println("default no_of_buttons is: "+shirt.no_of_buttons);
	System.out.println("default sleev_length is: "+shirt.sleev_length);
	
	
	
	shirt.color="Pink";
	shirt.fabric="Polyester";
	shirt.no_of_buttons=6;
	shirt.sleev_length=30.5f;
	

	
	System.out.println("\nupdated color is: "+shirt.color);
	System.out.println("updated value of fabric: "+shirt.fabric);
	System.out.println("updated no_of_buttons is: "+shirt.no_of_buttons);
	System.out.println("updated sleev_length is: "+shirt.sleev_length);
	
}
}