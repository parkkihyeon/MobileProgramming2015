package kr.ac.kookmin.shape;

public class Ellipse extends Shape // 타
{
	private int h, w ;
	
	public Ellipse(Point Center, int h , int w)
	{
		super(Center) ;
		this.h=h;
		this.w=w; 
	}
	
	public int getSemiMajorAxis()
	{
		return (h > w ? h/2 : w/2) ;
	}

	public int getSemiMinorAxis()
	{
		return (h < w ? h/2 : w/2) ;
	}
	
  public Rectangle getBounds()
    {
		return new Rectangle(center, w*2, h*2);
	}

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Ellipse";
	}
}