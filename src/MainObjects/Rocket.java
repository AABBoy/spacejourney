package MainObjects;

public class Rocket {
	
	String name;
	
	Rocket (String name) {
		
		this.name = name;
	}
	
 public static void lounch (String command) {
	 String s = command;
	 if (s.equals("� ������ �����") || s.equals("����������� ����������")) {
		 System.out.print("�������� �������� ������ �� ������ �������� ����������: ");
		 for (int i = 10; i>0; i--) {
			 System.out.print(i + ",");
		 }
		 System.out.print(".");
		System.out.print("��������! ����� ��������. ������ ������� ����������� ����!");		 
		
	 } else {
		 System.out.println("��������, �������� �������. ������� �� �������.");
	 }
	 
	 
 }
}
