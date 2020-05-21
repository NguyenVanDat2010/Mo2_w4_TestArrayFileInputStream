package object;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Customer> listCustomers = null;

    static {
        listCustomers = new ArrayList<>();
        listCustomers.add(new Customer(1, "Chau", "Ha Noi"));
        listCustomers.add(new Customer(2, "Thanh", "HCM"));
        listCustomers.add(new Customer(3, "Bao", "Hai Phong"));

    }

    public static void main(String[] args) {
        /**Test thêm từng đối tượng riêng lẻ*/
        TestObjectBinary testObjectBinary = new TestObjectBinary();
        String path = "test.data";
        Customer customer = new Customer(1, "Tuyen", "Nghe An");
        testObjectBinary.writeObjectBinary(path, customer);
        System.out.println(testObjectBinary.readObjectBinary(path));
//        testObjectBinary.readObjectBinary(path);

        /**Test khi thêm một list*/
//        TestObjectBinaryList testObjectBinaryList = new TestObjectBinaryList();
//        testObjectBinaryList.writeObjectBinary(path, listCustomers);
//        testObjectBinaryList.readObjectBinary(path);
//        for (Customer customer : listCustomers) {
//            System.out.println(customer);
//        }
    }
}
