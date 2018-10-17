package hw3;

import hw3.weapons.Weapon;
import hw3.weapons.WeaponFutureLaser;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Weapon> weapons = new ArrayList();
		weapons.add(new WeaponFutureLaser("Death Ray", 1, 10000));

		for (int weapon = 0; weapon < weapons.size(); weapon++)
		{
			System.out.println((weapon + 1) +
					". " + weapons.get(weapon));
			weapons.get(weapon).attack();
			System.out.println();
		}
	}
}
