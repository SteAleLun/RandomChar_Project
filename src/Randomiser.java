import java.util.Random;

public class Randomiser {

    public static final String[] nameTier = {
            "Marvin Sagar",
            "Gehrt Kimberley",
            "Issac Luther",
            "Ivan Nibley",
            "Renald Jasper"
    };

    public static final String[] weaponTier = {
            "Spellbinder",
            "Barrage",
            "Benediction",
            "Dire Idol",
            "Windsong Cane"
    };

    public static final int[] damageTier = {
            100,
            135,
            150,
            180,
            210
    };

    public static Character createChar(){
        return new Character(
                nameTier[new Random().nextInt(nameTier.length)],
                weaponTier[new Random().nextInt(weaponTier.length)],
                damageTier[new Random().nextInt(damageTier.length)]
        );
    }
}
