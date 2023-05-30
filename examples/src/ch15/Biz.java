package ch15;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Biz {
	public List<Book> convert(String[] contents) {
		List<Book> l=new ArrayList<>();
		
		for(int i=0;i<contents.length;i++) {
			StringTokenizer st=new StringTokenizer(contents[i],"/");
			String[] temp=new String[6];
			for(int j=0;st.hasMoreTokens();j++) {
				temp[j]=(String)st.nextElement();
			}
			l.add(new Book(temp[0],temp[1],temp[2],temp[3],Integer.parseInt(temp[4]),temp[5]));
		}
		return l;
	}
}
