package myMonsters;

public class No3_Chocobo陸行鳥 extends Monster {
	static String name="陸行鳥Chocobo";
	static int att=399;
	static int def=550;
	static int hp=12999;
	static int mp=2000;
	public No3_Chocobo陸行鳥() {
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
			MagName="憤怒一啄";
			break;
		case 3:
			MagName="影分身術--無限chokobo";
			break;
		case 4:
			MagName="卡丁車衝撞";
			break;
		case 5:
			MagName="2000倍巨大化--啄木術";
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