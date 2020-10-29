package Game;

public class Square
{
    private String squareName;
    private int squareValue;

    public Square(String squareName, int squareValue)
    {
        this.squareName = squareName;
        this.squareValue = squareValue;
    }

    public String getName()
    {
        return squareName;
    }
    public int getValue()
    {
        return squareValue;
    }

    public void setName(String squareName)
    {
        this.squareName = squareName;
    }
    public void SetValue(int SquareValue)
    {
        this.squareValue = squareValue;
    }

}
