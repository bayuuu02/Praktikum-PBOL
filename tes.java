import java.util.HashMap;
import java.util.Map;

public class tes {

public static void main(String[] args) {
        Map<String, String> namaHero = new HashMap<>();
        namaHero.put("terizla", "fighter");
        namaHero.put("miya", "marksman");
        namaHero.put("roger", "assasin");
        namaHero.put("roger", "marksman");

        System.out.println(namaHero.get("roger"));

        for (String nama : namaHero.keySet()) {
            System.out.println(nama);
        }

        for (String role : namaHero.values()) {
            System.out.println(role);
        }
        
        for (Map.Entry<String, String> data : namaHero.entrySet()) {
            System.out.println("Hero: " + data.getKey() + ", Role: " + data.getValue());
        }
        
    }
}
