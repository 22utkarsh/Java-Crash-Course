package com.exception;
class Word{
	public int Number;
	public String st;
	public Word(int Number,String st) {
		this.Number=Number;
		this.st=st;
	}
}

class Vowels{
	public String CheckWord(Word word) throws VowelException {
		if(word.Number>5) {
			throw new VowelException("Vowels limit exceeded");
		}
		int c=0;
		for(int i=0;i<word.st.length();i++) {
			char ch=word.st.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				c++;
			}
		}
		if(c!=word.Number) {
			throw new VowelException("Number mismatched");
		}
		return "Can be finalized";
	}
	
	
	public String FinalizeWord(Word word) {
		try {
			this.CheckWord(word);
			return "Successful";
		}catch(VowelException e) {
			return "Failed";
		}catch(Exception e) {
			return "Other Exception";
		}
	}
	
}

class VowelException extends Exception{
	public VowelException(String msg) {
		super(msg);
	}
}

public class Main {
	public static void main(String[] args) {
		Word w = new Word(6,"AePLK");
		Vowels v =new Vowels();
		try {
//			System.out.println(v.FinalizeWord(w));
			System.out.println(v.CheckWord(w));
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
