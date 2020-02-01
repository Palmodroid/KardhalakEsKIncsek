package digitalgarden.kardhalakeskincsek;

import digitalgarden.kardhalakeskincsek.utils.Text;

public class Room
    {
    private Text description;

    public static final int NORTH = 0;
    public static final int EAST = 1;
    public static final int SOUTH = 2;
    public static final int WEST = 3;

    private Room[] ways = new Room[4];

    private Door door;
    private int directionOfDoor = -1;


    public Room(String shortDescription, String longDescription)
        {
        description = new Text(shortDescription, longDescription);
        }

    public void setWay(int direction, Room room)
        {
        ways[direction] = room;
        }

    public void setWay(Room north, Room east, Room south, Room west)
        {
        ways[NORTH] = north;
        ways[EAST] = east;
        ways[SOUTH] = south;
        ways[WEST] = west;
        }

    public void setDoor(Door door, int direction)
        {
        this.door = door;
        directionOfDoor = direction;
        }

    public String getDescription()
        {
        return description.get();
        }

    public String getDescription(boolean isShort)
        {
        return description.get(isShort);
        }

    public String checkDoor(int direction)
        {
        return ( directionOfDoor == direction && !door.isOpen() ) ? door.getDescription() : null;
        }

    public Door getDoor()
        {
        return door;
        }

    public Room getWay(int direction )
        {
        return ways[direction];
        }

    }
