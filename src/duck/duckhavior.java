/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;
    
import Fly.IFlybehavior;
import Quac.IQuacbehavior;

/**
 *
 * @author Admin
 */
public abstract class duckhavior {
    IFlybehavior flyable;
    IQuacbehavior quacable;

    public duckhavior() {
    }

    public void setFlyable(IFlybehavior flyable) {
        this.flyable = flyable;
    }

    public void setQuacable(IQuacbehavior quacable) {
        this.quacable = quacable;
    }
   public String performQuack()
    {
        return quacable.quack();
    }
   public String swim(){
       return "Vit đang bơi trong ao";
    }
   public String perfromFLy(){
       return flyable.fly();
   }
   public abstract String display();
} 
