package ch18;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception{
		File dir=new File("C:/Users/admin/eclipse-workspace/images");
		File f1=new File("C:/Users/admin/eclipse-workspace/file1.txt");
		File f2=new File("C:/Users/admin/eclipse-workspace/file2.txt");
		File f3=new File("C:/Users/admin/eclipse-workspace/file3.txt");
		
		if(!dir.exists()) dir.mkdirs();
		if(!f1.exists()) f1.createNewFile();
		if(!f2.exists()) f2.createNewFile();
		if(!f3.exists()) f3.createNewFile();
		
		File temp=new File("C:/Users/admin/eclipse-workspace");
		File[] contents=temp.listFiles();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File f:contents) {
			System.out.printf("%-25s",sdf.format(new Date(f.lastModified())));
			if(f.isDirectory()) {
				System.out.printf("%-10s%-20s","<DIR>",f.getName());
			}else {
				System.out.printf("%-10s%-20s",f.length(),f.getName());
			}
			System.out.println();
		}
	}
}
