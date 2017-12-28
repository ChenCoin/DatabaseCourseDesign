select
	GradeInfo.StudentID studentID,
	StudentInfo.name studentName,
	GradeInfo.term time,
	CourseInfo.name course,
	TeacherInfo.name teacher,
	GradeInfo.grade
from
	GradeInfo,
	CourseInfo,
	StudentInfo,
	TeacherInfo
where 
	state = 'Selected' and 
	GradeInfo.CourseID = CourseInfo.CourseID and
	GradeInfo.StudentID = StudentInfo.StudentID and
	GradeInfo.term = CourseInfo.term and
	CourseInfo.TeacherID = TeacherInfo.TeacherID;
