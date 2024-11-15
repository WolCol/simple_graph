public class Adja {
    private boolean[][] adja;
    private Knot[] knots;
    private int currentKnots, maxKnots;

    public Adja(int amountKnots){
        adja = new boolean[amountKnots][amountKnots];
        knots = new Knot[amountKnots];
        maxKnots = amountKnots;
    }

    public void addKnot(Knot k){
        if(currentKnots<maxKnots){
            knots[currentKnots] = k;
            currentKnots++;
        }
        else{
            System.out.println("Error on Line 18.");
        }
    }

    public void addEdge(int start, int end){
        if(start > maxKnots || end > maxKnots){
            System.out.println("Error on Line 24.");
        }
        else{
            adja[start][end] = true;
            adja[end][start] = true;
        }
    }

    public void printAdja(){
        System.out.print("    ");
        for(int i=0; i<maxKnots; i++){
            System.out.print(knots[i].getName() + "    ");
        }
        System.out.println("    ");
        for(int i=0; i<maxKnots; i++){
            System.out.print(knots[i].getName() + "    ");
            for(int j=0; j<maxKnots; j++){
                if(adja[i][j]){
                    System.out.print("x    ");
                }
                else{
                    System.out.print("-    ");
                }
            }
            System.out.println("    ");
        }
        System.out.println("    ");
    }
}
