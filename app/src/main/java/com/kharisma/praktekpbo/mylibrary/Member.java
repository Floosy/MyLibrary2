package com.kharisma.praktekpbo.mylibrary;

public class Member {
    private String id_members;
    private Pinjaman pinjaman;


    public String getId_members() {
        return id_members;
    }

    public void setId_members(String id_member) {
        this.id_members = id_member;
    }

    public Pinjaman getPinjaman() {
        return pinjaman;
    }

    public void setPinjaman(Pinjaman pinjaman) {
        this.pinjaman = pinjaman;
    }
}
