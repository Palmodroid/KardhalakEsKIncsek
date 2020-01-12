package digitalgarden.kardhalakeskincsek.utils;

import java.util.ArrayList;

public class NumeratedArray<E> extends ArrayList<E>
    {
    public NumeratedArray()
        {
        super();
        }

    public int addElement(E e)
        {
        add(e);

        return size() - 1;
        }


    }
