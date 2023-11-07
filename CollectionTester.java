import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CollectionTester implements CollectionTest{

    private Person person;
    private int size;

    LinkedList<Person> linked_list = new LinkedList<Person>();
    ArrayList<Person> array_list = new ArrayList<Person>();
    HashMap<Integer, Person> hash_map = new HashMap<>();

    public CollectionTester()
    {

    }


    @Override
    public void setSize(int size) {
    //Defines the size of the collections that should be created when the ADD test is run.
        this.size = size;
    }

    public void testLinkedList(TestType type, int iterations) {
        int num = iterations/2;

        switch (type) {
            case ADD -> {
                for (int i = 0; i < iterations; i++) {
                    linked_list.add(new Person("Person" + i, i));
                }
                System.out.println(linked_list);

            }
            case INDEX -> {
                System.out.println(linked_list.get(num));
            }

            case SEARCH -> {
                String query = "Person"+num;

                int i = 0;
                while(!(query.equals(linked_list.get(i).getName()))) {
                    i++;
                }
                System.out.println(linked_list.get(i));

            }
        }
    }


    public void testArrayList(TestType type, int iterations){
        int num = iterations/2;

        switch (type){
            case ADD -> {
                for (int i = 0; i < iterations; i++){
                    array_list.add(new Person("Person"+i,i));
                }
                System.out.println(array_list);

            }
            case INDEX -> {

                System.out.println(array_list.get(num));
            }
            case SEARCH -> {
                String query = "Person"+num;

                int i = 0;
                while(!(query.equals(array_list.get(i).getName()))) {
                    i++;
                }
                System.out.println(array_list.get(i));
            }
        }
    }

    public void testHashMap(TestType type, int iterations){
        int num = iterations/2;

        switch (type){
            case ADD -> {

                for (int i = 0; i < iterations; i++){
                    hash_map.put(i,new Person("Person"+i,i));
                }
                System.out.println(hash_map);

            }
            case INDEX -> {
                System.out.println(hash_map.get(num));
            }
            case SEARCH -> {
                Person query = new Person("Person"+num,num) ;
                System.out.println(hash_map.containsValue(query));
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
