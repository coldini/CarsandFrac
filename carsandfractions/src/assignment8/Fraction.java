package assignment8;
public class Fraction{
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
		simplify();
	}
	public int getNum() {
		return numerator;
	}
	
	public int getDenom() {
		return denominator;
	}
	
	public void setNum(int n) {
		numerator = n;
	}
	
	public void setDenom(int d) {
		denominator = d;
	}
	
	public Fraction add(Fraction a) {
		int newNumerator = numerator * a.getDenom() + denominator* a.getNum();
		int newDenom = denominator * a.getDenom();
		return new Fraction(newNumerator, newDenom);
		
	}
	
	public int gcf(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcf(b, a%b);
		
	}
	
	public void simplify() {
		int dividable= gcf(numerator, denominator);
		numerator /= dividable;
		denominator /= dividable;
	}
	
	public boolean equals(Fraction a) {
		if(numerator == a.getNum() && denominator == a.getDenom()) {
			return true;
		}else {
			return false;
		}
		
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
}