package SorteOpgaver.ch11.aske1208_a_11_13;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class thirteen
{

    public boolean isUnique(Map<String, String> map)
    {
    Map<String, String> copyMap = map;


        try {
            for (Map.Entry<String, String> m : map.entrySet()) {
                map.remove(m.getKey());
                if (map.containsValue(m.getValue()) == true) {
                    return false;
                }
            }

        }catch (ConcurrentModificationException CMe)
        {

        }
        return true;
    }
}
