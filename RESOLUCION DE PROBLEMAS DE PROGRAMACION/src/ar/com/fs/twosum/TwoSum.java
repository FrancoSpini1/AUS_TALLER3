package ar.com.fs.twosum;

public class TwoSum {

	public boolean IsPossibleOrNot(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					return true;
				}
			}
		}
		return false;
	}

}