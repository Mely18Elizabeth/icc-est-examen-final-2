package models;

import java.util.List;

public class Maquina {
    String nombre;
    String ip;
    int subred;
    int riesgo;
    List<Integer> codigos;
    public Maquina(String nombre, String ip, int subred, int riesgo, List<Integer>codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.subred = subred;
        this.riesgo = riesgo;
        this.codigos = codigos;
    }

    public int CalcularSubred(){
        if (subred>=0) {

        }
         return subred;
    }

    public int CalcularRiesgo(){
         if (riesgo>=0) {
            
        }
         return riesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((ip == null) ? 0 : ip.hashCode());
        result = prime * result + subred;
        result = prime * result + riesgo;
        result = prime * result + ((codigos == null) ? 0 : codigos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Maquina other = (Maquina) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (ip == null) {
            if (other.ip != null)
                return false;
        } else if (!ip.equals(other.ip))
            return false;
        if (subred != other.subred)
            return false;
        if (riesgo != other.riesgo)
            return false;
        if (codigos == null) {
            if (other.codigos != null)
                return false;
        } else if (!codigos.equals(other.codigos))
            return false;
        return true;
    }

    
    
}
