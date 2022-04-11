package com.company;

public class Main {

    public static void main(String[] args) {

        Vertex graph = new Vertex(5);
        graph.add(0,1);
        graph.add(0,2);
        graph.add(1,2);
        graph.add(2,3);

        graph.DFS(2);
    }
}
