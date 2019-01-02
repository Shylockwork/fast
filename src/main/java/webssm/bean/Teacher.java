package webssm.bean;


import javax.validation.constraints.NotBlank;

public class Teacher {
    private Integer teacherId;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherWorktime() {
        return teacherWorktime;
    }

    public void setTeacherWorktime(String teacherWorktime) {
        this.teacherWorktime = teacherWorktime;
    }

    @NotBlank(message = "姓名不能为空")
    private String teacherName;
    @NotBlank(message = "工龄不能为空")
    private String teacherWorktime;


}
