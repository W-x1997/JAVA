import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Letter_Combine_phone {
	List <String> result=new LinkedList<String>();  
	 String[] table = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	 private void helper(String[] table,int index,StringBuilder temp,String digits){
		 if(index==digits.length()){
			 if(temp.length()!=0)result.add(temp.toString());
		 }else{
			 String candidate=table[digits.charAt(index)-'0'];
			 for(int i=0;i<candidate.length();i++){
				 temp.append(candidate.charAt(i));
				 helper(table,index+1,temp,digits);
				 temp.deleteCharAt(temp.length()-1);
				  
			 }
			 
			 
		 }
		 
	 }
	
	
	 public List<String> letterCombinations(String digits) {
	     
	    
	     StringBuilder tmp=new StringBuilder();
	     helper(table,0,tmp,digits);
	     
	     return result;
	    }
	
	
}
