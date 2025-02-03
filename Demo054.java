class Demo054{
    public int display(int x,int y){
        return(x+y);
    }
    public double display(double x,double y){
        return(x+y);
    }
    public static void main(String[] args) {
        Demo054 obj = new Demo054();
        System.out.println(obj.display(10,20));
        System.out.println(obj.display(10.0,20.0));
    }

}
