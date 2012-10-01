package Shape3D;
// Class Cylinder, subclass of CircularShapeWithHeight
// Represents a cylinder shape.
public class Cylinder extends CircularShapeWithHeight {

	public Cylinder(double radius, double height)
	{
		super(radius, height);
	}
	
	public double getArea(){
		return (2*PI*this.radius*height + 2*PI*Math.pow(this.radius, 2.0));
	}

	public double getVolume(){
		return ( height * PI * Math.pow(this.radius, 2.0));
	}
	
	public boolean equals(Object obj){
		
		if(!(obj instanceof Cylinder))
			return false;
		
		Cylinder RpObj = (Cylinder) obj;
		
		if ( super.radius == RpObj.radius && this.height==RpObj.height)
			return true;
		else
			return false;
	}

	public String toString()
	{
		StringBuilder classinfo = new StringBuilder();
		classinfo.append("For this cylinder the radius =");
		classinfo.append(super.radius);
		classinfo.append("and the height =");
		classinfo.append(super.height);
		return classinfo.toString();
	}

	
}