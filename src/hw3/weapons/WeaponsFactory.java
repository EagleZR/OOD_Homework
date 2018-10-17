package hw3.weapons;

import java.util.IdentityHashMap;
import java.util.Map;

public class WeaponsFactory {

	private static final Map<WeaponType, Class<? extends Weapon>> WEAPONS_MAP;

	static {
		WEAPONS_MAP = new IdentityHashMap<>();
		WEAPONS_MAP.putIfAbsent( WeaponType.FutureLaser, WeaponFutureLaser.class );
		WEAPONS_MAP.putIfAbsent( WeaponType.FutureRocket, WeaponFutureRocket.class );
		WEAPONS_MAP.putIfAbsent( WeaponType.FutureSonicScrewdriver, WeaponFutureSonicScrewdriver.class );
		WEAPONS_MAP.putIfAbsent( WeaponType.FutureMindMeld, WeaponFutureMindMeld.class );
		WEAPONS_MAP.putIfAbsent( WeaponType.MedievalFist, WeaponMedievalFist.class );
		WEAPONS_MAP.putIfAbsent( WeaponType.MedievalGun, WeaponMedievalGun.class );
		WEAPONS_MAP.putIfAbsent( WeaponType.MedievalBooger, WeaponMedievalBooger.class );
		WEAPONS_MAP.putIfAbsent( WeaponType.MedievalStinkyFoot, WeaponMedievalStinkyFoot.class );
	}

	public WeaponsFactory() {

	}

	public Weapon getWeapon( WeaponType weaponType, WeaponPowerSetting powerSetting ) {
		try {
			return WEAPONS_MAP.get( weaponType ).getDeclaredConstructor( String.class, int.class, int.class ).newInstance(
					powerSetting == WeaponPowerSetting.LOW_POWER ? weaponType.LOW_POWER_NAME : weaponType.HIGH_POWER_NAME,
					powerSetting == WeaponPowerSetting.LOW_POWER ?
							weaponType.LOW_POWER_ATTACKS_PER_MINUTE :
							weaponType.HIGH_POWER_ATTACKS_PER_MINUTE,
					powerSetting == WeaponPowerSetting.LOW_POWER ? weaponType.LOW_POWER_DAMAGE : weaponType.HIGH_POWER_DAMAGE );
		} catch ( Exception e ) {
			e.printStackTrace();
			return null;
		}
	}

}
