public class Driver {
    public static void main(String args[]){
        CollectionTester test = new CollectionTester();

        test.runTest(CollectionTest.CollectionType.LINKED_LIST, CollectionTest.TestType.ADD,10);
        test.runTest(CollectionTest.CollectionType.ARRAY_LIST, CollectionTest.TestType.ADD,10);
        test.runTest(CollectionTest.CollectionType.HASH_MAP, CollectionTest.TestType.ADD,10);

        test.runTest(CollectionTest.CollectionType.LINKED_LIST, CollectionTest.TestType.INDEX,10);
        test.runTest(CollectionTest.CollectionType.ARRAY_LIST, CollectionTest.TestType.INDEX,10);
        test.runTest(CollectionTest.CollectionType.HASH_MAP, CollectionTest.TestType.INDEX,10);

        test.runTest(CollectionTest.CollectionType.LINKED_LIST, CollectionTest.TestType.SEARCH,10);
        test.runTest(CollectionTest.CollectionType.ARRAY_LIST, CollectionTest.TestType.SEARCH,10);
        test.runTest(CollectionTest.CollectionType.HASH_MAP, CollectionTest.TestType.SEARCH,10);
    }
}
