package com.d3.prac.graph.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph {
    private ArrayList<Project> nodes = new ArrayList<Project>();
    private Map<String, Project> map = new HashMap<>();

    public Project getOrCreateNode(String name) {
        if (!map.containsKey(name)) {
            Project node = new Project(name);
            nodes.add(node);
            map.put(name, node);
        }
        return map.get(name);
    }

    public void addEdge(String startName, String endName) {
        Project start = getOrCreateNode(startName);
        Project end = getOrCreateNode(endName);
        start.addNeighbor(end);
    }

    public ArrayList<Project> getNodes() {
        return nodes;
    }
}
