package Collections.Streams;

import java.util.*;

public class FilterDuplicateNamesDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ayush","Subhash","Ayush","Aryan","Subhash"));
       
        List<String> uniqueNames = names.stream()
             .distinct()
             .toList();

             for (String unique : uniqueNames) {
                names.remove(unique);
             }
             System.out.println(names);
            
    }

    
}
