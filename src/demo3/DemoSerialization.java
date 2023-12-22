package demo3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoSerialization {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Hải Yến",17,false));
        students.add(new Student(2,"Gì",17,false));
        students.add(new Student(3,"Nguyễn Văn Bao",17,true));

        File file = new File("student.txt");
        if(file.createNewFile()){
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            for (Student student : students) {
                outputStream.writeObject(student);
            }
            outputStream.close();
            System.out.println("Đã ghi file thành công");
        } else {
            System.err.println("Ghi Thất bại");
        }

    }
}
