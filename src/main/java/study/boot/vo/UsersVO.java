package study.boot.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class UsersVO {
    private String userId;
    private String userPassword;
    private String userName;
    private String regDate;
    private String deleteDate;
    private boolean deleteYn; //delete_yn
}
