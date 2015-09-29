package myMonsters;

public class No4_Brynhild¥¬­Û§Æº¸¼w extends Monster {
	static String name="¥¬­Û§Æº¸¼wBrynhild";
	static int att=799;
	static int def=455;
	static int hp=9999;
	static int mp=500;
	public No4_Brynhild¥¬­Û§Æº¸¼w() {
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
			MagName="Â_»î±Ù";
			break;
		case 3:
			MagName="¤k¯«¤§»R";
			break;
		case 4:
			MagName="¯}¸HµêªÅ±Ù";
			break;
		case 5:
			MagName="²×·¥.¤Ñ¦a¤Ûª{±Ù";
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