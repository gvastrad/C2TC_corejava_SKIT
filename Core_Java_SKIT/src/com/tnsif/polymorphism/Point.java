//Program to demonstrate constructor overloading - Compile Time Polymorphism
package com.tnsif.polymorphism;

public class Point {
 private float x;
 private float y;
 
public Point() {
	this.x=0;
	this.y=0;
}
public Point(float x) {
	this.x = x;
	this.y= x;
}
public Point(float x, float y) {
	this.x = x;
	this.y = y;
}
@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
}
}
