
public class SearchForRange {
	
	  public  int[] searchRange(int[] nums, int target) {
	      int res[]={-1,-1};
	      int start=0;
	      int end=nums.length-1;
	      int flag1=0;
	      int flag2=0;
	      if(nums.length==1)
              return new int[]{0,0};
		  while(start<end){
			  
			  if(flag1==0){
			  if(target>nums[start]){
				  start++;
			  }
			  else if(target==nums[start]){
				  flag1=1;
				  res[0]=start;
			  }
			  else{
				  flag1=1;
			  }
			  
			  }
			  
			  if(flag2==0){
				  if(target<nums[end]){
					 end--;
				  }
				  else if(target==nums[end]){
					  flag2=1;
					  res[1]=end;
				  }
				  else{
					  flag1=1;
				  }
				  
				  
			  }
              if(flag1==1&&flag2==1)
            	  break;
		  }
	      
	      return res;
	    }
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
		  int b[]={5,7,7,8,8,10};
		  int a[]=searchRange(b,8);
		  System.out.println(a);
		  System.out.println("!");
		}
	 
	  
	  
}
