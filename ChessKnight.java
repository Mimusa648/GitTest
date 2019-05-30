import java.util.HashSet;

public class ChessKnight {

    private HashSet<Knight.Point> move(Knight.Point point){
        HashSet<Knight.Point> result = new HashSet<>();
        for (int i = -2; i <= 2; i++) {
            for (int j = -2; j <=2; j++) {
                if (i !=0 && j !=0 && Math.abs(i) != Math.abs(j)){
                    result.add(new Knight.Point(point.getX()+i,point.getY()+j));
                }
            }
        }
        return result;
    }

    public HashSet<Knight.Point> generate(int x, int y){
        HashSet<Knight.Point> output = new HashSet<>();
        HashSet<Knight.Point> swap = new HashSet<>();
        output = filter( move(new Knight.Point(x,y)));
        for (int i = 1; i < 3; i++) {
            for (Knight.Point point: output) {
                swap.addAll(move(point));
            }
            output = filter(swap);
            swap.clear();
        }
        return output;
    }

    private HashSet<Knight.Point> filter (HashSet<Knight.Point> inputs){
        HashSet<Knight.Point> output = new HashSet<>();
        for (Knight.Point point: inputs) {
            if (isValid(point)){
                boolean duplicate = false;
                for (Knight.Point point2: output) {
                    if(point.getX() == point2.getX() && point.getY() == point2.getY()){
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate){
                    output.add(point);
                }
            }
        }
        return output;
    }

    private boolean isValid(Knight.Point point){
        return (point.getY() > 0 && point.getY() <9 && point.getX() > 0 && point.getX() <9 );
    }

    public void print(HashSet<Knight.Point> resultOutput){
        int [][] arr = new int[8][8];
        for (Knight.Point point: resultOutput) {
            arr[point.getX()-1][point.getY()-1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1){
                    System.out.print("♥ ");
                }
                else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
