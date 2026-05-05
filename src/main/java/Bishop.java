import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    @Override
    public List<Pos> getPossibleMoves(Pos currPos, Board board) {
        return new ArrayList<>();
    }
}
