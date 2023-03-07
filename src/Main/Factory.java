package Main;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.List;

import Main.DriverP;

public class Factory{
	
	public static <T,Q> Map<String, ArrayList<Products>> Products(int option) {
		if (option.DriverP == 1) {
			return new HashMap<String, ArrayList<Products>>();
	}
		if (option.DriverP == 2) {
			return new TreeMap<String, ArrayList<Products>>();
		}
		if (option.DriverP == 3) {
			return new LinkedHashMap<String, ArrayList<Products>>();
		}
	}
	
	

}
