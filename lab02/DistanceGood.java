class DistanceGood {
    public static void main(String[] args) {

        if(0 != args.length % 2 ){
            System.out.println("Only running with even number of args!");
            return;
        }
        Point point = new Point(),
              prev  = null;
        double distance = 0.0;
        for(int i = 0; i < args.length;i += 2){
            point.x = Double.parseDouble(args[i]);
            point.y = Double.parseDouble(args[i+1]);
            if(null != prev){
                distance += point.distance(prev);
                prev.x = point.x;
                prev.y = point.y;
            } else{
                prev = new Point();
                prev.x = point.x;
                prev.y = point.y;
            }

        }
        System.out.println("Distance: " + distance);
    }
}
