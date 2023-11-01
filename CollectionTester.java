import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CollectionTester implements CollectionTest{

    private Person person;
    private int size;
    public CollectionTester()
    {
        this.size = 100;
    }
    @Override
    public void setSize(int size) {
    //Defines the size of the collections that should be created when the ADD test is run.
        this.size = size;
    }

    public void createCollection(CollectionType type, int iterations)
    {
        switch (type) {
            case LINKED_LIST -> {
                LinkedList<Person> linked_list = new LinkedList<Person>();
                for (int i = 0;i < iterations; i++){
                    linked_list.add(new Person("Person"+i,i));
                }
            }
            case ARRAY_LIST -> {
                ArrayList<Person> array_list = new ArrayList<Person>();
                for (int i = 0; i < iterations; i++){
                    array_list.add(new Person("Person"+i,i));
                }
            }
            case HASH_MAP -> {
                HashMap<Person, String> hash_map = new HashMap<Person, String>();
                for (int i = 0; i < iterations; i++){
                    hash_map.put(new Person("Person"+i,i), String.valueOf(i));
                }
            }
        }
    }

    public void indexTest(CollectionType type, int iterations){
        int index = iterations/2;

        switch (type){
            case LINKED_LIST -> {

            }
        }
    }

    @Override
    public void runTest(CollectionType type, TestType test, int iterations) {

        switch (test) {
            case ADD -> {
                //create a new collection of the given type and populate it with size unique instances of a person (as defined in setSize
                this.createCollection(type, iterations);
            }
            case INDEX -> {
                //retrieve an item from the collection based on its index in that collection, position should be approx halfway through collection

            }
            case SEARCH -> {
                //retrieve item from collection based on Person's name
                for (int i = 0; i < iterations; i++) {

                }
            }
        }
    }
}
