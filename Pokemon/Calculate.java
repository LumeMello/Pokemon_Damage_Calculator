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

		int minDamage = 0;
		int maxDamage = 0;
		int critDamage = 0;
		
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

		DamageCalculator(mk2,mk1);
		System.out.println(minDamage);
		System.out.println(maxDamage);
		System.out.println(critDamage);
	}
	
	private void DamageCalculator(Monster attacker, Monster defender) {
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

		if(defender.(attacker.move.type.toLowerCase()) != 0){
			if(defender.(attacker.move.type.toLowerCase()) == -2){
				fdamage = fdamage * 4;
			}else if(defender.(attacker.move.type.toLowerCase()) == -1){
				fdamage = fdamage * 2;
			}else if(defender.(attacker.move.type.toLowerCase()) == 1){
				fdamage = fdamage * 0.5;
			}else if(defender.(attacker.move.type.toLowerCase()) == 2){
				fdamage = fdamage * 0.25;
			}else{
				fdamage = 0;
			}
		}
		
		double fminDamage = fdamage * 0.85; 
		double fmaxDamage = fdamage; 
		double fcritDamage = fdamage * 1.5;
		
		minDamage = (int) fminDamage;
		maxDamage = (int) fmaxDamage;
		critDamage = (int) fcritDamage;
		
	}
}

