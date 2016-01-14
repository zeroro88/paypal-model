package com.zeroro.paypal.classic.model;

import com.google.common.base.MoreObjects;
import com.zeroro.paypal.classic.util.HashBuilder;

public class PaypalClassicModel {
    protected void hashCode(final HashBuilder hash) {
    }
    @Override
    public String toString() {
        return toStringHelper().toString();
    }

    protected MoreObjects.ToStringHelper toStringHelper() {
        return MoreObjects.toStringHelper(this);
    }

    @Override
    public int hashCode() {
        final HashBuilder hash = new HashBuilder();
        hashCode(hash);
        return hash.getHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (getClass() != obj.getClass()) return false;
        return true;
    }
}
