package myMonsters;

public class No5_Robin�g�iù�� extends Monster {
	static String name="�g�iù�� Robin";
	static int att=599;
	static int def=567;
	static int hp=9999;
	static int mp=1500;
	public No5_Robin�g�iù��() {
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
			MagName="�G����P�x��";
			break;
		case 3:
			MagName="�G�Q����P�}��";
			break;
		case 4:
			MagName="�ʪ�·�áP���ʾ�P�x�Q";
			break;
		case 5:
			MagName="�U���d���P���j��P����";
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
