import java.util.List;

public class Board {
    private List<Piece> board;

    public Board() {

    }

    public Board(String fen) {

    }

    private int getIndex(String pos) {
        return -1;
    }

    private int getIndex(char file, int rank) {
        return -1;
    }

    public boolean movePiece(String oldPos, String newPos) {
        return false;
    }
}
