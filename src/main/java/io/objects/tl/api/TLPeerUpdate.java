package io.objects.tl.api;

import io.objects.tl.core.TLObject;

/**
 * This class is generated by Abolfazl Rezvan.
 */
public abstract class TLPeerUpdate extends TLObject {

    protected TLAbsUpdates updates;

    public TLPeerUpdate() {
    }

    public TLAbsUpdates getUpdates() {
        return updates;
    }

    public void setUpdates(TLAbsUpdates updates) {
        this.updates = updates;
    }
}
