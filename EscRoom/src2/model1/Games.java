package model1;

public class Games {

	protected int life;
	protected String[] lifeMsg;
	protected int[] codes;
	protected int hints;
	
	public int getLife() {
		return life;
	}
	
	public String getlifeMsg(int cnt) {
		return lifeMsg[cnt];
	}

	public void lossLife() {
		this.life = life-1;
	}

	public void setCodes(int[] codes) {
		this.codes = codes;
	}

	public void setHints(int hints) {
		this.hints = hints;
	}

}
