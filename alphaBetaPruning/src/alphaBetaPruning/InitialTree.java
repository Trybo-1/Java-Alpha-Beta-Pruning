package alphaBetaPruning;

public class InitialTree {
	public static Node buildSampleTree1() {
        Node A = new Node("A",null);
        Node B = new Node("B",null);
        Node C = new Node("C",null);
        Node D = new Node("D",null);
        Node E = new Node("E",null);
        Node F = new Node("F",null);
        Node G = new Node("G",null);
        
        A.addChild(B);
        A.addChild(C);
        
        B.addChild(D);
        B.addChild(E);
        
        C.addChild(F);
        C.addChild(G);

        D.addChild(new Node("H",7));
        D.addChild(new Node("I",6));

        E.addChild(new Node("J",8));
        E.addChild(new Node("K",-10));

        F.addChild(new Node("L",2));
        F.addChild(new Node("M",1));

        G.addChild(new Node("N",-15));
        G.addChild(new Node("O",-10));

        return A;
    }
	public static Node buildSampleTree2() {
        Node A = new Node("A",null);
        Node B = new Node("B",1);
        Node C = new Node("C",5);

        
        A.addChild(B);
        A.addChild(C);

        return A;
    }
	public static Node buildSampleTree3() {
        Node A = new Node("A",null);
        Node B = new Node("B",null);
        Node C = new Node("C",null);
        Node D = new Node("D",null);
        Node E = new Node("E",null);
        Node F = new Node("F",null);
        Node G = new Node("G",null);
        Node H = new Node("H",null);
        Node I = new Node("I",null);
        Node J = new Node("J",null);
        Node K = new Node("K",null);
        Node L = new Node("L",null);
        Node M = new Node("M",null);
        Node N = new Node("N",null);
        Node O = new Node("O",null);
        
        A.addChild(B);
        A.addChild(C);
        
        B.addChild(D);
        B.addChild(E);
        
        C.addChild(F);
        C.addChild(G);

        D.addChild(H);
        D.addChild(I);

        E.addChild(J);
        E.addChild(K);

        F.addChild(L);
        F.addChild(M);

        G.addChild(N);
        G.addChild(O);
        
        H.addChild(new Node("H1",-1));
        H.addChild(new Node("H2",5));
        
        I.addChild(new Node("I1",3));
        I.addChild(new Node("I1",7));
        
        J.addChild(new Node("J1",19));
        J.addChild(new Node("J1",4));
        
        K.addChild(new Node("K1",-12));
        K.addChild(new Node("K1",-4));
        
        L.addChild(new Node("L1",1));
        L.addChild(new Node("L1",7));
        
        M.addChild(new Node("M1",5));
        M.addChild(new Node("M1",8));
        
        N.addChild(new Node("N1",4));
        N.addChild(new Node("N1",2));

        O.addChild(new Node("O1",-3));
        O.addChild(new Node("O1",0));
        return A;
    }

	 public static  void print(Node root) {
         if (root == null) return;
         System.out.println(format(root));
         for (int i = 0; i < root.getChildren().size(); i++) {
             boolean isLast = (i == root.getChildren().size() - 1);
             print(root.getChildren().get(i), "", isLast);
         }
     }

     private static void print(Node node, String prefix, boolean isLast) {
         System.out.println(prefix + (isLast ? "|__ " : "|-- ") + format(node));
         String childPrefix = prefix + (isLast ? "    " : "|  ");
         for (int i = 0; i < node.getChildren().size(); i++) {
             boolean lastChild = (i == node.getChildren().size() - 1);
             print(node.getChildren().get(i), childPrefix, lastChild);
         }
     }

     private static String format(Node node) {
         return node.getValue() == null ? node.getName() : node.getName() + " (" + node.getValue() + ")";
     }
    }

