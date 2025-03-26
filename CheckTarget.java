public class CheckTarget {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 35; 
        boolean found = false;

        for (int num : arr) {
            if (num == target) {
                found = true;
                break;
            }
        }
		if(found==true){
        System.out.println("Target found in the array");
		}else{
		System.out.println("Target not found in the array");
		}
    }
}
