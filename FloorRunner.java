class FloorRunner{
	public static void main(String[] args){
	//coping class
	Floor floor=new Floor();
	//default values
	System.out.println("default floor number is: "+floor.floorNo);
	System.out.println("default value for is Slippery: "+floor.is_slippery);
	System.out.println("default material is: "+floor.material);
	System.out.println("default tilesCount is: "+floor.tilesCount);
	System.out.println("default area is: "+floor.area);
	
	//updating instance variables
	floor.floorNo = 2;
	floor.is_slippery=true;
	floor.material="Wood";
	
	floor.tilesCount =100;
	floor.area=250.5f;
	
	//re printing all variables
	System.out.println("\nupdated floor number is: "+floor.floorNo);
	System.out.println("updated value for is Slippery: "+floor.is_slippery);
	System.out.println("updated material is: "+floor.material);
	System.out.println("updated tilesCount is: "+floor.tilesCount);
	System.out.println("updated area is: "+floor.area);
	
}
}