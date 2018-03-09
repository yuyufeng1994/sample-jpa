package top.yuyufeng.sample.domain;

import javax.persistence.*;

/**
 * @author yuyufeng
 * @date 2018/3/9
 */
@Entity
@Table(name = "blog_info")
public class BlogInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
   private Integer blogId;
   private String blogName;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getBlogName() {
        return blogName;
    }

    public void setBlogName(String blogName) {
        this.blogName = blogName;
    }

    @Override
    public String toString() {
        return "BlogInfo{" +
                "blogId=" + blogId +
                ", blogName='" + blogName + '\'' +
                '}';
    }
}
