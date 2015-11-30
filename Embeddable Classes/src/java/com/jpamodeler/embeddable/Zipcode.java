package com.jpamodeler.embeddable;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable

public class Zipcode implements Serializable {

    @Basic
    private String mainCode;

    @Basic
    private String codeSuffix;

    public Zipcode() {

    }

    public String getMainCode() {
        return this.mainCode;
    }

    public void setMainCode(String mainCode) {
        this.mainCode = mainCode;
    }

    public String getCodeSuffix() {
        return this.codeSuffix;
    }

    public void setCodeSuffix(String codeSuffix) {
        this.codeSuffix = codeSuffix;
    }
}
