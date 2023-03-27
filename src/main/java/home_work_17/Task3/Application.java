package home_work_17.Task3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import home_work_17.Task2.Track;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader objectReader = objectMapper.readerFor(Track.class);
        Track[] tracks = new Track[4];

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/home_work_17/Task2/track0.json"))) {
            BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("src/main/java/home_work_17/Task2/track1.json"));
            BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("src/main/java/home_work_17/Task2/track2.json"));
            BufferedInputStream bis3 = new BufferedInputStream(new FileInputStream("src/main/java/home_work_17/Task2/track3.json"));

            BufferedInputStream[] inputStreams = new BufferedInputStream[]{bis, bis1, bis2, bis3};
            for (int i = 0; i < inputStreams.length; i++) {
                Track track = objectReader.readValue(inputStreams[i]);
                tracks[i] = track;
            }
            System.out.println(Arrays.toString(tracks));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}