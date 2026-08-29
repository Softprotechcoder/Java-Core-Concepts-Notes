package Collections;

import java.util.Iterator;

public class ManualIterator {
    public static void main(String[] args) {
        String[] names = {"Ayush","Sanjana","Aryan","Rohit"};
        NameContainer nameContainer = new NameContainer(names);

        Iterator<String> it = nameContainer.iterator();
        
            while(it.hasNext()){
                System.out.println(it.next());
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
       return new NameContainerIterator();
    }
    private class NameContainerIterator implements Iterator<String>{

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
}
