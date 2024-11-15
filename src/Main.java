public class Main {
    public static void main(String[] args){
        Adja adja = new Adja(4);

        Knot k1 = new Knot("A");
        Knot k2 = new Knot("B");
        Knot k3 = new Knot("C");
        Knot k4 = new Knot("D");

        adja.addKnot(k1);
        adja.addKnot(k2);
        adja.addKnot(k3);
        adja.addKnot(k4);

        adja.addEdge(0, 3);
        adja.addEdge(3, 0);
        adja.addEdge(1, 3);
        adja.addEdge(3, 1);
        adja.addEdge(1,2);
        adja.addEdge(2,1);

        adja.printAdja();
    }
}