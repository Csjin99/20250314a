package com.kh.boot.domain.vo;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class PicBoard {
    private int picboardNo;
    private String picboardTitle;
    private String picboardWriter;
    private String picboardContent;
    private String originName;
    private String changeName;
    private int count;
    private String createDate;
    private String status;
}
