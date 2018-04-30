package chapt09;

import java.util.*;
import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		File fp = new File("chapt09" + File.separator + "FileTest2.java");
		if (fp.exists()) {
			System.out.println(fp.getName() + " существует");
			if (fp.isFile()) {
				System.out.println("Путь к файлу:\t" + fp.getPath());
				System.out.println("Абсолютный путь:\t" + fp.getAbsolutePath());
				System.out.println("Размер файла:\t" + fp.length());
				System.out.println("Последняя модификация:\t" + new Date(fp.lastModified()));

			}
		} else
			System.out.println("файл " + fp.getName() + " не существует");

		try {
			if (fp.createNewFile())
				System.out.println("Файл " + fp.getName() + " создан");
		} catch (IOException e) {
			System.err.println(e);
		}

		File dir = new File("com" + File.separator + "learn");
		if (dir.exists() && dir.isDirectory())
			System.out.println("каталог " + dir.getName() + " существует");

		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			Date date = new Date(files[i].lastModified());
			System.out.print("\n" + files[i].getPath() + " \t| " + files[i].length() + "\t| " + date.toString());

		}

		File root = File.listRoots()[1];
		System.out.printf("\n%s %,d из %,d свободно.", root.getPath(), root.getUsableSpace(), root.getTotalSpace());

	}
}
