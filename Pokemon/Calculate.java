package Pokemon;

public class Calculate {
	public static void main(String[] args) {
		TypeRelations tr = new TypeRelations();
		Monster mk1 = new Monster();
		mk1.name = Pokemons.CHARIZARD;
		mk1.name.PokemonData(mk1);
		
		Monster mk2 = new Monster();
		mk2.name = Pokemons.VENUSAUR;
		mk2.name.PokemonData(mk2);
		mk2.move = Moves.ABSORB;
		
		System.out.println(mk2.name);
		System.out.println(mk2.Health);
		System.out.println(mk2.Attack);
		System.out.println(mk2.Defence);
		System.out.println(mk2.SpecialAttack);
		System.out.println(mk2.SpecialDefence);
		System.out.println(mk2.Speed);
		System.out.println(mk2.type1);
		System.out.println(mk2.type2);
		
		tr.CalculateRelations(mk1);
		tr.CalculateRelations(mk2);
		
		System.out.println("Bug:" + mk1.bug);
		
		mk2.move.MoveData(mk2);
		System.out.println(mk2.move.power);
	}
	
	private int DamageCalculator(Monster attacker, Monster defender) {
		double fdamage;
		if(attacker.move.category == Category.PHYSICAL) {
			fdamage = (((2*attacker.level+10)/250) * ((attacker.move.power*attacker.Attack)/defender.Defence) +2);
		}else if(attacker.move.category == Category.SPECIAL) {
			fdamage = (((2*attacker.level+10)/250) * ((attacker.move.power*attacker.SpecialAttack)/defender.SpecialDefence) +2);
		}else {
			fdamage = 0;
		}
		
		if(attacker.move.type == attacker.type1 || attacker.move.type == attacker.type2) {
			fdamage = fdamage * 1.5;
		}
		
		
		
		int damage = (int) fdamage;
		return damage;
	}
}
