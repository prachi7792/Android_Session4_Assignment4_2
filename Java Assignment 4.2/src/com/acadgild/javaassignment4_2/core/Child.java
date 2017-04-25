/**
 * this for files
 * @author Acer
 * 
 * @date Apr 25, 2017
 */
package com.acadgild.javaassignment4_2.core;

/**
 * this for classes
 */

	class Child extends Parent {  	      //here we are creating a subclass of the class extending
		 public void method1() {
		 System.out.println ("Child's method1()");
		} 
		
		public static void main(String args[]) { // calling main method
		Parent p = new Child();          //It is called as up-casting. Object 'p' has limited access. It can only access parent class properties, because p is a reference to parent class.
		p.method2();
		}}


	// correct option C


	// Explanation: It would call the child method if it overrode the parent method. But it doesn't, since the parent method is private, and thus can't be overridden.

