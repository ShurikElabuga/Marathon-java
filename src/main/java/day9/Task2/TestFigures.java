package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[8];
        figures[0] = new Triangle("Red", 10, 10, 10);
        figures[1] = new Triangle("Green", 10, 20, 30);
        figures[2] = new Triangle("Red", 10, 20, 15);
        figures[3] = new Rectangle("Red", 5, 10);
        figures[4] = new Rectangle("Orange", 40, 15);
        figures[5] = new Circle("Red", 4);
        figures[6] = new Circle("Red", 10);
        figures[7] = new Circle("Blue", 5);

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));

    }
        public static double calculateRedPerimeter (Figure[] figures) {
            double sumP = 0;
            for (var i = 0; i < figures.length; i++) {
                if ("Red".equals(figures[i].getColor())) {
                    sumP = sumP + figures[i].perimeter();
                }
            }
            return sumP;
        }
        public static double calculateRedArea (Figure[] figures){
            double sumArea = 0;
            for (Figure fgr : figures) {
                if ("Red".equals(fgr.getColor())) {
                    sumArea = sumArea + fgr.area();
                }
            }
            return sumArea;
        }

}


