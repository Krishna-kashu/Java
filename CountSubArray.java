class CountSubArray{
	static int subArray(int[] arr, int k){
		int res=0;
		for(int s=0; s<arr.length; s++){
			int sum = 0;
			
			for(int e=s; e<arr.length; e++){
				sum += arr[e];
				if (sum == k){
					res++;
				}
			}
		}
		return res;
	}

	public static void main(String[] args){
		int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k = 10;
		System.out.println("count of sub array"+subArray(arr, k));
	
}}