
class HangerRunner{
	
	public static void main(String[] args){

	
	Hanger hanger= new Hanger();
	
	
	System.out.println("default material is: "+hanger.material);
	System.out.println("default color is: "+hanger.color);
	System.out.println("default hook_rotate is: "+hanger.hook_rotate);
	System.out.println("default width is: "+hanger.width);
	
	
	
	hanger.material="Wood";
	hanger.color="White";
	hanger.hook_rotate=true;
	hanger.width=45.5f;
	

	
	System.out.println("\nupdated color is: "+hanger.material);
	System.out.println("updated color is: "+hanger.color);
	System.out.println("updated hook_rotate is: "+hanger.hook_rotate);
	System.out.println("updated width is: "+hanger.width);
	
}
}