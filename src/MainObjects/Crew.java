package MainObjects;

public class Crew {

	static String crewMemberspec;
//	String Engeenierspec;
//	String scientistspec;
//	String medicspec;

    

   
    public static void showCrewMember(Spec spec) {
        System.out.println("�������������� ����� �������: " + Spec.spec + ".");
        System.out.println("��� �� ��������� �������: " + crewMemberspec + "." + " " + "������������� �� ��������� �������: " + Spec.spec + ".");
        System.out.println("������� �����������: "  + Spec.strength + ".");
        System.out.println("������� �������� �� �������������: " + Spec.agility + ".");
        System.out.println("����������� ����������: " + Spec.intelligence + ".");
        System.out.println("������ ������ ������: " + Spec.healScore + ".");
        System.out.println("������ �������: " + Spec.repair + ".");
        System.out.println("����������� ����� � ������ � ��������: " + Spec.successLevel + ".");

    }

    public static String getSpec(String s) {
        Spec.spec = s;
        return Spec.spec;
    }

}
