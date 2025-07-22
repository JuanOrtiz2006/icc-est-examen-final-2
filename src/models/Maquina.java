package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Maquina {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos){
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred= calcularSubred(ip);
        this.riesgo=calcularRiesgo(nombre, codigos);
    }

    private int calcularSubred(String ip){
        String [] subred = ip.split("\\.");
        int num = 0;
        for(int i=0; i<=subred.length; i++){
            if(i==2){
                return Integer.parseInt(subred[i]);
            }
        }
        return num;
    }

    private int calcularRiesgo(String nombre, List<Integer> codigos){
        List<Integer> divisibles = new ArrayList<>();
        Set<Character> carcteresUnicos = new HashSet<>();
        nombre.split(" ");
        int sumaCodigos= 0;
        for(int codigo: codigos){
            if(codigo%5==0){
                divisibles.add(codigo);
                sumaCodigos+=codigo;
            }
        }

        for(char caracter: nombre.toCharArray()){
            if(carcteresUnicos.add(caracter));
        }

    
        return sumaCodigos * carcteresUnicos.size();
    }
    
    public List<Integer> getCodigos() {
        return codigos;
    }

    public String getIp() {
        return ip;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public int getSubred() {
        return subred;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return nombre + " " + ip + " " + " " + subred + " " + riesgo;
    }

}
