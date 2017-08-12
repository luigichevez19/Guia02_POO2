/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Luis
 */
public class Pers {
    
    int Codi,tipoP;
    boolean esta;
    String nomb, apel,sang,dui,nit,naci,fech1,fech2,tipo,ubic;
    String gene,email;

    public Pers(String nomb, String apel, String email) {
        this.nomb = nomb;
        this.apel = apel;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    byte [] foto;

    public String getUbic() {
        return ubic;
    }

    public void setUbic(String ubic) {
        this.ubic = ubic;
    }

    public String getNaci() {
        return naci;
    }

    public void setNaci(String naci) {
        this.naci = naci;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte [] foto) {
        this.foto = foto;
    }

        public int getTipoP() {
        return tipoP;
    }

    public void setTipoP(int tipoP) {
        this.tipoP = tipoP;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }
    public int getCodi() {
        return Codi;
    }

    public void setCodi(int Codi) {
        this.Codi = Codi;
    }

    public boolean isEsta() {
        return esta;
    }

    public void setEsta(boolean esta) {
        this.esta = esta;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getSang() {
        return sang;
    }

    public void setSang(String sang) {
        this.sang = sang;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getFech1() {
        return fech1;
    }

    public void setFech1(String fech1) {
        this.fech1 = fech1;
    }

    public String getFech2() {
        return fech2;
    }

    public void setFech2(String fech2) {
        this.fech2 = fech2;
    }
}
