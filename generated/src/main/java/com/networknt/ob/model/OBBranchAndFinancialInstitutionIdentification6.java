package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBBranchAndFinancialInstitutionIdentification6  {

    private OBPostalAddress6 PostalAddress;
    private String SchemeName;
    private String Identification;
    private String Name;

    public OBBranchAndFinancialInstitutionIdentification6 () {
    }

    @JsonProperty("PostalAddress")
    public OBPostalAddress6 getPostalAddress() {
        return PostalAddress;
    }

    public void setPostalAddress(OBPostalAddress6 PostalAddress) {
        this.PostalAddress = PostalAddress;
    }

    @JsonProperty("SchemeName")
    public String getSchemeName() {
        return SchemeName;
    }

    public void setSchemeName(String SchemeName) {
        this.SchemeName = SchemeName;
    }

    @JsonProperty("Identification")
    public String getIdentification() {
        return Identification;
    }

    public void setIdentification(String Identification) {
        this.Identification = Identification;
    }

    @JsonProperty("Name")
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBBranchAndFinancialInstitutionIdentification6 OBBranchAndFinancialInstitutionIdentification6 = (OBBranchAndFinancialInstitutionIdentification6) o;

        return Objects.equals(PostalAddress, OBBranchAndFinancialInstitutionIdentification6.PostalAddress) &&
               Objects.equals(SchemeName, OBBranchAndFinancialInstitutionIdentification6.SchemeName) &&
               Objects.equals(Identification, OBBranchAndFinancialInstitutionIdentification6.Identification) &&
               Objects.equals(Name, OBBranchAndFinancialInstitutionIdentification6.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PostalAddress, SchemeName, Identification, Name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBBranchAndFinancialInstitutionIdentification6 {\n");
        sb.append("    PostalAddress: ").append(toIndentedString(PostalAddress)).append("\n");        sb.append("    SchemeName: ").append(toIndentedString(SchemeName)).append("\n");        sb.append("    Identification: ").append(toIndentedString(Identification)).append("\n");        sb.append("    Name: ").append(toIndentedString(Name)).append("\n");
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
