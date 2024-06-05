/**
 * Character
 */


public class Character {
     void Attack(IAttackType attackType){
        attackType.Perform();
    }
}

interface IAttackType{
    void Perform();
}

class EarthAttack implements IAttackType{
	@Override
	public void Perform() {
        System.out.println("Earth attack");
	}

}
class FireAttack implements IAttackType{
	@Override
	public void Perform() {
        System.out.println("Fire attack");
	}

}
class NormalAttack implements IAttackType{
	@Override
	public void Perform() {
        System.out.println("Normal attack");
	}

}
