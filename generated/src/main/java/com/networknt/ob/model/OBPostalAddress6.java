package com.networknt.ob.model;

import java.util.Arrays;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OBPostalAddress6  {

    private String StreetName;
    private String CountrySubDivision;
    private String Department;
    private java.util.List<String> AddressLine;
    private String BuildingNumber;
    private String TownName;
    private String Country;
    private String SubDepartment;
    private OBAddressTypeCode AddressType;
    private String PostCode;

    public OBPostalAddress6 () {
    }

    @JsonProperty("StreetName")
    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    @JsonProperty("CountrySubDivision")
    public String getCountrySubDivision() {
        return CountrySubDivision;
    }

    public void setCountrySubDivision(String CountrySubDivision) {
        this.CountrySubDivision = CountrySubDivision;
    }

    @JsonProperty("Department")
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    @JsonProperty("AddressLine")
    public java.util.List<String> getAddressLine() {
        return AddressLine;
    }

    public void setAddressLine(java.util.List<String> AddressLine) {
        this.AddressLine = AddressLine;
    }

    @JsonProperty("BuildingNumber")
    public String getBuildingNumber() {
        return BuildingNumber;
    }

    public void setBuildingNumber(String BuildingNumber) {
        this.BuildingNumber = BuildingNumber;
    }

    @JsonProperty("TownName")
    public String getTownName() {
        return TownName;
    }

    public void setTownName(String TownName) {
        this.TownName = TownName;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    @JsonProperty("SubDepartment")
    public String getSubDepartment() {
        return SubDepartment;
    }

    public void setSubDepartment(String SubDepartment) {
        this.SubDepartment = SubDepartment;
    }

    @JsonProperty("AddressType")
    public OBAddressTypeCode getAddressType() {
        return AddressType;
    }

    public void setAddressType(OBAddressTypeCode AddressType) {
        this.AddressType = AddressType;
    }

    @JsonProperty("PostCode")
    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        OBPostalAddress6 OBPostalAddress6 = (OBPostalAddress6) o;

        return Objects.equals(StreetName, OBPostalAddress6.StreetName) &&
               Objects.equals(CountrySubDivision, OBPostalAddress6.CountrySubDivision) &&
               Objects.equals(Department, OBPostalAddress6.Department) &&
               Objects.equals(AddressLine, OBPostalAddress6.AddressLine) &&
               Objects.equals(BuildingNumber, OBPostalAddress6.BuildingNumber) &&
               Objects.equals(TownName, OBPostalAddress6.TownName) &&
               Objects.equals(Country, OBPostalAddress6.Country) &&
               Objects.equals(SubDepartment, OBPostalAddress6.SubDepartment) &&
               Objects.equals(AddressType, OBPostalAddress6.AddressType) &&
               Objects.equals(PostCode, OBPostalAddress6.PostCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StreetName, CountrySubDivision, Department, AddressLine, BuildingNumber, TownName, Country, SubDepartment, AddressType, PostCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OBPostalAddress6 {\n");
        sb.append("    StreetName: ").append(toIndentedString(StreetName)).append("\n");        sb.append("    CountrySubDivision: ").append(toIndentedString(CountrySubDivision)).append("\n");        sb.append("    Department: ").append(toIndentedString(Department)).append("\n");        sb.append("    AddressLine: ").append(toIndentedString(AddressLine)).append("\n");        sb.append("    BuildingNumber: ").append(toIndentedString(BuildingNumber)).append("\n");        sb.append("    TownName: ").append(toIndentedString(TownName)).append("\n");        sb.append("    Country: ").append(toIndentedString(Country)).append("\n");        sb.append("    SubDepartment: ").append(toIndentedString(SubDepartment)).append("\n");        sb.append("    AddressType: ").append(toIndentedString(AddressType)).append("\n");        sb.append("    PostCode: ").append(toIndentedString(PostCode)).append("\n");
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
