

public class Frame {
    private String moves;
    public Frame(String moves) {
        this.moves = moves;
    }

    public int calculateScore() {
        if (moves.equals("X")) {
            return 10;
        }

        if (moves.charAt(1) == '/') {
            return 10;
        }

        moves = moves.replaceAll("-","0");

        int turnOne = Character.getNumericValue(moves.charAt(0));
        int turnTwo = Character.getNumericValue(moves.charAt(1));

        return  turnOne + turnTwo;

        //return 0;
    }
}
