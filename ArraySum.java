class ArraySum{
	public static void main(String[] args){
		int sum=0;
		int[] arr={12,32,34,45,56};
		for(int no:arr){
			sum += no;
		}
		System.out.println("Sum is: "+sum);
	}
}