package com.wang.entity;

import lombok.Data;

@Data
public class Cet4Word {

    public Cet4Word(String word, String pronounce, String paraphrase) {
        this.word = word;
        this.pronounce = pronounce;
        this.paraphrase = paraphrase;
    }

    private Long id;

    private String word;

    private String pronounce;

    private String paraphrase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word == null ? null : word.trim();
    }

    public String getPronounce() {
        return pronounce;
    }

    public void setPronounce(String pronounce) {
        this.pronounce = pronounce == null ? null : pronounce.trim();
    }

    public String getParaphrase() {
        return paraphrase;
    }

    public void setParaphrase(String paraphrase) {
        this.paraphrase = paraphrase == null ? null : paraphrase.trim();
    }
}