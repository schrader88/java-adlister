package model;

import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String content;
    private long authorId;

    public Quote() {

    }

    public Quote(long id, String content, long authorId) {
        this.id = id;
        this.content = content;
        this.authorId = authorId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}
