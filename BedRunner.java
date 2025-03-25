class BedRunner{
	
	public static void main(String[] args){

	//coping class
	Bed bed= new Bed();
	//default values
	
	System.out.println("default material is: "+bed.material);
	System.out.println("default value of length: "+bed.length);
	System.out.println("default width is: "+bed.width);
	System.out.println("default has_headboard is: "+bed.has_headboard);
	
	
	//updating instance variables
	bed.material="Metal";
	bed.length=7.0f;
	bed.width=6.5f;
	bed.has_headboard=true;
	
	Bed bed1=new Bed();
	bed1.width=bed.width;
	
	
	//re printing all variables
	System.out.println("\nupdated material is: "+bed.material);
	System.out.println("updated value of length: "+bed.length);
	System.out.println("updated width is: "+bed1.width);
	//System.out.println("updated width is: "+bed.width);
	System.out.println("updated has_headboard is: "+bed.has_headboard);
	
}
}