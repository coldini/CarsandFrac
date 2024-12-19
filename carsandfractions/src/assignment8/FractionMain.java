package assignment8;

public class FractionMain{
	//Colden Jeanmonod
			//04/2/2024
			//Assignment 8b Fractions
			//
			//This program runs through a brief demo of my fractions work and tests them briefly 
			//

	public static void main(String[] args) {
		Fraction fourEight = new Fraction(4,8);
		Fraction threefourt = new Fraction(3,4);
		
		Fraction half = new Fraction(1, 2);
		half.setNum(3);
		half.setDenom(5);
		System.out.println(half);
		Fraction third = new Fraction(1,3);
		
		Fraction twosixth = new Fraction(2,6);
		
		System.out.println(twosixth);
		System.out.println(threefourt);
		
		System.out.println(third.equals(twosixth));
		System.out.println(fourEight.equals(half));
		
		half.setNum(5);
		half.setDenom(3);
		System.out.println(half);
		
		
		
	
		
		System.out.println(third.add(threefourt));
		System.out.println(third.add(fourEight));
		System.out.println(third.add(twosixth));
		
		
		
		
	}
}