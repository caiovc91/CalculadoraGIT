/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitproject;

import java.util.ArrayList;
import java.util.Random;

public class GitProject {
    private int rodadas;
    private static ArrayList<Integer> vet_jogadas = new ArrayList<Integer>();
    private static ArrayList<Integer> jogada_atual = new ArrayList<Integer>();
    
public static void gen_Game(){
        Random rand = new Random();
        for(int x = 0; x < 100; x++){
            vet_jogadas.add(rand.nextInt(4) + 1);
            System.out.println(vet_jogadas);
        }    
}

    public static void get_step(){
        int rodada = 1;
        
        
        
    }
    public static void main(String[] args) {
        gen_Game();
    }
    
}