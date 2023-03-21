import java.util.Random;

public class Randomiser {

    public static Character createChar(){
        return new Character(
                Character.nameTier[new Random().nextInt(Character.nameTier.length)],
                Character.weaponTier[new Random().nextInt(Character.weaponTier.length)],
                Character.damageTier[new Random().nextInt(Character.damageTier.length)]
        );
    }
}
