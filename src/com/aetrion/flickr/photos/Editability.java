package com.aetrion.flickr.photos;

/**
 * @author Anthony Eden
 */
public class Editability {

    private boolean comment;
    private boolean addmeta;

    public Editability() {

    }

    public boolean isComment() {
        return comment;
    }

    public void setComment(boolean comment) {
        this.comment = comment;
    }

    public boolean isAddmeta() {
        return addmeta;
    }

    public void setAddmeta(boolean addmeta) {
        this.addmeta = addmeta;
    }

}