package com.cpc.dp.builder;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder {
	
	private String fName;
    private String lName;
    private String age;
    private String address;
    private UserWebDTO dto;

    public UserDTOBuilder withFirstName(String fname){
        this.fName = fname;
        return this;
    }

    public UserDTOBuilder withLastName(String lname){
        this lName = lname;
        return this
    }

    public UserDTOBuilder withBirthday(LocalDate date){
        Period ageInYears = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYears.getYears());
        return this;
    }

    public UserDTOBuilder withAddress(Address address){
        this.address = address;
        return this;
    }

    public UserDTO build(){
        dto = new UserWebDTO(fName+" "+lName, address, age);
        return dto
    }
    //(optional) method to fetch already built object
    public UserDTO getUserDTO(){
        return dto;
    }
}
