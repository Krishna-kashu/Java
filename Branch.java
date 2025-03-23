public class Branch{
	
	static String[] BranchNames={null,null,null};
	static int index=0;
	
	public static void addBranchnames(String BranchName){
		if(BranchNames!=null)
		{
			if(index < BranchNames.length){
				BranchNames[index]=BranchName;
				index++;
				System.out.println("Element saved ssuccessfully ");
			}
			else{
				System.out.println("Array is full, Cannot add the elements ");
			}
		}
		else{
			System.out.println("The Array is null");
		
		}
	}
    public static void display(){
		for(index=0;index<BranchNames.length;index++){
			System.out.println(BranchNames[index]);
		}
	}
    public static void search(){
		for(index=0;index<BranchNames.length;index++){
			
		}
	}	
}