/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mapslab1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author prausch
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, Player> players = new HashMap<Integer, Player>();
        
        Player p1 = new Player(1, "Bob", 7);
        Player p2 = new Player(2, "Joe", 2);
        Player p3 = new Player(3, "John", 1);
        
        players.put(1, p1);
        players.put(2, p2);
        players.put(3, p3);
    }
}
