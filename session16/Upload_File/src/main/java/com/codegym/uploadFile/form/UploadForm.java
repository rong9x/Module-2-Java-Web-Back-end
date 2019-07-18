package com.codegym.uploadFile.form;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class UploadForm {
    private String description;
    private CommonsMultipartFile[] fileDatas;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommonsMultipartFile[] getFileDatas() {
        return fileDatas;
    }

    public void setFileDatas(CommonsMultipartFile[] fileDatas) {
        this.fileDatas = fileDatas;
    }
}
