package MainObjects;

import javax.swing.*;

public class ForRunOnly {



	public static void main(String[] args) {


//		Rocket myRocket = new Rocket ("Vulture");
//		System.out.println (myRocket.name);
		
//		Rocket.lounch("����������� ����������");
		JOptionPane myPane = new JOptionPane ();

		Spec medicDefault = new Spec ();
//		medicDefault.spec = "�����";
//		medicDefault.strength = 2;
//		medicDefault.agility = 2;
//		medicDefault.intelligence = 4;
//		medicDefault.healScore = 5;
//		medicDefault.repair = 2;
//		medicDefault.successLevel = 2;
		medicDefault.medicDefaults();






//		String nameMedic = myPane.showInputDialog("������� ��� ������ �������");
//		myPane.showMessageDialog (null,"������� �������","�������!",1);
//		medicDefault.memberName = nameMedic;
//
//		Crew.showCrewMember(medicDefault,nameMedic);

		System.out.println(Crew.setName());
//		Spec mechanickDefault = new Spec();
//		mechanickDefault.mechanickDefaults();
//		String nameMechanick = myPane.showInputDialog("������� ��� �������� �������");
//		myPane.showMessageDialog (null,"������� �������","�������!",1);
//		mechanickDefault.memberName = nameMechanick;
//		Crew.showCrewMember(mechanickDefault,nameMechanick);
	}


	}
	

