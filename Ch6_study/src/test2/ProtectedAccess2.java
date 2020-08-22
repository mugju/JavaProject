package test2;

import test1.ProtectedData;

public class ProtectedAccess2 extends ProtectedData{
	public static void main(String args[]){
		ProtectedAccess2 pd = new ProtectedAccess2();
		
		System.out.println(pd.protectedVar);
	}
}