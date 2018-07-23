import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Remove_element {

	
	 public int removeElement(int[] nums, int val) {  
	        int result = 0;  
	        int index = 0;  
	        while(index < nums.length)  
	        {  
	            if(nums[index] != val)  
	                nums[result++] = nums[index];  
	            index++;  
	        }  
	        return result;  
	    }  
	  
}
