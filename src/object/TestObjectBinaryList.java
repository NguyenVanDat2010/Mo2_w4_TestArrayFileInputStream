package object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestObjectBinaryList {
    public void writeObjectBinary(String path, List<Customer> listCustomer) {
        FileOutputStream fileInputStream = null;
        ObjectOutputStream objectInputStream = null;
        try {
            fileInputStream = new FileOutputStream(path);
            objectInputStream = new ObjectOutputStream(fileInputStream);
            for (Customer customer : listCustomer) {
                objectInputStream.writeObject(customer);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Customer> readObjectBinary(String path) {
        List<Customer> customerList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);

            Customer customer = null;
            while ((customer = (Customer) objectInputStream.readObject()) != null) {
                customerList.add(customer);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Het file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
