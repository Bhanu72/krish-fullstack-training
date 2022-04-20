package com.company;

public class Main {

    public static void main(String[] args) {

        //creating graphs and calling function to find articulation points.
        Graph graph_1 = new Graph(6);
        graph_1.add_an_edge(1,0);
        graph_1.add_an_edge(0,5);
        graph_1.add_an_edge(1,3);
        graph_1.add_an_edge(1,2);
        graph_1.add_an_edge(2,3);
        graph_1.add_an_edge(2,4);
        graph_1.add_an_edge(3,4);
        System.out.println("Articulation points in Graph 1 are ");
        graph_1.findArticulationPoints();
        System.out.println();

        Graph graph_2 = new Graph(5);
        graph_2.add_an_edge(0,1);
        graph_2.add_an_edge(0,3);
        graph_2.add_an_edge(0,4);
        graph_2.add_an_edge(1,3);
        graph_2.add_an_edge(3,4);
        graph_2.add_an_edge(1,2);
        graph_2.add_an_edge(3,2);
        System.out.println("Articulation points in Graph 2 are ");
        graph_2.findArticulationPoints();
        System.out.println();

    }
}
