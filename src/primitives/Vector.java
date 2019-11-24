package primitives;

import java.lang.Math;

public class Vector {

	Point3D vec;

	static Point3D ZeroVec = new Point3D(Coordiante.ZERO, Coordiante.ZERO, Coordiante.ZERO);

	public Vector(Point3D vec) {
		if (vec.equals(Vector.ZeroVec))
			throw new IllegalArgumentException("invalid - vector zero");
		this.vec = vec;
	}

	public Point3D getVec() {
		return vec;
	}

	@Override
	public boolean equals(Object other) {
		if (vec.equals(other) == true) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Vector [vec=" + vec.toString() + "]";
	}

	

	public Vector Add(Vector other) {
		Point3D temp;
		Vector OtherVec;
		temp = new Point3D(this.vec.getX().add(other.getVec().getX()), this.vec.getY().add(other.getVec().getY()),
				this.vec.getZ().add(other.getVec().getZ()));
		OtherVec = new Vector(temp);
		return OtherVec;
	}

	public Vector Sub(Vector other) {
		Point3D temp;
		Vector OtherVec;
		temp = new Point3D(this.vec.getX().subtract(other.getVec().getX()),
				this.vec.getY().subtract(other.getVec().getY()), this.vec.getZ().subtract(other.getVec().getZ()));
		OtherVec = new Vector(temp);
		return OtherVec;
	}

	public double dotProduct(Vector other) {
		double temp;
		temp = (this.vec.getX().multiply(other.getVec().getX()).get()
				+ this.vec.getY().multiply(other.getVec().getY()).get()
				+ this.vec.getZ().multiply(other.getVec().getZ()).get());
		return temp;
	}

	public Vector crossProduct(Vector other) {
		Point3D temp;
		Vector OtherVec;
		Coordiante x;
		Coordiante y;
		Coordiante z;
		x = this.vec.getY().multiply(other.getVec().getZ())
				.subtract(this.getVec().getZ().multiply(other.getVec().getY()));
		y = this.vec.getZ().multiply(other.getVec().getX())
				.subtract(this.getVec().getX().multiply(other.getVec().getZ()));
		z = this.vec.getX().multiply(other.getVec().getY())
				.subtract(this.getVec().getY().multiply(other.getVec().getX()));
		temp = new Point3D(x, y, z);
		OtherVec = new Vector(temp);
		return OtherVec;
	}

	
	public double length() {
		return Math.sqrt(lengthSQ());
	}

	public Vector scale(double num) {
		Point3D temp;
		Vector OtherVec;
		temp = new Point3D(this.vec.getX().scale(num), this.vec.getY().scale(num), this.vec.getZ().scale(num));
		OtherVec = new Vector(temp);
		return OtherVec;
	}
//
	public void newNormal() {
		
		double temp; // Variable 
		temp = 1 / sqrt(this.lengthSQ());// temp = 1 /(size of vector )
		
		Vector OtherVec;
		OtherVec = this.scale(temp);
		this.vec = OtherVec.vec;
	}
	
//Returns the size of the vector square.
	public double lengthSQ() {
		double length = (Math.pow(this.vec.getX().get(), 2) + Math.pow(this.vec.getY().get(), 2)
				+ Math.pow(this.vec.getZ().get(), 2));
		return length;
	}

	
	public Vector Normal() {
		Vector OtherVec = new Vector(this.vec);
		OtherVec.newNormal();
		return OtherVec;
	}

}
