package cn.xiaocai.id;

public enum EnumIdMode {
    NUM("num"),
    REDIS("redis");

    public final String value;

    private EnumIdMode(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
