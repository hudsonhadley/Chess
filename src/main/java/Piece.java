import java.util.List;

public abstract class Piece {
    private boolean isWhite;

    public abstract List<Pos> getPossibleMoves();
}
