package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBBeneficiary3  {

    private OBCashAccount5 CreditorAccount;
    private OBBranchAndFinancialInstitutionIdentification6 CreditorAgent;
    private String AccountId;
    private String BeneficiaryId;
    private String Reference;

    public OBBeneficiary3 () {
    }

    @JsonProperty("CreditorAccount")
    public OBCashAccount5 getCreditorAccount() {
        return CreditorAccount;
    }

    public void setCreditorAccount(OBCashAccount5 CreditorAccount) {
        this.CreditorAccount = CreditorAccount;
    }

    @JsonProperty("CreditorAgent")
    public OBBranchAndFinancialInstitutionIdentification6 getCreditorAgent() {
        return CreditorAgent;
    }

    public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification6 CreditorAgent) {
        this.CreditorAgent = CreditorAgent;
    }

    @JsonProperty("AccountId")
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @JsonProperty("BeneficiaryId")
    public String getBeneficiaryId() {
        return BeneficiaryId;
    }

    public void setBeneficiaryId(String BeneficiaryId) {
        this.BeneficiaryId = BeneficiaryId;
    }

    @JsonProperty("Reference")
    public String getReference() {
        return Reference;
    }

    public void setReference(String Reference) {
        this.Reference = Reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBBeneficiary3 OBBeneficiary3 = (OBBeneficiary3) o;

        return Objects.equals(CreditorAccount, OBBeneficiary3.CreditorAccount) &&
               Objects.equals(CreditorAgent, OBBeneficiary3.CreditorAgent) &&
               Objects.equals(AccountId, OBBeneficiary3.AccountId) &&
               Objects.equals(BeneficiaryId, OBBeneficiary3.BeneficiaryId) &&
               Objects.equals(Reference, OBBeneficiary3.Reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CreditorAccount, CreditorAgent, AccountId, BeneficiaryId, Reference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBeneficiary3 {\n");
        sb.append("    CreditorAccount: ").append(toIndentedString(CreditorAccount)).append("\n");        sb.append("    CreditorAgent: ").append(toIndentedString(CreditorAgent)).append("\n");        sb.append("    AccountId: ").append(toIndentedString(AccountId)).append("\n");        sb.append("    BeneficiaryId: ").append(toIndentedString(BeneficiaryId)).append("\n");        sb.append("    Reference: ").append(toIndentedString(Reference)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
