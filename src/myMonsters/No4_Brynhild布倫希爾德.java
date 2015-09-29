package myMonsters;

public class No4_Brynhild���ۧƺ��w extends Monster {
	static String name="���ۧƺ��wBrynhild";
	static int att=799;
	static int def=455;
	static int hp=9999;
	static int mp=500;
	public No4_Brynhild���ۧƺ��w() {
		super(name, att, def, hp, mp);
	}
	
	int MagCost,MagDamage;
	String MagName;
	
	@Override
	public String getMagName(int magLv) {
		switch (magLv) {
		case 1:
			MagName="��_";
			break;
		case 2:
			MagName="�_���";
			break;
		case 3:
			MagName="�k�����R";
			break;
		case 4:
			MagName="�}�H��ű�";
			break;
		case 5:
			MagName="�׷�.�Ѧa�۪{��";
			break;
		}
		return MagName;
	}
	@Override
	public int getMagDamage(int magLv) {
		switch (magLv) {
		case 1:
			MagDamage=123;
			break;
		case 2:
			MagDamage=-300;
			break;
		case 3:
			MagDamage=-500;
			break;
		case 4:
			MagDamage=-700;
			break;
		case 5:
			MagDamage=-999;
			break;
		}
		return MagDamage;
	}
	@Override
	public int getMagCost(int magLv) {
		switch (magLv) {
		case 1:
			MagCost=30;
			break;
		case 2:
			MagCost=30;
			break;
		case 3:
			MagCost=60;
			break;
		case 4:
			MagCost=120;
			break;
		case 5:
			MagCost=300;
			break;
		}
		return MagCost;
	}
	
}