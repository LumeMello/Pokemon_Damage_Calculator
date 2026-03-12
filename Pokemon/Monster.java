package Pokemon;


public class Monster {
	
	
	Type type1 = Type.NORMAL;
	Type type2 = null;
	Pokemons name = Pokemons.VENUSAUR;
	
	Moves move = null;
	
	int level = 50;
	
	int Health = 1;
	int Attack = 1;
	int Defence = 1;
	int SpecialAttack = 1;
	int SpecialDefence = 1;
	int Speed = 1;
	
	int EV_Health = 0;
	int EV_Attack = 0;
	int EV_Defence = 0;
	int EV_SpecialAttack = 0;
	int EV_SpecialDefence = 0;
	int EV_Speed = 0;
	
	int IV_Health = 31;
	int IV_Attack = 31;
	int IV_Defence = 31;
	int IV_SpecialAttack = 31;
	int IV_SpecialDefence = 31;
	int IV_Speed = 31;
	
	Nature nature = Nature.Bashful;
	
	Ability ability = Ability.ADAPTABILITY;
	
	Itens item = Itens.BLACK_BELT;
	
	int bug = 0;
	int dark;
	int dragon = 0;
	int eletric= 0;
	int fairy = 0;
	int fighting = 0;
	int fire = 0;
	int flying = 0;
	int ghost = 0;
	int grass = 0;
	int ground = 0;
	int ice = 0;
	int normal = 0;
	int poison = 0;
	int psychic = 0;
	int rock = 0;
	int steel = 0;
	int water = 0;
	
	
	public int getTypeRelations(String type) {
	    switch (type) {
	        case "bug": return this.bug;
	        case "dark": return this.dark;
	        case "dragon": return this.dragon;
	        case "eletric": return this.eletric;
	        case "fairy": return this.fairy;
	        case "fighting": return this.fighting;
	        case "fire": return this.fire;
	        case "flying": return this.flying;
	        case "ghost": return this.ghost;
	        case "grass": return this.grass;
	        case "ground": return this.ground;
	        case "ice": return this.ice;
	        case "normal": return this.normal;
	        case "poison": return this.poison;
	        case "psychic": return this.psychic;
	        case "rock": return this.rock;
	        case "steel": return this.steel;
	        case "water": return this.water;
	        default: return 0;
	    }
	}
}
