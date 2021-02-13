class RecursiveFibonacci{
	int x;
	int fibo(int a){
		if(a==0) return 0;
		else if(a==1) return 1;
		else return(fibo(a-1)+fibo(a-2));
	}
	public static void main(String []args){
		RecursiveFibonacci fibo1= new RecursiveFibonacci();
		fibo1.x=Integer.parseInt(args[0]);
		for(int i=0;i<fibo1.x;i++)
		{
			System.out.println(fibo1.fibo(i));
		}
		System.out.println("Change for dev branch"); 
	}
}