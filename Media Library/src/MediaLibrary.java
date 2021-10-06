
import java.util.ArrayList;

public class MediaLibrary {
/*    int arrayLength = 4;
    Media[] array = new Media[arrayLength];*/
    ArrayList<Media> mediaArray = new ArrayList<>();

    public MediaLibrary(){
    }

/*    public void addMedia(Media arrayAddition, int i){
        if (array.length - i){
            *//** create new array of correct size and copy array contents in.*//*
            *//***//*

        }
        array[i] = arrayAddition;

    }*/

    public void addMedia(Media mediaAddition){
        mediaArray.add(mediaAddition);
        //mediaArray.sort();
    }

    public void printMedia(){
        for (Media array:mediaArray) {
            System.out.println(array);
        }
    }
    public Media findMedia(String findParameter){
        for (Media media : mediaArray) {

            if (media.getmName().equals(findParameter)) {
                return media;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        MediaLibrary MyLibrary = new MediaLibrary();

        MediaLibraryTest_w3.acceptanceTest(MyLibrary);

    }


}
