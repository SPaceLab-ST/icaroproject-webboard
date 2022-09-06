package es.spuertes.projecticaro.webboard.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AprsResponse {

    private String command;
    private String description;
    private String result;
    private String what;
    private Integer found;

    private List<Entry> entries;
}
