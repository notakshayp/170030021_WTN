import java.util.*;

public class Box{
    int box_w,box_h;
    double box_d;
    Box(int w,int h,double d){
        box_w=w;
        box_h=h;
        box_d=d;
    }
    double boxVolume(){
        return box_h*box_w*box_d;
    }
    public static void main(String args[]){
        int nboxW=10,nboxH=20;
        double nboxD=20.0;
        Box nbox=new Box(nboxW,nboxH,nboxD);
        System.out.println(nbox.boxVolume());
    }

}

