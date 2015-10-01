package kr.ac.embeded.kookmin.shape;

public class Rectangle extends Shape {
	private int w;
	private int h;
	
	public Rectangle(Point center, int w, int h){
		this.w = w;
		this.h = h;
		this.center = center;
	}
	
	public int getHeight() {
		return h;
	}
	
	public int getWidth() {
		return w;
	}
	
	public Rectangle getBounds()
	{
		return this;
	}
	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Rectangle";
	}
}
