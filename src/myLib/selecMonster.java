package myLib;

import myMonsters.*;

public class selecMonster {
	public static Monster selMonster(int GachyaNo){
		Monster urMonster=null;
		switch (GachyaNo) {
		case 1:
			urMonster=new No1_Minotaur米陶諾斯();
			break;
		case 2:
			urMonster=new No2_Titan巨人泰坦();
			break;
		case 3:
			urMonster=new No3_Chocobo陸行鳥();
			break;
		case 4:
			urMonster=new No4_Brynhild布倫希爾德();
			break;
		case 5:
			urMonster=new No5_Robin妮可羅賓();
			break;
		case 6:
			urMonster=new No6_Zoro羅羅諾亞索隆();
			break;
		case 7:
			urMonster=new No7_Law外科醫生_羅();
			break;
		case 8:
			urMonster=new No8_Ruffy蒙其D魯夫();
			break;

		default:
			if (urMonster==null)
				urMonster=new No1_Minotaur米陶諾斯();
		}
		return urMonster;
	}
}
