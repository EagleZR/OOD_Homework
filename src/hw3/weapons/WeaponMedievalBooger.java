package hw3.weapons;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
class WeaponMedievalBooger extends Weapon {
	WeaponMedievalBooger( String name, int attacksPerMinute, int maxDamagePoints ) {
		super( name, attacksPerMinute, maxDamagePoints );
	}

	@Override public void attack() {
		System.out.println( "SPLOT!" );
	}
}
