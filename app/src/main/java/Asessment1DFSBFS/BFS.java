package Asessment1DFSBFS;

import java.util.ArrayList;

public class BFS {
    

    public BFS(){

    }

    public Node getTarget(ArrayList<Node> nodes){
        Node result = null;

        // Check binnengekomen nodes of ze de data zijn.
        for (Node node : nodes) {
            if (node.getData().contains("Exit")){
                return node;
            }
        }

        // Maak nieuwe arralyst om kinderen in op te slaan.
        ArrayList<Node> children = new ArrayList<>();

        // Plaats van elke node de kinderen in de arraylist.
        for (Node node : nodes){
            if (node.getChildren().size() != 0){
                for (Node child : node.getChildren()) {
                    children.add(child);
                }
            }
        }

        // Als de arraylist leeg is, kunnen we niks.
        if (children.isEmpty()){
            return result;
        } else { // Als de arralist niet leeg is, geven we elk kind mee om te bekijken of daar het target in zit.
            result = getTarget(children);
            // Als we het target hebben gevonden, geven we deze terug.
            if (result != null){
                return result;
            }
        }
        return result;
    }

}
