
public class PrAp0001a {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		while (x < 5)
			y += ++x;
			// x++;
		System.out.println( "" + y + x);

	}

}

/*
x=1
y=1

x<5 -> y=y(x+1)

y=1+2=3			->	x=2
y=3+3=6			->	x=3
y=6+4=10		->	x=4
y=10+5=15		->	x=5
*/

