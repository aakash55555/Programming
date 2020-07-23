import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static String solution(int N, String artifacts, String searched) {
        int ship_sink = 0, ship_hit = 0, top, left, right, bottom;
        Set<String> hits = new HashSet<>(Arrays.asList(searched.split(" ")));
        String[] ships = artifacts.split(",");
        for (String ship : ships) {
            Set<String> ship_components = new HashSet<>();
            String[] split_top_bottom = ship.split(" ");	
            if(split_top_bottom[0].charAt(1) > 57)
            	top = Integer.parseInt(split_top_bottom[0].charAt(0)+"");
            else {
            	top = Integer.parseInt(split_top_bottom[0].charAt(0)+""+split_top_bottom[0].charAt(1)+"");
            }
            if(top > 9) {
            	left = split_top_bottom[0].charAt(2); 
            }
            else {
            	left = 	split_top_bottom[0].charAt(1);
            }
            if(split_top_bottom[1].charAt(1) > 57) {
            	bottom = Integer.parseInt(split_top_bottom[1].charAt(0)+"");
            }
            else {
            	bottom = Integer.parseInt(split_top_bottom[1].charAt(0)+""+split_top_bottom[1].charAt(1)+"");
            }
            if(bottom > 9) {
            	right = split_top_bottom[1].charAt(2); 
            }
            else {
            	right = split_top_bottom[1].charAt(1);
            }
            for (int i = top; i <= bottom; i++) {
                for (int j = left; j <= right; j++) {
                    ship_components.add("" + i + (char) j);
                }
            }
            if (hits.containsAll(ship_components)) {
                ship_sink++;
            } else {
                for (String com : ship_components) {
                    if (hits.contains(com)) {
                        ship_hit++;
                        break;
                    }
                }
            }

        }

        return "" + ship_sink + "," + ship_hit;

    }

    public static void main(String[] args) {
        //  String ans = solution(4,"1B 2C,2D 4D","2B 2D 3D 4D 4A");
        String ans = solution(12, "1A 2A,12A 12A", "12A");
        System.out.println(ans);

    }
}