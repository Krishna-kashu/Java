class Wire{
	public static void main(String[] args){
		
		String[] wires ={"Solid Wire","Stranded Wire","Twisted Pair Wire","Coaxial Cable","Fiber Optic Cable"};
		
		for(String wire:wires){
			System.out.println(wire);
		}
	}
}

class Wall{
	public static void main(String[] args){
		
		double[] wallheights={0.13,0.35,6.56,9.57,0.64};
		for(double height:wallheights){
		System.out.println(height);
		}
	}
}

class Paper{
	public static void main(String[] args){
		char[] papers={'A','B','C','X','K','M','L'};
		for(int i=6;i>1;i--){
			System.out.println(papers[i]);
		}
		
	}
}

class Poster{
	public static void main(String[] args){
		String[] posters = {"Motivation", "Nature", "Art", "Quotes","advertisement"};
		for(int i=0;i<5;++i){
			System.out.println(posters[i]);
		}
		
	}
}

class Wallet{
	public static void main(String[] args){
		float[] walletprize={23.75f,87.65f,76.54f,7777.675f};
		for(int i=0;i<4;++i){
			System.out.println(walletprize[i]);
		}
	}
}

class Coin{
	public static void main(String[] args){
		String[] coins={"indian","britan","china","england","american"};
		for(String coin:coins){
			System.out.println(coin);
		}
	}
}

class Note{
	public static void main(String[] args){
		int[] notes={1,2,5,20,50,100,500,2000};
		for(int i=0;i<7;++i){
			System.out.println(notes[i]);
		}
	}
}