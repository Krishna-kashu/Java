class OddEven{
	static int[] arr={1,2,3,4,5,6,8,7};
	public static void main(String[] args) {
		int odd=0; int even=0;
		for(int index=0;index<arr.length;index++){
			if(arr[index]%2==0){
				even++;
			}else{
				odd++;
			}
		    
		}
		System.out.println("odd"+odd);
		System.out.println("even"+even);

	}
}