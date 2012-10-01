package Shape3D;



public interface Shape3D {

	//get the area of the object
	public double getArea();

	//get the volume of the object
	public double getVolume();

	//overwrite the tostring method
	public String toString();
	
	public boolean equals(Object obj);
}