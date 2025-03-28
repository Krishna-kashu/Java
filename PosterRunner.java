class PosterRunner{
	public static void main(String... args){
		
	double width=45.67;
	double length=34.54;
	String content="Yakshnagana Invitation";
	String material="Plastic";
	String color="White";
	String durability="2 month";
	boolean isReusable=true;
	int cost=300;
	String manufacture="sd printers";
	String environmentalImpact="low";
	
	
	Poster poster1=new Poster();
	poster1.info();
	
	Poster poster2=new Poster(width);
	poster2.info();
	
	Poster poster3=new Poster(width,length);
	poster3.info();
	
	Poster poster4=new Poster(width,length,content);
	poster4.info();
	
	Poster poster5=new Poster(width,length,content,material);
	poster5.info();
	
	Poster poster6=new Poster(width,length,content,material, color);
	poster6.info();
	
	Poster poster7=new Poster(width,length,content,material, color, durability);
	poster7.info();
	
	Poster poster8=new Poster(width,length,content,material, color, durability, isReusable);
	poster8.info();
	
	Poster poster9=new Poster(width,length,content,material, color, durability, isReusable, cost);
	poster9.info();
	
	Poster poster10=new Poster(width,length,content,material, color, durability, isReusable, cost, manufacture);
	poster10.info();
	
	Poster poster11=new Poster(width,length,content,material, color, durability, isReusable, cost, manufacture, environmentalImpact);
	poster11.info();

	
	
	
	}

}