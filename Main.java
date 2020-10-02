

public class Main {
    public static void main(String[] args) {

        Graph< String, Integer> part1 = new Graph<>();
        Graph< String, Integer> part2 = new Graph<>();

        part1.addEdge("1", "2", 10);
        part1.addEdge("2", "3", 20);
        part1.addEdge("3", "4", 30);
        part1.addEdge("3", "5", 15);
        part2.addEdge("6", "7", 20);

        System.out.println(part1);
        System.out.println(part2);

        

    }
}
