package hw3.weapons;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
class WeaponMedievalStinkyFoot extends Weapon {

	WeaponMedievalStinkyFoot( String name, int attacksPerMinute, int maxDamagePoints ) {
		super( name, attacksPerMinute, maxDamagePoints );
	}

	@Override public void attack() {
		System.out.println( "\uFE34\uFE34\uFE34\uFE34" );
	}
}
