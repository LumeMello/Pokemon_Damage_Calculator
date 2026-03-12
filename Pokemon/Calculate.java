package Pokemon;

public class Calculate {
	public static void main(String[] args) {
		TypeRelations tr = new TypeRelations();
		Monster mk1 = new Monster();
		mk1.name = Pokemons.CHARIZARD;
		mk1.name.PokemonData(mk1);
		mk1.level = 50;
		
		
		Monster mk2 = new Monster();
		mk2.name = Pokemons.VENUSAUR;
		mk2.nature = Nature.Modest;
		mk2.name.PokemonData(mk2);
		mk2.move = Moves.ROCK_TOMB;
		mk2.level = 50;
		
		tr.CalculateRelations(mk1);
		tr.CalculateRelations(mk2);
		
		mk2.move.MoveData(mk2);
		

		DamageCalculator(mk2,mk1);
		
	}
	
	private static void DamageCalculator(Monster attacker, Monster defender) {
		double fdamage;
		int minDamage = 0;
		int maxDamage = 0;
		int critDamage = 0;
		
		
		if(attacker.move.category == Category.PHYSICAL) {
			fdamage = ((((((2*attacker.level+10)/5) + 2) * ((attacker.move.power*attacker.Attack)/defender.Defence))/50 )+2);
		}else if(attacker.move.category == Category.SPECIAL) {
			fdamage = (((((2*attacker.level+10)/50) + 2) * ((attacker.move.power*attacker.SpecialAttack)/defender.SpecialDefence)/50 )+2);
		}else {
			fdamage = 0;
		}
		
		System.out.println(attacker.move.power);
		System.out.println(attacker.Attack);
		System.out.println(attacker.SpecialAttack);
		
		if(attacker.move.type == attacker.type1 || attacker.move.type == attacker.type2) {
			fdamage = fdamage * 1.5;
		}
		
		int typeMod = defender.getTypeRelations(attacker.move.type.toString());
		System.out.println(fdamage);

		if(typeMod != 0){
			if(typeMod == -2){
				fdamage = fdamage * 4;
			}else if(typeMod == -1){
				fdamage = fdamage * 2;
			}else if(typeMod == 1){
				fdamage = fdamage * 0.5;
				if(fdamage == 0) {
					fdamage++;
				}
			}else if(typeMod== 2){
				fdamage = fdamage * 0.25;
				if(fdamage == 0) {
					fdamage++;
				}
			}else{
				fdamage = 0;
			}
		}
		System.out.println(fdamage);
				
		double fminDamage = fdamage * 0.85; 
		double fmaxDamage = fdamage; 
		double fcritDamage = fdamage * 1.5;
		
		minDamage = (int) fminDamage;
		maxDamage = (int) fmaxDamage;
		critDamage = (int) fcritDamage;
		
		System.out.println(minDamage);
		System.out.println(maxDamage);
		System.out.println(critDamage);
		
		
		
		
		
		
	}
}
