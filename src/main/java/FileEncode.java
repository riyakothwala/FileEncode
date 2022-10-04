import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.codec.binary.Base64;

public class FileEncode{
    public static void main(String[] args) {

        try {
            File file = new File("../src/main/resources/samplePdf.pdf");
            byte [] bytes = Files.readAllBytes(file.toPath());

            String base64String = Base64.encodeBase64String(bytes);
            System.out.println(base64String);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}