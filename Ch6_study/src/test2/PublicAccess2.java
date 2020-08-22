package test2;

import test1.PublicData;

public class PublicAccess2{
	public static void main(String args[]){
		PublicData pdd = new PublicData();
		
		System.out.println(pdd.publicVar);
	}
}