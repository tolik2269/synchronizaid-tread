package com.company;

import java.util.ArrayList;
import java.util.List;

public class Shopauto {


ToyotaCompani toyotaCompani=new ToyotaCompani (this);
List<Auto>autos= new ArrayList<>(10);

public Auto sellAuto (){
    return toyotaCompani.sellAuto();
}

//    public Auto sellAuto2 (){
//        return toyotaCompani.sellAuto2();
//    }

public void acceptAuto () {
    toyotaCompani.receiveAuto();

}

List <Auto> getAutos(){
    return autos;
    }

}
