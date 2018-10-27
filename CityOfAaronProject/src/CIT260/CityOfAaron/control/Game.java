/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.CityOfAaron.control;

/**
 *
 * @author 1
 */
public class Game {
    public static double buyLand (double acres, double price, double wheatInStorage, double currentPeople){
     
        if (price < 17 || price > 27){
   return -1;
        }
        
        if (wheatInStorage < landCost){
            return -1;
        }
        
        if (currentPeople < individualProperty){
            return -1;
        }
       
        
       double landCost = price * acres;
       double individualProperty = acres / 10;
       double buyLand = wheatInStorage – landCost;
       
       return individualProperty;
       return buyLand;
               
    }
}
    
    
        
