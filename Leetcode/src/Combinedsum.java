import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinedsum {
	 public List<List<Integer>> combinationSum(int[] candidates, int target) {
		 List<List<Integer>> res = new ArrayList<>();  
		Arrays.sort(candidates);
		ArrayList <Integer>num=new ArrayList<Integer>();
		for(int i=0;i<candidates.length;i++){
			num.add(candidates[i]);
		}
	   int i=0,j=candidates.length-1;
		while(i<candidates.length){
		   int k=i+1;
		   
			
		}
		 
		 return res;
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
