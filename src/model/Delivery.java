package model;

public class Delivery {
    private String VNum;
    private String type;
    private String name;
    private String leftTime;

    public Delivery() {
    }

    public Delivery(String VNum, String type, String name, String leftTime) {
        this.setVNum(VNum);
        this.setType(type);
        this.setName(name);
        this.setLeftTime(leftTime);
    }


    public String getVNum() {
        return VNum;
    }

    public void setVNum(String VNum) {
        this.VNum = VNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(String leftTime) {
        this.leftTime = leftTime;
    }
}
