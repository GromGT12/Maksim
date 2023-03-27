package home_work_17.Task2;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TrackDeserialization {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader objectReader = objectMapper.readerFor(Track.class);

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/home_work_17/Task2/track0.json"))) {
            BufferedInputStream bis1 = new BufferedInputStream(new FileInputStream("src/main/java/home_work_17/Task2/track1.json"));
            BufferedInputStream bis2 = new BufferedInputStream(new FileInputStream("src/main/java/home_work_17/Task2/track2.json"));
            BufferedInputStream bis3 = new BufferedInputStream(new FileInputStream("src/main/java/home_work_17/Task2/track3.json"));

            byte[] bytes = bis.readAllBytes();
            byte[] bytes1 = bis1.readAllBytes();
            byte[] bytes2 = bis2.readAllBytes();
            byte[] bytes3 = bis3.readAllBytes();

            Track track = objectReader.readValue(bytes);
            Track track1 = objectReader.readValue(bytes1);
            Track track2 = objectReader.readValue(bytes2);
            Track track3 = objectReader.readValue(bytes3);
            Track[] tracks = new Track[]{track, track1, track2, track3};
            System.out.println(Arrays.toString(tracks));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

