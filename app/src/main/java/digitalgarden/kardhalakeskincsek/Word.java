package digitalgarden.kardhalakeskincsek;

public class Word
    {
    private String text;
    private int meaning;

    public Word(String text, int meaning)
        {
        this.text = text;
        this.meaning = meaning;
        }

    public int getMeaningIfEquals( String command )
        {
        return text.equals(command) ? meaning : -1;
        }
    }
