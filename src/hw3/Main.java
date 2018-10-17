package hw3;

import hw3.weapons.StandardWeapons;
import hw3.weapons.Weapon;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Weapon> weapons = StandardWeapons.getStandardWeapons();

		for (int weapon = 0; weapon < weapons.size(); weapon++)
		{
			System.out.println((weapon + 1) +
					". " + weapons.get(weapon));
			weapons.get(weapon).attack();
			System.out.println();
		}
	}
}
