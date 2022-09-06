package es.spuertes.projecticaro.webboard.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message extends Entry{

    private String messageId;
    private String srccall;
    private String dst;
    private String message;

}
