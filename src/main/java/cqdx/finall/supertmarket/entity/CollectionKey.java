package cqdx.finall.supertmarket.entity;

public class CollectionKey {
    private String colUid;

    private Integer colRid;


    public CollectionKey(String colUid, Integer colRid) {
        this.colUid = colUid;
        this.colRid = colRid;
    }

    public String getColUid() {
        return colUid;
    }

    public void setColUid(String colUid) {
        this.colUid = colUid;
    }

    public Integer getColRid() {
        return colRid;
    }

    public void setColRid(Integer colRid) {
        this.colRid = colRid;
    }
}