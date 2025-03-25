class TabletRunner{
	public static void main(String[] args){
		
		Tablet.Tname("Vitamin C effervescent");
		Tablet.dissolve(true);
		
		Tablet.cure(false);
		
		Tablet.killThePain(false);
		
		Tablet.react(true);
		
		System.out.println("**************");
		
		String nm ="Morphine SR";	
		Tablet.Tname(nm);
		
		boolean g=false;
		Tablet.dissolve(g);
		
		boolean t=true;
		Tablet.killThePain(t);
		
		
		boolean dd=true;
		Tablet.cure(dd);
		
		boolean d=false;	
		Tablet.react(d);
		
	}
}