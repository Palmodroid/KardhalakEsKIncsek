package digitalgarden.kardhalakeskincsek;

public class Player
    {
    private World world;
    private Room whereAmI;

    public Player( World world )
        {
        this.world = world;
        whereAmI = world.create();
        }


    public String getDescriptionOfPosition()
        {
        return whereAmI.getDescription();
        }

    public String move( int direction )
        {
        if ( direction >= 0 && direction <= 3 )
            {
            String door = whereAmI.checkDoor( direction );

            if ( door != null )
                return door;

            Room r = whereAmI.getWay(direction);

            if ( r == null)
                {
                return null;
                }

            whereAmI = r;
            }

        return whereAmI.getDescription();
        }

    public String open()
        {
        if ( whereAmI.getDoor() != null )
            {
            whereAmI.getDoor().setOpen( true );
            return "Az ajtó kitárul!";
            }
        return null;
        }
    }
