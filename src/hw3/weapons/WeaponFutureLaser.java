package hw3.weapons;

public class WeaponFutureLaser extends hw3.weapons.Weapon {
	public WeaponFutureLaser(String name, int attacksPerMinute, int maxDamagePoints) {
		super(name, attacksPerMinute, maxDamagePoints);
	}

	//for this exercise, attack just writes
	//the sound of the attack to the console
	@Override
	public void attack() {
		System.out.println("Zap!");
	}
}
