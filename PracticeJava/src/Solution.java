import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
	public static int solution(int numOfEle , int arr[] , int n) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<n;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum+=arr[i*j];
			}
			list.add(sum);
		}
		
		Collections.sort(list);
		int ans=list.get(list.size()-1);
		return ans;
	}
	
	
	
	
	
	public static void main(String[] args) {
//		int arr[] = {4,14,12,7,14,16,5,13,7,16,11,19};
		int arr[] = {1,13,15,5,16,3,4,9,20};
		System.out.println(solution(arr.length,arr,3));
	}
}
