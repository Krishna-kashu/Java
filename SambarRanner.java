class SambarRanner{
	public static void main(String... args){
		String[] vegg=Sambar.vegitable();
		for(String veg:vegg){
			System.out.println(veg);
			
		}	
			
		int qu=Sambar.quantity();
			System.out.println(qu);
			
		boolean cld=Sambar.is_cold();
			System.out.println(cld);
			
		boolean good=Sambar.is_bad();
			System.out.println(good);
	
	}

}