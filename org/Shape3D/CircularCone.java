package Shape3D;


// Class CircularCone, subclass of CircularShapeWithHeight
// Represents cones with a circular base.
public class CircularCone extends CircularShapeWithHeight {
	
	public CircularCone(double radius, double height)
	{
		super(radius, height);
	}
	
	public double getArea(){
		return (PI*this.radius*Math.sqrt(Math.pow(this.radius, 2.0)+ Math.pow(this.height, 2.0)) );
	}

	public double getVolume(){
		return ( height * PI * Math.pow(this.radius, 2.0)/3);
	}
	
	public boolean equals(Object obj){
		
		if(!(obj instanceof CircularCone))
			return false;
		
		CircularCone RpObj = (CircularCone) obj;
		
		if ( super.radius == RpObj.radius && this.height==RpObj.height)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		StringBuilder classinfo = new StringBuilder();
		classinfo.append("For this circular cone the radius =");
		classinfo.append(super.radius);
		classinfo.append("and the height =");
		classinfo.append(super.height);
		return classinfo.toString();
	}
}