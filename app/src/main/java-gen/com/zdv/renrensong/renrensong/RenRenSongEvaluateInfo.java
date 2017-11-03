package com.zdv.renrensong.renrensong;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "REN_REN_SONG_EVALUATE_INFO".
 */
public class RenRenSongEvaluateInfo {

    private Long id;
    private String order_id;
    private String rating_content;
    private String level;
    private String r_time;
    private String user_id;
    private String key_word;
    private String rating_person;
    private String is_end;
    private Boolean is_read;
    private String evaluate_owner;

    public RenRenSongEvaluateInfo() {
    }

    public RenRenSongEvaluateInfo(Long id) {
        this.id = id;
    }

    public RenRenSongEvaluateInfo(Long id, String order_id, String rating_content, String level, String r_time, String user_id, String key_word, String rating_person, String is_end, Boolean is_read, String evaluate_owner) {
        this.id = id;
        this.order_id = order_id;
        this.rating_content = rating_content;
        this.level = level;
        this.r_time = r_time;
        this.user_id = user_id;
        this.key_word = key_word;
        this.rating_person = rating_person;
        this.is_end = is_end;
        this.is_read = is_read;
        this.evaluate_owner = evaluate_owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getRating_content() {
        return rating_content;
    }

    public void setRating_content(String rating_content) {
        this.rating_content = rating_content;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getR_time() {
        return r_time;
    }

    public void setR_time(String r_time) {
        this.r_time = r_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getKey_word() {
        return key_word;
    }

    public void setKey_word(String key_word) {
        this.key_word = key_word;
    }

    public String getRating_person() {
        return rating_person;
    }

    public void setRating_person(String rating_person) {
        this.rating_person = rating_person;
    }

    public String getIs_end() {
        return is_end;
    }

    public void setIs_end(String is_end) {
        this.is_end = is_end;
    }

    public Boolean getIs_read() {
        return is_read;
    }

    public void setIs_read(Boolean is_read) {
        this.is_read = is_read;
    }

    public String getEvaluate_owner() {
        return evaluate_owner;
    }

    public void setEvaluate_owner(String evaluate_owner) {
        this.evaluate_owner = evaluate_owner;
    }

}
