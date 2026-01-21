package org.example.springbootapp1.models;

public class ClientResponse {
    boolean OK;
    String orgId;

    public ClientResponse(boolean OK, String orgId) {
        this.OK = OK;
        this.orgId = orgId;
    }

    public boolean isOK() {
        return OK;
    }

    public void setOK(boolean OK) {
        this.OK = OK;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }
}
