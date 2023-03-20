import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;

public class ExerciseC2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Map<String, Integer> mapC2 = new HashMap<String, Integer>();
            Map<String, Integer> remove = new HashMap<String, Integer>();


            for(int i = 1; i <= 10; i++){
                System.out.println("Enter Name: ");
                String name = scan.next();

                System.out.println("Enter Value: ");
                Integer val = scan.nextInt();

                mapC2.put(name, val);
            }

            System.out.println("Find a name in the hash map: ");
            String find = scan.next();
            if(mapC2.containsKey(find))
                System.out.printf("The value of %s is %d\n", find, (Integer)mapC2.get(find));
            else{
                System.out.println("Key not found");
            }
            
            
            System.out.println("Looping with enhanced for-loop");

            for (Object key : mapC2.keySet()) {
                System.out.printf("%s : %d | ", key,mapC2.get(key));
                
            }

            System.out.println();
            System.out.println("Looping with iterator");
            Iterator<String> iterator = mapC2.keySet().iterator();
            
            

            while(iterator.hasNext()){
                Object sec_key = iterator.next();

                System.out.printf("%s : %d | ", sec_key, mapC2.get(sec_key));
            }

            for(String ke : mapC2.keySet()){
                if((mapC2.get(ke) % 2) == 0)
                    remove.put(ke, mapC2.get(ke));
            }

            Set<String>removeKeys = remove.keySet();
            
            mapC2.keySet().removeAll(removeKeys);

            System.out.println();

            Iterator<String> iterator2 = mapC2.keySet().iterator();

            System.out.printf("After removal: ");

            while(iterator2.hasNext()){
                Object third_key = iterator2.next();

                System.out.printf("%s : %d | ", third_key, mapC2.get(third_key));
            }
        }
        
    }
    }

