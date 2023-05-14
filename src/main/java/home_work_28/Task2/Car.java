package home_work_28.Task2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Car(
       String id,
       String title,
       String description,
       String city,
       String status
) {
}
