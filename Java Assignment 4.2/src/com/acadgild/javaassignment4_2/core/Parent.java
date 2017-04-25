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
public class Parent {
	
		
		/**
		 * Method 1.
		 */
		private void method1(){
		 System.out.println ("Parent's method1()");     // this message should be printed.
		}
		
		/**
		 * Method 2.
		 */
		public void method2() {
		 System.out.println ("Parent's method2()");    // this message should be printed.
		method1();
		}
		
	    }


