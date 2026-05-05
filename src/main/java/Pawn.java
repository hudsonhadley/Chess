import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    @Override
    public List<Pos> getPossibleMoves() {
        return new ArrayList<>();
    }
}
