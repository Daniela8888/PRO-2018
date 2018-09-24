/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoznampole;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author client
 */
public class ZoznamPole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ovocie[]= {"Jablko","Banan","Hruska"," kiwi"};
        
        ArrayList<String>zoznam=new ArrayList<String>(Arrays.asList(ovocie));
        
   
    for(String s:zoznam){
    System.out.println(s+"");
}
    //pouzijem triedenie
    Collections.sort(zoznam);
    for(String s: zoznam){
    System.out.println(s +"");
}
    Collections.shuffle(zoznam);
    for(String s: zoznam){
    System.out.println(s +"");
}
 }