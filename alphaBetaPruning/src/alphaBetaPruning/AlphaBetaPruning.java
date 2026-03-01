package alphaBetaPruning;

public class AlphaBetaPruning {
    public static int alphaBeta(Node node, int alpha, int beta, boolean isMaximizing) {
    	
    	if (node.isLeaf()) {
            return node.getValue();
        }

        if (isMaximizing) {
            int maxEval = Integer.MIN_VALUE;
            for (Node child : node.getChildren()) {
                int eval = alphaBeta(child, alpha, beta, false);
                maxEval = Math.max(maxEval, eval);
                alpha = Math.max(alpha, eval);
                if (beta <= alpha)
                    break;
            }
            if(node.getValue()!= null) {
                maxEval = node.getValue();
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;
            for (Node child : node.getChildren()) {
                int eval = alphaBeta(child, alpha, beta, true);
                minEval = Math.min(minEval, eval);
                beta = Math.min(beta, eval);
                if (beta <= alpha)
                    break;
            }
            if(node.getValue()!= null) {
            	 minEval = node.getValue();
            }
           
            return minEval;
        }
    }
}
