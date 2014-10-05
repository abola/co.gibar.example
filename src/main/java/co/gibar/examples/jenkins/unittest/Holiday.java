package co.gibar.examples.jenkins.unittest;

public class Holiday {

	static String[] weekend = {"Fri", "Sun"};
	
	public Boolean isHoliday(String today){
		for(String holiday: weekend){  
			if ( today == holiday ) return true;
		}
		return false;
	}
}
