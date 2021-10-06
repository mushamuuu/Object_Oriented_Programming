public class Media {
    private String mName;
    private String mDescription;

    public Media(String name, String desc){
        this.mName = name;
        this.mDescription = desc;
    }

    public String getmDescription() {
        return this.mDescription;
    }

    public String getmName() {
        return this.mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmDesc(String mDescription) {
        this.mDescription = mDescription;
    }

}

