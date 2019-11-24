package geometries;

import primitives.*;

public class Plane implements Geometry {

	Point3D _p;
	Vector _normal;

	public Plane(Point3D _p, Vector _normal) {
		super();
		this._p = _p;
		this._normal = _normal;
	}

	public Vector getNormal(Point3D p) {
		return null;
	}

}
