package myMonsters;

public class No7_Law外科醫生_羅 extends Monster{
	static String name="羅 Law";
	static int att=1099;
	static int def=500;
	static int hp=9999;
	static int mp=500;
	public No7_Law外科醫生_羅() {
		super(name, att, def, hp, mp);
	}
	
	int MagCost,MagDamage;
	String MagName;
	
	@Override
	public String getMagName(int magLv) {
		switch (magLv) {
		case 1:
			MagName="恢復";
			break;
		case 2:
			MagName="手術刀";
			break;
		case 3:
			MagName="ROOM·屠宰場";
			break;
		case 4:
			MagName="鬼哭.死亡之刀";
			break;
		case 5:
			MagName="召喚 培波Bepo!!";
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
