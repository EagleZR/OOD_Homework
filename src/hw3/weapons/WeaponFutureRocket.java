package hw3.weapons;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
class WeaponFutureRocket extends Weapon {
	WeaponFutureRocket( String name, int attacksPerMinute, int maxDamagePoints ) {
		super( name, attacksPerMinute, maxDamagePoints );
	}

	@Override public void attack() {
		System.out.println(
				"SSSSSSSSSSSSSSHHHHHHHHHHHHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr......................................................................................................................................................... boom" );
	}
}
