package myLib;

import myMonsters.*;

public class selecMonster {
	public static Monster selMonster(int GachyaNo){
		Monster urMonster=null;
		switch (GachyaNo) {
		case 1:
			urMonster=new No1_Minotaur�̳��մ�();
			break;
		case 2:
			urMonster=new No2_Titan���H���Z();
			break;
		case 3:
			urMonster=new No3_Chocobo���泾();
			break;
		case 4:
			urMonster=new No4_Brynhild���ۧƺ��w();
			break;
		case 5:
			urMonster=new No5_Robin�g�iù��();
			break;
		case 6:
			urMonster=new No6_Zoroùù�ըȯ���();
			break;
		case 7:
			urMonster=new No7_Law�~�����_ù();
			break;
		case 8:
			urMonster=new No8_Ruffy�X��D�|��();
			break;

		default:
			if (urMonster==null)
				urMonster=new No1_Minotaur�̳��մ�();
		}
		return urMonster;
	}
}
