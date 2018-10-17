package hw3.weapons;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
class WeaponFutureSonicScrewdriver extends Weapon {
	WeaponFutureSonicScrewdriver( String name, int attacksPerMinute, int maxDamagePoints ) {
		super( name, attacksPerMinute, maxDamagePoints );
	}

	@Override public void attack() {
		System.out.println( "Weeyu-weeyu-weeyu-weeyu-weeyu-weeyu" );
	}
}
