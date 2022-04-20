package Asessment1DFSBFS;

import java.util.List;


public class DFS {
    
    public DFS(){

    }

    public Node getTarget(Node startNode){

        Node result = null;

        if(startNode.getData().contains("Exit")) {
            return startNode;
        } else if (startNode.getChildren().size() != 0){
            for (Node node : startNode.getChildren()) {
                result = getTarget(node);
                if (result != null) {
                    return result;
                }
            }
        }
        return result;
    }
}
