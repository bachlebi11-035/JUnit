import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class CharacterSameTest {
    public CharactersSame character;

    @BeforeEach
    public void init(){
        character = new CharactersSame();
    }

    /**
     * Not all character the same in string
     */
    @Test
    public void notSame(){
        String str = "aaab";
        Assertions.assertFalse(character.isAllCharactersSame(str));
    }

    /**
     * Same character in string
     */
    @Test
    public void sameAlphabet(){
        String str = "aaaa";
        Assertions.assertTrue(character.isAllCharactersSame(str));
    }

    /**
     * Same character in string
     */
    @Test
    public void sameNumber(){
        String num = "1111";
        Assertions.assertTrue(character.isAllCharactersSame(num));
    }

    /**
     * Empty string
     */
    @Test
    public void emptyString(){
        String str = "";
        Assertions.assertTrue(character.isAllCharactersSame(str));
    }

    /**
     * Same character but string longer than int max value
     */
    @Test
    public void tooLongString(){
        String str = "a";
        String newstr = str.repeat(Integer.MAX_VALUE+1);
        Assertions.assertTrue(character.isAllCharactersSame(newstr));
    }
}
