package bicho;

public class BichoDormilon extends Bicho {
	public int sue�o;

	BichoDormilon() {
		super();
		sue�o = hambre * 2;
	}

	BichoDormilon(int i) {
		super(i, 0);
		sue�o = i + 20;
	}

	@Override
	public void come() {
		hambre -= 10;
		sue�o += 5;
	}

	public void aDormir() {
		super.come();
		sue�o = 0;
	}

}
