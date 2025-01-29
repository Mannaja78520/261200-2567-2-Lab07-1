import java.util.List;
import java.util.Map;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World! " + args[2] + " " + args[3]);

        List<String> aList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            aList.add(args[i]);
        }
        System.out.println(aList);
        Collections.shuffle(aList, new Random());
        System.out.println(aList);

        Set<String> hSet = new HashSet<>();
        hSet.add("OOP");
        hSet.add("GG");
        hSet.add("EZ");
        hSet.add("F");
        hSet.add("not");
        hSet.add("drop");
        hSet.add("GG");
        hSet.add("GG");
        hSet.add("GG");
        hSet.remove("GG");
        System.out.println(hSet);

        SortedSet<String> sSet = new TreeSet<>();
        sSet.add("OOP");
        sSet.add("GG");
        sSet.add("EZ");
        sSet.add("F");
        sSet.add("not");
        sSet.add("drop");
        sSet.add("GG");
        sSet.add("ZZZ");
        sSet.add("123");
        sSet.add("กขค");
        System.out.println(sSet);

        Stack<String> stackko = new Stack<>();
        stackko.push("a");
        stackko.push("b");
        stackko.push("c");
        System.out.println(stackko);
        System.out.println(stackko.pop());
        System.out.println(stackko);

        Map<String, Color> favoritesColors = new HashMap<String, Color>();
        favoritesColors.put("Juliet", Color.BLUE);
        favoritesColors.put("Romeo", Color.GREEN);
        favoritesColors.put("Adam", Color.RED);
        favoritesColors.put("Eve", Color.BLUE);
        favoritesColors.put("Robert", Color.BLACK);
        favoritesColors.put("Mark", Color.WHITE);
        favoritesColors.put("Pedro", Color.YELLOW);
        favoritesColors.put("Cole", Color.BLUE);

        // Print all keys and values in the map
        Set<String> keySet = favoritesColors.keySet();
        for (String key : keySet) {
            Color value = favoritesColors.get(key);
            System.out.println(key + " " + value);
        }   

        Map<String, Color> favoritesColors2 = new TreeMap<String, Color>();
        favoritesColors2.put("Juliet", Color.BLUE);
        favoritesColors2.put("Romeo", Color.GREEN);
        favoritesColors2.put("Adam", Color.RED);
        favoritesColors2.put("Eve", Color.BLUE);
        favoritesColors2.put("Robert", Color.BLACK);
        favoritesColors2.put("Mark", Color.WHITE);
        favoritesColors2.put("Pedro", Color.YELLOW);
        favoritesColors2.put("Cole", Color.BLUE);

        // Print all keys and values in the map
        Set<String> keySet2 = favoritesColors2.keySet();
        for (String key : keySet2) {
            Color value = favoritesColors2.get(key);
            System.out.println(key + " " + value);
        }   
    }   
}
