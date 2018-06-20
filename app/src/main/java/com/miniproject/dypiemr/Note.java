package com.miniproject.dypiemr;

/**
 * Created by Admin on 10/8/2017.
 */

public class Note {
    String DESCRIPTION,IMAGE;

    public Note(){

    }

    public Note(String DESCRIPTION, String IMAGE) {
        this.DESCRIPTION = DESCRIPTION;
        this.IMAGE = IMAGE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(String IMAGE) {
        this.IMAGE = IMAGE;
    }
}
