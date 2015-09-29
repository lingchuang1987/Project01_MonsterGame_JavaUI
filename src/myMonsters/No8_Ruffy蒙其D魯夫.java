package myMonsters;

public class No8_Ruffy�X��D�|�� extends Monster {
	static String name="�X��D�|�� Ruffy";
	static int att=1999;
	static int def=345;
	static int hp=9999;
	static int mp=500;
	public No8_Ruffy�X��D�|��() {
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
			MagName="��JET�j";
			break;
		case 3:
			MagName="��JET���ۼu";
			break;
		case 4:
			MagName="�󽦥��H��y";
			break;
		case 5:
			MagName="�Q��.�Z�˦�w��.��JET�j�å�";
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
			MagDamage=-400;
			break;
		case 3:
			MagDamage=-600;
			break;
		case 4:
			MagDamage=-800;
			break;
		case 5:
			MagDamage=-1299;
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
