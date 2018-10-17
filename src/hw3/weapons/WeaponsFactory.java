package hw3.weapons;

public class WeaponsFactory {

	private static WeaponsFactory weaponsFactoryInstance;

	private WeaponsFactory() {

	}

	public static WeaponsFactory getWeaponsFactoryInstance() {
		if (weaponsFactoryInstance == null) {
			weaponsFactoryInstance = new WeaponsFactory();
		}
		return weaponsFactoryInstance;
	}

	public hw3.weapons.Weapon getWeapon( hw3.weapons.WeaponType weaponType) {

	}
}
