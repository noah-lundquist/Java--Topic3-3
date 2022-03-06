package app;

public class Gun implements WeaponInterface {

	//firepower of gun
	public void fireWeapon(int power)
	{
		System.out.println("In Gun, fireWeapon() with a power of " + power);
	}
	//fires weapon
	public void fireWeapon()
	{
		System.out.println("in Gun, fireWeapon()");
		
	}
	
	//activates gun
	public void activate(boolean enable) {
		System.out.println("In the Gun. activate() with an enable of " +enable);
	}
}
