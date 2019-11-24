package primitives;

public class main {
public static void main(String[] args) {
	Coordiante a = new Coordiante(1);
	Coordiante b = new Coordiante(2);
	Coordiante c = new Coordiante(3);
	Point3D PA = new Point3D(a,b,c);
	Vector A = new Vector(PA);
	System.out.println(A.toString());
}
}
