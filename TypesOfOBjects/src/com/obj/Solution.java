package com.obj;

	
public class Solution {
	public String solution(String S) {
		//write your code in Java SE 8
		String[] args = S.split("\n");
		int c=0;
		for(String s:args) {
			int f=0;
			String sps[] = s.split("\\s+");
			if((sps[2].contains("r"))||sps[1].equals("root")) {
				f=1;
			}
			String ext = s.substring(s.length()-3);
			if(ext.equals("doc")||ext.equals("xls")||ext.equals("pdf")) {
				f=1;
			}
			if(f==1) {
				c++;
			}
		}
		if(c==0) {
			return "NO FILES";
		}
		return String.valueOf(c);
	}

}






//import java.util.*;
//
//
//class Solution {
//      public int[] solution(int N) {
//          // write your code in Java SE 8
//          int arr[] = new int[N];
//          Arrays.fill(arr,1);
//          return arr;
//      }
// }



//class Solution {
//       public int solution(int N) {
//       //write you code in Java SE 8
//       int sum=sol.digitSum(N);
//       int db1=sum*2;
//       int temp=N;
//       while(temp<100000){
//           if(sol.digitSum(temp)==db1){
//              return temp;
//           }
//           temp++;
//       }
//       return 0;
//}
//       public int digitSum(int n){
//       int su=0;
//       while(n!=0){
//           su+=n%10;
//           n/=10;
//       }
//       return su;
//       }
//}
//




//Task 4 Solution
//class Solution{
//	public int solution(String S){
//		//write your code in Java SE 8
//		int btn = 0;
//		for (int i=1;i<S.length();i++){
//			int cur=(S.charAt(i-1)-'0')*10+(S.charAt(i)-'0');
//			if(cur>btn) btn=cur;
//		}
//		return btn;
//	}
//}



