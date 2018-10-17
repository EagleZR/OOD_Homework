package hw3.weapons;

public enum WeaponType {
	FutureLaser( "E-11", "DC-17", 60, 1000, 100, 1000 ),
	FutureRocket( "Concussion Missile", "Baradium Torpedo", 1, 1, 100000, 1000000000 ),
	FutureSonicScrewdriver( "Sonic Screwdriver", "Wanabe Lightsaber", 2, 5, 1, 1 ),
	FutureMindMeld( "Mind Whisper", "Bad Psychiatrist", 2, 10, 0, 0 ),
	MedievalFist( "Bare Knuckles", "Ascûdgamln", 5, 220, 10, 100 ),
	MedievalGun( "Arquebus", "Musket", 1, 2, 100, 100 ),
	MedievalBooger( "Clear Snot Booger", "Green Booger", 1, 2, 1, 1 ),
	MedievalStinkyFoot( "Haven't changed socks in a week", "Just wore those leather shoes that can't ever come inside",
			5, 10, 0, 0 );

	final String LOW_POWER_NAME;
	final String HIGH_POWER_NAME;
	final int LOW_POWER_ATTACKS_PER_MINUTE;
	final int HIGH_POWER_ATTACKS_PER_MINUTE;
	final int LOW_POWER_DAMAGE;
	final int HIGH_POWER_DAMAGE;

	WeaponType( String lowPowerName, String highPowerName, int lowPowerAttacksPerMinute, int highPowerAttacksPerMinute,
			int lowPowerDamage, int highPowerDamage ) {
		this.LOW_POWER_NAME = lowPowerName;
		this.HIGH_POWER_NAME = highPowerName;
		this.LOW_POWER_ATTACKS_PER_MINUTE = lowPowerAttacksPerMinute;
		this.HIGH_POWER_ATTACKS_PER_MINUTE = highPowerAttacksPerMinute;
		this.LOW_POWER_DAMAGE = lowPowerDamage;
		this.HIGH_POWER_DAMAGE = highPowerDamage;
	}
}
