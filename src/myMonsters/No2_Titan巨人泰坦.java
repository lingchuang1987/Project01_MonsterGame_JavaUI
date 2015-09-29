package myMonsters;

public class No2_Titan¥¨¤H®õ©Z extends Monster{
	static String name="¦Ì³³¿Õ´µMinotaur";
	static int att=600;
	static int def=700;
	static int hp=9999;
	static int mp=500;
	public No2_Titan¥¨¤H®õ©Z() {
		super(name, att, def, hp, mp);
	}
	
	int MagCost,MagDamage;
	String MagName;
	
	@Override
	public String getMagName(int magLv) {
		switch (magLv) {
		case 1:
			MagName="«ì´_";
			break;
		case 2:
			MagName="¤g¬Þ¼C";
			break;
		case 3:
			MagName="¥¨¥Û¥¿®±";
			break;
		case 4:
			MagName="¯u.¤Ñ±Y¦aµõ";
			break;
		case 5:
			MagName="²×·¥.®õ¤sÀ£³»";
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
