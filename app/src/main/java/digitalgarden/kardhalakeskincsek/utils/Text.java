package digitalgarden.kardhalakeskincsek.utils;

public class Text
    {
    private String shortDescription;
    private String longDescription;

    public Text(String shortDescription, String longDescription)
        {
        this.longDescription = longDescription;
        this.shortDescription = shortDescription;
        }

    public String get(boolean isShort)
        {
        return isShort ? shortDescription : longDescription;
        }
    }
