package MainObjects;

import javax.swing.*;

public class ForRunOnly {



	public static void main(String[] args) {


//		Rocket myRocket = new Rocket ("Vulture");
//		System.out.println (myRocket.name);
		
//		Rocket.lounch("����������� ����������");
		JOptionPane myPane = new JOptionPane ();

		Spec medicDefault = new Spec ();
		medicDefault.spec = "�����";
		medicDefault.strength = 2;
		medicDefault.agility = 2;
		medicDefault.intelligence = 4;
		medicDefault.healScore = 5;
		medicDefault.repair = 2;
		medicDefault.successLevel = 2;

//		Spec.showSpecMember(medic);




		String nameMedic = myPane.showInputDialog("������� ��� ������ �������");
		myPane.showMessageDialog (null,"������� �������","�������!",1);
		medicDefault.memberName = nameMedic;

		Crew.showCrewMember(medicDefault);

	}


	}
	

