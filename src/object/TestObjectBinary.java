package object;

import java.io.*;

public class TestObjectBinary {
    public void writeObjectBinary(String path, Customer customer) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customer);

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Customer readObjectBinary(String path) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Customer customer = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);

            customer=(Customer)objectInputStream.readObject();

//            while ((customer = (Customer) objectInputStream.readObject()) != null) {
//                System.out.println(customer);
//            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (EOFException e) {
            System.out.println("Het file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customer;
    }
}
