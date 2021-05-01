package kh.oop1.day02.exam;

import java.util.*;

public class ImportExam {
	//java.lang
	public double piExam() {
		double d = Math.PI;
		return d;
		
	}
	
	//java.util Random class
	
	public int randomExam(int ran) {
		Random r = new Random();
		int i = r.nextInt(ran);
		return i;
	}
	
	
	//java.util Arrays class sort 메소드 (배열 정렬)
	public String sortExam() {
		int[] arr= {1,8,3,2,9};
		Arrays.sort(arr);
		
		return Arrays.toString(arr); 
	}

}
