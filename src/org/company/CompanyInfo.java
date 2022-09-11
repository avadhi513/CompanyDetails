package org.company;

public class CompanyInfo {
	
	private void companyName(int sec) {
		System.out.println(sec);		
		}
	
	private void companyName(int sec, int min) {
		System.out.println(sec+ " "+min);		
		}
	
	private void companyName(int sec, int min, int hr) {
		System.out.println(sec+ " "+min + " "+hr);		
		}
	
	private void companyName(int sec, int min, int hr, int day) {
		System.out.println(sec+ " "+min + " "+hr +" "+day);		
		}
	
	private void companyName(int sec, int min, int hr, int day, int week) {
		System.out.println(sec+ " "+min + " "+hr +" "+day+" "+week);		
		}
	
	private void companyName(int sec, int min, int hr, int day, int week, int mon) {
		System.out.println(sec+ " "+min + " "+hr +" "+day+" "+week +" "+mon);		
		}
	
	private void companyName(int sec, int min, int hr, int day, int week, int mon, int yr) {
		System.out.println(sec + " "+min + " "+hr +" "+day+" "+week +" "+mon +" "+yr);		
		}
		
	public static void main (String[] args) {
		CompanyInfo ci = new CompanyInfo();
		ci.companyName(4);
		ci.companyName(4, 5);
		ci.companyName(4, 5, 6);
		ci.companyName(4, 5, 6, 7);
		ci.companyName(4, 5, 6, 7, 8);
		ci.companyName(4, 5, 6, 7, 8, 9);
		ci.companyName(4, 5, 6, 7, 8, 9, 10);
		
	}

}
