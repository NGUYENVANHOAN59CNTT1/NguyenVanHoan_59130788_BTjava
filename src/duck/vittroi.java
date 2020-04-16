/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

/**
 *
 * @author Admin
 */
public class vittroi extends duckhavior{

    @Override
    public String display() {
      return "chào các bạn tôi là vịt trời"+
              swim()+"\n"+
              performQuack()+"\n"+
              perfromFLy();    
    }
    
}
