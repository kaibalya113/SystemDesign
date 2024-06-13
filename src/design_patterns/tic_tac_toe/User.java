package design_patterns.tic_tac_toe;

public class User {
    // in user class username is required and which symbole he pick is also matter
    private String userName;
    private Piece piece;

    public User(String userName, Piece piece) {
        this.userName = userName;
        this.piece = piece;
    }
}
