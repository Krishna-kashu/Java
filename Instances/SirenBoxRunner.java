class SirenBoxRunner{
	
	public static void main(String[] args){

	Siren siren= new Siren();
	
	System.out.println("default sound_level is: "+siren.sound_level);
	System.out.println("default value for fequency is: "+siren.fequency);
	System.out.println("default source is: "+siren.source);
	System.out.println("default color is: "+siren.color);
	
	siren.sound_level=200;
	siren.fequency=2000.0f;
	siren.source="Electric";
	siren.color="Blue";
	
	System.out.println("\nupdated sound_level is: "+siren.sound_level);
	System.out.println("updated value for fequency is: "+siren.fequency);
	System.out.println("updated source is: "+siren.source);
	System.out.println("updated color is: "+siren.color);
	
}
}