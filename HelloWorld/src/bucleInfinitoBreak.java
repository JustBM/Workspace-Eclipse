
public class bucleInfinitoBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 3;
		System.out.printf("El numero a es %d", a).println();
		while(true) {
			a++;
			System.out.printf("El numero a es %d", a).println();
			if (a == 6000) {
				break;
			}
		}
	}

}
