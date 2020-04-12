package com.perscholas.object_class_variable2;

import oppsexerSlack.Classone;

public class VarriableApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classone classOne = new Classone();
		// here string1 is default & string3 is Protected AccesModifiers . so it cant be accesable outside of the package.
		// string2 is public it can be accesed inside that project.
		//System.out.println(classOne.string1+classOne.string2+classOne.string3);
		//System.out.println(classOne.string4);
		System.out.println(classOne.getString4());

	}

}
