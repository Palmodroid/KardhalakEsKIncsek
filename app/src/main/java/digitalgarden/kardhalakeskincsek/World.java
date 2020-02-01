package digitalgarden.kardhalakeskincsek;

import static digitalgarden.kardhalakeskincsek.Room.*;

public class World
    {
    public Room create()
        {
        Room centralRoom = new Room("Középső", "A terem közepén állsz");
        Room northRoom = new Room("Észak", "A hideg északon vagy");
        Room eastRoom = new Room("Kelet", "A nap kel fel előtted");
        Room southRoom = new Room("Dél", "A forró délre tekintesz");
        Room westRoom = new Room("Nyugat", "Árnyékod nyugatra vetül");

        centralRoom.setWay( northRoom, eastRoom, southRoom, westRoom );
        northRoom.setWay( SOUTH, centralRoom );
        northRoom.setWay( EAST, eastRoom );
        eastRoom.setWay( WEST, centralRoom );
        southRoom.setWay( NORTH, centralRoom );
        westRoom.setWay( EAST, centralRoom );

        Door centralEastDoor = new Door( "Zárva", "Zárt ajtó előtt állsz" );

        centralEastDoor.setWay( centralRoom, EAST, eastRoom, WEST );

        return centralRoom;
        }

    }
