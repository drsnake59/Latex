public class TestTab {
	public static void main(String[] args) {
		int[] t1 = [1,2,3,4,5};
		int[] t2;
		
		t2=t1; //t1 et t2 referencent le meme tableau
		
		for(int i=0; i<t2.length; i++) {
			t2[i]++;
		}
		
		for(int i=0; i<t1.length; i++) {
			System.out.println("t1[" + i + "] = " t1[i]);
		}
	}
}
