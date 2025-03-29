class Food{
	
	public static void foodInfo(String name){
	if((name=="Masala Dosa")||(name=="Set Dosa")||(name=="Onion Dosa")){
		System.out.println(name+" 60 rupees");
	}else if((name=="Rise Bath")||(name=="Bisibele Bath")||(name=="Pongal")){
		System.out.println(name+" 57 rupees");
	}else if((name=="Samosa")||(name=="Panipuri")||(name=="Rasgulla")){
		System.out.println(name+" 50 rupees");
	}else if((name=="Idli Sambar")||(name=="Dhokla")||(name=="Pav Bhaji")){
		System.out.println(name+" 80 rupees");
	}else if((name=="Chole Bhature")||(name=="Rajma Chawal")||(name=="Veg Pulao")){
		System.out.println(name+" 150 rupees");
	}else if((name=="Dal Makhani")||(name=="Malai Kofta")||(name=="Paneer Butter Masala")){
		System.out.println(name+" 200 rupees");
	}else if((name=="Chicken Biryani")||(name=="Hyderabadi Biryani")||(name=="Mutton Rogan Josh")){
		System.out.println(name+" 250 rupees");
	}else if((name=="Tandoori Chicken")||(name=="Butter Naan")){
		System.out.println(name+" 300 rupees");
	}else if((name=="Baingan Bharta")||(name=="Gobi Manchurian")||(name=="Methi Thepla")){
		System.out.println(name+" 150 rupees");
	}
	else{
		System.out.println(name+" not available!!!!!!!!!!!");
	}
	}
}