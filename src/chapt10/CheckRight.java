package chapt10;

import java.util.HashMap;

public class CheckRight  {
    private static HashMap<Integer, String> map = new HashMap<>();

    public static void startUsing(int id, String name) {
        if (canUse(id)) {
            map.put(id, name);
            System.out.println("Access granted");
        } else
            System.out.println("Access denied");
    }


    public static boolean canUse(int id) {
        final int MAX_NUM = 2;
        int currNum = 0;
        if(!map.containsKey(id))
            currNum = map.size();
        return currNum < MAX_NUM;
    }

}
