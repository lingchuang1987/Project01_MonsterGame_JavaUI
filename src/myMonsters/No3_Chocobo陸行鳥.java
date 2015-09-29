package myMonsters;

public class No3_Chocobo���泾 extends Monster {
	static String name="���泾Chocobo";
	static int att=399;
	static int def=550;
	static int hp=12999;
	static int mp=2000;
	public No3_Chocobo���泾() {
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
			MagName="����@��";
			break;
		case 3:
			MagName="�v�����N--�L��chokobo";
			break;
		case 4:
			MagName="�d�B���ļ�";
			break;
		case 5:
			MagName="2000�����j��--�֤�N";
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
			MagDamage=-1111;
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
			MagCost=500;
			break;
		}
		return MagCost;
	}
	
}