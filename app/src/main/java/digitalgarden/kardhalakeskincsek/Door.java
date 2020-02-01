package digitalgarden.kardhalakeskincsek;

import digitalgarden.kardhalakeskincsek.utils.Text;

public class Door
    {
    private Text description;
    private boolean open = false;

    public Door(String shortDescription, String longDescription)
        {
        description = new Text(shortDescription, longDescription);
        }

    public void setWay(Room room1, int direction1, Room room2, int direction2)
        {
        room1.setDoor( this, direction1 );
        room2.setDoor( this, direction2 );
        }

    public String getDescription()
        {
        return open ? "" : description.get();
        }

    public void setOpen( boolean open )
        {
        this.open = open;
        }

    public boolean isOpen()
        {
        return open;
        }
    }
