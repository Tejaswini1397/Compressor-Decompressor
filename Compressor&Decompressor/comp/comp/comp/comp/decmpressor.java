package comp.comp.comp.comp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class decmpressor {
    public static void method(File file) throws IOException {
        String fileDirectory=file.getParent();
        FileInputStream  fis=new FileInputStream(file);
        FileOutputStream  fos=new FileOutputStream(fileDirectory+ "/DecompressedFile.gz");
        GZIPOutputStream gzip=new GZIPOutputStream(fos);

        byte[]buffer=new byte[2024];
        int len;

        while((len=fis.read(buffer))!=-1){
            gzip.write(buffer,0,len);
    }
    gzip.close();
    fos.close();
    fis.close();
}
public static void main(String[] args) throws IOException{
    File path=new File("C:/Users/HP/Desktop/Accio project/comp data");
    method(path);
}
}
