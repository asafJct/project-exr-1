package geometries;

import java.util.List;

import primitives.*;

public class Polygon implements Geometry {
	List<Point3D> _points;
	Plane _plane;

	public Polygon(List<Point3D> _points , plane) {
		this._points = _points;
		_plane = plane ;
	}

	public Vector getNormal(Point3D p) {
		return null;
	}
}
