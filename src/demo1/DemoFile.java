package demo1;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) {
        String path = "D:\\JV2306";
        File file = new File(path);
        if(!file.exists()){
            file.mkdir(); // tao moi thu muc
        }
        // xóa thu muc
//        if(file.exists()){
//            file.delete();
//        }
        // tạo file
        String fileName = "D:\\JV2306\\demo.txt";
        File file1 = new File(fileName);
        try {
            if(file1.isFile()){
//                file1.createNewFile(); // tạo mới
                // đổi tên file
                file1.renameTo(new File("D:\\JV2306\\rename_demo.txt"));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
