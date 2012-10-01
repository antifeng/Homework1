package Shape3D;

// Class RectangularPrism. Implements Shape3D
// Represents a three-dimensional rectangular shape.
public class RectangularPrism implements Shape3D {
	protected double length;
	protected double width;
	protected double height;

	public RectangularPrism(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double getVolume()
	{
		return length*width*height;
	}
	
	public double getArea()
	{
		return 2*(length*width + length*height + width*height);
	}
	
	public String toString() {
		StringBuilder classinfo = new StringBuilder();
		classinfo.append("For this rectangular prism the base has the length =");
		classinfo.append(this.length);
		classinfo.append("and the width = ");
		classinfo.append(this.length);
		classinfo.append("The height of the prism = ");
		classinfo.append(this.length);
		return classinfo.toString();
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof RectangularPrism))
			return false;
		
		RectangularPrism RpObj = (RectangularPrism) obj;
		
		if (this.length == RpObj.length && this.height==RpObj.height && this.width==RpObj.width)
			return true;
		else
			return false;
	}
}