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

    public void testLinkedList(TestType type, int iterations) {
        int num = iterations/2;
        LinkedList<Person> linked_list = new LinkedList<Person>();
        switch (type) {
            case ADD -> {
                for (int i = 0; i < iterations; i++) {
                    linked_list.add(new Person("Person" + i, i));
                }
            }
            case INDEX -> {
                System.out.println(linked_list.get(num));
            }

            case SEARCH -> {
                String query = "Person"+num;

                int i = 0;
                while(linked_list.get(i).getName() != query) {
                    i++;
                }
                System.out.println(linked_list.get(i));
            }
        }
    }


    public void testArrayList(TestType type, int iterations){
        int num = iterations/2;
        ArrayList<Person> array_list = new ArrayList<Person>();
        switch (type){
            case ADD -> {
                for (int i = 0; i < iterations; i++){
                    array_list.add(new Person("Person"+i,i));
                }
            }
            case INDEX -> {

                System.out.println(array_list.get(num));
            }
            case SEARCH -> {
                String query = "Person"+num;

                int i = 0;
                while(array_list.get(i).getName() != query) {
                    i++;
                }
                System.out.println(array_list.get(i));
            }
        }
    }

    public void testHashMap(TestType type, int iterations){
        HashMap<Person, Integer> hash_map = new HashMap<Person, Integer>();
        switch (type){
            case ADD -> {
                for (int i = 0; i < iterations; i++){
                    hash_map.put(new Person("Person"+i,i), i);
                }
            }
            case INDEX -> {
                int num = iterations/2;
                System.out.println(hash_map.get(num));
            }
            case SEARCH -> {

            }
        }
    }


    @Override
    public void runTest(CollectionType type, TestType test, int iterations) {

        switch (type) {
            case LINKED_LIST -> {
                this.testLinkedList(test,iterations);
            }
            case ARRAY_LIST -> {
                this.testArrayList(test,iterations);
            }
            case HASH_MAP -> {
                this.testHashMap(test,iterations);
            }
        }
    }
}
