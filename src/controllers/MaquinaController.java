package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {
    
    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral){
        Stack<Maquina> maquinasFiltradas = new Stack<>();
        for(Maquina maquina : maquinas.reversed()){
            if(maquina.getSubred() > umbral){
                maquinasFiltradas.add(maquina);
            }
        }
        return maquinasFiltradas;
    }

    public Set<Maquina> ordenarPorSubred(Stack<Maquina> pila){
        Set<Maquina> ordenados = new TreeSet<>();

        for(Maquina maquina: pila){
            ordenados.add(maquina);
        }
        return ordenados;
    }

    public Map<Integer,Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas){
        return null;
    }

    public Stack<Maquina> explotarGrupo(Map<Integer,Queue<Maquina>> mapa){
        Stack<Maquina> maquinas = new Stack<>();
        for(int i = 0; i<= mapa.size(); i++){


        }
        return null;
    }
}
