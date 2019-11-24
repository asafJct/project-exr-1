package geometries;

import java.util.List;

import primitives.*;

public class Triangle extends Polygon {
	Plane _plane;
	Point3D p1;
	Point3D p2;
	Point3D p3;
//c'ctor.
	public Triangle(Point _p1 ,Point _p2, Point _p3) {
		p1 = _p1;
		p2 = _p2;
		p3 = _p3;
		//Initialize a list of points .
		List<Point3D> _points =Lists.newArrayList(_p1, _p2,_p3);
		super(_points);
	}

	@Override
	public Vector getNormal(Point3D p) {
		return null;
	}
}
