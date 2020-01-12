package digitalgarden.kardhalakeskincsek;

public class Room
    {
    private String shortDescription;
    private String longDescription;

    private int[] doors;


    public Room(String shortDescription, String longDescription,
                int north, int east, int south, int west )
        {
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;

        doors = new int[] { north, east, south, west };
        }

    public String getDescription( boolean onlyShort )
        {
        return onlyShort ? shortDescription : longDescription;
        }

    public int getDoor( int direction )
        {
        return doors[direction];
        }

    }
