import java.util.*;

public class Knight {
    private int [][] gameboard;
    private int height;
    private int width;

    public Knight(int height, int width) {
        this.gameboard = new int [height][width];
        this.height = height;
        this.width = width;

    }

    public class Point{
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    private Point startingPoint(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter 1.number (1-8)");
        int x = myObj.nextInt();
        System.out.println("Enter 2.number (1-8)");
        int y = myObj.nextInt();
        return new Point(x,y);
    }

    private void valid(int num1, int num2){ //vypisanie ak bude zly vstup
        if(num1>8 || num1<1 || num2>8 || num2<1){
            System.out.println("Wrong input.");
        }
    }

    private HashSet<Point> results = new HashSet<>();

    private void printValid(int num1,int num2){ //osetrenie vstupov
        if( num1>8 || num1<1|| num2>8 || num2<1){
        } else {
//            System.out.println(num1+" "+num2);
            Point point = new Point(num1,num2);
            results.add(point);
        }
    }


    public void generatingFirstMove(){
        Point startP = startingPoint();
        valid(startP.getX(),startP.getY());
        int a,b;
        HashSet<Point> positions= new HashSet<>();
        for(a=-1;a<=1;a+=2){   //pismenko
            for(b=-2;b<=2;b+=4){  //cislo
                printValid(startP.getX()+a,startP.getY()+b); //riadok nad/pod
                Point point1 = new Point(startP.getX()+a,startP.getY()+b);
                positions.add(point1);

                printValid(startP.getX()+b,startP.getY()+a); //riadok o 2 vyssie/nizsie
                Point point2 = new Point(startP.getX()+b,startP.getY()+a);
                positions.add(point2);
            }
        }
        generatingSecThrMove(positions);
    }

    private HashSet<Point> generatingMove(Point point) {
        int a, b;
        HashSet<Point> positions= new HashSet<>();
        for (a = -1; a <= 1; a += 2) {   //pismenko
            for (b = -2; b <= 2; b += 4) {  //cislo
                printValid(point.getX() + a, point.getY() + b);//riadok nad/pod
                Point point1 = new Point(point.getX() + a, point.getY() + b);
                positions.add(point1);
                printValid(point.getX() + b, point.getY() + a); //riadok o 2 vyssie/nizsie
                Point point2 = new Point(point.getX() + b, point.getY() + a);
                positions.add(point2);
            }
        }
        return positions;
    }




    private void generatingSecThrMove(HashSet<Point> resultiky){
        HashSet<Point> positions2 = new HashSet<>();
        for(Point point: resultiky){
            positions2.addAll(generatingMove(point));
        }

        HashSet<Point> positions3 = new HashSet<>();
        for(Point point: positions2){
            positions3.addAll(generatingMove(point));
        }

        for(Point point: positions3){
            System.out.println(point);
        }

    }


}
