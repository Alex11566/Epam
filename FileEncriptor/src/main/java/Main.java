

import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String path = "C:/Users/tangm/Desktop/del/";
        ZipParameters parameters = new ZipParameters();
        parameters.setCompressionMethod(CompressionMethod.DEFLATE);
        parameters.setCompressionLevel(CompressionLevel.ULTRA);
        parameters.setEncryptFiles(true);
        parameters.setEncryptionMethod(EncryptionMethod.AES);
        parameters.setAesKeyStrength(AesKeyStrength.KEY_STRENGTH_256);


        try {
            String password = "123";
            ZipFile zipFile = new ZipFile(path + "archive.zip", password.toCharArray());
            zipFile.addFolder(new File(path ), parameters);
            
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
