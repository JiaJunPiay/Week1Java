class SingleNumber
{
	public int findSingleNumber(int a1[]){
		int ans = 0;
		for(int i=0; i< a1.length; i++) {
			ans = ans ^ a1[i];
		}
		return ans;
	}

}

class testClass {
	public static void main(String args[]) {
		SingleNumber sn = new SingleNumber();
		int[] a1 = {1,2,1};
		sn.findSingleNumber(a1);
	}

	
}
