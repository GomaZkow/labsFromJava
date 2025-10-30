package laba9;
import java.util.Map;
import java.util.HashMap;



public class Main {
    public static void main(String[] args) {
	Map<String,Student> sudents = new HashMap<>();
	
	sudents.put("Леха", new UnderGraduate("Леха",2));
	sudents.put("Лехан", new Graduate("Лехан","Микробиология"));
	sudents.put("Никита", new UnderGraduate("Никита",2));
	sudents.put("Матвей",new Graduate("Матвей","Квантовая механика"));
	
	
	
	for(String std : sudents.keySet()) {
	    System.out.println(std);
	}
	
	for (Student std : sudents.values() ) {
	    System.out.println(std);
	}
    }
    
    
    
}
