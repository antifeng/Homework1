package Shape3D;
// Class Sphere. Implements Shape3D
// Represents a perfect sphere.

import java.lang.Math;

public class Sphere implements Shape3D {

	private double radius;
	public static final double PI = 3.14159;

	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (4 * PI * Math.pow(this.radius, 2.0));
	}

	public double getVolume() {
		return (4 * PI * Math.pow(this.radius, 3.0) / 3);
	}

	public String toString() {
		StringBuilder classinfo = new StringBuilder();
		classinfo.append("The radius of this sphere =");
		classinfo.append(this.radius);
		return classinfo.toString();
	}

	public boolean equals(Object obj) {

		if (!(obj instanceof Sphere))
			return false;

		Sphere SpObj = (Sphere) obj;

		if (this.radius == SpObj.radius)
			return true;
		else
			return false;

	}

}