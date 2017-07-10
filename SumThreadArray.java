package neel;

public class SumThreadArray extends Thread{

	private int lo,hi;
	private int[] arr;
	private int ans=0;
	public SumThreadArray(int[]arr,int hi,int lo)
	{
		super();
		this.lo=lo;
		this.hi=hi;
		this.arr=arr;
		}
	public void run() {
		for(int i=lo;i<hi;i++) {
			ans+=arr[i];
		}
	}
	public static int sum(int []arr) throws InterruptedException{
    int len=arr.length;
	int ans=0;
	SumThreadArray[]ts=new SumThreadArray[4];
	for(int i=0;i<4;i++)
	{
		SumThreadArray[]ts1=new SumThreadArray[4];
		for(int i1=0;i1<4;i1++) {
		ts1[i1]=new SumThreadArray(arr,(i1*len)/4,((i1+1)*len/4));
		 ts1[i1].start();
		}
	
	for(int i1=0;i1<4;i1++)
	{
		ts1[i1].join();
		ans+=ts1[i1].ans;
	}
	
	}
	return ans;
	}

public static void main(String args[]) throws InterruptedException {
	int[] arr=new int[100];
	for(int i=0; i<arr.length;i++)
	{
		arr[i]=i;
	}
	int sum=sum(arr);
	System.out.println("Sum:"+ sum);

}
}
