public class Cloth{
	static String[] cloths={null,null,null,null,null};
	static int index=0;
	
	public static void addcloth(String newcloth){
		if(cloths!=null){
			if(index<cloths.length){
			cloths[index]=newcloth;
			index++;
			System.out.println("Element added successfully");
			}else{
				System.out.println("Array is full");
			}
		}else{
			System.out.println("Array is null");
		}
	}
	public static void display(){
			for(index=0;index<cloths.length;index++){
				System.out.println(cloths[index]);
		}
	}
	public static void search(String Tcloth){
		for(index=0;index<cloths.length;index++){
			if(cloths[index]==Tcloth){
				System.out.println("cloth found at index: "+index);
			}else{
				System.out.println("cloth not found!!");

			}
		}
		
	}
	public static void update(String clothname,String Ccloth){
		for(index=0;index<cloths.length;index++){
			if(cloths[index]==clothname){
				clothname=Ccloth;
				
			}
		}

	}
}


