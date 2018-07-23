
public class GetMinPath {

	static int Min(int a,int b){
		if(a<=b)
			return a;
		return b;
	}
	
	public static int getMinpath(int [][]arr){
		int sum=0;
		if(arr==null||arr.length==0){
			return 0;
		}
		
		int row=arr.length;
		int col=arr[0].length;
		int arr2[][]=new int[row][col];
        
		arr2[0][0]=arr[0][0];
		for(int i=1;i<row;i++){
		  arr2[0][i]=arr2[0][i-1]+arr[0][i];
		}
		
		for(int j=1;j<col;j++){
			arr2[j][0]=arr2[j-1][0]+arr[j][0];
		}
		
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				if(arr2[i-1][j]<=arr2[i][j-1]){
					System.out.println("("+(i-1)+","+j+")");
				}else{
					System.out.println("("+i+","+(j-1)+")");
				}
				arr2[i][j]=Min(arr2[i-1][j],arr2[i][j-1])+arr[i][j];
			}
		}
		
		System.out.println("("+(row-1)+","+(col-1)+")");
		return arr2[row-1][col-1];
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[][]={{1,4,3},{8,7,5},{2,1,5}};
      System.out.println("路径为：");
      System.out.println(getMinpath(arr));
     
	}

}
