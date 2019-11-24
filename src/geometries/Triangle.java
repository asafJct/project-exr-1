package geometries;

import java.util.List;

import primitives.*;

public class Triangle extends Polygon {
	Plane _plane;
	Point3D _p1;
	Point3D _p2;
	Point3D _p3;

	public Triangle(List<Point3D> _points) {
		super(_points);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vector getNormal(Point3D p) {
		return null;
	}
}
