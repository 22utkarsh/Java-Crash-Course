package com.String;

public class AssignmentString {
	
	static String reverse(String s1) {
		char ch[] = s1.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char temp = ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
			
		}
		return new String(ch);
	}
	
	
	
	static String lowerCase(String s1) {
		char ch[] = s1.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int val = ch[i];
			if((val>64 && val<91) && ch[i]!=' ') {
				ch[i]=(char)(val+32);
			}
			
		}
		return new String(ch);
	}
	
	
	
	static String casesensitiveReverse(String s1) {
		char ch[] = s1.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			
			int v1=ch[i];
			int v2=ch[ch.length-1-i];
			char temp = ch[i];
			
			 if(v1>64 && v1<91 && ch[i]!=' ' && (v2>96 && v2<123)) {
			
				ch[i]=(char)(v2-32);
				ch[ch.length-1-i]=(char)(v1+32);
			}else if(v2>64 && v2<91 && ch[ch.length-1-i]!=' ' && (v1>96 && v1<123)) {
				
				ch[i]=(char)(v2+32);
				ch[ch.length-1-i]=(char)(v1-32);
			}else {
				
				ch[i]=ch[ch.length-1-i];
				ch[ch.length-1-i]=temp;
			}
			
			
		}
		return new String(ch);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println(reverse("Hello World"));
		System.out.println(reverse("gnirtS esrever ma I"));
		
		
		System.out.println(lowerCase("WelCome EveryOnE"));
		
		System.out.println(casesensitiveReverse("HellO World"));
		System.out.println(casesensitiveReverse("JoHn SnoW"));
		System.out.println(casesensitiveReverse("CAT tom"));
		
		
		
	}
}
