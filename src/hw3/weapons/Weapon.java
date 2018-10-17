package hw3.weapons;


public abstract class Weapon {

	private String _name;
	private int _attacksPerMinute;
	private int _maxDamagePoints;

	protected Weapon(String name, int attacksPerMinute, int maxDamagePoints) {
		_name = name;
		_attacksPerMinute = attacksPerMinute;
		_maxDamagePoints = maxDamagePoints;
	}

	public int getAttacksPerMinute() {
		return _attacksPerMinute;
	}

	public int getMaxDamagePoints() {
		return _maxDamagePoints;
	}

	public String getName() {
		return _name;
	}

	//for this exercise, attack just writes
	//the sound of the attack to the console
	public abstract void attack();

	@Override
	public String toString() {
		return
				this.getClass().getSimpleName() +
						" -- " + _name +
						" -- Attacks Per Minute: " + _attacksPerMinute +
						" -- MaxDamagePoints: " + _maxDamagePoints;
	}
}
