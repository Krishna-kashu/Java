
class AnchorRunner{
	
	public static void main(String[] args){

	Anchor anchor= new Anchor();
	
	System.out.println("default anchor material is: "+anchor.material);
	System.out.println("default value for is_rustproof is: "+anchor.is_rustproof);
	System.out.println("default anchor holdingPower is: "+anchor.holdingPower);
	System.out.println("default usage is: "+anchor.usage);
	
	anchor.material="Iron";
	anchor.is_rustproof=true;
	anchor.holdingPower=3500;
	anchor.usage="Boat";
	
	System.out.println("\nupdated anchor material is: "+anchor.material);
	System.out.println("updated value for is_rustproof is: "+anchor.is_rustproof);
	System.out.println("updated anchor holdingPower is: "+anchor.holdingPower);
	System.out.println("updated usage is: "+anchor.usage);
	
}
}