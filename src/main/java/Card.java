import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {

    private String name;
    private int strength;
    private int toughness;

}
