package Pokemon;

public class TypeRelations {
	// >2 imunidade
	// 2 = duplaresistencia
	// 1 = ressistencia
	// 0 = neutro
	// -1 = fraqueza
	// -2 = dupla fraqueza
	public void CalculateRelations(Monster mk) {
		if(mk.type1 == Type.BUG) {
			mk.grass++;
			mk.fighting++;
			mk.ground++;
			mk.fire--;
			mk.flying--;
			mk.rock--;
		} else if(mk.type1 == Type.DARK) {
			mk.psychic +=4;
			mk.ghost++;
			mk.dark++;
			mk.fighting--;
			mk.bug--;
			mk.fairy--;
		}else if(mk.type1 == Type.DRAGON) {
			mk.grass++;
			mk.fire++;
			mk.water++;
			mk.eletric++;
			mk.ice--;
			mk.dragon--;
			mk.fairy--;
		}else if(mk.type1 == Type.ELETRIC) {
			mk.eletric++;
			mk.flying++;
			mk.steel++;
			mk.ground--;
		}else if(mk.type1 == Type.FAIRY) {
			mk.dragon+=4;
			mk.fighting++;
			mk.bug++;
			mk.dark++;
			mk.poison--;
			mk.steel--;
		}else if(mk.type1 == Type.FIGHTING) {
			mk.bug++;
			mk.rock++;
			mk.dark++;
			mk.flying--;
			mk.psychic--;
			mk.fairy--;
		}else if(mk.type1 == Type.FIRE) {
			mk.fire++;
			mk.bug++;
			mk.grass++;
			mk.ice++;
			mk.steel++;
			mk.fairy++;
			mk.water--;
			mk.ground--;
			mk.rock--;
		}else if(mk.type1 == Type.FLYING) {
			mk.ground+=4;
			mk.grass++;
			mk.fighting++;
			mk.bug++;
			mk.eletric--;
			mk.ice--;
			mk.rock--;
		}else if(mk.type1 == Type.GHOST) {
			mk.normal+=4;
			mk.fighting+=4;
			mk.poison++;
			mk.bug++;
			mk.dark--;
			mk.ghost--;
		}else if(mk.type1 == Type.GRASS) {
			mk.water++;
			mk.eletric++;
			mk.grass++;
			mk.ground++;
			mk.fire--;
			mk.ice--;
			mk.poison--;
			mk.flying--;
			mk.bug--;
		}else if(mk.type1 == Type.GROUND) {
			mk.eletric+=4;
			mk.poison++;
			mk.rock++;
			mk.water--;
			mk.grass--;
			mk.ice--;
		}else if(mk.type1 == Type.ICE) {
			mk.ice++;
			mk.fire--;
			mk.fighting--;
			mk.rock--;
			mk.steel--;
		}else if(mk.type1 == Type.NORMAL) {
			mk.ghost+=4;
			mk.fighting--;
		}else if(mk.type1 == Type.POISON) {
			mk.grass++;
			mk.fighting++;
			mk.poison++;
			mk.bug++;
			mk.fairy++;
			mk.ground--;
			mk.psychic--;
		}else if(mk.type1 == Type.PSYCHIC) {
			mk.fighting++;
			mk.psychic++;
			mk.bug--;
			mk.ghost--;
			mk.dark--;
		}else if(mk.type1 == Type.ROCK) {
			mk.normal++;
			mk.fire++;
			mk.poison++;
			mk.flying++;
			mk.water--;
			mk.grass--;
			mk.fighting--;
			mk.ground--;
			mk.steel--;
		}else if(mk.type1 == Type.STEEL) {
			mk.normal++;
			mk.grass++;
			mk.ice++;
			mk.flying++;
			mk.psychic++;
			mk.bug++;
			mk.rock++;
			mk.dragon++;
			mk.steel++;
			mk.fairy++;
			mk.fire--;
			mk.fighting--;
			mk.ground--;
		}else if(mk.type1 == Type.WATER) {
			mk.fire++;
			mk.water++;
			mk.ice++;
			mk.steel++;
			mk.eletric--;
			mk.grass--;
		}if(mk.type2 != null) {
			if(mk.type2 == Type.BUG) {
				mk.grass++;
				mk.fighting++;
				mk.ground++;
				mk.fire--;
				mk.flying--;
				mk.rock--;
			} else if(mk.type2 == Type.DARK) {
				mk.psychic +=4;
				mk.ghost++;
				mk.dark++;
				mk.fighting--;
				mk.bug--;
				mk.fairy--;
			}else if(mk.type2 == Type.DRAGON) {
				mk.grass++;
				mk.fire++;
				mk.water++;
				mk.eletric++;
				mk.ice--;
				mk.dragon--;
				mk.fairy--;
			}else if(mk.type2 == Type.ELETRIC) {
				mk.eletric++;
				mk.flying++;
				mk.steel++;
				mk.ground--;
			}else if(mk.type2 == Type.FAIRY) {
				mk.dragon+=4;
				mk.fighting++;
				mk.bug++;
				mk.dark++;
				mk.poison--;
				mk.steel--;
			}else if(mk.type2 == Type.FIGHTING) {
				mk.bug++;
				mk.rock++;
				mk.dark++;
				mk.flying--;
				mk.psychic--;
				mk.fairy--;
			}else if(mk.type2 == Type.FIRE) {
				mk.fire++;
				mk.bug++;
				mk.grass++;
				mk.ice++;
				mk.steel++;
				mk.fairy++;
				mk.water--;
				mk.ground--;
				mk.rock--;
			}else if(mk.type2 == Type.FLYING) {
				mk.ground+=4;
				mk.grass++;
				mk.fighting++;
				mk.bug++;
				mk.eletric--;
				mk.ice--;
				mk.rock--;
			}else if(mk.type2 == Type.GHOST) {
				mk.normal+=4;
				mk.fighting+=4;
				mk.poison++;
				mk.bug++;
				mk.dark--;
				mk.ghost--;
			}else if(mk.type2 == Type.GRASS) {
				mk.water++;
				mk.eletric++;
				mk.grass++;
				mk.ground++;
				mk.fire--;
				mk.ice--;
				mk.poison--;
				mk.flying--;
				mk.bug--;
			}else if(mk.type2 == Type.GROUND) {
				mk.eletric+=4;
				mk.poison++;
				mk.rock++;
				mk.water--;
				mk.grass--;
				mk.ice--;
			}else if(mk.type2 == Type.ICE) {
				mk.ice++;
				mk.fire--;
				mk.fighting--;
				mk.rock--;
				mk.steel--;
			}else if(mk.type2 == Type.NORMAL) {
				mk.ghost+=4;
				mk.fighting--;
			}else if(mk.type2 == Type.POISON) {
				mk.grass++;
				mk.fighting++;
				mk.poison++;
				mk.bug++;
				mk.fairy++;
				mk.ground--;
				mk.psychic--;
			}else if(mk.type2 == Type.PSYCHIC) {
				mk.fighting++;
				mk.psychic++;
				mk.bug--;
				mk.ghost--;
				mk.dark--;
			}else if(mk.type2 == Type.ROCK) {
				mk.normal++;
				mk.fire++;
				mk.poison++;
				mk.flying++;
				mk.water--;
				mk.grass--;
				mk.fighting--;
				mk.ground--;
				mk.steel--;
			}else if(mk.type2 == Type.STEEL) {
				mk.normal++;
				mk.grass++;
				mk.ice++;
				mk.flying++;
				mk.psychic++;
				mk.bug++;
				mk.rock++;
				mk.dragon++;
				mk.steel++;
				mk.fairy++;
				mk.fire--;
				mk.fighting--;
				mk.ground--;
			}else if(mk.type2 == Type.WATER) {
				mk.fire++;
				mk.water++;
				mk.ice++;
				mk.steel++;
				mk.eletric--;
				mk.grass--;
			}
		}
	}

}
