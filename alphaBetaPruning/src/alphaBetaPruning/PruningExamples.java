package alphaBetaPruning;

public class PruningExamples {
    public static void main(String[] args) {
        Node root = InitialTree.buildSampleTree1();
        System.out.println("Tree before Alpha-Beta Pruning:");
        InitialTree.print(root);
        
        //pruning first example
        int bestValue = AlphaBetaPruning.alphaBeta(root, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        System.out.println("Best utility value for Max from Alpha-Beta Pruning: " + bestValue);
        
        int bestValue2 = AlphaBetaPruning.alphaBeta(root, Integer.MIN_VALUE, Integer.MAX_VALUE, false);
        System.out.println("Best utility value for Min from Alpha-Beta Pruning: " + bestValue2);
        
        root = InitialTree.buildSampleTree2();
        System.out.println("Tree before Alpha-Beta Pruning:");
        InitialTree.print(root);
        
        //pruning second example
        bestValue = AlphaBetaPruning.alphaBeta(root, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        System.out.println("Best utility value for Max from Alpha-Beta Pruning: " + bestValue);
        
        bestValue2 = AlphaBetaPruning.alphaBeta(root, Integer.MIN_VALUE, Integer.MAX_VALUE, false);
        System.out.println("Best utility value for Min from Alpha-Beta Pruning: " + bestValue2);
        
        root = InitialTree.buildSampleTree3();
        System.out.println("Tree before Alpha-Beta Pruning:");
        InitialTree.print(root);
        
        //pruning third example
        bestValue = AlphaBetaPruning.alphaBeta(root, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        System.out.println("Best utility value for Max from Alpha-Beta Pruning: " + bestValue);
        
        bestValue2 = AlphaBetaPruning.alphaBeta(root, Integer.MIN_VALUE, Integer.MAX_VALUE, false);
        System.out.println("Best utility value for Min from Alpha-Beta Pruning: " + bestValue2);
        
    }
}
