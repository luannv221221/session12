package demo3;

import java.io.*;

public class DemoDeserialization {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Danh sachs doc duoc tu file student.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream("student.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) inputStream.readObject();
            while (true){
                System.out.println(student.toString());
                student = (Student) inputStream.readObject();
            }
        } catch (EOFException eofException){
            System.out.println("Qua trinh doc file ket thuc");
        } catch (IOException e) {
            throw new RuntimeException(" da co loi khi doc");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(" Dnhj dang du lieu doc duoc ko dung");
        }
        FileInputStream fileInputStream = new FileInputStream("student.txt");

    }
}
