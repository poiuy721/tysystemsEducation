package ch18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample3 {
	public static void main(String[] args) {
		try {
			Reader r=null;
			
			r=new FileReader("C:\\Users\\admin\\eclipse-workspace\\test.txt");
			while(true) {
				int data=r.read();
				if(data==-1)break;
				System.out.print((char)data);
			}
			r.close();
			System.out.println();
			
			r=new FileReader("C:\\Users\\admin\\eclipse-workspace\\test.txt");
			char[] data=new char[100];
			while(true) {
				int num=r.read(data);
				if(num==-1)break;
				for(int i=0;i<num;i++)
					System.out.print(data[i]);
			}
			r.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
