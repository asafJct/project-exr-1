package primitives;

public class Ray {
	
	private Vector vec;
	
	private Vector direction;

	public Ray(Vector _vec, Vector _direction) {
		vec = _vec;
		direction =_directon;
	}
	
//  #region getters
	public Vector getVector() {
		return vec;
	}

	public Vector getDirection() {
		return direction;
	}
//  #endRegion.
	
	
	@Override
	public boolean equals(Object other) {
		if (p.equals(other) == true) {
			if (vec.equals(other) == true) {
				return true;
			}
		}
		return false;
	}
	
//
	@Override
	public String toString() {
		return 
	}
}
