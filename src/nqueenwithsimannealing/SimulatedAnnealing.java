/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueenwithsimannealing;

/**
 *
 * @author Safat
 */
public class SimulatedAnnealing {

    public static void main(String[] args) 
    {
        NQueen nq = new NQueen(8);
        for(int i = 1; i<12; i++){
        System.out.println("Solution: "+i);
        nq.solve();
        nq.show();
        System.out.println("");
        }
     }

}