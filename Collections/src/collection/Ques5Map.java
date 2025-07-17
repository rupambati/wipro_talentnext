package collection;

import java.util.*;
public class Ques5Map {
	
	private TreeMap<String,String> tm=new TreeMap<>();
	public TreeMap<String,String> saveCountryCapital(String countryName,String capital){
		tm.put(countryName, capital);
		return tm;
	}
	public String getCapital(String countryName) {
		if(tm.containsKey(countryName)) {
			return tm.get(countryName);
		}else {
			return "not present";
		}
	}
	public String getCountry(String capitalName) {
		for(String s:tm.keySet()) {
			if(capitalName.equalsIgnoreCase(tm.get(s))) {
				return s;
			}
		}
		return null;
	}
	public HashMap<String,String> exchange(){
		HashMap<String,String> m2=new HashMap<>();
		for(String s:tm.keySet()) {
			m2.put(tm.get(s), s);
		}
		return m2;
	}
	public ArrayList<String> getcountries(){
		ArrayList<String> al=new ArrayList<>();
		for(String s:tm.keySet()) {
			al.add(s);
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ques5Map obj=new Ques5Map();
		System.out.println(obj.saveCountryCapital("India","Delhi"));
		System.out.println(obj.saveCountryCapital("Japan","Tokoyo"));
		System.out.println(obj.saveCountryCapital("Germany","Berlin"));
		System.out.println(obj.getCapital("India"));
		System.out.println(obj.getCountry("Tokoyo"));
		System.out.println(obj.exchange());
		System.out.println(obj.getcountries());

		
	}

}