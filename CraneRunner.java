class CraneRunner{
	
	public static void main(String[] args){

	Crane crane= new Crane();
	
	System.out.println("default crane type is: "+crane.type);
	System.out.println("default value for capacity is: "+crane.capacity);
	System.out.println("default has_remote_control is: "+crane.has_remote_control);
	System.out.println("default speed is: "+crane.speed);
	
	crane.type="Mobile";
	crane.capacity=10000f;
	crane.has_remote_control=true;
	crane.speed=5.0f;
	
	System.out.println("\nupdated type is: "+crane.type);
	System.out.println("updated value for capacity is: "+crane.capacity);
	System.out.println("updated has_remote_control is: "+crane.has_remote_control);
	System.out.println("updated speed is: "+crane.speed);
	
}
}