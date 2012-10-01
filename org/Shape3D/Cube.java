package Shape3D;


// Class Cube, subclass of RectangularPrism
// Represents a perfect cube.


public class Cube extends RectangularPrism{
	public Cube(double sideLength)
	{
		super(sideLength, sideLength, sideLength);
	}

	public String toString()
	{
		StringBuilder classinfo = new StringBuilder();
		classinfo.append("For this cube all sides = ");
		classinfo.append(super.length);
		return classinfo.toString();
	}

	public boolean equals(Object obj){
			
		if(!(obj instanceof Cube))
			return false;
		
		Cube RpObj = (Cube) obj;
		
		if (this.length == RpObj.length)
			return true;
		else
			return false;
	}

}
