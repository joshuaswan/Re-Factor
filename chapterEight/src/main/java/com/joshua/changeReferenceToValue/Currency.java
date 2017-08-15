package com.joshua.changeReferenceToValue;

/**
 * Created by joshua on 2017/8/15.
 */
public class Currency {
    private String code;

    public String getCode() {
        return code;
    }

    private Currency(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        return code != null ? code.equals(currency.code) : currency.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}
