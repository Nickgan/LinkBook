package cn.linkboo.common.mycenterInfo;

/**
 * 学校信息，针对学生用户
 * created by ramble 2018-10-27 21:46:52
 */
public class School {
    private String name;
    private String area;
    private String academy;
    //班级
    private String cla;
    //学号
    private String no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getCla() {
        return cla;
    }

    public void setCla(String cla) {
        this.cla = cla;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
