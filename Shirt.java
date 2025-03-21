class Shirt{
	 static public void main(String[] Args){
	 //public void main(String[] Args){
	 //void public static main(String[] Args){ (not compailing)
	  //public ststic int main(String[] Args){     (not compailing)
		String shirt1="Black";
		String shirt2="White";
		String shirt3="Pink";
		String shirt4="Sky blue";
		String shirt5="Red";
		
		String[] shirts={shirt1,shirt3,shirt4,shirt5,shirt2,"Checks"};
		for(int i=0;i<=5;){
		System.out.println((i+1)+")"+" \nMy favorite shirt color is "+ shirts[i]);
		i++;
		}
		System.out.println("\n");
		for(String shirt:shirts)
		{
			System.out.println(shirt);
		}
	}
}