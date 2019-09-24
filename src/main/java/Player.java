import lombok.Data;

@Data
public class Player {

    private int life;
    private Board board;

    public Player(int life) {

        this.life = life;

    }

}