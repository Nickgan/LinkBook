package cn.linkboo.common.mycenterInfo;

public class User {
    private String email;
    private String name;
    private String passwd;
    //boy:0,girl:1
    private short gender;
    private String nickName;
    private int phone;
    //微信号
    private String wechatNo;
    //qq号
    private String qqNo;
    private School school;
    private Company company;
    //区域
    private String area;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * the number indicates user's gender
     * @return o : boy and 1 : girl
     */
    public short getGender() {
        return gender;
    }

    /**
     * setting the number which indicates user's gender
     * @param gender o : boy and 1 : girl
     */
    public void setGender(short gender) {
        this.gender = gender;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getWechatNo() {
        return wechatNo;
    }

    public void setWechatNo(String wechatNo) {
        this.wechatNo = wechatNo;
    }

    public String getQqNo() {
        return qqNo;
    }

    public void setQqNo(String qqNo) {
        this.qqNo = qqNo;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
