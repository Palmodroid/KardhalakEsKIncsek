package digitalgarden.kardhalakeskincsek;

public class World
    {
    // A sorrend nagyon fontos, mert a szobákra a sorszámukkal hivatkozunk (0, 1, 2, 3...)
    private Room[] room = new Room[] {
            new Room("Középső", "A terem közepén állsz", 1, 2, 3, 4),
            new Room("Észak", "A hideg északon vagy", -1, 2, 0, 4),
            new Room("Kelet", "A nap kel fel előtted", 1, -1, 3, 0),
            new Room("Dél", "A forró délre tekintesz", 0, 2, -1, 4),
            new Room("Nyugat", "Árnyékod nyugatra vetül", 1, 0, 3, -1) };

    public int getNumberOfRooms()
        {
        return room.length;
        }

    public Room getRoom(int roomNumber)
        {
        return room[roomNumber];
        }

    }
