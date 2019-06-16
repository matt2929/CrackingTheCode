package DataStructs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MapNode {

    private String data;
    private ArrayList<MapNode> neighbors = new ArrayList<>();

    public MapNode(String data) {
        this.data = data;
    }

    public void addNeighbor(MapNode mapNode) {
        neighbors.add(mapNode);
    }

    public ArrayList<MapNode> getNeighbors() {
        return this.neighbors;
    }

    public String getData() {
        return data;
    }

    public ArrayList<String> depthFirstSearch() {
        Stack<MapNode> mapNodes = new Stack<>();
        mapNodes.add(this);
        ArrayList<String> out = new ArrayList<>();
        while (mapNodes.size() != 0) {
            MapNode node = mapNodes.pop();
            out.add(node.data);
            for (MapNode adjacent : node.getNeighbors()) {
                mapNodes.push(adjacent);
            }

        }
        return out;
    }

    public ArrayList<String> depthFirstSearchRecur() {
        ArrayList<String> out = new ArrayList<>();
        depthFirstSearchRecur(this, out);
        return out;
    }



    private void depthFirstSearchRecur(MapNode mapNode, ArrayList<String> visited) {
        if (mapNode != null) {
            visited.add(mapNode.data);
            for (MapNode neighbor : mapNode.getNeighbors()) {
                depthFirstSearchRecur(neighbor, visited);
            }

        }
    }

    public ArrayList<String> breadthFirstSearch() {
        Queue<MapNode> mapNodes = new LinkedList<>();
        mapNodes.add(this);
        ArrayList<String> out = new ArrayList<>();
        while (mapNodes.size() != 0) {
            MapNode node = mapNodes.poll();
            for (MapNode adjacent : node.getNeighbors()) {
                mapNodes.add(adjacent);
            }
            out.add(node.data);
        }
        return out;
    }
}
