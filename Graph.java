import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph<K,E>{

    private Map<K, List<Node<K,E>>> G = null;

    public Graph() {
        G = new HashMap<>();
    }

    public boolean addEdge(K x, K y, E length) {

        if (!G.containsKey(x)) {
            G.put(x, new LinkedList<>());
        }
        G.get(x).add(new Node<>(x,y,length));

        return true;
    }


    public String toString() {
        String data = "";
        for(K key : G.keySet()) {
            data += key + " ==> [ " + G.get(key) + " ]\n";
        }
        return data;
    }
}
