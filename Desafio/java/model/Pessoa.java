package com.example.alunos.adr.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Pessoa implements Parcelable {
    private String nome;
    private String telefone;
    private int idade;
    public Pessoa(String nome, String telefone, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    protected Pessoa(Parcel in) {
        nome = in.readString();
        telefone = in.readString();
        idade = in.readInt();
    }

    public static final Creator<Pessoa> CREATOR = new Creator<Pessoa>() {
        @Override
        public Pessoa createFromParcel(Parcel in) {
            return new Pessoa(in);
        }

        @Override
        public Pessoa[] newArray(int size) {
            return new Pessoa[size];
        }
    };

    public void setNome​(String nome) {
        this.nome = nome;
    }

    public void setTelefone​(String telefone) {
        this.telefone = telefone;
    }
    public void setIdade​(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(telefone);
        dest.writeInt(idade);
    }
}
