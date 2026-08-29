package Collections;

import java.util.Iterator;

public class ManualIterator {
    public static void main(String[] args) {
        String[] names = {"Ayush","Sanjana","Aryan","Rohit"};
        NameContainer nameContainer = new NameContainer(names);

        // Iterator<String> it = nameContainer.iterator();
        
        //     while(it.hasNext()){
        //         System.out.println(it.next());
        //     }
        for (String name : nameContainer){
            System.out.println(name);
        }
    }
}
class NameContainer implements Iterable<String>{
    private String[] names;
    private int size;

    public NameContainer(String[] names){
        this.names = names;
        this.size = this.names.length;
    }

    @Override
    public Iterator<String> iterator() {

      
        // return new NameContainerIterator(); // here we are returning the object of internal class which implements iterator interface.

          /* Used Anonymous class removed NameContainerIterator class */
       return new Iterator<String>(){

         int position = 0;

        @Override
        public boolean hasNext() {
          return position < size;
        }

        @Override
        public String next() {
           return names[position++];
        }

       };


    }

    /* 
     private class NameContainerIterator implements Iterator<String>{
    
    // here as we know this internal class is used once it just overrides method of iterator interface.
    // and as we know if the class is used once we can replace it with anonymous class.
    
        int position = 0;

        @Override
        public boolean hasNext() {
          return position < size;
        }

        @Override
        public String next() {
           return names[position++];
        }
        
    }
    */
   
}
