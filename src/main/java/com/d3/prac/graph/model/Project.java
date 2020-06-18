package com.d3.prac.graph.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Project {
    public enum State { VISITED, VISITING, UNVISITED };
    private ArrayList<Project> children = new ArrayList<>();
    private HashMap<String, Project> map = new HashMap<>();
    private String name;
    private State state = State.UNVISITED;

    public Project(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void addNeighbor(Project node) {
        if(!map.containsKey(node.getName())) {
            children.add(node);
            map.put(node.getName(), node);
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State st) {
        state = st;
    }

    public ArrayList<Project> getChildren() {
        return children;
    }
}
