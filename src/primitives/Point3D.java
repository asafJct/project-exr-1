package primitives;

import java.lang.Math;

public class Point3D {
	private Coordiante x;
	private Coordiante y;
	private Coordiante z;

	public Point3D(Coordiante x, Coordiante y, Coordiante z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public String toString() {
		return "Point3D [x=" + x.toString() + ", y=" + y.toString() + ", z=" + z.toString() + "]";
	}

	public Coordiante getX() {
		return x;
	}

	public Coordiante getY() {
		return y;
	}

	public Coordiante getZ() {
		return z;
	}

	@Override
	public boolean equals(Object other) {
		if (x.equals(other) == true) {
			if (y.equals(other) == true) {
				if (z.equals(other) == true)
					return true;
			}
		}
		return false;
	}

	public Vector subtruct(Point3D a) {
		Point3D temp;
		Vector vec;
		temp = new Point3D(a.getX().subtract(this.getX()), a.getY().subtract(this.getY()),
				a.getZ().subtract(this.getZ()));
		vec = new Vector(temp);
		return vec;
	}

	public Point3D add(Vector other) {
		Point3D temp;
		temp = new Point3D(this.getX().add(other.getVec().getX()), this.getY().add(other.getVec().getY()),
				this.getZ().add(other.getVec().getZ()));
		return temp;
	}

	public double distanceSQ(Point3D other) {
		double temp = Math.pow(this.getX().subtract(other.getX()).get(), 2)
				+ Math.pow(this.getY().subtract(other.getY()).get(), 2)
				+ Math.pow(this.getY().subtract(other.getY()).get(), 2);
		return temp;
	}

	public double distance(Point3D other) {
		return Math.sqrt(distanceSQ(other));
	}

}
