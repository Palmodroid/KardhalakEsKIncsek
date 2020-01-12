package digitalgarden.kardhalakeskincsek;

public class Command
    {
    private Word[] words = new Word[] {
            new Word( "", -2),
            new Word( "eszak", 0),
            new Word( "kelet", 1),
            new Word( "del", 2),
            new Word( "nyugat", 3),
            new Word( "e", 0),
            new Word( "k", 1),
            new Word( "d", 2),
            new Word( "ny", 3) };

    public int getMeaning( String command )
        {
        int m = -1;
        for (Word word : words)
            {
            if ( (m = word.getMeaningIfEquals(command)) >= 0 )
                break;
            }
        return m;
        }
    }
