package demo2;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutputStream {
    public static void main(String[] args) throws IOException {
        File output = new File("data.txt");
        if(output.createNewFile()){
            FileOutputStream fileOutputStream = new FileOutputStream(output);
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);
            outputStream.writeInt(500);
            outputStream.writeUTF("Hello JV2306");
            outputStream.writeBoolean(true);
            outputStream.close();
            System.out.println("Đã ghi file thành công");
        } else {
            System.out.println("Ghi thất bại");
        }
    }
}
