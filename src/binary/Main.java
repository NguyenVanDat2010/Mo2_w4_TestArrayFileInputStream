package binary;

public class Main {
    public static void main(String[] args) {
        TestBinary testBinary=new TestBinary();
        String path="test.data";
        int[]arr={1,2,3,4,5,6};
        testBinary.writeBinary(path,arr);
        testBinary.readBinary(path);
    }
}
