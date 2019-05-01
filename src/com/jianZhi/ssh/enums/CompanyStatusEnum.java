package com.jianZhi.ssh.enums;

import java.util.Optional;

/**
 * @author sgyh
 */
public enum CompanyStatusEnum {

    /**
     * 公司开放，缺省值
     */
    OPEN("open", "开放"),
    /**
     * 公司关闭
     */
    CLOSED("closed", "关闭");

    private String code;
    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    CompanyStatusEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static Optional<CompanyStatusEnum> value(String code) {
        if (OPEN.code.equals(code)) {
            return Optional.of(CompanyStatusEnum.OPEN);
        } else if (CLOSED.code.equals(code)) {
            return Optional.of(CompanyStatusEnum.CLOSED);
        }
        return Optional.empty();
    }

    public static String defaultStatus() {
        return OPEN.code;
    }
}
