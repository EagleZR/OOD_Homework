package hw3.weapons;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
class WeaponFutureMindMeld extends Weapon {

	private static final List<String> QUOTES_LIST = new LinkedList<>( Arrays.asList(
			"Life has no meaning a priori… It is up to you to give it a meaning, and value is nothing but the meaning that you choose.",
			"I have come to believe that the whole world is an enigma, a harmless enigma that is made terrible by our own mad attempt to interpret it as though it had an underlying truth.",
			"Man is nothing else but what he makes of himself.",
			"If we believe in nothing, if nothing has any meaning and if we can affirm no values whatsoever, then everything is possible and nothing has any importance.",
			"For I do not exist: there exist but the thousands of mirrors that reflect me. With every acquaintance I make, the population of phantoms resembling me increases. Somewhere they live, somewhere they multiply. I alone do not exist.",
			"All that is transitory is but a metaphor." ) );

	WeaponFutureMindMeld( String name, int attacksPerMinute, int maxDamagePoints ) {
		super( name, attacksPerMinute, maxDamagePoints );
	}

	@Override public void attack() {
		System.out.println( QUOTES_LIST.get( ThreadLocalRandom.current().nextInt( 0, QUOTES_LIST.size() ) ) );
	}
}
