public class Test06{
	public static void main(String[] args){
		// int[] a=new int[5];
		// a[0]=1;
		// a[1]=3;
		// a[2]=4;
		// a[3]=2;
		// a[4]=0;
		int a[]={9,3,8,3,2};
		for(int i=0;i<a.length-1;i++){
			{
				for(int j=0;j<a.length-1-i;j++)
				{
					if(a[j]>a[j+1]){
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}

