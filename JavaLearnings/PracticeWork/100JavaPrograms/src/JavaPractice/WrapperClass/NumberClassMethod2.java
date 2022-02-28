package JavaPractice.WrapperClass;

public class NumberClassMethod2{
	public static void main(String args[]){
		Integer x =5;
		System.out.println(x.compareTo(3));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(8));
	}
	
}

//In this method the object is compared to argument, the argument should be of same type

// If the Integer is equal to the argument then 0 is returned
// If the Integer is less than the argument then -1 is returned
// If the Integer is greater than the argument then 1 is returned
/*
Number Methods:
Here is the list of the instance methods that all the subclasses of the Number class implement:
1
xxxValue()
Converts the value of this Number object to the xxx data type and returned it.
2
compareTo()
Compares this Number object to the argument.
3
equals()
Determines whether this number object is equal to the argument.
4
valueOf()
Returns an Integer object holding the value of the specified primitive.
5
toString()
Returns a String object representing the value of specified int or Integer.
6
parseInt()
This method is used to get the primitive data type of a certain String.
7
abs()
Returns the absolute value of the argument.
8
ceil()
Returns the smallest integer that is greater than or equal to the argument. Returned as a double.
9
floor()
Returns the largest integer that is less than or equal to the argument. Returned as a double.
10 
rint()
Returns the integer that is closest in value to the argument. Returned as a double.
11 
round()
Returns the closest long or int, as indicated by the method's return type, to the argument.
12 
min()
Returns the smaller of the two arguments.
13 
max()
Returns the larger of the two arguments.
14 
exp()
Returns the base of the natural logarithms, e, to the power of the argument.
15 
log()
Returns the natural logarithm of the argument.
16 
pow()
Returns the value of the first argument raised to the power of the second argument.
17 
sqrt()
Returns the square root of the argument.
18 
sin()
Returns the sine of the specified double value.
19 
cos()
Returns the cosine of the specified double value.
20 
tan()
Returns the tangent of the specified double value.
21 
asin()
Returns the arcsine of the specified double value.
22 
acos()
Returns the arccosine of the specified double value.
23 
atan()
Returns the arctangent of the specified double value.
24 
atan2()
Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.
25 
toDegrees()
Converts the argument to degrees
26 
toRadians()
Converts the argument to radians.
27 
random()
Returns a random number.


*/