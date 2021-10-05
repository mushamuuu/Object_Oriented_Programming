public class Media {
    String mName;
    String mDescription;

    public Media(String x, String y){
        mName = x;
        mDescription = y;
    }

    public String getmDescription() {

        return mDescription;
    }

    public String getmName() {

        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmDesc(String mDescription) {
        this.mDescription = mDescription;
    }

}

