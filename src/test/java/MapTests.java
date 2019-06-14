import DataStructs.MapNode;
import DataStructs.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class MapTests {

    @Test
    public void depthFirstSearch() {

        MapNode[] mapNodes = new MapNode[7];
        for (int i = 0; i < 7; i++) {
            mapNodes[i] = new MapNode("" + (i + 1));
        }

        mapNodes[0].addNeighbor(mapNodes[1]);
        mapNodes[0].addNeighbor(mapNodes[2]);
        mapNodes[0].addNeighbor(mapNodes[3]);
        mapNodes[0].addNeighbor(mapNodes[4]);
        mapNodes[2].addNeighbor(mapNodes[5]);
        mapNodes[2].addNeighbor(mapNodes[6]);

        assertEquals(mapNodes[0].depthFirstSearch(), new ArrayList<String>(Arrays.asList(new String[]{"1", "2", "3", "6", "7", "4", "5"})));
    }

    @Test
    public void depthFirstSearchRecur() {
        MapNode[] mapNodes = new MapNode[7];
        for (int i = 0; i < 7; i++) {
            mapNodes[i] = new MapNode("" + (i + 1));
        }

        mapNodes[0].addNeighbor(mapNodes[1]);
        mapNodes[0].addNeighbor(mapNodes[2]);
        mapNodes[0].addNeighbor(mapNodes[3]);
        mapNodes[0].addNeighbor(mapNodes[4]);
        mapNodes[2].addNeighbor(mapNodes[5]);
        mapNodes[2].addNeighbor(mapNodes[6]);

        assertEquals(mapNodes[0].depthFirstSearchRecur(), new ArrayList<String>(Arrays.asList(new String[]{"1", "2", "3", "6", "7", "4", "5"})));
    }

    @Test
    public void breadthFirstSearch() {
        MapNode[] mapNodes = new MapNode[7];
        for (int i = 0; i < 7; i++) {
            mapNodes[i] = new MapNode("" + (i + 1));
        }
        mapNodes[0].addNeighbor(mapNodes[1]);
        mapNodes[0].addNeighbor(mapNodes[2]);
        mapNodes[0].addNeighbor(mapNodes[3]);
        mapNodes[0].addNeighbor(mapNodes[4]);
        mapNodes[2].addNeighbor(mapNodes[5]);
        mapNodes[2].addNeighbor(mapNodes[6]);

        assertEquals(mapNodes[0].breadthFirstSearch(), new ArrayList<String>(Arrays.asList(new String[]{"1", "2", "3", "4", "5", "6", "7"})));
    }


}
