package cqdx.finall.supertmarket.entity;

public class ShopcartKey {
    private String spcUid;

    private Integer spcDid;

    public String getSpcUid() {
        return spcUid;
    }

    public void setSpcUid(String spcUid) {
        this.spcUid = spcUid;
    }

    public Integer getSpcDid() {
        return spcDid;
    }

    public void setSpcDid(Integer spcDid) {
        this.spcDid = spcDid;
    }

    public ShopcartKey() {
}

    public ShopcartKey(String spcUid, Integer spcDid) {
        this.spcUid = spcUid;
        this.spcDid = spcDid;
    }
}