package geometries;

public abstract class RadialGeometry implements Geometry {
	double _radius;

	public RadialGeometry(double _radius) {
		super();
		this._radius = _radius;
	}

	public double get_radius() {
		return _radius;
	}

	
}
