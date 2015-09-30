package com.kumkee.userAgent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 操作系统枚举
 * Created by Administrator on 2015/9/28.
 */
public enum OperateSystem {

    Win95("win95","WD95","Windows 95","windows nt 4\\.0"),
    Win2000("win2000","WD20","Windows 2000","windows nt 5\\.0"),
    WinXP("winXP","WDXP","Windows XP","windows nt 5\\.1"),
    WinXP64("winXP64","WDX6","Windows XP 64-bit","windows nt 5\\.2"),
    Win2003("win2003","WD03","Windows 2003","windows nt 5\\.1"),
    WinVista("winVista","WDV","Windows Vista","windows nt 6\\.0"),
    Win7("win7","WD7","Windows 7","windows nt 6\\.1"),
    Win8("win8","WD8","Windows 8","windows nt 6\\.2"),
    Win81("win81","WD81","Windows 8.1","windows nt 6\\.3"),
    WinPhone("winPhone","WDP","Windows phone","windows phone ([\\w\\.\\-]+)"),

    Osx("osx","OSX","OSX","os x (\\d+[._]\\d+)"),
    Android("android","AND","Android","android ([\\d\\w\\.\\-]+)"),
    Ipad("ipad","IPA","iPad OS","iPad.*os (\\d+[._]\\d+)"),
    Iphone("iphone","IPH","iPhone OS","iPhone.*os (\\d+[._]\\d+)"),
    Linux("linux","LIN","Linux","linux"),
    Wii("wii","WII","Wii","wii"),
    Ps3("ps3","PS3","PS3","playstation 3"),
    Psp("psp","PSP","PSP","playstation portable"),
    Symbian("symbian","SMB","Symbian","symbian(os)?"),
    Blackberry("blackberry","BB","BlackBerry","blackberry"),
    Darwin("darwin","DW","Darwin","Darwin\\/([\\d\\w\\.\\-]+)"),
    Adobeair("adobeair","AA","AdobeAir","symbian(os)?"),
    Java("java","JA","Java","Java[\\s]+([\\d\\w\\.\\-]+)"),

    Unknown("unknown","UN","未知",""),
    ;
    private final Pattern pattern;
    private final String name;
    private final String remark;
    private final String acronym;
    private String version;

    OperateSystem(String name, String acronym, String remark, String pattern) {
        this.version = "";
        this.name = name;
        this.remark = remark;
        this.acronym = acronym;
        this.pattern = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
    }

    public static OperateSystem parser(String useragent) {
        for (OperateSystem op : values()) {
            if (op.matches(useragent)) {
                return op;
            }
        }
        OperateSystem.Unknown.version = "";
        return OperateSystem.Unknown;
    }

    public static OperateSystem parserAcronym(String acronym) {
        for (OperateSystem op : values()) {
            if (op.acronym.equals(acronym)) {
                return op;
            }
        }
        OperateSystem.Unknown.version = "";
        return OperateSystem.Unknown;
    }

    private boolean matches(String useragent) {
        Matcher matcher = pattern.matcher(useragent);
        if (matcher.find()) {
            int index = 0;
            while ((version == null || version.trim().length() == 0) && index++ < matcher.groupCount()) {
                version = matcher.group(index);
            }
            version = (version == null) ? "" : version;
            if(version==null||version.trim().length()==0){
                if (remark.startsWith("Windows")){
                    version = remark.substring(remark.indexOf(" ")+1);
                }
            }
            return true;
        }
        return false;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public String getName() {
        return name;
    }

    public String getRemark() {
        return remark;
    }

    public String getVersion() {
        return version;
    }

    public String getAcronym() {
        return acronym;
    }
}
