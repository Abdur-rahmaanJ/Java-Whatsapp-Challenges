public class CounterMain {
	public static void main(String[] args) {
		int[] A1 = {1,2,2,3,3,4,5};
		int[] A2 = new int[A1.length];
		for(int i = 0;i<A1.length;i++)
			if(++A2[A1[i]] >1)
				System.out.println(A1[i]);
	}

}
