package geometries;

import primitives.*;

public class Tube extends RadialGeometry {

	public Tube(double _radius) {
		super(_radius);
	}

	Ray _axisRay;

	@Override
	public Vector getNormal(Point3D p) {
		return null;
	}

}
