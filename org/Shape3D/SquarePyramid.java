package Shape3D;

// Class SquarePyramid. Implements Shape3D
// Represents a pyramid with a square as its base.
public class SquarePyramid implements Shape3D {

	private double length, height;
	
	public SquarePyramid(double length, double height)
	{
		this.length = length;
		this.height = height;
	}
	
	public double getArea()
	{
		double sl = Math.sqrt(Math.pow(this.height, 2.0) + Math.pow(this.length/2, 2.0));
		return (2*sl*this.length + Math.pow(this.length, 2.0));
	}

	public double getVolume(){
		return (Math.pow(this.length, 2.0) * this.height)/3;
	}

	public String toString(){
		
		StringBuilder classinfo = new StringBuilder();
		classinfo.append("For this square pyramid the base has the length");
		classinfo.append(this.length);
		classinfo.append("and the height =");
		classinfo.append(this.height);
		return classinfo.toString();
	}

	public boolean equals(Object obj){
		if(!(obj instanceof SquarePyramid))
			return false;
		
		SquarePyramid tObj = (SquarePyramid)obj;
		if (this.length==tObj.length && this.height == tObj.height)
			return true;
		else 
			return false;
		
	}
}

