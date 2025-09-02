package ca.sheridancollege.chaupala.beans;

public class Course {

    private Long id;
    private String prefix;
    private int code;
    private String name;

    public Course() {
        // default constructor
    }

    public Course(Long id, String prefix, int code, String name) {
        this.id = id;
        this.prefix = prefix;
        this.code = code;
        this.name = name;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPrefix() { return prefix; }
    public void setPrefix(String prefix) { this.prefix = prefix; }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String toString() {
        return "Course [id=" + id + ", prefix=" + prefix + ", code=" + code + ", name=" + name + "]";
    }
}
