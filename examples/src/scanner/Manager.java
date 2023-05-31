package scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	private List<Person> personList=new ArrayList<>();
	
	public void printPersonList() {
		for(int i=0;i<personList.size();i++) {
			System.out.println((i+1)+". 아이디="+personList.get(i).getId()+" | 이름="+personList.get(i).getName()+" | 나이="+personList.get(i).getAge()+" | "+((personList.get(i).getSex().equals("F"))?"여":"남"));
		}
	}
	public void addPerson(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id=sc.nextLine();
		System.out.print("이름을 입력하세요 =>");
		String name=sc.nextLine();
		System.out.print("나이를 입력하세요 =>");
		String age=sc.nextLine();
		System.out.print("성별을 입력하세요(값 : F,M) =>");
		String sex=sc.nextLine();
		for(int i=0;i<personList.size();i++) {
			if(personList.get(i).getId().equals(id)) {
				System.out.println("인원을 추가할 수 없습니다. 동일한 ID가 존재합니다.");
				return;
			}
		}
		personList.add(new Person(id,name,age,sex));
		System.out.println();
	}
	public void updatePerson(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id=sc.nextLine();
		System.out.print("수정 이름을 입력하세요 =>");
		String name=sc.nextLine();
		System.out.print("수정 나이를 입력하세요 =>");
		String age=sc.nextLine();
		System.out.print("수정 성별을 입력하세요(값 : F,M) =>");
		String sex=sc.nextLine();
		for(int i=0;i<personList.size();i++) {
			if(personList.get(i).getId().equals(id)) {
				personList.remove(i);
				personList.add(new Person(id,name,age,sex));
				System.out.println();
				return;
			}
		}
		System.out.println("ID Not Found");
	}
	public void deletePerson(Scanner sc) {
		System.out.print("ID를 입력하세요 =>");
		String id=sc.nextLine();
		for(int i=0;i<personList.size();i++) {
			if(personList.get(i).getId().equals(id)) {
				personList.remove(i);
				System.out.println();
				return;
			}
		}
		System.out.println("ID Not Found");
	}
	public void selectPersonBySex(Scanner sc) {
		System.out.print("성별을 입력하세요(값 : F,M) =>");
		String sex=sc.nextLine();
		for(int i=0;i<personList.size();i++) {
			if(personList.get(i).getSex().equals(sex)) {
				System.out.println("아이디="+personList.get(i).getId()+" | 이름="+personList.get(i).getName()+" | 나이="+personList.get(i).getAge()+" | "+((personList.get(i).getSex().equals("F"))?"여":"남"));
			}
		}
	}
	public void selectPersonByBetweenAge(Scanner sc) {
		System.out.print("시작 나이를 입력하세요 =>");
		int start=Integer.parseInt(sc.nextLine());
		System.out.print("종료 나이를 입력하세요 =>");
		int end=Integer.parseInt(sc.nextLine());
		for(int i=0;i<personList.size();i++) {
			if((Integer.parseInt(personList.get(i).getAge())>=start)&&(Integer.parseInt(personList.get(i).getAge())<=end)) {
				System.out.println("아이디="+personList.get(i).getId()+" | 이름="+personList.get(i).getName()+" | 나이="+personList.get(i).getAge()+" | "+((personList.get(i).getSex().equals("F"))?"여":"남"));
			}
		}
	}
}
