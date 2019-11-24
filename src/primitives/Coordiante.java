package primitives;

import static primitives.Util.*;

public final class Coordiante {
	//private static final double EPSILON = 0.0000001;
	protected double _coord;

	public static Coordiante ZERO = new Coordiante(0.0);
	
	/********** Constructors ***********/
	public Coordiante(double coord) {
		// if it too close to zero make it zero
		_coord = alignZero(coord);
	}

	public Coordiante(Coordiante other) {
		_coord = other._coord;
	}

	/************** Getters/Setters *******/
	public double get() {
		return _coord;
	}

	/*************** Admin *****************/
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!(obj instanceof Coordiante)) return false;
		return usubtract(_coord, ((Coordiante)obj)._coord) == 0.0;
	}

	@Override
	public String toString() {
		return "" + _coord;
	}

	/************** Operations ***************/
	public Coordiante subtract(Coordiante other) {
		return new Coordiante(usubtract(_coord, other._coord));
	}

	public Coordiante add(Coordiante other) {
		return new Coordiante(uadd(_coord, other._coord));
	}
	
	public Coordiante scale(double num) {
		return new Coordiante(uscale(_coord, num));
	}
	
	public Coordiante multiply(Coordiante other) {
		return new Coordiante(uscale(_coord, other._coord));
	}
	
}
