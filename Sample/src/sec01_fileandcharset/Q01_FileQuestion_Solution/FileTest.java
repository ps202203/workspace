package sec01_fileandcharset.Q01_FileQuestion_Solution;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
/*
문제

1. C:/dev/file_test/ 디렉토리 생성.
2. C:/dev/file_test/ 디렉토리에 UUID를 이용해 임의의 파일명 10개 생성.

3. C:/dev/file_test/ 디렉토리의 파일들을 읽어와서 확장자를 제거하는 형태로 파일의 이름을 변경.
 */
public class FileTest {
    public static void main(String[] args) {
        // 1. 디렉토리 생성
        File dir = new File("C:/dev/file_test/");
        if (!dir.exists()) {
            dir.mkdirs(); // 디렉토리가 존재하지 않으면 생성
        }

        // 2. 파일 생성
        for (int i=1; i <= 10; i++) {
           int fileNameLength = (int)(Math.random()*16)+5; 
            File file = new File(dir, 
               UUID.randomUUID().toString().substring(0,fileNameLength) + ".txt");
            try {
                if (file.createNewFile()) {
                    System.out.println("생성 파일명 : " + file.getName());
                } else {
                    System.out.println("이미 존재하는 파일명 : " + file.getName());
                }
            } catch (IOException e) {
                System.err.println("파일 생성 실패 : " + e.getMessage());
            }
        }

        // 3. 디렉토리의 파일들을 읽어와서 확장자 제거
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                String fileName = file.getName();
                int dotIndex = fileName.lastIndexOf('.');
                if (dotIndex != -1) {
                    String fileNameWithoutExtension = fileName.substring(0, dotIndex);
                    File newFile = new File(dir, fileNameWithoutExtension);
                    if (file.renameTo(newFile)) {
                        System.out.println("확장자를 제거하여 [" + fileName + "]을 [" + newFile.getName() + "]로 수정하였습니다.");
                    } else {
                        System.out.println("파일명 수정이 되지 않습니다. " + fileName);
                    }
                }
            }
        }
    }
}
