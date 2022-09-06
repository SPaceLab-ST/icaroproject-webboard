package es.spuertes.projecticaro.webboard.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location extends Entry{

    private String classType;
    private String name;
    private String showname;
    private String type;
    private String lasttime;
    private String lat;
    private String lng;
    private String course;
    private String speed;
    private String altitude;
    private String symbol;
    private String srccall;
    private String dstcall;
    private String comment;
    private String path;
    private String phg;
    private String status;
    private String status_lasttime;
    private String Additional;
    private String mmsi;
    private String imo;
    private String vesselclass;
    private String navstat;
    private String heading;
    private String length;
    private String width;
    private String draught;
    private String ref_front;
    private String ref_left;

}
