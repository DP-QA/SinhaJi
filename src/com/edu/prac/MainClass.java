package com.edu.prac;

public class MainClass {
	public static void main(String[] args) {
		ParentClass parent = new ChildClass();
		ChildClass child = new ChildClass();
		
		parent.display();
		child.display();
	}
}
