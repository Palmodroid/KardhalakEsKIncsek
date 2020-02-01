package digitalgarden.kardhalakeskincsek.utils;

public class Text
    {
    private String shortDescription;
    private String longDescription;

    private boolean alreadyShown = false;

    public Text(String shortDescription, String longDescription)
        {
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        }

    public String get(boolean isShort)
        {
        return isShort ? shortDescription : longDescription;
        }

    public String get()
        {
        if ( alreadyShown )
            return shortDescription;

        alreadyShown = true;
        return longDescription;
        }

    }
