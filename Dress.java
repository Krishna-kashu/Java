public class Clothing{
	static String[] clothes={null,null,null,null,null};
	static int index=0;
	public static void addCloth(String clothName){
		if(clothes!=null){
			if(index<clothes.length){
				clothes[index]=clothName;
				index++;
				System.out.println("cloth saved successfully");
			}
			else{
				System.out.println("array if full");
			}
			
		}
		else{
			System.out.println("Array is null");
		}
	}
	public static void display(){
		for(index=0;index<clothes.length;index++){
			System.out.println(clothes[index]);
		}
	}
	
	public static void search(String clothName){
		boolean present=true;
		for(index=0;index<clothes.length;index++){
			if(clothes[index]==clothName){
				present=true;
				break;
			}
			else{
				present=false;
			}
		}
		if(present==true){
			System.out.println(clothName+" found at index "+index);
		}
		else{
			System.out.println("cloth not found");
		}
		
	}
	
	public static void delete(String clothName){
		for(index=0;index<clothes.length;index++){
			if(clothes[index]==clothName){
				clothes[index]=null;
			}
		}
	}
	
	public static void update(String clothName,String newCloth){
		for(index=0;index<clothes.length;index++){
			if(clothes[index]==clothName){
				clothes[index]=newCloth;
			}
		}
	}
}