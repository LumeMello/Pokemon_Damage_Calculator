package Pokemon;

import java.lang.Math;


public enum Nature {
	Hardy,
	Lonely,
	Adamant,
	Naughty,
	Brave, 
	Bold,
	Docile,
	Impish,
	Lax,
	Relaxed,
	Modest,
	Mild,
	Bashful,
	Rash,
	Quiet,
	Calm,
	Gentle,
	Careful,
	Quirky,
	Sassy,
	Timid,
	Hasty,
	Jolly,
	Naive,
	Serious;
	
	public void NatureData(Monster monster) {
		if(monster.nature == Nature.Bold || monster.nature == Nature.Modest || monster.nature == Nature.Calm || monster.nature == Nature.Timid) {
			monster.Attack = (int) (Math.floor(monster.Attack * 0.9));
		}else if(monster.nature == Nature.Lonely || monster.nature == Nature.Mild || monster.nature == Nature.Gentle || monster.nature == Nature.Hasty) {
			monster.Defence = (int) (Math.floor(monster.Defence * 0.9));
		}else if(monster.nature == Nature.Adamant || monster.nature == Nature.Impish || monster.nature == Nature.Careful || monster.nature == Nature.Jolly) {
			monster.SpecialAttack = (int) (Math.floor(monster.SpecialAttack * 0.9));
		}else if(monster.nature == Nature.Naughty || monster.nature == Nature.Lax || monster.nature == Nature.Rash || monster.nature == Nature.Naive) {
			monster.SpecialDefence = (int) (Math.floor(monster.SpecialDefence * 0.9));
		}else if(monster.nature == Nature.Brave || monster.nature == Nature.Relaxed || monster.nature == Nature.Quiet || monster.nature == Nature.Sassy) {
			monster.Speed = (int) (Math.floor(monster.Speed * 0.9));
		}
		
		if(monster.nature == Nature.Lonely || monster.nature == Nature.Adamant || monster.nature == Nature.Naughty || monster.nature == Nature.Brave) {
			monster.Attack = (int) (Math.floor(monster.Attack * 1.1));
		}else if(monster.nature == Nature.Bold || monster.nature == Nature.Impish || monster.nature == Nature.Lax || monster.nature == Nature.Relaxed) {
			monster.Defence = (int) (Math.floor(monster.Defence * 1.1));
		}else if(monster.nature == Nature.Modest || monster.nature == Nature.Mild || monster.nature == Nature.Rash || monster.nature == Nature.Quiet) {
			monster.SpecialAttack = (int) (Math.floor(monster.SpecialAttack * 1.1));
		}else if(monster.nature == Nature.Calm || monster.nature == Nature.Gentle || monster.nature == Nature.Careful || monster.nature == Nature.Sassy) {
			monster.SpecialDefence = (int) (Math.floor(monster.SpecialDefence * 1.1));
		}else if(monster.nature == Nature.Timid || monster.nature == Nature.Hasty || monster.nature == Nature.Jolly || monster.nature == Nature.Naive) {
			monster.Speed = (int) (Math.floor(monster.Speed * 1.1));
		}
	}
}
