package cn.linkboo.common.mycenterInfo;

/**
 * 公司信息，针对工作人员
 * created by ramble 2018-10-27 21:46:45
 */
public class Company {
    //公司简称
    private String shortName;
    //公司全称
    private String qualifyName;

    private String department;
    //公司所属行业
    private String industry;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getQualifyName() {
        return qualifyName;
    }

    public void setQualifyName(String qualifyName) {
        this.qualifyName = qualifyName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    class Industry{
        //行业code
        private String code;
        //行业中文名
        private String name;
        //行业描述
        private String desc;
        //子行业
        private Industry child;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public Industry getChild() {
            return child;
        }

        public void setChild(Industry child) {
            this.child = child;
        }
    }

}
