package collection;
import java.util.*;

public class Ques6Map {
	private Hashtable<String,String> ht=new Hashtable<>();
	
	public Hashtable<String,String> saveCountryCapital(String countryName,String capital){
		ht.put(countryName, capital);
		return ht;
	}
	public String getCapital(String countryName) {
		if(ht.containsKey(countryName)) {
			return ht.get(countryName);
		}else {
			return "not present";
		}
	}
	public String getCountry(String capitalName) {
		for(String s:ht.keySet()) {
			if(capitalName.equalsIgnoreCase(ht.get(s))) {
				return s;
			}
		}
		return null;
	}
	public HashMap<String,String> exchange(){
		HashMap<String,String> m2=new HashMap<>();
		for(String s:ht.keySet()) {
			m2.put(ht.get(s), s);
		}
		return m2;
	}
	public ArrayList<String> getcountries(){
		ArrayList<String> al=new ArrayList<>();
		for(String s:ht.keySet()) {
			al.add(s);
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques6Map obj=new Ques6Map();
		System.out.println(obj.saveCountryCapital("India","Delhi"));
		System.out.println(obj.saveCountryCapital("Japan","Tokoyo"));
		System.out.println(obj.saveCountryCapital("Germany","Berlin"));
		System.out.println(obj.getCapital("India"));
		System.out.println(obj.getCountry("Tokoyo"));
		System.out.println(obj.exchange());
		System.out.println(obj.getcountries());
	}

}