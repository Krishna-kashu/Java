class TerraceRunner{
	
	public static void main(String[] args){

	//coping class
	Terrace terrace= new Terrace();
	//default values
	
	System.out.println("default Terrace number is: "+terrace.type);
	System.out.println("default value for no_of_chairs: "+terrace.no_of_chairs);
	System.out.println("default flooring_material is: "+terrace.flooring_material);
	System.out.println("default height_from_grount is: "+terrace.height_from_grount);
	
	
	//updating instance variables
	terrace.type="Closed";
	terrace.no_of_chairs=2;
	terrace.flooring_material="Wooden";
	terrace.height_from_grount=15.5f;
	
	
	//re printing all variables
	System.out.println("\nupdated Terrace number is: "+terrace.type);
	System.out.println("updated value for no_of_chairs: "+terrace.no_of_chairs);
	System.out.println("updated flooring_material is: "+terrace.flooring_material);
	System.out.println("updated height_from_grount is: "+terrace.height_from_grount);
	
}
}