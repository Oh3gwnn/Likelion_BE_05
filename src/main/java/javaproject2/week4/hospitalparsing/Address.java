package javaproject2.week4.hospitalparsing;

public class Address {
    public String getFullAddr() {
        return fullAddr;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }

    private String fullAddr;
    private String sido;
    private String sigungu;

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }
}


