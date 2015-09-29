package myMonsters;

public class No6_ZoroÃ¹Ã¹¿Õ¨È¯Á¶© extends Monster{
	static String name="Ã¹Ã¹¿Õ¨È¯Á¶© Zoro";
	static int att=1299;
	static int def=432;
	static int hp=9999;
	static int mp=500;
	public No6_ZoroÃ¹Ã¹¿Õ¨È¯Á¶©() {
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
			MagName="°­±Ù";
			break;
		case 3:
			MagName="¤j¦ò±Ù";
			break;
		case 4:
			MagName="¤T¡P¤d¡P¥@¡P¬É";
			break;
		case 5:
			MagName="¤T¤M¬y¡P¤d¤K¤Q·Ð´o»ñ";
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
			MagDamage=-1199;
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
