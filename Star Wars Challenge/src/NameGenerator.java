public class NameGenerator {
    private String firstName;
    private String lastName;
    private String mothersMaidenName;
    private String placeOfBirth;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void generateStarWarsName(String firstName, String lastName, String mothersMaidenName, String placeOfBirth){
        String conFirstName = firstName.substring(0,3);
        String conLastName = lastName.substring(0,2);
        String conMothersMaidenName = mothersMaidenName.substring(0,2);
        String conPlaceOfBirth = placeOfBirth.substring(0,3);

        displayStarWarsName(conFirstName,conLastName, conMothersMaidenName, conPlaceOfBirth);
    }
    public void displayStarWarsName(String conFirstName, String conLastName, String conMothersMaidenName, String conPlaceOfBirth){
        System.out.println("Your new first name is " + conFirstName + conLastName);
        System.out.println("Your new last name is " + conMothersMaidenName + conPlaceOfBirth);
    }


}
