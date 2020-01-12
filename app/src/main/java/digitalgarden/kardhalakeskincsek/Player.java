package digitalgarden.kardhalakeskincsek;

public class Player
    {
    private int position;

    private World world;

    private boolean[] roomVisited;


    public Player( World world )
        {
        position = 0;

        this.world = world;

        roomVisited = new boolean[ world.getNumberOfRooms() ];

        for ( int n = 0 ; n < roomVisited.length ; n++ )
            {
            roomVisited[n] = false;
            }
        }

    public String getDescriptionOfPosition()
        {
        String d;

        d = world.getRoom( position ).getDescription( roomVisited[position]);
        roomVisited[position] = true;

        return d;
        }

    public boolean move( int direction )
        {
        if ( direction >= 0 && direction <= 3 )
            {
            int p = world.getRoom(position).getDoor(direction);

            if (p < 0)
                {
                return false;
                }

            position = p;
            }
        return true;
        }
    }
