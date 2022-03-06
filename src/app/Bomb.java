package app;

public class Bomb implements WeaponInterface {

	//prints firepower
	public void fireWeapon(int power)
	{
		System.out.println("In Bomb, fireWeapon() with a power of " + power);
	}
	//fires weapon
	public void fireWeapon()
	{
		System.out.println("in Bomb, fireWeapon()");
		
	}
	@Override
	public void activate(boolean enable) {
		System.out.println("In the Bomb. activate() with an enable of " +enable);
	}
}
