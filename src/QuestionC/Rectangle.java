package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	if(int newx , int newy <0)
		throw new ILLEGALRectangle("x and y cannot be negative numbers")
		else
			System.out.println(Invalid)
	
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
