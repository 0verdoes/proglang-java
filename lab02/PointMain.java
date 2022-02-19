class PointMain {
    /**
     * Basic main function to test Point object
     * Shows howw to initialize, and use the implemented functions
     * @param args commnad line arguments
     */
    public static void main(String[] args) {
        Point origo = new Point();
        origo.print();
        Point p1 = new Point(2, 4);
        p1.print();
        p1.move(2, 0);
        p1.print();
        p1.mirror(0, 0);
        p1.print();
    }
}
