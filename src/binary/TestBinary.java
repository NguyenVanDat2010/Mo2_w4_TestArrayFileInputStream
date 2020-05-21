package binary;

import java.io.*;

public class TestBinary {
    public void writeBinary(String path, int[] arr) {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(path);
            dataOutputStream = new DataOutputStream(fileOutputStream);

            for (int i = 0; i < arr.length; i++) {
                dataOutputStream.writeInt(arr[i]);
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readBinary(String path) {
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            dataInputStream = new DataInputStream(fileInputStream);

            int bye;
            while ((bye = dataInputStream.readInt()) != -1) {
                System.out.print(bye +" ");
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }catch (EOFException e){
            System.out.println("Hết file");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
