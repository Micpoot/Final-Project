public class Sprite extends Rectangle
{
	private int height; //height
	private int width; //in pixels
	private int xPos;
	private int yPos;
	public Sprite(int x, int y, int h,int w)
	{
		xPos = x;
		yPos = y;
		height = h;
		width = w;

	}
	
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
}
