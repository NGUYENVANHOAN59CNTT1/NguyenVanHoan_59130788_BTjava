/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd1;

import Fly.Flywhit;
import Fly.IFlybehavior;
import Quac.IQuacbehavior;
import Quac.Quacwhit;
import duck.duckhavior;
import duck.vittroi;

/**
 *
 * @author Admin
 */
public class VD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        duckhavior duck1 = new vittroi();
        duck1.setFlyable(new Flywhit());
        duck1.setQuacable(new Quacwhit());
        System.out.println(duck1.display());       
    }   
}
