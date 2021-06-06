import java.util.HashMap;

public class hashmap {
  public static void main(String[] args) {
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities); 
    System.out.println(capitalCities.size());

// get take value
    System.out.println(capitalCities.get("England")); 

// remove item
    capitalCities.remove("England");
    System.out.println(capitalCities); 
//clear every thing
    // capitalCities.clear();
    System.out.println(capitalCities); 

    System.out.println(capitalCities.size());


    for (String i : capitalCities.keySet()) {
        System.out.println(i);
      }
      
  }

  

}

//it works on key mapping , here the key is city and the value is cityName


