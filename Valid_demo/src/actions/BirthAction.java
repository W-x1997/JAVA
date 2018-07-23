package actions;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class BirthAction extends ActionSupport {

	private Map<Integer, String> birthyearmap;

	public Map<Integer, String> getBirthyearmap() {
		return birthyearmap;
	}
    public void setBirthyearmap(Map<Integer, String> birthyearmap) {
		this.birthyearmap = birthyearmap;
	}

    public  BirthAction()
	{
		this.birthyearmap = new HashMap();
		
		for(int i = 1900; i<= 2017; i++)
		{
			this.birthyearmap.put(new Integer(i), i + "");
		}
	}
}
