package hw3.weapons;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Mark Zeagler
 * @version 1.0
 */
public class StandardWeapons {

	private static final Object LOCK = new Object();
	private static List<Weapon> weapons;

	public static List<Weapon> getStandardWeapons() {
		if ( weapons == null ) {
			synchronized ( LOCK ) {
				if ( weapons == null ) {
					LinkedList<Weapon> weaponList = new LinkedList<>();
					WeaponsFactory weaponsFactory = new WeaponsFactory();
					for ( WeaponType weaponType : WeaponType.values() ) {
						for ( WeaponPowerSetting powerSetting : WeaponPowerSetting.values() ) {
							weaponList.add( weaponsFactory.getWeapon( weaponType, powerSetting ) );
						}
					}
					weapons = Collections.unmodifiableList( weaponList );
				}
			}
		}
		return weapons;
	}
}
