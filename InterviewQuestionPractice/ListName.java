package InterviewQuestionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListName {
     public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Abhinash");
        names.add("Abhishek");
        names.add("Atul");
        names.add("Abhinash");
        for (int i =0 ; i< names.size()-1; i++){
           for (int j = i+1; j< names.size();j++){
             if (names.get(i).equals(names.get(j)))
            {
                System.out.println("Duplicate Names: "+names.get(i));
            }
           }
        }

    }
}
