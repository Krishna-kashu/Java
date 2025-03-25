class IronBoxRunner{
	
	public static void main(String[] args){

	IronBox ironBox= new IronBox();
	
	System.out.println("default ironBox plate_material is: "+ironBox.plate_material);
	System.out.println("default value for temp_range is: "+ironBox.temp_range);
	System.out.println("default ironBox power is: "+ironBox.power);
	System.out.println("default weight is: "+ironBox.weight);
	
	ironBox.plate_material="Aluminum";
	ironBox.temp_range=250.0f;
	ironBox.power=1500;
	ironBox.weight=1.8f;
	
	System.out.println("\nupdated ironBox plate_material is: "+ironBox.plate_material);
	System.out.println("updated value for temp_range is: "+ironBox.temp_range);
	System.out.println("updated ironBox power is: "+ironBox.power);
	System.out.println("updated weight is: "+ironBox.weight);
	
}
}