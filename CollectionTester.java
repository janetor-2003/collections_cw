import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CollectionTester implements CollectionTest{

    private Person person;
    public CollectionTester(TestType type)
    {

    }
    @Override
    public void setSize(int size) {
    //Defines the size of the collections that should be created when the ADD test is run.
    }

    public void createCollection(CollectionType type)
    {
        switch (type) {
            case LINKED_LIST -> {
                LinkedList<Person> linked_list = new LinkedList<Person>();
            }
            case ARRAY_LIST -> {
                ArrayList<Person> array_list = new ArrayList<Person>();
            }
            case HASH_MAP -> {
                HashMap<Person, String> hash_map = new HashMap<Person, String>();
            }
        }
    }


    @Override
    public void runTest(CollectionType type, TestType test, int iterations) {

        switch (test) {
            case ADD -> {
                //create a new collection of the given type and populate it with size unique instances of a person (as defined in setSize
                this.createCollection(type);
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
