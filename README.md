# ＰＯＫéＭＯＮ_ＤＡＭＡＧＥ_ＣＡＬＣＵＬＡＴＯＲ 
> *"No guesswork. No loose ends. Just cold, hard numbers in the neon rain."*

Welcome to the **Null Dossier**. This is a Java-based combat simulation engine designed to calculate exact lethal force for competitive Pokémon battles. It cuts through the fog of war by pulling live target data directly from the PokéAPI, allowing you to plan your strikes with clinical precision.

In a world dictated by RNG and hidden stats, knowledge is your Chronos. 

---

### ＞_ ＰＲＥＲＥＱＵＩＳＩＴＥＳ

Before you accept the contract, ensure your rig is equipped with the following:
* **Java Development Kit (JDK) 11 or higher:** Required to run the simulation engine (specifically for the `java.net.http.HttpClient` neural link).
* **Active Network Connection:** The calculator fetches real-time dossiers (stats, types, move data) directly from `pokeapi.co`. Without a connection, the simulation flatlines.

---

### ＞_ ＩＮＳＴＡＬＬＡＴＩＯＮ

Extract the files into your local directory. Open your terminal—the glow of the phosphor screen is all you need.

**1. Clone the repository (or download the source):**
```bash
git clone https://github.com/LumeMello/Pokemon_Damage_Calculator.git
cd Pokemon_Damage_Calculator
```
**2. Compile the source code:
Target the Pokemon package directory to link all dependencies.

```bash
javac Pokemon/*.java
```
###＞_ ＵＳＡＧＥ // ＰＬＡＮＮＩＮＧ_ＴＨＥ_ＳＴＲＩＫＥ
This isn't a point-and-click toy; it's a developer's tool. To simulate a battle, you must edit your contract briefing directly in the Calculate.java file.

**1. Open Calculate.java
This is your staging area. Configure your Attacker (mk2 in the default script) and your Defender (mk1).

**2. Assign Variables
Equip your operatives with the necessary data. You can set their Base Pokemon, Level, Nature, and the specific Move you plan to execute.

Java
// Example Contract Briefing:
Monster target = new Monster();
target.name = Pokemons.CHARIZARD;
target.name.PokemonData(target); // Fetches live API data
target.level = 50;
```
Monster operative = new Monster();
operative.name = Pokemons.VENUSAUR;
operative.nature = Nature.Modest;
operative.name.PokemonData(operative);
operative.move = Moves.ROCK_TOMB; // Select your move
operative.level = 50;
```
**3. Execute the Simulation
Once your parameters are set, save the file, recompile, and run the main class to see the projected damage output (Minimum, Maximum, and Critical strike values).

```bash
# Recompile after making changes
javac Pokemon/Calculate.java

# Execute the protocol
java Pokemon.Calculate
```
The terminal will spit out the raw damage calculations based on precise API stats, Type advantages, STAB, and modifiers. Assess the numbers. Execute your move.

Leave no survivors.
