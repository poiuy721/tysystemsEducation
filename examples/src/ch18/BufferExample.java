package ch18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {
	public static void main(String[] args) throws Exception{
		String originalFilePath1=BufferExample.class.getResource("originalFile1.png").getPath();
		String targetFilePath1="C:/Users/admin/eclipse-workspace/targetFile1.png";
		FileInputStream fis=new FileInputStream(originalFilePath1);
		FileOutputStream fos=new FileOutputStream(targetFilePath1);
		
		String originalFilePath2=BufferExample.class.getResource("originalFile2.png").getPath();
		String targetFilePath2="C:/Users/admin/eclipse-workspace/targetFile2.png";
		FileInputStream fis2=new FileInputStream(originalFilePath2);
		FileOutputStream fos2=new FileOutputStream(targetFilePath2);
		BufferedInputStream bis=new BufferedInputStream(fis2);
		BufferedOutputStream bos=new BufferedOutputStream(fos2);
		
		long nonbufferTime=copy(fis,fos);
		System.out.println("버퍼 미사용 : "+nonbufferTime);
		
		long bufferTime=copy(bis,bos);
		System.out.println("버퍼 사용 : "+bufferTime);
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	public static long copy(InputStream is,OutputStream os) throws Exception{
		long start=System.nanoTime();
		while(true) {
			int data=is.read();
			if(data==-1)break;
			os.write(data);
		}
		os.flush();
		long end=System.nanoTime();
		return (end-start);
	}
}
