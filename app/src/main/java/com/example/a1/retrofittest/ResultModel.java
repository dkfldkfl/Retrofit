package com.example.a1.retrofittest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultModel {
    private static final String TAG = ResultModel.class.getSimpleName();
    @SerializedName("list")
    @Expose
    private java.util.List<DayList> list = null;

    public java.util.List<DayList> getList() {
        return list;
    }

    public void setList(java.util.List<DayList> list) {
        this.list = list;
    }

    public class DayList {

        @SerializedName("SEQ")
        @Expose
        private String seq;
        @SerializedName("QRCODE")
        @Expose
        private String qrcode;
        @SerializedName("POSITION")
        @Expose
        private String position;
        @SerializedName("SLEEP_BIT")
        @Expose
        private String sleepbit;
        @SerializedName("ACTIVE")
        @Expose
        private String active;
        @SerializedName("LIGHT")
        @Expose
        private String light;
        @SerializedName("DEEP")
        @Expose
        private String deep;
        @SerializedName("SLEEP_DATE")
        @Expose
        private String sleepdate;
        @SerializedName("SLEEP_TIME")
        @Expose
        private String sleeptime;
        @SerializedName("SLEEP_DATA")
        @Expose
        private String sleepdata;
        @SerializedName("REGDT")
        @Expose
        private String regdt;

        @Override
        public String toString() {
            return "DayList{" +
                    "seq='" + seq + '\'' +
                    ", qrcode='" + qrcode + '\'' +
                    ", position='" + position + '\'' +
                    ", sleepbit='" + sleepbit + '\'' +
                    ", active='" + active + '\'' +
                    ", light='" + light + '\'' +
                    ", deep='" + deep + '\'' +
                    ", sleepdate='" + sleepdate + '\'' +
                    ", sleeptime='" + sleeptime + '\'' +
                    ", sleepdata='" + sleepdata + '\'' +
                    ", regdt='" + regdt + '\'' +
                    '}';
        }

        public String getSeq() {
            return seq;
        }

        public void setSeq(String seq) {
            this.seq = seq;
        }

        public String getQrcode() {
            return qrcode;
        }

        public void setQrcode(String qrcode) {
            this.qrcode = qrcode;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getSleepbit() {
            return sleepbit;
        }

        public void setSleepbit(String sleepbit) {
            this.sleepbit = sleepbit;
        }

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }

        public String getLight() {
            return light;
        }

        public void setLight(String light) {
            this.light = light;
        }

        public String getDeep() {
            return deep;
        }

        public void setDeep(String deep) {
            this.deep = deep;
        }

        public String getSleepdate() {
            return sleepdate;
        }

        public void setSleepdate(String sleepdate) {
            this.sleepdate = sleepdate;
        }

        public String getSleeptime() {
            return sleeptime;
        }

        public void setSleeptime(String sleeptime) {
            this.sleeptime = sleeptime;
        }

        public String getSleepdata() {
            return sleepdata;
        }

        public void setSleepdata(String sleepdata) {
            this.sleepdata = sleepdata;
        }

        public String getRegdt() {
            return regdt;
        }

        public void setRegdt(String regdt) {
            this.regdt = regdt;
        }
    }

}
