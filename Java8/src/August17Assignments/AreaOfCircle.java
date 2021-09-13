package August17Assignments;

interface Area{
	double pi =3.14;
	void print(int radius);
}

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = (radius)->{
			double are = radius*radius*3.14;
			System.out.println(are);
		};
		a.print(10);

	}

}
