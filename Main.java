package FolderandFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("История изменений. \n");

        // создаем каталоги

        File dir1 = new File("D://Games");
        File dir2 = new File("D://Games/src");
        File dir3 = new File("D://Games/res");
        File dir4 = new File("D://Games/savegames");
        File dir5 = new File("D://Games/temp");
        File dir6 = new File("D://Games/res/drawables");
        File dir7 = new File("D://Games/res/vectors");
        File dir8 = new File("D://Games/res/icons");
        File dir9 = new File("D://Games/src/test");
        File dir10 = new File("D://Games/src/main");


        if (dir1.mkdir()) buffer.append(dir1.getPath() + "  Каталог создан\n");
        if (dir2.mkdir()) buffer.append(dir2.getPath() + "  Каталог создан\n");
        if (dir3.mkdir()) buffer.append(dir3.getPath() + "  Каталог создан\n");
        if (dir4.mkdir()) buffer.append(dir4.getPath() + "  Каталог создан\n");
        if (dir5.mkdir()) buffer.append(dir5.getPath() + "  Каталог создан\n");
        if (dir6.mkdir()) buffer.append(dir6.getPath() + "  Каталог создан\n");
        if (dir7.mkdir()) buffer.append(dir7.getPath() + "  Каталог создан\n");
        if (dir8.mkdir()) buffer.append(dir8.getPath() + "  Каталог создан\n");
        if (dir9.mkdir()) buffer.append(dir9.getPath() + "  Каталог создан\n");
        if (dir10.mkdir()) buffer.append(dir10.getPath() + "  Каталог создан\n");

        //создаем файлы


        File myFileM = new File("D://Games/src/main//Main.java");
        File myFileUt = new File("D://Games/src/main//Utils.java");
        File myFileT = new File("D://Games/temp//temp.txt");


        try {
            if (myFileM.createNewFile())
                buffer.append("Файл " + myFileM.getName() + " был создан\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (myFileUt.createNewFile())
                buffer.append("Файл " + myFileUt.getName() + " был создан\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            if (myFileT.createNewFile())
                buffer.append("Файл " + myFileT.getName() + " был создан\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // записываем процесс создания в файл temp.txt


        try (FileOutputStream fos = new FileOutputStream("D://Games/temp//temp.txt")) {
            byte[] bytes = buffer.toString().getBytes();
            fos.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}






