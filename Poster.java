
class Poster{
	
	double width;
	double length;
	String content;
	String material;
	String color;
	String durability;
	boolean isReusable;
	int cost;
	String manufacture;
	String environmentalImpact;
	
	
	Poster(){
		
		System.out.println("no argument constructor Poster is running...");
		
	}
	Poster(double width){
		this.width=width;
		System.out.println("1. Constructor with argument Poster is running...");
		
	}
	Poster(double width, double length){
		this(width);
		this.length=length;
				System.out.println("2. Constructor with argument Poster is running...");

	}
	Poster(double width, double length, String content){
		this(width,length);
		this.content=content;
				System.out.println("3. Constructor with argument Poster is running...");

	}
	Poster(double width, double length, String content, String material){
		this(width,length,content);
		this.material=material;
				System.out.println("4. Constructor with argument Poster is running...");

	}
	Poster(double width, double length, String content, String material, String color){
		this(width,length,content,material);
		this.color=color;
		System.out.println("5 argument constructor Poster is running...");
		
	}
	Poster(double width, double length, String content, String material, String color, String durability){
		this(width,length,content,material,color);
		this.durability=durability;
		System.out.println("6 Constructor with argument Poster is running...");
		
	}
	Poster(double width, double length, String content, String material, String color, String durability,boolean isReusable){
		this(width,length,content,material,color,durability);
		this.isReusable=isReusable;
		System.out.println("7 Constructor with argument Poster is running...");
		
	}
	
	Poster(double width, double length, String content, String material, String color, String durability, boolean isReusable, int cost){
		this(width,length,content,material,color,durability, isReusable);
		this.cost=cost;
				System.out.println("8 Constructor with argument Poster is running...");

	}
	Poster(double width, double length, String content, String material, String color, String durability, boolean isReusable, int cost, String manufacture){
		this(width,length,content,material,color,durability,isReusable, cost);
		this.manufacture=manufacture;
				System.out.println("9 Constructor with argument Poster is running...");

	}
	Poster(double width, double length, String content, String material, String color, String durability, boolean isReusable, int cost, String manufacture, String environmentalImpact){
		this(width,length,content,material,color,durability,isReusable, cost,manufacture);
		this.environmentalImpact=environmentalImpact;
				System.out.println("10 Constructor with argument Poster is running...");

	}
	
	public void info(){
		
		System.out.println("Poster width: "+ this.width);
		System.out.println("Poster length: "+ this.length);
		System.out.println("Poster content: "+ this.content);
		System.out.println("Poster material: "+ this.material);
		System.out.println("Poster color: "+ this.color);
		System.out.println("Poster durability: "+ this.durability);
		System.out.println("Poster isReusable: "+ this.isReusable);
		System.out.println("Poster cost: "+ this.cost+"Rupees");
		System.out.println("Poster manufacture: "+ this.manufacture);
		System.out.println("Poster environmentalImpact: "+ this.environmentalImpact);
		
	}
	
	
	
	
}










/* class Poster{
	
	double width;
	double length;
	String content;
	String material;
	
	Poster(){
		System.out.println("no argument constructor Poster is running...");
		
	}
	Poster(double width){
		this.width=width;
		System.out.println("1. Constructor with argument Poster is running...");
		
	}
	Poster(double width, double length){
		this.width=width;
		this.length=length;
				System.out.println("2. Constructor with argument Poster is running...");

	}
	Poster(double width, double length, String content){
		this.width=width;
		this.length=length;
		this.content=content;
				System.out.println("3. Constructor with argument Poster is running...");

	}
	Poster(double width, double length, String content, String material){
		this.width=width;
		this.length=length;
		this.content=content;
		this.material=material;
				System.out.println("4. Constructor with argument Poster is running...");

	}
	
	public void info(){
		
		System.out.println("Poster width: "+ this.width);
		System.out.println("Poster length: "+ this.length);
		System.out.println("Poster content: "+ this.content);
		System.out.println("Poster material: "+ this.material);
	}
	
	
	
	
}

*/